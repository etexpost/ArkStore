package com.etexsoft.arkstore.domain;

import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * Created by ������ on 20.01.2016.
 * ��賺��� ������
 *
 */


@Entity
@Table(name = "clients") /*��� ��� �볺��� ����������� � ������� clients */
public class Client {

    Client () {

    }

    private class ContactPerson {

        private String surname; /*������� ��������� �����*/
        private String name; /*��'� ��������� �����*/
        private String midName; /*�� ������� ��������� �����*/

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
            return "contactPerson{}" + "�������: " +surname+ "��'�: "+ name + "�� �������: "+ midName;
        }
    }

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

    public LocalGregorianCalendar.Date getDateOfChange() {
        return dateOfChange;
    }

    public void setDateOfChange(LocalGregorianCalendar.Date dateOfChange) {
        this.dateOfChange = dateOfChange;
    }

    public User getWhoMadeChanges() {
        return whoMadeChanges;
    }

    public void setWhoMadeChanges(User whoMadeChanges) {
        this.whoMadeChanges = whoMadeChanges;
    }


    private boolean clientType; /* ��� �볺��� - true = ������� -  false = Գ������ */
    private String edrpou; /*������ �������*/
    private String ipn; /*��� ��������*/
    private String fullNane; /*����� ������������ �볺���*/
    private String shortName; /*��������� ������������ �볺���*/
    private User manager; /*��������, ���� ������ � �볺����*/
    private LocalGregorianCalendar.Date dateOfChange; /*���� ������� ��� ����� ��� �볺���*/
    private User whoMadeChanges; /*��� ��� ���� �� ������, ��� ������� �����*/
    private ArrayList <String> phoneNumber = new ArrayList <String>(); /*�������� ������*/
    private ArrayList <String> cellNumber = new ArrayList <String>(); /*������ ������*/
    private ArrayList <ContactPerson> clientContactPerson = new ArrayList <ContactPerson>(); /*������ ���������� ���*/
    private ArrayList <Client> historyOfChanges = new ArrayList<Client>(); /*���������� ����� ��� ����� ��� �볺���*/

    /*��������� ������ ��������*/
    public void addPhoneNumber(String phone) {
        this.phoneNumber.add(phone);
    }

    /*��������� ������ ���������*/
    public void addCellNumber(String cellphone) {
        this.cellNumber.add(cellphone);
    }

    /*��������� ���������� �����*/
    public void addClientContactPerson(ContactPerson contactPerson) {
        this.clientContactPerson.add(contactPerson);
    }

 /*   public void addHistoryOfChanges(Client client) {
        client.setDateOfChange();   *//*�������� ������� ����*//*
        client.setWhoMadeChanges(); *//*�������� ��������� �����������*//*
        this.historyOfChanges.add(client);
    }*/



}
