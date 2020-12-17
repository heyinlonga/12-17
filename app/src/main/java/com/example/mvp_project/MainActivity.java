package com.example.mvp_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mvp_project.adapter.DataAdapter;
import com.example.mvp_project.base.BaseActivity;
import com.example.mvp_project.bean.DatBean;
import com.example.mvp_project.contract.MainContract;
import com.example.mvp_project.presenter.MainPresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView {

    private RecyclerView mRlv;
    private ArrayList<DatBean.DataBean> list;
    private DataAdapter dataAdapter;

    @Override
    protected void initData() {
       presenter.getList();
       mRlv.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        dataAdapter = new DataAdapter(this, list);
        mRlv.setAdapter(dataAdapter);

    }

    public void initView() {
        mRlv = findViewById(R.id.rlv);
    }

    @Override
    protected MainPresenter getPresenter()  {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void getList(DatBean datBean) {
        list.addAll(datBean.getData());
        dataAdapter.notifyDataSetChanged();
    }
}