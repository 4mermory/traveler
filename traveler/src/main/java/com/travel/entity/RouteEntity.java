package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:路线实体类
 * @Date:created in  2017-12-2017/12/18  23:56
 * @Modified By:
 */

public class RouteEntity {
    /**
     * com.travel.entity
     * 路线实体类
     * @author 4mermory
     * @create 2017-12-18 23:56
     * route_id   路线编号
     * route_name 路线名称
     * route_steptime 路线开始时
     * route_endtime  路线结束时
     * route_type 路线类型
     * route_city 路线所在城市
//     * activiti_id      活动编号
     * route_startplace 路线开始地点
     * route_endplace   路线目的地
     * route_url     路线路径
     * route_price   路线报价
     * route_price_remark 路线备注
     * route_except_price 路线不包备注
     * route_total  路线总价
     * route_info   路线信息
     **/
     private Integer route_id;
     private String route_name;
     private String route_steptime;
     private String route_endtime;
     private String route_type;
     private String route_city;
//     private String activiti_id;
     private String route_startplace;
     private String route_endplace;
     private String route_url;
     private String route_price;
     private String route_price_remark;
     private String route_except_price;
     private String route_total;
     private String route_info;

 /**
  * @Description:路线与公司 多对多
  * @Description:路线与景点 多对多
  * @Description:路线与交通 多对多
  * @Description:路线与导游 多对多
  * @Description:路线与宾馆 多对多
  */
    private Set<CompanyEntity> companyEntitiy;
    private Set<AttractionInfoEntity> attractionInfoEntity;
    private  Set<TrafficEntity> trafficEntity;
    private Set<GuideEntity> guideEntity;
    private Set<HotelEntity> hotelEntity;





}
