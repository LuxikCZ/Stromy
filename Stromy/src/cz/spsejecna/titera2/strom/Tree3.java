package cz.spsejecna.titera2.strom;

import java.util.ArrayList;

public class Tree3 {

	private static Tree3 singleton = null;

	public static Tree3 factoryTree3() {
		if (singleton == null) {
			singleton = new Tree3();
		}
		return singleton;
	}
	
	ArrayList<Node>list = new ArrayList<Node>();

	private Tree3() {
		// root
		Node n1 = new Node("F");
		// root left
		Node n2 = new Node("B");
		Node n3 = new Node("A");
		Node n4 = new Node("D");
		Node n5 = new Node("C");
		Node n6 = new Node("E");
		// root right
		Node n7 = new Node("G");
		Node n8 = new Node("I");
		Node n9 = new Node("H");
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
		//strom se automaticky vypise
		System.out.println("Tree3: " + n1);
		
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