package com.travel.dao;

import com.travel.entity.AttractionInfoEntity;

import java.util.List;

/**
 * @Author:4mermory
 * @Description:
 * @Date:created in  2017-12-2017/12/18  16:33
 * @Modified By:
 */
public interface AttractionInfoDao {

    public AttractionInfoEntity queryOne(int attr_id);

    public List<AttractionInfoEntity> queryAll();

}
