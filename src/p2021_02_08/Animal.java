package p2021_02_08;

public class Animal {
//           사용자 정의 클래스	

	int age;	// 필드(field), 멤버변수 ( heap 메모리 영역에 저장됨 )
	            // : 메소드 바깥쪽에 정의 되는 변수
	
	public Animal() {	// 기본 생성자(Default Constructor)
		                // : 매개변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10; // 지역 변수 ( stack 영역에 저장됨 )
		
		String str = new String("자바");
		
		Animal     a1           =    new      Animal();   
//      클래스          레퍼런스 변수	        연산자        생성자 호출
		
//		System.out.println("age:"+age);       // 오류발생
		System.out.println("age:"+a1.age);    // 0
		
//		age = 5;							 // 오류발생
		a1.age = 5;
		System.out.println("age:"+a1.age);   // 5
		
		Animal	 a2 = 	new 	Animal();
		System.out.println(a2.age);
		
		if(a1 == a2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		
		
		
	}

}
