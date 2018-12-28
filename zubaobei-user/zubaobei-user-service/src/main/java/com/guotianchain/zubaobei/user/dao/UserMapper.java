package com.guotianchain.zubaobei.user.dao;


import com.guotianchain.zubaobei.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 根据UID查询用户
     *
     * @param uid 用户ID
     * @return 用户
     */
    User selectUserByUID(String uid);

    /**
     * 查询全部用户记录
     * @return
     */
    List<User> selectAll();

    /**
     * 添加用户
     * @param entity
     * @return
     */
    int addUser(User entity);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 更新用户状态
     * @param uid
     * @param status
     * @return
     */
    int updateUserStatus(@Param("uid") String uid, @Param("status") int status);


    /**
     * 更新用户登录密码
     * @param uid
     * @param password
     * @return
     */
    int updateUserPassword(@Param("uid") String uid, @Param("password") String password);

    /**
     * 更新用户用户昵称
     * @param uid
     * @param name
     * @return
     */
    int updateUserName(@Param("uid") String uid, @Param("name") String name);

    /**
     * @Title 根据UID删除用户
     * @param uid 用户ID
     * @return
     */
    int deleteUserByUID(@Param("uid") String uid);

}
