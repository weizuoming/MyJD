package com.example.hello.myjd.view.Iview;

import com.example.hello.myjd.model.bean.FenLeiBean;
import com.example.hello.myjd.model.bean.HomeBean;

/**
 * Created by 韦作铭  on 2018/2/23.
 */
public interface InterFragmentHome {
    void onSuccess(HomeBean homeBean);

    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}
