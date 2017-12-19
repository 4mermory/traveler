package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:宾馆实体类
 * @Date:created in  2017-12-2017/12/19  0:51
 * @Modified By:
 */

public class HotelEntity {
    /**
     * com.travel.entity
     * 宾馆实体类
     * @author 4mermory
     * @create 2017-12-19 0:51
     * 宾馆编号
     * 宾馆名称
     * 宾馆位置
     * 宾馆类型
     * 宾馆报价
     * 宾馆图片
     * 宾馆联系
     * 宾馆备注
     * 宾馆营业时间
     **/
    private Integer hotel_id;
    private String hotel_name;
    private String hotel_location;
    private String hotel_type;
    private String hotel_price;
    private String hotel_image;
    private String hotel_tel;
    private String hotel_remark;
    private String hotel_setup;
/**
 *@Author:mermory
 *@Description:宾馆与公司 多对多
 */
    private Set<CompanyEntity> companyEntity;

}
