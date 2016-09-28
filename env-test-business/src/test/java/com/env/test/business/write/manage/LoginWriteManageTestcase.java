package com.env.test.business.write.manage;

import com.env.test.model.po.Login;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shj on 16-9-26.
 */
public class LoginWriteManageTestcase extends TestCase {

    private LoginWriteManage loginWriteManage;


    public LoginWriteManageTestcase() {
        System.setProperty("global.config.path","/home/shj/dev/env/env-dev");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("env-test-business/spring-service.xml");
        loginWriteManage = (LoginWriteManage) applicationContext.getBean("loginWriteManageImpl");
    }


    public void testSaveLogin(){
        Login login = new Login();
        login.setAccount("ody");
        login.setPassword("ody123");
        try {
            loginWriteManage.saveLogin(login);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }

}
