package com.tan.crud.service;

import com.tan.crud.bean.AdminExample;
import com.tan.crud.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tan on 2017/9/5.
 */
@Service
public class AdminService {

    @Autowired
    AdminMapper adminMapper;

    /**
     * 管理员账户核实
     * @param name
     * @param pwd
     * @return 返回true表示不存在
     */
    public boolean checkAdmin(String name,String pwd){
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdmNameEqualTo(name);
        criteria.andAdmPwdEqualTo(pwd);
        long count = adminMapper.countByExample(example);
        return count == 0 ;
    }
}
