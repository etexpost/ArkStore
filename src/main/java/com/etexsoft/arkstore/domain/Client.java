package com.etexsoft.arkstore.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * Created by Андрей on 20.01.2016.
 * Клиенты компании
 *
 */

@Entity
@Table(name = "clients") /*Данные о клиентах гранятся в таблице clients */
public class Client {
    private String fullNane; /*Полное наименование клиента*/
    private String shortName; /*Сокращенное наименование клиента*/
    private ArrayList <String> = new ArrayList <String>;
}
