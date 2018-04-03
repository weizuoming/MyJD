package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.AddNewAddrModel;
import com.example.hello.myjd.model.bean.AddNewAddrBean;
import com.example.hello.myjd.presenter.inter.AddNewAddrPresenterInter;
import com.example.hello.myjd.view.Iview.AddNewAddrInter;

/**
 * Created by weizuoming on 2018/2/26.
 */
public class AddNewAddrPresenter implements AddNewAddrPresenterInter {

    private AddNewAddrInter addNewAddrInter;
    private AddNewAddrModel addNewAddrModel;

    public AddNewAddrPresenter(AddNewAddrInter addNewAddrInter) {
        this.addNewAddrInter = addNewAddrInter;
        addNewAddrModel = new AddNewAddrModel(this);
    }

    public void addNewAddr(String addNewAddrUrl, String uid, String addr, String phone, String name) {

        addNewAddrModel.addNewAddr(addNewAddrUrl,uid,addr,phone,name);
    }

    @Override
    public void onAddAddrSuccess(AddNewAddrBean addNewAddrBean) {
        addNewAddrInter.onAddNewAddrSuccess(addNewAddrBean);
    }
}
