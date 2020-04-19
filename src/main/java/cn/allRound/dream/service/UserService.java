package cn.allRound.dream.service;

import cn.allRound.dream.domain.User;
import cn.allRound.dream.dto.UserDto;
import cn.allRound.dream.mapper.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    private static Logger log = Logger.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    /**
     * 登录功能
     * @param dto
     * @return
     */
        public UserDto doLogin(UserDto dto) {
        List<User> userList = userMapper.findByLoginName(dto.getLoginName());
        if (CollectionUtils.isEmpty(userList)) {
            log.info("根据用户名查找不到记录");
            return null;
        } else {
            User user = userList.get(0);
            log.info("根据用户名查找结果：{"+user+"}");
            return validatePassword(dto, user);
        }
    }

    private UserDto validatePassword(UserDto userDto, User user) {
        if (userDto.getPassword().equals(user.getPassword())) {
            BeanUtils.copyProperties(user, userDto);
            return userDto;
        } else {
            log.error("密码错误:"+user.getName()+":"+user.getPassword());
            return null;
        }
    }

    /**
     * @return
     */
    public void list() {

        List<User> userList = userMapper.list();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (i == 1) {
                throw new NullPointerException();
            }else{
                System.out.println("ok");
            }
            System.out.println(user);
        }
    }
}
