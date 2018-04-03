package com.example.hello.myjd.presenter.inter;


import com.example.hello.myjd.model.bean.CartBean;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public interface CartPresenterInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}
