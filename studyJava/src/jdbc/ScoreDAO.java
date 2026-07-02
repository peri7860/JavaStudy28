package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScoreDAO {
	
	// 저장
	public void setInsert(ScoreDTO dto) {
		Connection conn = null; // db 접속 정보 저장 객체
		PreparedStatement pstmt = null; // sql
		
		String sql = "insert into score (idx, name, kor, eng, mat) values (?, ?, ?, ?, ?)";
		
		try {
			conn = DBmanager.getInstance();
			pstmt = conn.prepareStatement(sql); // sql문을 실행하기 위한 준비
			pstmt.setInt(1, dto.getIdx()); // 1번 ?표에 idx값을 가져와서 int형으로 set
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			pstmt.executeUpdate(); // sql 실행
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 출력
	public void getScore() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	}
	
	// 조건 검색
	public void getCondition() {
		Connection conn = null;
		PreparedStatement pstmt = null; 
	}
	
	// 수정
	public void getUpdate() {
		Connection conn = null;
		PreparedStatement pstmt = null;
	}
	
	// 삭제
	public void getDelete() {
		Connection conn = null;
		PreparedStatement pstmt = null;
	}
	
	
}
