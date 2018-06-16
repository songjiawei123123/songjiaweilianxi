package com.bwie.song_erzhou_moni.model;

import com.bwie.song_erzhou_moni.RetrofitUtils;
import com.bwie.song_erzhou_moni.bean.MessageBean;
import com.bwie.song_erzhou_moni.parenter.DelPresenter;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018\6\16 0016.
 */

public class DelModel implements IModel {
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }

    @Override
    public void getData(String uid, String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}
