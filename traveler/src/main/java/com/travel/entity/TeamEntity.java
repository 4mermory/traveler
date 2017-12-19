package com.travel.entity;

import java.util.Set;

/**
 * @Author:4mermory
 * @Description:个人团队实体类
 * @Date:created in  2017-12-2017/12/18  23:10
 * @Modified By:
 */

public class TeamEntity {
    /**
     * com.travel.entity
     * 个人团队实体类
     * @author 4mermory
     * @create 2017-12-18 23:10
     * team_id    团队编号
     * team_no    团队编码
     * team_name  团队名称
     * team_startime  团队开始时间
     * team_endtime   团队结束时间
     * team_first_member  团队启始人（负责人）
     * team_member_num    团队人数量
     * team_member_remark 团队人员备注
     * team_member_count  团队人员统计数
     **/
    private Integer team_id;
    private String team_no;
    private String team_name;
    private String team_startime;
    private String team_endtime;
    private String team_first_member;
    private int team_member_num;
    private String team_member_remark;
    private String team_member_count;
//    private Integer guide_id;
//    private Integer route_id;


    private Set<CompanyEntity> companyEntity;













}
