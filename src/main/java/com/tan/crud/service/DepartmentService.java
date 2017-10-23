package com.tan.crud.service;

import com.tan.crud.bean.Department;
import com.tan.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tan on 2017/9/4.
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 查询所有部门信息
     * @return
     */
    public List<Department> getAll(){
        return departmentMapper.selectByExample(null);
    }


}
