package com.gproject.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gproject.entity.Notice;
import com.gproject.entity.Stulist;
import com.gproject.service.IStulistService;
import com.gproject.vo.Result;
import com.gproject.vo.StuListOV;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.LambdaConversionException;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-12-06
 */
@RestController
@RequestMapping("/stulist")
@Api(value = "学生管理",tags = "学生管理接口")
public class StulistController {

    @Autowired
    private IStulistService stulistService;

//    @GetMapping
//    @ApiOperation(value = "学生列表", notes = "查询所有学生信息")
//    public Result all(Integer page, Integer size){
////        List<Stulist> stulists = stulistService.all();
////        return  Result.succe(stulists);
//        Page<Stulist> page1 = new Page<>(page, size);
//        LambdaQueryWrapper<Stulist> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(Stulist::getStudentId,1722110089);
//        IPage<Stulist> IPage = stulistService.page(page1,queryWrapper);
//        long total = IPage.getTotal();
//        List<Stulist> records = IPage.getRecords();
//        Map<String,Object> map = new HashMap<>();
//        map.put("records",records);
//        map.put("total",total);
//        Result result = new Result();
//        result.setData(map);
//        return result;
//
//    }
    @PostMapping("/findStuPage")
    @ApiOperation(value = "学生列表-findStuPage", notes = "查询所有学生信息")
    public Result findStuPage(@RequestParam(defaultValue = "1") Integer page,
                              @RequestParam(defaultValue = "6") Integer size,
                              @RequestBody StuListOV stuListOV){
//        List<Stulist> stulists = stulistService.all();
//        return  Result.succe(stulists);
        Page<Stulist> page1 = new Page<>(page, size);
        QueryWrapper<Stulist> wrapper = getWrapper(stuListOV);
        IPage<Stulist> IPage = stulistService.findStuPage(page1,wrapper);
        long total = IPage.getTotal();
        List<Stulist> records = IPage.getRecords();
        Map<String,Object> map = new HashMap<>();
        map.put("records",records);
        map.put("total",total);
        Result result = new Result();
        result.setData(map);
        return result;
    }

    private QueryWrapper<Stulist> getWrapper(StuListOV stuListOV){
        QueryWrapper<Stulist> queryWrapper = new QueryWrapper<>();
        if (stuListOV!=null){
            if(!StringUtils.isEmpty(stuListOV.getStudentName())){
                queryWrapper.eq("student_name",stuListOV.getStudentName());
            }if(!StringUtils.isEmpty(stuListOV.getCollegeNmae())){
                queryWrapper.eq("college_name",stuListOV.getCollegeNmae());
            }if(!StringUtils.isEmpty(stuListOV.getGender())){
                queryWrapper.eq("gender",stuListOV.getGender());
            }
        }
        return queryWrapper;
    }

    @GetMapping("/selectById/{id}")
    @ApiOperation(value = "学生信息", notes = "查询单个学生信息")
    public Result getById(@PathVariable("id") long id){
        Result result = new Result();
        Stulist stulist = stulistService.selectById(id);
        try{
            result.setData(stulist);
            result.setMsg("查询成功");
        }catch (Exception e){
            result.setStatus(false);
            result.setMsg("操作失败");
        }
        return result;
    }

    @GetMapping("/college")
    @ApiOperation(value = "学院信息", notes = "查询单个学生信息")
    public List<Stulist> college(){
        List<Stulist> lists;
        lists = stulistService.college();
        return lists;
    }
}
