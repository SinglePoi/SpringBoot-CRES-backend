package com.gproject.entity;

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
 * @since 2020-12-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String userName;

    private String password;

    private String name;

    private Integer phone;

    private String email;

    private String sex;

    private LocalDateTime accessionDate;

    private Integer collegeId;


}
