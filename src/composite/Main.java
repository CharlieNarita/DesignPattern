package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchNode root = new BranchNode("root");
		BranchNode chapter1 = new BranchNode("chapter1");
		BranchNode chapter2 = new BranchNode("chapter2");
		
		Node c11 = new LeafNode("c1-1_content...");
		Node c12 = new LeafNode("c1-2_content...");
		
		BranchNode b21 = new BranchNode("section2-1");
		
		Node c211 = new LeafNode("c2-1-1_content...");
		Node c212 = new LeafNode("c2-1-2_content...");
		
		BranchNode b22 = new BranchNode("section2-2");
		
		Node c221 = new LeafNode("c2-2-1_content...");
		Node c222 = new LeafNode("c2-2-2_content...");
		
		
		root.add(chapter1);
		root.add(chapter2);
		
		chapter1.add(c11);
		chapter1.add(c12);
		
		chapter2.add(b21);
		chapter2.add(b22);
		
		b21.add(c211);
		b21.add(c212);
		
		b22.add(c221);
		b22.add(c222);
		
		printTree(root, 0);
	}
	
	public static void printTree(Node node, int level) {
		for(int i=0; i<level; i++) {
			System.out.print("\t");
		}
		node.printNodeName();
		
		if(node instanceof BranchNode) {
			for(Node n : ((BranchNode)node).getNodes()) {
				printTree(n, level+1);
			}
		}
	}
}


abstract class Node {
	abstract public void printNodeName();
}

class LeafNode extends Node {
	
	private String content;
	
	public LeafNode(String content) {
		this.content = content;
	}
	
	@Override
	public void printNodeName() {
		// TODO Auto-generated method stub
		System.out.println(content);
	}
	
}

class BranchNode extends Node {

	private String name;
	
	private List<Node> nodes;
	
	public BranchNode(String name) {
		this.name = name;
		nodes = new ArrayList<Node>();
	}
	
	@Override
	public void printNodeName() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	
	public void add(Node node) {
		nodes.add(node);
	}
	
	public void remove(Node node) {
		nodes.remove(node);
	}
	
	public List<Node> getNodes() {
		return nodes;
	}
	
}