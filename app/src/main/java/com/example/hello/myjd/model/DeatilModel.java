package com.example.hello.myjd.model;

import com.example.hello.myjd.model.bean.DeatilBean;
import com.example.hello.myjd.presenter.inter.DeatilPresenterInter;
import com.example.hello.myjd.util.CommonUtils;
import com.example.hello.myjd.util.OkHttp3Util_03;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by 韦作铭 on 2018/4/2.
 */
public class DeatilModel {
    private DeatilPresenterInter deatilPresenterInter;

    public DeatilModel(DeatilPresenterInter deatilPresenterInter) {
        this.deatilPresenterInter = deatilPresenterInter;
    }

    public void getDetailData(String detailUrl, int pid) {

        Map<String, String> params = new HashMap<>();
        params.put("pid", String.valueOf(pid));

        OkHttp3Util_03.doPost(detailUrl, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String json = response.body().string();

                    //解析
                    final DeatilBean deatilBean = new Gson().fromJson(json,DeatilBean.class);
                    //回调给主线程
                    CommonUtils.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
                            deatilPresenterInter.onSuccess(deatilBean);
                        }
                    });
                }
            }
        });
    }
}
