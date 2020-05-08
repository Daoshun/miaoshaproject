package org.example.service;

import org.example.service.model.UserModel;

/**
 * Created by Daoshun
 * 2020/4/23 22:54
 */
public interface UserService {

    /**
     * 通过用户ID获取用户对象的方法
     * */
    UserModel getUserById(Integer id);


}
