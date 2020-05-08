package org.example.controller;

import org.example.controller.viewobject.UserVO;
import org.example.service.UserService;
import org.example.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daoshun
 * 2020/4/23 22:46
 */
@Controller("user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public UserVO getUser(@RequestParam(name = "id") Integer id) {
        // 调用service服务获取对应id的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);
        return convertFromModel(userModel);
    }

    private UserVO convertFromModel(UserModel userModel) {

        if (userModel == null) {
            return null;
        }
         UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);

        return userVO;
    }
}
