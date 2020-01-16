package com.atliyuan.oa.controller;

import com.atliyuan.oa.common.ServerResponse;
import com.atliyuan.oa.dao.UserDao;
import com.atliyuan.oa.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author 黎源
 * @date 2019/12/15 23:40
 */
@Controller
public class HelloController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/hello")
    @ResponseBody
    public ServerResponse sayHello()
    {
        return ServerResponse.createResposneBySuccess(userDao.selectAllUser());
    }


}
