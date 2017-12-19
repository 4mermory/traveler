package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:交通实体类
 * @Date:created in  2017-12-2017/12/19  0:36
 * @Modified By:
 */

public class TrafficEntity {
    /**
     * com.travel.entity
     * 交通实体类
     * @author 4mermory
     * @create 2017-12-19 0:36
     * traffic_id    交通编号
     * traffic_no    交通分类编码
     * traffic_name  交通名称
     * traffic_type  交通类型
     * traffic_count 交通计数
     * traffic_startime  交通开始时间
     * traffic_entime    交通结束时间
     * traffic_price   交通报价
     * traffic_total   交通人数
     * traffic_remark  交通备注
     * traffic_info    交通信息
     **/
    private Integer traffic_id;
    private Integer traffic_no;
    private String traffic_name;
    private String traffic_type;
    private String traffic_count;
    private String traffic_startime;
    private String traffic_entime;
    private String traffic_price;
    private String traffic_total;
    private String traffic_remark;
    private String traffic_info;

    private Set<CompanyEntity> companyEntity;

}
