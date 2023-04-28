package String;
import java.util.*;

public class StringUniqueAndDuplicate {
	
	Map<Character,Long> map=new HashMap<>();
	

	public void uniqueChar(char[] chararray)
	{
		for(char c:chararray) {
			if(map.containsKey(c)&&c!=' ') {
				map.put(c, map.get(c)+1);
			}
			else if(c!=' ') {
				map.put(c,(long) 1);
			}
			
		}
		System.out.println("UniqueChar");
		for(Map.Entry<Character, Long> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
	}
	public void duplicateChar(char[] chararray)
	{
		/*
		 * for(char c:chararray) { if(map.containsKey(c)&&c!=' ') { map.put(c,
		 * map.get(c)+1); } else if(c!=' ') { map.put(c,(long) 1); }
		 * 
		 * }
		 */
		System.out.println("duplicateChar");
		for(Map.Entry<Character, Long> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
	}
	public static void main(String[] args) {
		String str="india geog";
		char[] chararray=str.toCharArray();
		StringUniqueAndDuplicate suad=new StringUniqueAndDuplicate();
		suad.uniqueChar(chararray);
		suad.duplicateChar(chararray);
		
	}

}
