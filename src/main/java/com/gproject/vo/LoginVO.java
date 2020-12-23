package com.gproject.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class LoginVO implements Serializable {
    @NotBlank(message = "账号不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
}
