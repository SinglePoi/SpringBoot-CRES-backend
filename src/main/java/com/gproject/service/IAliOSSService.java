package com.gproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gproject.entity.AliOSSEntity;
import com.gproject.entity.Stulist;
import com.sun.activation.registries.MailcapFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.channels.MulticastChannel;

/**
 *
 * Alibaba OSS
 */
public interface IAliOSSService{
    /**
     * 创建存储空间
     */
    void createBucket();

    /**
     * 上传文件
     * @param file
     * @return
     */
    String upload(MultipartFile file) throws IOException;

    /**
     * 下载文件
     * @param fileName
     * @throws IOException
     */
    void download(String fileName) throws IOException;

    /**
     * 列举文件
     */
    void listFlie();

    /**
     * 删除文件
     * @param fileName
     */
    void deleteFile(String fileName);
}
