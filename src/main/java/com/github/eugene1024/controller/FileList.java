package com.github.eugene1024.controller;

import com.github.eugene1024.bean.MyFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import  com.github.eugene1024.service.MyFileService;

import java.util.List;

@Controller
public class FileList {

    @Autowired
    private MyFileService myService;

    @RequestMapping("/getFileList")
    public String getFileList(Model model){
        //调用service然后获得数据库中数据，跳转到List页面
        //List<User> list =  userService.ListUser();
        //model.addAttribute("list",list);
        //return "user/index";
        List<MyFile> list = myService.getFileList();
        model.addAttribute("list",list);
        return "index";
    }
}
