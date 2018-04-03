package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.AddCartModel;
import com.example.hello.myjd.model.bean.AddCartBean;
import com.example.hello.myjd.presenter.inter.AddCartPresenterInter;
import com.example.hello.myjd.view.Iview.ActivityAddCartInter;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public class AddCartPresenter implements AddCartPresenterInter {

    private ActivityAddCartInter activityAddCartInter;
    private AddCartModel addCartModel;

    public AddCartPresenter(ActivityAddCartInter activityAddCartInter) {
        this.activityAddCartInter = activityAddCartInter;

        addCartModel = new AddCartModel(this);
    }

    public void addToCart(String addCart, String uid, int pid) {

        addCartModel.addToCart(addCart,uid,pid);

    }

    @Override
    public void onCartAddSuccess(AddCartBean addCartBean) {
        activityAddCartInter.onCartAddSuccess(addCartBean);
    }
}
