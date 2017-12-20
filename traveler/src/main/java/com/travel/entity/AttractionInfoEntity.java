package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:景点详细信息实体类
 * @Date:created in  2017-12-2017/12/18  21:41
 * @Modified By:
 */

public class AttractionInfoEntity {
    /**
     * com.travel.entity
     * 景点详细信息实体类
     * @author 4mermory
     * @create 2017-12-18 21:41
     * attr_id   景点编号
     * attr_name 景点名称
     * attr_type 景点类型
     * attr_location 景点方位
     * attr_traffic  景点交通
     * attr_price    景点报价
     * attr_tel   景点联系方
     * attr_info  景点信息
     * attr_image 景点图片
     **/
    private Integer attr_id;
    private String attr_name;
    private String attr_type;
    private String attr_location;
    private String attr_traffic;
    private String attr_price;
    private String attr_tel;
    private String attr_info;
    private String attr_image;
/**
 *@Author:mermory
 *@Description:景点与路线 多对多
 *@Description:景点与公司 多对多
 */
    private Set<RouteEntity> routeEntitiY;
    private Set<CompanyEntity> companyEntity;

    public AttractionInfoEntity() {
    }

    public AttractionInfoEntity(Integer attr_id, String attr_name, String attr_type, String attr_location, String attr_traffic, String attr_price, String attr_tel, String attr_info, String attr_image, Set<RouteEntity> routeEntitiY, Set<CompanyEntity> companyEntity) {
        this.attr_id = attr_id;
        this.attr_name = attr_name;
        this.attr_type = attr_type;
        this.attr_location = attr_location;
        this.attr_traffic = attr_traffic;
        this.attr_price = attr_price;
        this.attr_tel = attr_tel;
        this.attr_info = attr_info;
        this.attr_image = attr_image;
        this.routeEntitiY = routeEntitiY;
        this.companyEntity = companyEntity;
    }

    @Override
    public String toString() {
        return "AttractionInfoEntity{" +
                "attr_id=" + attr_id +
                ", attr_name='" + attr_name + '\'' +
                ", attr_type='" + attr_type + '\'' +
                ", attr_location='" + attr_location + '\'' +
                ", attr_traffic='" + attr_traffic + '\'' +
                ", attr_price='" + attr_price + '\'' +
                ", attr_tel='" + attr_tel + '\'' +
                ", attr_info='" + attr_info + '\'' +
                ", attr_image='" + attr_image + '\'' +
                ", routeEntitiY=" + routeEntitiY +
                ", companyEntity=" + companyEntity +
                '}';
    }

    public Integer getAttr_id() {
        return attr_id;
    }

    public void setAttr_id(Integer attr_id) {
        this.attr_id = attr_id;
    }

    public String getAttr_name() {
        return attr_name;
    }

    public void setAttr_name(String attr_name) {
        this.attr_name = attr_name;
    }

    public String getAttr_type() {
        return attr_type;
    }

    public void setAttr_type(String attr_type) {
        this.attr_type = attr_type;
    }

    public String getAttr_location() {
        return attr_location;
    }

    public void setAttr_location(String attr_location) {
        this.attr_location = attr_location;
    }

    public String getAttr_traffic() {
        return attr_traffic;
    }

    public void setAttr_traffic(String attr_traffic) {
        this.attr_traffic = attr_traffic;
    }

    public String getAttr_price() {
        return attr_price;
    }

    public void setAttr_price(String attr_price) {
        this.attr_price = attr_price;
    }

    public String getAttr_tel() {
        return attr_tel;
    }

    public void setAttr_tel(String attr_tel) {
        this.attr_tel = attr_tel;
    }

    public String getAttr_info() {
        return attr_info;
    }

    public void setAttr_info(String attr_info) {
        this.attr_info = attr_info;
    }

    public String getAttr_image() {
        return attr_image;
    }

    public void setAttr_image(String attr_image) {
        this.attr_image = attr_image;
    }

    public Set<RouteEntity> getRouteEntitiY() {
        return routeEntitiY;
    }

    public void setRouteEntitiY(Set<RouteEntity> routeEntitiY) {
        this.routeEntitiY = routeEntitiY;
    }

    public Set<CompanyEntity> getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(Set<CompanyEntity> companyEntity) {
        this.companyEntity = companyEntity;
    }
}
