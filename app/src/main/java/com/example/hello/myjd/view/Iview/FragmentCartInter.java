package com.example.hello.myjd.view.Iview;


import com.example.hello.myjd.model.bean.CartBean;

/**
 * Created by 韦作铭  on 2018/2/23.
 */
public interface FragmentCartInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}
