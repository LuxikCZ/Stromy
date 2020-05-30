package cz.spsejecna.titera2.strom;

import java.util.ArrayList;

public class Tree1023 {
	
	private static Tree1023 singleton = null;
	
	public static Tree1023 factoryTree1023() {
		if(singleton == null) {
			singleton = new Tree1023();
		}
		return singleton;
	}
	
	private Tree1023() {
		ArrayList<Node> arr = new ArrayList<Node>();
		arr.add(new Node("root"));
		int i = 0;
		
		while(arr.size() < 1023) {
			if(arr.get(i).left == null && arr.get(i).right == null) {
				Node n1 = new Node(Integer.toString(i));
				Node n2 = new Node(Integer.toString(i));
				arr.get(i).left = n1;
				arr.get(i).right = n2;
				
				arr.add(n1);
				arr.add(n2);
			}else {
				if(arr.get(i).left == null) {
					Node n1 = new Node(Integer.toString(i));
					arr.get(i).left = n1;
					arr.add(n1);
					}else {
						if(arr.get(i).right == null) {
							Node n1 = new Node(Integer.toString(i));
							arr.get(i).right = n1;
							arr.add(n1);
						}
					}
				}
			i++;
			}
		System.out.println("Tree1023: " + arr.get(0));
	}
}