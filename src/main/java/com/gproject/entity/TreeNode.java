package com.gproject.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode {
    private Integer cid;

    private String cname;

    private Integer pid;

    private List<TreeNode> nodes = new ArrayList();

    @Override
    public String toString() {
        return "TreeNode{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                '}';
    }
}
