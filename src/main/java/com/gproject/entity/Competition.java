package com.gproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
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
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "competition_id", type = IdType.AUTO)
    private Integer competitionId;

    private String competitionName;

    private String competitionClass;

    private String competitionType;

    private String competitionStatus;

    private LocalDateTime starttime;

    private Integer noticeId;

    private Integer collegeId;

    private Integer competitionfileId;

    private String grade;

    private String address;


}
