package com.etexsoft.arkstore.domain;

import javax.persistence.*;

/**
 * Created by Андрей on 25.01.2016.
 * Статус користувача: Адмыныстратор, Менеджер ы т.д.
 */

@Entity
@Table(name = "UserStatus")
public class UserStatus {

    UserStatus () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    private String status;

}
