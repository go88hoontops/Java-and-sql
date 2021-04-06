package p2021_02_04;

public class ImplicitConversion {

    public static void main( String[] args ) {
    	
	// char 변수 선언 및 초기화.
	char charValue = 'a';
	System.out.println( "charValue = " + charValue );
 
	// int 변수 선언 및 'a'의 값으로 초기화.
//	int intValueOfChar = 'a';
	int intValueOfChar = charValue;    // 자료형 변환 : 'a'   ---> 97 
	System.out.println( "intValueOfChar = " + intValueOfChar );

	// int 변수 선언 및 초기화.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float 변수 선언 및 intValue 변수 값 할당
	float floatValue = intValue;		// 자료형 변환 : 30 --> 30.0
	System.out.println( "floatValue = " + floatValue );

	// double 변수 선언및 floatValue,intValue 변수 값 할당
	double doubleValue1 = floatValue;   // 자료형 변환 : 30.0 --> 30.0
	double doubleValue2 = intValue;     // 자료형 변환 : 30 --> 30.0
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end



