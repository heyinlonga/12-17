package com.example.mvp_project.utils;

public interface INetWorkInterFace {
   public <T> void get(String url,INetCallBack<T> callBack);
}
