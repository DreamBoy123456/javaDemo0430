package com.example.test.mapper;

import com.example.test.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author libo
 * @since 2021-04-27
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * @Author libo
     * @Description: 返回所有数据的sql
     * @Date 14:35 2021/4/27
     * @Param
     * @return
     **/
    List<User> getUserList();

}
