package com.example.mvp_project.presenter;

import com.example.mvp_project.MainActivity;
import com.example.mvp_project.base.BasePresenter;
import com.example.mvp_project.bean.DatBean;
import com.example.mvp_project.contract.MainContract;
import com.example.mvp_project.model.MainModel;
import com.example.mvp_project.utils.INetCallBack;

public class MainPresenter extends BasePresenter implements MainContract.IMainPresenter {

    private MainContract.IMainView iMainView;
    private final MainModel mainModel;

    public MainPresenter(MainContract.IMainView iMainView) {
        mainModel = new MainModel(this);
        this.iMainView = iMainView;
    }

    @Override
    public void getList() {
        mainModel.getList("Girl/page/4/count/10", new INetCallBack<DatBean>() {
            @Override
            public void onSuccess(DatBean dataBean) {
                iMainView.getList(dataBean);
            }
        });
    }

    @Override
    public void listResult(String result) {

    }
}
