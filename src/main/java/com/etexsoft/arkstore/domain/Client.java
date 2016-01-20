package com.etexsoft.arkstore.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * Created by Андрей on 20.01.2016.
 * Клиієнти компанії
 *
 */

@Entity
@Table(name = "clients") /*Дані про клієнтів зберігаються в таблиці clients */
public class Client {
    private class contactPerson {
        private String surname;
        private String name;
        private String midName;
    }

    private boolean clientType; /* Тип клієнта - true = Юрособа -  false = Фізособа */
    private String fullNane; /*Повне найменування клієнта*/
    private String shortName; /*Скорочене найменування клієнта*/
    private ArrayList <String> phoneNumber = new ArrayList <String>(); /*Телефонні номери*/
    private ArrayList <String> cellNumber = new ArrayList <String>(); /*Мобільні номери*/
    private ArrayList <contactPerson> clientContactPerson = new ArrayList <contactPerson>(); /*Список контактних осіб*/
    private User manager; /*Менеджер, який працює з клієнтом*/

}
