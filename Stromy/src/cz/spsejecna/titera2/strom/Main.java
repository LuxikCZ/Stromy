package cz.spsejecna.titera2.strom;

public class Main {

	public static void main(String[] args) {
		// tree 1
		Tree1 t1 = Tree1.factoryTree1();
		// tree 2
		Tree2 t2 = Tree2.factoryTree2();
		//tree 3
		Tree3 t3 = Tree3.factoryTree3();
		//tree 1023
		Tree1023 t4 = Tree1023.factoryTree1023();
		
		System.out.println("\n");
		t1.pridejNode(new Node("100"));
		t2.pridejNode(new Node("100"));
		t3.pridejNode(new Node("100"));
		
	}
}