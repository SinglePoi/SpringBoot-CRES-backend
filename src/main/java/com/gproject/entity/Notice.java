package com.gproject.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Long noticeId;

    private String noticeTitle;

    @Override
    public String toString() {
        return "Notice{" +
                "notice_id=" + noticeId +
                '}';
    }

    private Integer competitionClass;

    private String competitionType;

    private String grade;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startdate;

    private String noticeState;

    private String college;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date longtime;

    private String noticeContent;

    private String noticeFile;

    private String classifyName;
}
