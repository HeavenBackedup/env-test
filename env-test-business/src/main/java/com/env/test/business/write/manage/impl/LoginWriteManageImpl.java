package com.env.test.business.write.manage.impl;

import com.env.test.business.write.dao.LoginWriteDao;
import com.env.test.business.write.manage.LoginWriteManage;
import com.env.test.model.po.Login;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shj on 16-9-26.
 */
@Service
public class LoginWriteManageImpl implements LoginWriteManage{

    private Logger logger = Logger.getLogger(LoginWriteManageImpl.class);

    @Autowired
    private LoginWriteDao loginWriteDao;



    @Override
    public void saveLogin(Login login) throws Exception {
        try {
            loginWriteDao.insertLogin(login);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw e;
        }

    }
}
