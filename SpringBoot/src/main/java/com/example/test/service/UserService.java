package com.example.test.service;

import com.example.test.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author libo
 * @since 2021-04-27
 */
public interface UserService extends IService<User> {

    /**
     * @Author libo
     * @Description: 返回数据库所有数据信息
     * @Date 14:34 2021/4/27
     * @Param
     * @return
     **/
    public List<User> getList();
}
