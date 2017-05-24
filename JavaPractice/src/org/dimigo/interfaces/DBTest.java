/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *  |_DBTest
 *
 *  1. 개요 :
 *  2. 작성일 : 2017. 5. 24.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	private static void crud (IDBManager db) {
		db.insert();
		db.search();
		db.update();
		db.delete();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDBManager s = IDBManager.getDBObject("SYBASE");
		System.out.println("<<변경 전>>");
	
		crud(s);
		IDBManager o = IDBManager.getDBObject("ORACLE");
		System.out.println();
		System.out.println("<<변경 후>>");
		crud(o);
	}

}
