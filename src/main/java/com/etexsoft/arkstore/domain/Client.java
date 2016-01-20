package com.etexsoft.arkstore.domain;

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
    private class contactPerson {
        private String surname;
        private String name;
        private String midName;
    }

    private boolean clientType; /* ��� �볺��� - true = ������� -  false = Գ������ */
    private String fullNane; /*����� ������������ �볺���*/
    private String shortName; /*��������� ������������ �볺���*/
    private ArrayList <String> phoneNumber = new ArrayList <String>(); /*�������� ������*/
    private ArrayList <String> cellNumber = new ArrayList <String>(); /*������ ������*/
    private ArrayList <contactPerson> clientContactPerson = new ArrayList <contactPerson>(); /*������ ���������� ���*/
    private User manager; /*��������, ���� ������ � �볺����*/

}
