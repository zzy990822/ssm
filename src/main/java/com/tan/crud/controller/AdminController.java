package com.tan.crud.controller;

import com.tan.crud.bean.Msg;
import com.tan.crud.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tan on 2017/9/5.
 */
@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @ResponseBody
    @RequestMapping("/admincheck")
    public Msg accountCheck(@RequestParam("admName")String admName,
                            @RequestParam("admPwd")String admPwd){
        boolean b = adminService.checkAdmin(admName,admPwd);
        System.out.println(b);
        if(!b){
            return Msg.success();
        }else{
            return Msg.fail().add("va_msg", "用户名或密码不正确");
        }
    }

}
