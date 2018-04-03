package com.example.hello.myjd.presenter;


import com.example.hello.myjd.model.ProductListModel;
import com.example.hello.myjd.model.bean.ProductListBean;
import com.example.hello.myjd.presenter.inter.ProductListPresenterInter;
import com.example.hello.myjd.view.Iview.ProductListActivityInter;

/**
 * Created by 韦作铭 on 2018/3/2.
 */
public class ProductListPresenter implements ProductListPresenterInter {

    private ProductListModel productListModel;
    private ProductListActivityInter productListActivityInter;

    public ProductListPresenter(ProductListActivityInter productListActivityInter) {
        this.productListActivityInter = productListActivityInter;

        productListModel = new ProductListModel(this);
    }

    public void getProductData(String seartchUrl, String keywords, int page) {

        productListModel.getProductData(seartchUrl,keywords,page);
    }

    @Override
    public void onSuccess(ProductListBean productListBean) {
        productListActivityInter.getProductDataSuccess(productListBean);
    }
}
