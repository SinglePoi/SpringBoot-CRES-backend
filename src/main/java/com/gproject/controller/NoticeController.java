//package com.gproject.controller;
//
//import com.alibaba.druid.util.StringUtils;
//import com.gproject.entity.Notice;
//import com.gproject.service.INoticeService;
//import com.gproject.vo.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * <p>
// *  前端控制器
// * </p>
// *
// * @author jobob
// * @since 2020-11-18
// */
//@RestController
//@RequestMapping("/notice")
//public class NoticeController {
//    @Autowired
//    private INoticeService noticeService;
//
////    @GetMapping("/all")
////    @Transactional(propagation = Propagation.SUPPORTS)
////    public List<Notice> findAll(){
////        return noticeService.findAll();
////    }
//
//    @PostMapping("/save")
//    public Result add(@RequestBody Notice notice){
//        Boolean value;
//        try{
//            value = StringUtils.isEmpty(notice.getNoticeId().toString()); //false
//            if(value){
//                noticeService.add(notice);
//                result.setMsg("添加信息成功");
//            }else{
////                result.setMsg("true");
//                noticeService.update(notice);
//                result.setMsg("修改信息成功");
//            }
//        }catch (Exception e){
//            result.setStatus(false);
//            result.setMsg("操作失败");
//        }
//        return result;
//    }
//
//    @GetMapping("/remove")
//    public Result removeById(Long id){
//        Result result = new Result();
//        try{
//            noticeService.removeById(id);
//            result.setMsg("操作成功");
//        }catch (Exception e){
//            result.setStatus(false);
//            result.setMsg("操作失败");
//        }
//        return result;
//    }
//
//    @GetMapping("/page")
//    public Map<String ,Object> selectPage(Integer page, Integer size){
//        Map<String, Object> result = new HashMap<>();
//        page = page == null?1:page;
//        size = size == null?4:size;
//        List<Notice> notices = noticeService.selectByPage(page, size);
//        Long totals = noticeService.findTotals();
//        result.put("notices", notices);
//        result.put("total", totals);
//        return result;
//    }
//}
