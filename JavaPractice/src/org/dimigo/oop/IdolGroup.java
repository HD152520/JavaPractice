/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_IdolGroup
 *
 *  1. 개요 :
 *  2. 작성일 : 2017. 4. 7.
 *</pre>
 *
 * @author : AM
 * @version : 1.0
 */
public class IdolGroup {

		static void main(String[] args) {
				String[] group = {"빅뱅","2NE1","걸스데이"};
				String[][] name = {
						{"GD","태양","대성","탑","승리"},
						{"CL","산다라박","박봄","민지"},
						{"유라","혜리","소진","민아"}
				};
				
		for(int i=0 ; i<group.length ; i++)
		{	
			System.out.println("<< "+group[i]+" >>");
			for(int j= 0 ; j<name[i].length ; j++)
				System.out.println(name[i][j]);
			System.out.println();
			
		}
		

	}

}
