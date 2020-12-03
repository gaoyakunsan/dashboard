package com.gao.dashboardcore.business.dao;

import com.gao.dashboardcore.pojo.Score;

import java.util.List;
import java.util.Map;

public interface ScoreMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    List<Score> getScoreDetail(Map<String, Object> map);
}