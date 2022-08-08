package com.yedam.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO { // JDBC 연결 역할

	// DAO 
	// Data Access Object
	
	// java <-> DB 연결할 때 쓰는 객체
	protected Connection conn= null;
	
	// Select(조회) 결과 값 반환 받는 객체 
	protected ResultSet rs = null;     // ResultSet : DB에서 데이터 로우row 모음.. 테이블? 
	
	
	//Query문을 담고 Query문 실행하는 객체, DML (insert, update, delete) 사용시 편함
	protected PreparedStatement pstmt = null;
	
	
	//Query문을 담고 Query문 실행하는 객체, select 할 때 편함
	protected Statement stmt = null;
	
	
	
    // 접속에 필요한 정보로 구성된 문자열, Connection String
    Properties pro = new Properties();
	String driver = ""; // 포트명 
	String url = ""; //접속주소, local host 대신 ip 주소가 들어갈수도 있음 (@127.0.0.1)
    String id = ""; //DB id
    String pw = ""; //DB pw
    
    public void conn() {
    	try {
    		getProperties();
    		// 1. 드라이버 로딩
			Class.forName(driver);
			// 2. DB 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) { //Exception 넣으면 모든 예외 처리 다 가능함.
			e.printStackTrace();				
		}
    }
    		// 3. DB 닫기
    public void disconnect() {
    	try {
    		if(rs != null) {
    			rs.close();    			
    		} 
    		if(stmt != null) {
    			stmt.close();   
    		}
    		if(pstmt!= null) {
    			pstmt.close();   
    		}
    		if(conn!= null) {
    			conn.close();   
    		}
    	}catch(Exception e) {	
    		e.printStackTrace();
    	}
    }
	
    
    private void getProperties() { // 외부 파일 정보 열어서 연결할 수도 있음.
    	try {
    		FileReader resource = new FileReader("src/config/db.properties");
    		pro.load(resource);
    		driver = pro.getProperty("driver");
    		url = pro.getProperty("url");
    		id = pro.getProperty("id");
    		pw = pro.getProperty("pw"); 		
    		
    	}catch(Exception e){
    		
    	}
    }
    

}



