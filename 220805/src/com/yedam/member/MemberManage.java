package com.yedam.member;

//다른 패키지라 import 
import com.yedam.common.DAO;

// member 관련 sql(database)를 다 작성, data 담아두는 곳
public class MemberManage extends DAO{ 
	// 싱글톤 
	private static MemberManage mm = null; 
	//null도 하나의 데이터. 초기화하기 위해 사용.
	//private static MemberManage mm; 로 선언할 경우, heap 영역에 어떤 데이터가 들어갔는지 알 수 없고 주소값 알수 없음.
	
	
	// 생성자 생성 막기
	private MemberManage() {
		
	}
	

	public static MemberManage getInstance() {
		if(mm == null) {			
			mm = new MemberManage(); // 필요할 때 초기화해서 사용하기 위해서 여기에 씀
				
		} 
			return mm;
		}
	
	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null;
		try {
			//1.DB 연결
			conn();
			//2. sql 작성
			// id랑 pw가 존재하면 값이 리턴될 수 있게 만든 쿼리
			String sql = "SELECT * FROM MEMBER WHERE member_id =? AND member_pw =?";
			//3. 창구만들기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			
			// 반환값 넣어주는 객체에 select 쿼리 실행
			rs = pstmt.executeQuery(); 
			if(rs.next()) {
				mem = new MemberDTO(); // 객체 초기화
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberBelong(rs.getString("member_belong"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return mem;
	
	}
	

}
/*private static MemberManage mm = new MemberManage();
 *  
  public static MemberManage getInstance() {
	return mm; }
	해도 동일함 
  
 */
