package com.xiaozhi.service;

import com.xiaozhi.common.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozhi on 2017/10/16.
 */

public interface UserService {
    public User getUserById(int userId);
}
