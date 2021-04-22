package com.github.eugene1024.mapper;

import com.github.eugene1024.bean.MyFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyFileMapper {
    List<MyFile> getFileList();
    int addFile(MyFile file);
    int deleteFile(String id);
}
