package com.ratel.sso.user.controller;

import com.ratel.sso.common.web.WebResult;
import com.ratel.sso.common.web.WebResultFactory;
import com.ratel.sso.constant.ApiConstant;
import com.ratel.sso.user.entity.ApiParam.LoginParam;
import com.ratel.sso.user.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ratel
 * @date 2020/3/2
 */
@RestController
@RequestMapping(ApiConstant.USER_API_SUFFIX)
@Api(tags = "用户登录相关接口")
public class UserController {
    @Autowired
    private SysUserService userService;

    @PostMapping(ApiConstant.LOGIN)
    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "ratel", required = true),
            @ApiImplicitParam(name = "password", value = "密码", defaultValue = "123456", required = true),
            @ApiImplicitParam(name = "autoCode", value = "验证码", defaultValue = "1234", required = true)
    }
    )
    public WebResult login(@RequestBody LoginParam loginParam){
        return WebResultFactory.success(userService.getUserByUserName(loginParam.getUsername()));
    }
}
