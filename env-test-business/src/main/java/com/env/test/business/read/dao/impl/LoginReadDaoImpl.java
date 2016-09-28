package com.env.test.business.read.dao.impl;

import com.env.test.business.read.dao.LoginReadDao;
import com.env.test.model.po.Login;
import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by shj on 16-9-28.
 */
@Repository
public class LoginReadDaoImpl implements LoginReadDao{

    @Autowired
    @Qualifier("sqlMapClientRead")
    private SqlMapClient sqlMapClient;

    @Override
    public Integer login(Login login) throws Exception {
        return (Integer) sqlMapClient.queryForObject("loginService.login_check",login);
    }
}
