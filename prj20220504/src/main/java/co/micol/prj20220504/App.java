package co.micol.prj20220504;

import java.sql.Date;

import co.micol.prj20220504.dto.StudentVO;
import co.micol.prj20220504.menu.Menu;

public class App 
{
    public static void main( String[] args )
    {
    	Menu menu = new Menu();
    	menu.run();
    	
//    	StudentVO student = new StudentVO();
//    	student.setId("park@abc.com");
//    	student.setName("박승리");
//    	student.setMajor("컴퓨터공학과");
//    	student.setBirthday(Date.valueOf("2000-01-01")); //String문자열을 Date로 바꿔주는 Date.valueOf
//    	student.setTel("010-1111-1111");
//    	student.setAddress("대구광역시 중구 종로");
//    	
//    	student.toString();
//    	
//    	student = new StudentVO("lee", "이기자", "미술학과", "서울 강남", "123-123", Date.valueOf("2012-12-12"));
//    	student.toString();
    }
}
