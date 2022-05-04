package co.micol.prj20220504.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj20220504.dto.StudentVO;

public class StudentService {
	
//	c:create 생성 추가 등록
//	r:read 조회
//	u:update 수정 변경 갱신
//	d:delete 삭제
//	crud - 등록하고 수정하고 삭제하고 조회할 수 있는것을 만들어라.
	
	private StudentVO student;
	List<StudentVO> students = new ArrayList<StudentVO>();
	
	private void detaSet() {
		
		student = new StudentVO("lee","이기자","컴퓨터공학과","대구 광역시","010-1111", Date.valueOf("2010-05-06"));
		students.add(student);
		student = new StudentVO("kin","김치국","컴퓨터공학과","대구 광역시","010-2222", Date.valueOf("2011-12-06"));
		students.add(student);
		student = new StudentVO("bark","박승리","컴퓨터공학과","대구 광역시","010-3333", Date.valueOf("1995-12-11"));
		students.add(student);
		student = new StudentVO("hinh","홀길동","컴퓨터공학과","대구 광역시","010-4444", Date.valueOf("1996-03-11"));
		students.add(student);
	
	
	}
	
	public void selectList() { //학생목록보기
		detaSet();
		for(StudentVO vo : students) {
			vo.toString();
		}
		
	}
	public void selectStudent(String id) {
		detaSet();
		for(StudentVO vo : students) {
			if(vo.getId().equals(id)) {
				System.out.println("검색한 학생===");
				vo.toString();
				break;
			}
		}
		
	}
	
	public void insertStudent(StudentVO vo) {
		detaSet();
		students.add(vo);
		for(StudentVO s : students) {
			s.toString();
		}
	}
	

}
