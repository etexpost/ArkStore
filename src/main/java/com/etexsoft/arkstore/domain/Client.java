package com.etexsoft.arkstore.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * Created by ������ on 20.01.2016.
 * ������� ��������
 *
 */

@Entity
@Table(name = "clients") /*������ � �������� �������� � ������� clients */
public class Client {
    private String fullNane; /*������ ������������ �������*/
    private String shortName; /*����������� ������������ �������*/
    private ArrayList <String> = new ArrayList <String>;
}
