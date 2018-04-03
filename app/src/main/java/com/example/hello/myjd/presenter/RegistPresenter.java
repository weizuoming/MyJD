package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.RegistModel;
import com.example.hello.myjd.model.bean.RegistBean;
import com.example.hello.myjd.presenter.inter.RegistPresenterInter;
import com.example.hello.myjd.view.Iview.RegistActivityInter;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public class RegistPresenter implements RegistPresenterInter {

    private RegistActivityInter registActivityInter;
    private RegistModel registModel;

    public RegistPresenter(RegistActivityInter registActivityInter) {
        this.registActivityInter = registActivityInter;
        registModel = new RegistModel(this);
    }

    public void registUser(String registUrl, String name, String pwd) {

        registModel.registUser(registUrl,name,pwd);
    }

    @Override
    public void onRegistSuccess(RegistBean registBean) {
        registActivityInter.onRegistSuccess(registBean);
    }
}
