package com.ratel.sso.user.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
/**
 * @author ratel
 * @date 2020/3/2
 */
@ApiModel(value="com.ratel.sso.user.entity.po.SysUser")
@TableName(value = "sys_user")
public class SysUser {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * -1 隐藏 0男 1女
     */
    @TableField(value = "six")
    @ApiModelProperty(value="-1 隐藏 0男 1女")
    private Integer six;

    /**
     * 年龄
     */
    @TableField(value = "age")
    @ApiModelProperty(value="年龄")
    private Integer age;

    /**
     * 电话
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="电话")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
     * 创建人
     */
    @TableField(value = "creator")
    @ApiModelProperty(value="创建人")
    private Long creator;

    /**
     * 修改人
     */
    @TableField(value = "modifier")
    @ApiModelProperty(value="修改人")
    private Long modifier;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "modify_time")
    @ApiModelProperty(value="修改时间")
    private Date modifyTime;

    /**
     * 注册来源 app/web/client
     */
    @TableField(value = "source")
    @ApiModelProperty(value="注册来源 app/web/client")
    private String source;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取-1 隐藏 0男 1女
     *
     * @return six - -1 隐藏 0男 1女
     */
    public Integer getSix() {
        return six;
    }

    /**
     * 设置-1 隐藏 0男 1女
     *
     * @param six -1 隐藏 0男 1女
     */
    public void setSix(Integer six) {
        this.six = six;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public Long getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取注册来源 app/web/client
     *
     * @return source - 注册来源 app/web/client
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置注册来源 app/web/client
     *
     * @param source 注册来源 app/web/client
     */
    public void setSource(String source) {
        this.source = source;
    }
}