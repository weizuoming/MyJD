package com.example.hello.myjd.presenter.inter;


import com.example.hello.myjd.model.bean.FenLeiBean;
import com.example.hello.myjd.model.bean.HomeBean;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public interface FragmentHomePInter {
    //首页的数据
    void onSuccess(HomeBean homeBean);
    //分类
    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}
