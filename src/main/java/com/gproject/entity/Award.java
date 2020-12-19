package com.gproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

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
 * @since 2020-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Award implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "award_id", type = IdType.AUTO)
    private Integer awardId;

    private String awardName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime awardTime;

    private String awardFile;

    private Integer competitionId;

    private Integer collegeId;

    private Integer userId;

    private String teacher;

    private String collegeName;

    private String classifyName;

    private String competitionType;

    private String competitionName;
}
