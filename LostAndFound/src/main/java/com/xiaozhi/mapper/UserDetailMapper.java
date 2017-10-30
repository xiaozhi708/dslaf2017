package com.xiaozhi.mapper;

import com.xiaozhi.common.entity.User;
import org.springframework.stereotype.Repository;


/**
 * Created by Taoyongpan on 2017/5/25.
 */
@Repository
public interface UserDetailMapper {
    public User getUserById();
}
