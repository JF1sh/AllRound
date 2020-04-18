package cn.allRound.dream.mapper;


import cn.allRound.dream.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findByLoginName(String loginName);

    List<User> list();

}