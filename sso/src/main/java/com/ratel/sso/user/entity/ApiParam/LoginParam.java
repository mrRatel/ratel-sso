package com.ratel.sso.user.entity.ApiParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Data
@ApiModel(value="com.ratel.sso.user.entity.ApiParam.LoginParam")
public class LoginParam {
    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value="密码")
    private String password;
    /**
     * 验证码
     */
    @ApiModelProperty(value="验证码")
    private String authCode;
}
