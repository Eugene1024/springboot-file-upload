package com.github.eugene1024.controller;

import com.github.eugene1024.bean.MyFile;
import com.github.eugene1024.service.MyFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author : dylanz
 * @since : 11/02/2020
 */
@Controller
@RequestMapping("/api")
public class FileUploadController {
    @Autowired
    private MyFileService myFileService;
    //@Value(value = "${file.upload.dir}")
    @Value(value = "${file.upload.dir}")
    private String rootPath;

    @GetMapping("/upload/ping")
    public String ping() {
        return "success";
    }

    @PostMapping("/file")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        try {

            String IMG_PATH_PREFIX = "static/upload/imgs";
            String fileDirPath = new String("src/main/resources/" + IMG_PATH_PREFIX);

            File fileDir = new File(fileDirPath);
            if(!fileDir.exists()){
                // 递归生成文件夹
                fileDir.mkdirs();
            }

            String pjtPath = request.getSession().getServletContext().getRealPath("");
            System.out.println("路径:"+pjtPath);
            String filePath = request.getServletContext().getRealPath("imgupload/");
            //File path = new File(ResourceUtils.getURL("classpath:").getPath());
            // System.out.println(path.getAbsolutePath());
            // File upload = new File(path.getAbsolutePath(),"static/images/upload/");
            //if(!upload.exists()) upload.mkdirs();
            //在开发测试模式时，得到的地址为：{项目跟目录}/target/static/images/upload/
            //在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/images/upload/

            //上传并且将名称存入数据库
            File file1 = new File(filePath);
            System.out.println("111:"+filePath);
            // 若不存在则创建该文件夹
            if(!file1.exists()){
                file1.mkdirs();
            }
            String fileName = file.getOriginalFilename();
            assert fileName != null;
            System.out.println(fileName);

            //File dest = new File(file1.getAbsolutePath(),fileName);
            System.out.println("-------");
            System.out.println(fileDirPath);
            System.out.println(fileDir.getAbsolutePath());
            File dest = new File(fileDir.getAbsolutePath() ,fileName);

            file.transferTo(dest);
            MyFile myFile = new MyFile();
            myFile.setName(fileName);
            myFileService.addFile(myFile);
            return "redirect:/getFileList";
        } catch (Exception e) {
            e.printStackTrace();
            return "/index";
        }
    }

}
