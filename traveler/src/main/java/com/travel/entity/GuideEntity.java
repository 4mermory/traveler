package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:导游实体类
 * @Date:created in  2017-12-2017/12/18  23:49
 * @Modified By:
 */

public class GuideEntity {
    /**
     * com.travel.entity
     * 导游实体类
     * @author 4mermory
     * @create 2017-12-18 23:49
     * guide_id   导游编号
     * guide_name 导游姓名
     * guide_sex  导游性别
     * guide_age  导游年龄
     * guide_idcard  导游身份证
     * guide_tel     导游联系号码
     * guide_language 导游语言
     * guide_type     导游类型
     **/
    private Integer guide_id;
    private String guide_name;
    private String guide_sex;
    private int guide_age;
    private String guide_idcard;
    private String guide_tel;
    private String guide_language;
    private String guide_type;


    private Set<CompanyEntity> companyEntity;


}
