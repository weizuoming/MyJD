package com.example.hello.myjd.model;


import com.example.hello.myjd.model.bean.RegistBean;
import com.example.hello.myjd.presenter.inter.RegistPresenterInter;
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
public class RegistModel {
    private RegistPresenterInter registPresenterInter;

    public RegistModel(RegistPresenterInter registPresenterInter) {
        this.registPresenterInter = registPresenterInter;
    }

    public void registUser(String registUrl, String name, String pwd) {

        Map<String, String> params = new HashMap<>();
        params.put("mobile",name);
        params.put("password",pwd);

        OkHttp3Util_03.doPost(registUrl, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {

                    String json = response.body().string();

                    final RegistBean registBean = new Gson().fromJson(json,RegistBean.class);

                    CommonUtils.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
                            registPresenterInter.onRegistSuccess(registBean);
                        }
                    });

                }
            }
        });

    }
}
