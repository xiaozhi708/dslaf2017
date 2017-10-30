package com.xiaozhi.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xiaozhi on 2017/10/17.
 */
@Entity
@Table(name = "t_relation")
public class Relation {
    @Id
    private Integer id;
    @Column(name ="user_id")
    private Integer user_id;
    @Column(name = "friend_id")
    private Integer friend_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(Integer friend_id) {
        this.friend_id = friend_id;
    }

    @Override
    public String toString() {
        return "Relation{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", friend_id=" + friend_id +
                '}';
    }
}
