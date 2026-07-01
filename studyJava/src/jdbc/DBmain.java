package jdbc;

import java.sql.Connection;

public class DBmain {

	public static void main(String[] args) {
		
		DBmanager db = new DBmanager();
		Connection conn = db.getInstance();
		if(conn != null) {
			System.out.println("연결완료");
		} else {
			System.out.println("접속 에러");
		}

	}

}
