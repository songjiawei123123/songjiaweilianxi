package com.bwie.song_erzhou_moni.model;

import com.bwie.song_erzhou_moni.parenter.NewsPresenter;

/**
 * Created by Administrator on 2018\6\16 0016.
 */

public class NewsModel implements IModel {
    private NewsPresenter presenter;

    public NewsModel(NewsPresenter presenter){
        this.presenter = (NewsPresenter) presenter;

    }


    @Override
    public void getData(String uid, String pid) {

    }
}