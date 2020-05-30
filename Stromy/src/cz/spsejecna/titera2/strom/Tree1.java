package cz.spsejecna.titera2.strom;

import java.util.ArrayList;

public class Tree1 {

	private static Tree1 singleton = null;

	public static Tree1 factoryTree1() {
		if (singleton == null) {
			singleton = new Tree1();
		}
		return singleton;
	}
	
	ArrayList<Node>list = new ArrayList<Node>();

	private Tree1() {
		// root
		Node n1 = new Node("5");
		// root left
		Node n2 = new Node("2");
		Node n3 = new Node("1");
		Node n4 = new Node("3");
		// root right
		Node n5 = new Node("8");
		Node n6 = new Node("6");
		Node n7 = new Node("9");
		// root
		n1.left = n2;
		n1.right = n5;
		// root left
		n2.left = n3;
		n2.right = n4;
		// root right
		n5.left = n6;
		n5.right = n7;
		// strom se s vytvorenim rovnou automaticky vypise
		System.out.println("Tree1: " + n1);
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);
		list.add(n7);
	}
	
	public void pridejNode(Node Node) {
		int size = list.size();
		int i = 0;
		
		while(size == list.size()) {
			if(list.get(i).left == null) {
				list.get(i).left = Node;
				list.add(Node);
			}else {
				if(list.get(i).right == null) {
					list.get(i).right = Node;
					list.add(Node);
				}
			}
			i++;
		}
		System.out.println(list.get(0));
	}	
}