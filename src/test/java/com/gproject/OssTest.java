package com.gproject;

import com.gproject.entity.AliOSSEntity;
import com.gproject.service.IAliOSSService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class OssTest {

    @Autowired
    private AliOSSEntity aliOSSEntity;
    @Autowired
    private IAliOSSService aliOSSService;
    @Test
    public void test(){
        aliOSSService.listFlie();
    }
}
