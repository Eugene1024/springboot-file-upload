package com.github.eugene1024.controller;

import com.github.eugene1024.service.MyFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class DeleteFileLController {
    @Autowired
    private MyFileService myFileService;
    @Value(value = "${file.download.dir}")
    private String rootPath;
    @GetMapping("/delete")
    public String deleteFile(HttpServletRequest req){
        String id = req.getParameter("id");
        String fileName =req.getParameter("fileName");
        System.out.println(id);
        System.out.println(fileName);
        //删除文件，删除数据库数据
        String filePath = req.getSession().getServletContext().getRealPath("imgupload/");
        File file = new File(filePath, fileName);
        if(file.delete()&&myFileService.deleteFile(id)){
            System.out.println(file.getName() + " 文件已被删除！");
        }
        return "redirect:/getFileList";

    }
}
