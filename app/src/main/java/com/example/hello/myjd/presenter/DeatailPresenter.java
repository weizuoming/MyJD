package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.DeatilModel;
import com.example.hello.myjd.model.bean.DeatilBean;
import com.example.hello.myjd.presenter.inter.DeatilPresenterInter;
import com.example.hello.myjd.view.Iview.DetailActivityInter;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public class DeatailPresenter implements DeatilPresenterInter {

    private DeatilModel deatilModel;
    private DetailActivityInter detailActivityInter;

    public DeatailPresenter(DetailActivityInter detailActivityInter) {
        this.detailActivityInter = detailActivityInter;

        deatilModel = new DeatilModel(this);

    }

    public void getDetailData(String detailUrl, int pid) {

        deatilModel.getDetailData(detailUrl,pid);
    }

    @Override
    public void onSuccess(DeatilBean deatilBean) {
        //回调给view
        detailActivityInter.onSuccess(deatilBean);
    }
}
