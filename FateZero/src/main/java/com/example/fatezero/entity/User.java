package com.example.fatezero.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    @ApiModelProperty("用户")
    private String user;
    @ApiModelProperty("密码")
    private String password;
}
