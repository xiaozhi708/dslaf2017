package com.xiaozhi.common.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by xiaozhi on 2017/10/16.
 */
@Entity
@Table(name = "t_foundGoods")
public class FoundGoods {
    @Id
    private Integer id;
    @Column(name = "f_name")
    private String f_name;
    @Column(name = "f_place")
    private String f_place;
    @Column(name = "f_date")
    private Date f_date;
    @Column(name = "f_pic")
    private String f_pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getF_place() {
        return f_place;
    }

    public void setF_place(String f_place) {
        this.f_place = f_place;
    }

    public Date getF_date() {
        return f_date;
    }

    public void setF_date(Date f_date) {
        this.f_date = f_date;
    }

    public String getF_pic() {
        return f_pic;
    }

    public void setF_pic(String f_pic) {
        this.f_pic = f_pic;
    }

    @Override
    public String toString() {
        return "FoundGoods{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", f_place='" + f_place + '\'' +
                ", f_date=" + f_date +
                ", f_pic=" + f_pic +
                '}';
    }
}
