/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 *  org.dimigo.basic
 *  |_Loop
 *
 *  1. 개요 :
 *  2. 작성일 : 2017. 3. 16.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int at=100, choice, job;
	String[] a = {"마법사","영주","기사","농민"};
	do {
		System.out.println("<<게임 메뉴>>");
		System.out.println("1.공격력 증가");
		System.out.println("2.공격력 감소");
		System.out.println("3.캐릭터 설정");
		System.out.println("9.종료");
		System.out.println("메뉴 입력 =>");
		Scanner aa = new Scanner(System.in);
		choice = aa.nextInt();
		if(choice == 1)
			{	
			at+=10;
			System.out.println("공격력이 증가되었습니다. 현재 공격력 :"+at);
			}
		else if(choice == 2)
			{	
			at-=10;
			System.out.println("공격력이 감소되었습니다. 현재 공격력 :"+at);
			}
		else if(choice == 3)
		{
			job = new Random().nextInt(3)+1;
			if(job == 0)
				System.out.println("마법사(으)로 설정되었습니다.");
			else if(job==2)
				System.out.println("영주(으)로 설정되었습니다.");
			else if(job==3)
				System.out.println("기사(으)로 설정되었습니다.");
			else 
				System.out.println("농민(으)로 설정되었습니다.");
		}
		else if(choice!=9)
			System.out.println("없는 메뉴입니다!!");
	
		}while(choice!=9);
	
	

	}

}
