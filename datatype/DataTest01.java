package datatype;

public class DataTest01 {
	
	public static void main(String[] args) {
		
		//정수형
		//1byte=8bit (바이트가 데이터의 최소 단위)
		//바이트 데이터 범위는 -128 ~ 127까지 저장 가능 
		//2byte----short
		//4byte----정수형의 기본형 ->int
		//8byte----long
		
		
		byte b1=127;
		byte b2=-128, b3=0;
				
		//쇼트 범위 -32,768~ 32,767
		short b4;
		b4=10;
		
		// int 범위 -21억 ~ 21억까지
		int b5;
		
		long b6=10;
		
		
		byte m=(byte)130;
		System.out.print(m);
		
		//실수형 
		float f1;//4byte 메모리(기본형 x)
		double f2=3.14; //8byte 메모리(기본형)
		
		//논리형
		boolean flag=true;
		flag=false;
		
		//문자형 _2byte (마이너스가 없는)
		char mo='a';
		
		String str="몽여름"; //=문자열
				
	}
}
