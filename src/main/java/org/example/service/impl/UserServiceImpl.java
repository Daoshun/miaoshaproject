package org.example.service.impl;

import org.example.dao.UserDoMapper;
import org.example.dao.UserPasswordDOMapper;
import org.example.dataobject.UserDo;
import org.example.dataobject.UserPasswordDO;
import org.example.service.UserService;
import org.example.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daoshun
 * 2020/4/23 22:56
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Autowired
    private UserDoMapper userDoMapper;

    @Override
    public UserModel getUserById(Integer id) {
        // 调用userdomapper获取到对应的用户dataobject
        UserDo userDo = userDoMapper.selectByPrimaryKey(id);

        if(userDo == null) {
            return null;
        }

        //通过用户id获取对应的用户加密密码信息
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDo.getId());

        return convertFromDataObject(userDo, userPasswordDO);
    }

    private UserModel convertFromDataObject(UserDo userDo, UserPasswordDO userPasswordDO) {

        if(userDo==null) {
            return null;
        }

        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDo, userModel);

        if(userPasswordDO!=null) {
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }

        return  userModel;
    }
}
