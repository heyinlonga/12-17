package com.example.mvp_project.contract;

import com.example.mvp_project.bean.DatBean;
import com.example.mvp_project.utils.INetCallBack;

public class MainContract {
    public interface IMainModel{
        <T> void getList(String url , INetCallBack<T> callBack);
    }
    public interface IMainPresenter{
        void getList();
        void listResult(String result);
    }
    public interface IMainView{
        void getList(DatBean datBean);
    }
}
