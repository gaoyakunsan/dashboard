package com.gao.dashboardcore.business.dao;

import com.gao.dashboardcore.pojo.Menu;
import com.gao.dashboardcore.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectBySelectiveFields(User record);

    List<Map<String, Object>> getUserMenuByUserId(String userId);

    List<Menu> getUserMenuButton(String userId);

    List<User> getUserDetail(Map<String, Object> map);
}