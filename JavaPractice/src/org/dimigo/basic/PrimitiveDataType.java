/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *  |_PrimitiveDataType
 *
 *  1. 개요 : 아이유 프로필
 *  
 *  2. 작성일 : 2017. 3. 9.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isMale = false;			//로컬변수 초기화필요(전역 메인위)
		
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name +"");
		if(isMale)
		System.out.println("성별 :  여자" + "");
		else
		System.out.println("성별 :  여자" + "");
		System.out.println("나이 : " + age +"세");
		System.out.println("키 : " + height +"cm");
		System.out.println("몸무게 : " + weight +"kg");
		System.out.println("혈액형: " + bloodType +"형");
		

	}

}
