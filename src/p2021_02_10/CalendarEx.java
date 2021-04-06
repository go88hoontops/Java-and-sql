package p2021_02_10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 3. Calendar 클래스
		
//		Calendar c1 = new Calendar();				// 오류 발생
		Calendar c2 = new GregorianCalendar();		// 업캐스팅
		
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
//		System.out.println(Calendar.YEAR);          // 1
		int y = c.get(Calendar.YEAR);				// 연
		int m = c.get(Calendar.MONTH) + 1;          // 월(0 ~ 11)
		int d = c.get(Calendar.DATE);				// 일
		
		System.out.println(y+"-"+m+"-"+d);
		
		int h1 = c.get(Calendar.HOUR);				// 12시간제 시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);		// 24시간제 시간
		
		int ap = c.get(Calendar.AM_PM);				// 0:오전, 1:오후
		if(ap == 0) {
			System.out.print("오전 ");
		}else {
			System.out.print("오후 ");
		}
		
		int mm = c.get(Calendar.MINUTE);			// 분
		int s = c.get(Calendar.SECOND);				// 초		
		
		System.out.println(h1+":"+mm+":"+s);		// 12시간
		System.out.println(h2+":"+mm+":"+s);		// 24시간		
		
		// 오늘의 요일을 출력 하세요?
		int w = c.get(Calendar.DAY_OF_WEEK);		// 요일 : 1 ~ 7
		System.out.println("w="+w);					// 4
		
		// 1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토 
		
		String[] week = {"일","월","화","수","목","금","토"};
//		week[0] = "일";
//		week[1] = "월";
//		week[2] = "화";
//		week[3] = "수";
//		week[4] = "목";
//		week[5] = "금";
//		week[6] = "토";
		
		System.out.println(week[w-1]+"요일");		
	}

}



