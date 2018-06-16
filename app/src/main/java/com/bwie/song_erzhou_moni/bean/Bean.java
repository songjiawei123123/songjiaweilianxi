package com.bwie.song_erzhou_moni.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018\6\16 0016.
 */
@Entity
public class Bean {
    public int id;
    public String name;
    @Generated(hash = 1351626606)
    public Bean(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 80546095)
    public Bean() {
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
