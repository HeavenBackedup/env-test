package com.env.test.business.write.dao;

import com.env.test.model.po.Login;

/**
 * Created by shj on 16-9-26.
 */
public interface LoginWriteDao {
    void insertLogin(Login login) throws Exception;
}
