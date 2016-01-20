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

    public boolean isClientType() {
        return clientType;
    }

    public void setClientType(boolean clientType) {
        this.clientType = clientType;
    }

    public String getEdrpou() {
        return edrpou;
    }

    public void setEdrpou(String edrpou) {
        this.edrpou = edrpou;
    }

    public String getIpn() {
        return ipn;
    }

    public void setIpn(String ipn) {
        this.ipn = ipn;
    }

    public String getFullNane() {
        return fullNane;
    }

    public void setFullNane(String fullNane) {
        this.fullNane = fullNane;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    private class contactPerson {

        private String surname; /*Прізвище контактної особи*/
        private String name; /*Ім'я контактної особи*/
        private String midName; /*По батькові контактної особи*/

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }


        @Override
        public String toString() {
            return "contactPerson{}" + "Прізвище: " +surname+ "Ім'я: "+ name + "По батькові: "+ midName;
        }
    }

    private boolean clientType; /* Тип клієнта - true = Юрособа -  false = Фізособа */
    private String edrpou; /*ЄДРПОУ юрособи*/
    private String ipn; /*ІПН фізособи*/
    private String fullNane; /*Повне найменування клієнта*/
    private String shortName; /*Скорочене найменування клієнта*/
    private User manager; /*Менеджер, який працює з клієнтом*/
    private ArrayList <String> phoneNumber = new ArrayList <String>(); /*Телефонні номери*/
    private ArrayList <String> cellNumber = new ArrayList <String>(); /*Мобільні номери*/
    private ArrayList <contactPerson> clientContactPerson = new ArrayList <contactPerson>(); /*Список контактних осіб*/
    private ArrayList <Client> historyOfChanges = new ArrayList<Client>(); /*Збереження історії змін даних про клієнта*/


    Client () {

    }
}
