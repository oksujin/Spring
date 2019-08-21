package com.myproject.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DB_Test {
@Test
public void test() throws Exception {
    Class.forName("org.mariadb.jdbc.Driver"); // 마리아DB

    Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/jspdb", "root",     "sue013126*");// 마리아DB

    System.out.println(con);
    }
}