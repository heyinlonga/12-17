package com.example.mvp_project.model;

import com.example.mvp_project.contract.MainContract;
import com.example.mvp_project.utils.INetCallBack;
import com.example.mvp_project.utils.RetrofitUtils;

public class MainModel implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModel(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getList(String url, INetCallBack<T> callBack) {
        presenter.listResult("成功");
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }
}
