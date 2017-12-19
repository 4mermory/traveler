package com.travel.entity;

import java.util.List;
import java.util.Set;

/**
 * @Author:4mermory
 * @Description:团成员实体类
 * @Date:created in  2017-12-2017/12/19  0:18
 * @Modified By:
 */

public class UsTeamEntity {

    /**
     * com.travel.entity
     * 团成员实体类
     * @author 4mermory
     * @create 2017-12-19 0:18
     * uteam_id 团成员编号
     * team_id  团编号
     * userInfoEntityList  成员编号
     * uteam_remark   团成员信息备注
     **/
    private Integer uteam_id;
    private String  team_id;
    private String uteam_remark;
    private Set<UsTeamEntity> usTeamEntity;


}
