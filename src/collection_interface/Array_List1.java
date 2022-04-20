package collection_interface;

import java.util.ArrayList;

public class Array_List1 {
	public static void main(String[] args) {
		ArrayList arList=new ArrayList<>();
		arList.add("abc");
		arList.add("fgh");
		arList.add(12);
		arList.add(true);
		arList.add(1,"azx");
		arList.remove(0);
		arList.add(null);
		arList.remove(null);
		arList.set(2, 555);
	//	arList.removeAll(arList);
		arList.remove(3);
	//	arList.addAll(arList);
		arList.add(3, "jay");
		arList.addAll(2, arList);
			System.out.println(arList);	
	}

}
