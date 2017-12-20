package com.travel.entity;/**
 * @Author:4mermory
 * @Description:用户信息实体类
 * @Date:created in  2017-12-2017/12/18  16:29
 * @Modified By:
 */

public class UserInfoEntity {
    /**
     * com.travel.entity
     * 用户详细信息实体类
     * @author 4mermory
     * @create 2017-12-18 21:41
     * uinfo_id   用户编号
     * uinfo_name 用户姓名
     * uinfo_pwd  用户密码
     * uinfo_type 用户类型
     * uinfo_sex  用户性别
     * uinfo_qw   用户QQ/WEIXin
     * uinfo_account  用户头像
     * uinfo_address  用户地址
     * uinfo_tel    用户电话
     * uinfo_remark 用户备注
     * uinfo_email  用户电子邮箱
     * uinfo_birth  用户出生日期
     * uinfo_idcard 用户身份证
     **/
    private Integer uinfo_id;
    private String uinfo_name;
    private String uinfo_pwd;
    private String uinfo_type;
    private String uinfo_sex;
    private String uinfo_qw;
    private String uinfo_account;
    private String uinfo_address;
    private String uinfo_tel;
    private String uinfo_remark;
    private String uinfo_email;
    private String uinfo_birth;
    private String uinfo_idcard;

    public UserInfoEntity(Integer uinfo_id, String uinfo_name, String uinfo_pwd, String uinfo_type, String uinfo_sex, String uinfo_qw, String uinfo_account, String uinfo_address, String uinfo_tel, String uinfo_remark, String uinfo_email, String uinfo_birth, String uinfo_idcard) {
        this.uinfo_id = uinfo_id;
        this.uinfo_name = uinfo_name;
        this.uinfo_pwd = uinfo_pwd;
        this.uinfo_type = uinfo_type;
        this.uinfo_sex = uinfo_sex;
        this.uinfo_qw = uinfo_qw;
        this.uinfo_account = uinfo_account;
        this.uinfo_address = uinfo_address;
        this.uinfo_tel = uinfo_tel;
        this.uinfo_remark = uinfo_remark;
        this.uinfo_email = uinfo_email;
        this.uinfo_birth = uinfo_birth;
        this.uinfo_idcard = uinfo_idcard;
    }


    public Integer getUinfo_id() {
        return uinfo_id;
    }

    public void setUinfo_id(Integer uinfo_id) {
        this.uinfo_id = uinfo_id;
    }

    public String getUinfo_name() {
        return uinfo_name;
    }

    public void setUinfo_name(String uinfo_name) {
        this.uinfo_name = uinfo_name;
    }

    public String getUinfo_pwd() {
        return uinfo_pwd;
    }

    public void setUinfo_pwd(String uinfo_pwd) {
        this.uinfo_pwd = uinfo_pwd;
    }

    public String getUinfo_type() {
        return uinfo_type;
    }

    public void setUinfo_type(String uinfo_type) {
        this.uinfo_type = uinfo_type;
    }

    public String getUinfo_sex() {
        return uinfo_sex;
    }

    public void setUinfo_sex(String uinfo_sex) {
        this.uinfo_sex = uinfo_sex;
    }

    public String getUinfo_qw() {
        return uinfo_qw;
    }

    public void setUinfo_qw(String uinfo_qw) {
        this.uinfo_qw = uinfo_qw;
    }

    public String getUinfo_account() {
        return uinfo_account;
    }

    public void setUinfo_account(String uinfo_account) {
        this.uinfo_account = uinfo_account;
    }

    public String getUinfo_address() {
        return uinfo_address;
    }

    public void setUinfo_address(String uinfo_address) {
        this.uinfo_address = uinfo_address;
    }

    public String getUinfo_tel() {
        return uinfo_tel;
    }

    public void setUinfo_tel(String uinfo_tel) {
        this.uinfo_tel = uinfo_tel;
    }

    public String getUinfo_remark() {
        return uinfo_remark;
    }

    public void setUinfo_remark(String uinfo_remark) {
        this.uinfo_remark = uinfo_remark;
    }

    public String getUinfo_email() {
        return uinfo_email;
    }

    public void setUinfo_email(String uinfo_email) {
        this.uinfo_email = uinfo_email;
    }

    public String getUinfo_birth() {
        return uinfo_birth;
    }

    public void setUinfo_birth(String uinfo_birth) {
        this.uinfo_birth = uinfo_birth;
    }

    public String getUinfo_idcard() {
        return uinfo_idcard;
    }

    public void setUinfo_idcard(String uinfo_idcard) {
        this.uinfo_idcard = uinfo_idcard;
    }
}
