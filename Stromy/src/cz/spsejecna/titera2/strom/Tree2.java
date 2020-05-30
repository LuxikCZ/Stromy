package cz.spsejecna.titera2.strom;

import java.util.ArrayList;

public class Tree2 {

	private static Tree2 singleton = null;

	public static Tree2 factoryTree2() {
		if (singleton == null) {
			singleton = new Tree2();
		}
		return singleton;
	}
	
	ArrayList<Node>list = new ArrayList<Node>();

	private Tree2() {
		// root
		Node n1 = new Node("8");
		// root left
		Node n2 = new Node("3");
		Node n3 = new Node("1");
		Node n4 = new Node("6");
		Node n5 = new Node("4");
		Node n6 = new Node("7");
		// root right
		Node n7 = new Node("10");
		Node n8 = new Node("14");
		Node n9 = new Node("13");
		// root
		n1.left = n2;
		n1.right = n7;
		// root left
		n2.left = n3;
		n2.right = n4;
		n4.left = n5;
		n4.right = n6;
		// root right
		n7.right = n8;
		n8.left = n9;
		// strom se automaticky vypise
		System.out.println("Tree2: " + n1);
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);
		list.add(n7);
		list.add(n8);
		list.add(n9);
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