package datatype;

import java.util.Scanner;

public class DataTest02 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num=scanner.nextInt();
		System.out.println("num에 저장된값:"+ num);
		
		scanner.close();
		
	}

}
