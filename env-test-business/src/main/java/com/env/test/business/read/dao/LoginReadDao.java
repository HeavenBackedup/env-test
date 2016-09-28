package com.env.test.business.read.dao;

import com.env.test.model.po.Login;

/**
 * Created by shj on 16-9-28.
 */
public interface LoginReadDao
{
    /**
     *
     * @param login
     * @return
     * @throws Exception
     */
    Integer login(Login login) throws Exception;
}
