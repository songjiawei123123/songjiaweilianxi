package com.bwie.song_erzhou_moni.api;

import com.bwie.song_erzhou_moni.bean.DatasBean;
import com.bwie.song_erzhou_moni.bean.MessageBean;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2018\6\16 0016.
 */

public interface ApiService {
    //   http://120.27.23.105/product/deleteCart?uid=72&pid=1
    @GET("product/getCarts")
    Flowable<MessageBean<List<DatasBean>>> getDatas(@Query("uid") String uid);
    @GET("product/deleteCart")
    Flowable<MessageBean> deleteData(@Query("uid") String uid, @Query("pid") String pid);
}
