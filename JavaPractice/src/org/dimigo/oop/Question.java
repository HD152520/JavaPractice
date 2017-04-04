/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_Question
 *
 *  1. 개요 :
 *  2. 작성일 : 2017. 3. 31.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String[] question = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
	String[] answer = {"빅뱅","조인성","수학"};
	String in = null;
	Scanner input = new Scanner(System.in);
	for(int i=0 ;  i<3 ; i++)
	{
		System.out.println((i+1)+"."+question[i]);
		in=input.nextLine();
		if(in.equals(answer[i]))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다!");
	}
	System.out.println("<<결과 출력>>");
	StringBuilder sb1 = new StringBuilder ();
	sb1.append(question[0]+" "+answer[0]+"입니다.");
	StringBuilder sb2 = new StringBuilder ();
	sb2.append(question[1]+" "+answer[1]+"입니다.");
	StringBuilder sb3 = new StringBuilder ();
	sb3.append(question[2]+" "+answer[2]+"입니다.");
	
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println(sb3);
	

	}

}
