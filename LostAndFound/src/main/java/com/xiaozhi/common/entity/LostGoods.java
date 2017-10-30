package com.xiaozhi.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by xiaozhi on 2017/10/16.
 */
@Entity
@Table(name = "t_lostGoods")
public class LostGoods {
    @Id
    private Integer id;
    @Column(name = "l_name")
    private String l_name;
    @Column(name = "l_place")
    private String l_place;
    @Column(name = "l_date")
    private Date l_date;
    @Column(name = "l_pic")
    private String l_pic;
    @Column(name = "l_des")
    private String l_des;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getL_place() {
        return l_place;
    }

    public void setL_place(String l_place) {
        this.l_place = l_place;
    }

    public Date getL_date() {
        return l_date;
    }

    public void setL_date(Date l_date) {
        this.l_date = l_date;
    }

    public String getL_pic() {
        return l_pic;
    }

    public void setL_pic(String l_pic) {
        this.l_pic = l_pic;
    }

    public String getL_des() {
        return l_des;
    }

    public void setL_des(String l_des) {
        this.l_des = l_des;
    }

    @Override
    public String toString() {
        return "LostGoods{" +
                "id=" + id +
                ", l_name='" + l_name + '\'' +
                ", l_place='" + l_place + '\'' +
                ", l_date=" + l_date +
                ", l_pic='" + l_pic + '\'' +
                ", l_des='" + l_des + '\'' +
                '}';
    }
}
