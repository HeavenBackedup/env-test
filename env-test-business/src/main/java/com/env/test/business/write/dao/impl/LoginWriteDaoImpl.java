package com.env.test.business.write.dao.impl;

import com.env.test.business.write.dao.LoginWriteDao;
import com.env.test.model.po.Login;
import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by shj on 16-9-26.
 */
@Repository
public class LoginWriteDaoImpl implements LoginWriteDao{
    @Autowired
    @Qualifier("sqlMapClientWrite")
    private SqlMapClient sqlMapClient;

    @Override
    public void insertLogin(Login login) throws Exception {
        sqlMapClient.insert("loginService.insert_login",login);
    }
}
