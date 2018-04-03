package com.example.hello.myjd.view.Iview;


import com.example.hello.myjd.model.bean.LoginBean;

/**
 * Created by 韦作铭  on 2018/2/23.
 */
public interface LoginActivityInter {

    void getLoginSuccess(LoginBean loginBean);


    void getLoginSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}
