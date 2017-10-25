//package com.tan.crud.test;
//
//import com.tan.crud.bean.Employee;
//import com.tan.crud.dao.DepartmentMapper;
//import com.tan.crud.dao.EmployeeMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Random;
//import java.util.UUID;
//
///**
// * 测试dao层的工作
// * Created by Tan on 2017/9/1.
// * 推荐spring项目使用spring的单元测试，可以自动注入我们需要的组件
// * 1、导入springTest模块
// * 2、@ContextConfiguration指定spring配置文件的位置
// */
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//public class MapperTest {
//
//    @Autowired
//    DepartmentMapper departmentMapper;
//    @Autowired
//    EmployeeMapper employeeMapper;
//    @Autowired
//    SqlSession sqlSession;
//
//    /**
//     * 测试DepartmentMapper
//     */
//    @Test
//    public void testCRUD(){
//        //1、创建springIOC容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2、从容器中获取Mapper
//        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
////        System.out.println(bean);
////        System.out.println(departmentMapper);
//
//        //1、插入几个部门
////        departmentMapper.insertSelective(new Department(null,"开发部"));
////        departmentMapper.insertSelective(new Department(null,"测试部"));
//
//        //2、插入员工数据
////        employeeMapper.insertSelective(new Employee(null,"zhangsan","M","zhangsan@qq.com",1));
//
//        //3、批量插入多个员工
//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        for (int i=0;i<100;i++) {
//            String uuid = UUID.randomUUID().toString().substring(0,5)+i;
//            mapper.insertSelective(new Employee(null,uuid,"W",uuid+"@qq.com", new Random().nextInt(2)+1));
//        }
//    }
//}
