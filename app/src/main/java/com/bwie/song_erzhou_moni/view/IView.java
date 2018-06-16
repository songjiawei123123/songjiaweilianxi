package com.bwie.song_erzhou_moni.view;

import com.bwie.song_erzhou_moni.bean.MessageBean;

/**
 * Created by Administrator on 2018\6\16 0016.
 */

public interface IView {
    void onSuccess(Object o);
    void onFailed(Exception e);

    void delSuccess(MessageBean listMessageBean);
}
