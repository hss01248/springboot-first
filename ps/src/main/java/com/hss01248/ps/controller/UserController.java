package com.hss01248.ps.controller;

import com.hss01248.ps.entity.BaseNetBean;
import com.hss01248.ps.entity.User;
import com.hss01248.ps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/7/13.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findUserById")
    public  String findUserById(@RequestParam(value = "id") Integer id, ModelMap modelMap) {
        BaseNetBean<User> baseNetBean = new BaseNetBean<>();
        User user = null;
        try {
            user = userService.findUserById(id);
            baseNetBean.setData(user);
        } catch (Exception e) {
            e.printStackTrace();
            baseNetBean.setCode(1).setMsg(e.getMessage());
        }
        modelMap.put("data",baseNetBean.getData());
        modelMap.put("code",baseNetBean.getCode());
        modelMap.put("msg",baseNetBean.getMsg());
        return "test/web";
    }


}
