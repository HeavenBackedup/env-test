package com.env.test.web.controller;

import com.env.test.business.read.manage.LoginReadManage;
import com.env.test.business.write.manage.LoginWriteManage;
import com.env.test.business.write.manage.impl.LoginWriteManageImpl;
import com.env.test.model.po.Login;
import com.env.test.web.util.BaseAction;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by shj on 16-9-27.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginAction extends BaseAction{

    private Logger logger = Logger.getLogger(LoginAction.class);

    @Autowired
    private LoginReadManage loginReadManage;

    @RequestMapping(value = "/saveAccount" ,consumes = APPLICATION_JSON, method = RequestMethod.POST)
    public @ResponseBody
    Object login(@RequestBody Login login){
        try {
            Integer result = loginReadManage.login(login);
            if(result==null){
                return failReturnObject("登录失败");
            }else if(result.intValue()==1) {
                return successReturnObject("登录成功");
            }else {
                return failReturnObject("用户名或密码不正确");
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return failReturnObject("系统异常");
        }

    }
}
