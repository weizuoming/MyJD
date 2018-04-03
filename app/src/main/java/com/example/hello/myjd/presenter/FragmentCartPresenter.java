package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.CartModel;
import com.example.hello.myjd.model.bean.CartBean;
import com.example.hello.myjd.presenter.inter.CartPresenterInter;
import com.example.hello.myjd.view.Iview.FragmentCartInter;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public class FragmentCartPresenter implements CartPresenterInter {

    private FragmentCartInter fragmentCartInter;
    private CartModel cartModel;

    public FragmentCartPresenter(FragmentCartInter fragmentCartInter) {
        this.fragmentCartInter = fragmentCartInter;

        cartModel = new CartModel(this);
    }

    public void getCartData(String selectCart, String uid) {

        cartModel.getCartData(selectCart,uid);

    }

    @Override
    public void getCartDataNull() {
        fragmentCartInter.getCartDataNull();
    }

    @Override
    public void getCartDataSuccess(CartBean cartBean) {
        fragmentCartInter.getCartDataSuccess(cartBean);
    }
}
