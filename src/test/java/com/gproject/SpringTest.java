package com.gproject;

import com.gproject.entity.AliOSSEntity;
import com.gproject.entity.Stulist;
import com.gproject.service.IAliOSSService;

import com.gproject.service.IStulistService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.el.PropertyNotWritableException;

@SpringBootTest
public class SpringTest {

    @Autowired
    private AliOSSEntity aliOSSEntity;
    @Autowired
    private IAliOSSService aliOSSService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IStulistService stulistService;

    @Test
    public void test() {
        //$2a$10$P9spoaveZKa37FtTr5GIrevgQQAkp3DCYxk7Mjii0mS58KQ6OuqBC
        //每次生成密码都不一样
//        String encode = passwordEncoder.encode("123456");
        boolean matches = passwordEncoder.matches("123456", "$2a$10$P9spoaveZKa37FtTr5GIrevgQQAkp3DCYxk7Mjii0mS58KQ6OuqBC");
        System.out.println(matches);
    }
}
