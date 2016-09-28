package com.env.test.business.read.manage.impl;

import com.env.test.business.read.dao.LoginReadDao;
import com.env.test.business.read.manage.LoginReadManage;
import com.env.test.model.po.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shj on 16-9-28.
 */
@Service
public class LoginReadManageImpl implements LoginReadManage {
    @Autowired
    private LoginReadDao loginReadDao;
    @Override
    public Integer login(Login login) throws Exception {
        return loginReadDao.login(login);
    }
}
