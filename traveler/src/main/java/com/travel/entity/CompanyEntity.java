package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:公司实体类
 * @Date:created in  2017-12-2017/12/19  0:31
 * @Modified By:
 */

public class CompanyEntity {
    /**
     * com.travel.entity
     * 公司实体类
     * @author 4mermory
     * @create 2017-12-19 0:31
     * company_id   公司编号
     * company_name 公司名称
     * company_type   公司类型
     * company_remark 公司备注
     * getCompany_relation 公司关系
     **/
    private Integer company_id;
    private String company_name;
    private String company_type;
    private String company_remark;
    private String getCompany_relation;

    /**
     * @Description:公司与路线 多对多
     * @Description:公司与景点 多对多
     * @Description:公司与宾馆 多对多
     * @Description:公司与交通 多对多
     * @Description:公司与导游 多对多
     */
    private Set<RouteEntity> routeEntity;
    private Set<AttractionInfoEntity> attractionInfoEntity;
    private Set<HotelEntity> hotelEntity;
    private Set<TrafficEntity> trafficEntity;
    private Set<GuideEntity> guideEntity;



}
