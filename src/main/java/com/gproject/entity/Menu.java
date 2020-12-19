package com.gproject.entity;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer myId;

    private Integer parentId;

    private String menuName;

    private String url;

    private String perms;

    private String icon;

    private String type;

    private String open;

    private Integer available;

    private List<Menu> children;


}
