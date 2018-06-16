package com.bwie.song_erzhou_moni.parenter;

import com.bwie.song_erzhou_moni.bean.MessageBean;
import com.bwie.song_erzhou_moni.model.DelModel;
import com.bwie.song_erzhou_moni.view.IView;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

/**
 * Created by Administrator on 2018\6\16 0016.
 */

public class DelPresenter implements IPresenter {
    private IView iv;
    private DisposableSubscriber subscriber2;

    public void attachView(IView iv) {
        this.iv = iv;
    }

    public void detachView() {
        if (iv != null) {
            iv = null;
        }

        if (!subscriber2.isDisposed()){
            subscriber2.dispose();
        }
    }

    @Override
    public void getData(String uid,String pid) {
        DelModel model = new DelModel(this);
        model.getData(uid,pid);
    }



    public void delData(Flowable<MessageBean> delFlowable) {
        subscriber2 = delFlowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<MessageBean>() {
                    @Override
                    public void onNext(MessageBean listMessageBean) {
                        if (listMessageBean != null) {
                            iv.delSuccess(listMessageBean);

                        }
                    }



                    @Override
                    public void onError(Throwable t) {
                        iv.onFailed((Exception) t);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }



    }