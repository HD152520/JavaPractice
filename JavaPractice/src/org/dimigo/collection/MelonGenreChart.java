/**
 * 
 */
package org.dimigo.collection;
import java.util.*;
/**
 * <pre>
 * org.dimigo.collection
 ^   |_JavaPractice
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 *
 * @author : whhh5108
 * @version : 1.0
 * 
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<Music>> map = new HashMap<String,List<Music>>();
		List<Music> list1 = new ArrayList<Music>();
		List<Music> list2 = new ArrayList<Music>();
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		map.put("발라드", list1);
		map.get("발라드").add(new Music("팔레트","아이유"));
		map.put("댄스", list2);
		map.get("댄스").add(new Music("I LUV IT","PSY"));
		map.get("댄스").add(new Music("맞지?","언니쓰"));
		printMap(map);
		System.out.println("");

		
		System.out.println("-- << 댄스 2위곡 변경 >> --");
		map.get("댄스").set(1,new Music("SIGNAL","트와이스"));
		printMap(map);
		System.out.println("");
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		map.get("댄스").remove(0);
		printMap(map);
		System.out.println("");
		
		System.out.println("— << 전체 리스트 삭제 >> —");
		map.clear();
		printMap(map);
		System.out.println("");
	}
	
	private static void printMap(Map<String,List<Music>> map){
		for(String key : map.keySet()){
			int i = 1;
			System.out.println("["+key+"]");
			for(Music list : map.get(key)){
				System.out.println(i+". "+list.toString());
				i++;
			}
		}
	}

}