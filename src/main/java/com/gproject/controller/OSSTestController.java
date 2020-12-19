package com.gproject.controller;

import com.gproject.service.IAliOSSService;
import com.gproject.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/OSS")
@Api(value = "文件管理",tags = "OSS文件测试接口")
public class OSSTestController {

    @Autowired
    private IAliOSSService aliOSSService;

    @ApiOperation("OSS上传文件")
//    @ApiImplicitParams({@ApiImplicitParam(name = "file", value = "文件流对象,接收数组格式", required = true,dataType = "__File"),
//            @ApiImplicitParam(name = "title", value = "title", required = true)}
//    )
    @PostMapping("/upload")
    public Result upload(@RequestParam("file") MultipartFile multipartFile) {
        Result result = new Result();
        String msg = null;
        try {
            msg = aliOSSService.upload(multipartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMsg(msg);
        return result;
    }

    @ApiOperation("删除图片")
    @PostMapping("/deleteImage")
    public Result deleteImage(@RequestParam("file") String file) {
        Result result = new Result();
        System.out.println(file);
        try {
            String[] split = file.split(".com/");
//            String url = file.replaceAll("%2F","//");
            aliOSSService.deleteFile(split[1]);
            System.out.println(split[1]);
            result.setMsg("ok");
        } catch (Exception e) {
            result.setMsg("error");
        }
        return result;
    }

}
