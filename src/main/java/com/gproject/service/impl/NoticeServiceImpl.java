package com.gproject.service.impl;

import com.gproject.entity.Notice;
import com.gproject.mapper.NoticeMapper;
import com.gproject.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-18
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

//    @Override
//    public List<Notice> findAll(){
//        return noticeMapper.findAll();
//    }

    @Override
    public void add(Notice notice) {
        noticeMapper.add(notice);
    }

    @Override
    public void update(Notice notice) {
        noticeMapper.update(notice);
    }

    @Override
    public List<Notice> selectByPage(Integer page, Integer size) {
        int start = (page-1) * size;
        return noticeMapper.selectByPage(start, size);
    }


    @Override
    public Long findTotals() {
        return noticeMapper.findTotals();
    }
}
