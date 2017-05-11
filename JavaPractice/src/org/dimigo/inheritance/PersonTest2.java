/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_PersonTest
 *
 *  1. 개요 :
 *  2. 작성일 : 2017. 5. 8.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person P = new Person("Tom");
			Korean K = new Korean("홍길동");
			Chinese C = new Chinese("왕밍");
			Japanese J = new Japanese("다나카");
			/*
			System.out.println(P);
			System.out.println(K);
			System.out.println(J);
			System.out.println(C);
			System.out.println();
			
			P.sayHello();
			K.sayHello();
			J.sayHello();
			C.sayHello();
			System.out.println();
			
			P.sayBye();
			K.sayBye();
			J.sayBye();
			C.sayBye();
			*/
			Person[] persons = {
					new Person("Tom"),
					new Korean("홍길동"),
					new Japanese("다나카"),
					new Chinese("왕밍")
					
			};
			for(Person p : persons) {
				greeting(p);
				
			
	

			}
	}
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		
		System.out.println();
	}

}
