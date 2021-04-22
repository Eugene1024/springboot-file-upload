package com.github.eugene1024.service;

import com.github.eugene1024.bean.MyFile;
import com.github.eugene1024.mapper.MyFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MyFileService {
    @Autowired
    private MyFileMapper myFileMapper;

    public List<MyFile> getFileList(){
        return myFileMapper.getFileList();
    }
    public int addFile(MyFile file){
        return myFileMapper.addFile(file);
    }
    public boolean deleteFile(String id){
         if(myFileMapper.deleteFile(id) ==1){
             return true;
         }
         return false;
    }

}
