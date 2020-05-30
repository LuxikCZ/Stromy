package cz.spsejecna.titera2.strom;

public class Node {

	public String value;
	public Node left;
	public Node right;

	public Node(String value) {
		this.value = value;
	}
	public String toString() {
		return "[" + value + "," + left + "," + right + "],";
	}
}
