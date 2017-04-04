/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_CarTest
 *
 *  1. 개요 :
 *  2. 작성일 : 2017. 3. 23.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 genesis = new Car3("현대자동차","제네시스","검정색",225,50000000);
		
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+genesis.getCompany());
		System.out.println("모델명 : " + genesis.getModel());
		System.out.println("색상 : " + genesis.getColor());
		System.out.println("최대속도 : " +  String.format("%,d", genesis.getMaxSpeed()) + "km");
		System.out.println("가격 : " +  String.format("%,d", genesis.getPrice()) + "원\n");
		
		Car3 car = new Car3("기아자동차","K7","흰색",246);
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+ car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " +  String.format("%,d", car.getMaxSpeed()) + "km");
		System.out.println("가격 : " +  String.format("%,d", car.getPrice()) + "원\n");
		
	
		Car3 car2 = new Car3("현대자동차","SM7","회색");
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+ car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도 : " +  String.format("%,d", car2.getMaxSpeed()) + "km");
		System.out.println("가격 : " +  String.format("%,d", car2.getPrice()) + "원\n");
		
	}

}