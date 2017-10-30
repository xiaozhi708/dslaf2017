package com.xiaozhi.common.entity;

import javax.persistence.*;


@Entity
@Table(name = "t_user")
public class User {
    @Id
    private Integer id;
    @Column(name = "count")
    private String count;
    @Column(name = "password")
    private String password;
    @Column(name = "nickname")
    private String nickname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", count='" + count + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
