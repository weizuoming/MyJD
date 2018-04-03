package com.example.hello.myjd.presenter.inter;


import com.example.hello.myjd.model.bean.LoginBean;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public interface LoginPresenterInter {

    void onSuccess(LoginBean loginBean);


    void onSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}
