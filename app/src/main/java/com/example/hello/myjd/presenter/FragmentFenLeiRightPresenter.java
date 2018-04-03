package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.FragmentFenLeiRightModel;
import com.example.hello.myjd.model.bean.ChildFenLeiBean;
import com.example.hello.myjd.presenter.inter.FenLeiRightPresenterInter;
import com.example.hello.myjd.view.Iview.FenLeiRightInter;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public class FragmentFenLeiRightPresenter implements FenLeiRightPresenterInter {

    private FenLeiRightInter fenLeiRightInter;
    private FragmentFenLeiRightModel fragmentFenLeiRightModel;

    public FragmentFenLeiRightPresenter(FenLeiRightInter fenLeiRightInter) {
        this.fenLeiRightInter = fenLeiRightInter;

        fragmentFenLeiRightModel = new FragmentFenLeiRightModel(this);
    }

    public void getChildData(String childFenLeiUrl, int cid) {

        fragmentFenLeiRightModel.getChildData(childFenLeiUrl,cid);
    }

    @Override
    public void onSuncess(ChildFenLeiBean childFenLeiBean) {

        fenLeiRightInter.getSuccessChildData(childFenLeiBean);

    }
}
