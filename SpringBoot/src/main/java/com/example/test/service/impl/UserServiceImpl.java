package com.example.test.service.impl;

import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author libo
 * @since 2021-04-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * @Author libo
     * @Description: 返回数据库所有数据信息
     * @Date 14:34 2021/4/27
     * @Param
     * @return
     **/
    @Override
    public List<User> getList() {
        return baseMapper.getUserList();
    }
}
