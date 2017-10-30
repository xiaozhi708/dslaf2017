package com.xiaozhi.service.impl;

import com.xiaozhi.common.entity.User;
import com.xiaozhi.mapper.UserMapper;
import com.xiaozhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by xiaozhi on 2017/10/16.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
        @Autowired
        private UserMapper userMapper;

        public User getUserById (int userId){
            // TODO Auto-generated method stub
            return userMapper.getUserById();
        }

}
