package com.myproject.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DB_Test {
@Test
public void test() throws Exception {
    Class.forName("org.mariadb.jdbc.Driver"); // 마리아DB

    Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/jspdb", "root",     "PW");// 마리아DB
    //jspdb : 테스트를 위해 HeidiSQL에서 생성한 테이블의 이름
    //root : HeidiSQL에서 생성한 세션 이름
    //PW : mariaDB 설치시 설정한 비밀번호
    
    System.out.println(con);
    }
}

/*
 * DB연동 테스트 코드입니다
 * JUnit으로 실행하여 Error가 나지 않고, Console창에
 * org.mariadb.jdbc.MariaDbConnection@270421f5
 * 문구가 출력된다면 성공입니다.
 */