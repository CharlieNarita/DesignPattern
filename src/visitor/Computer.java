package visitor;

interface Visitor {
	void visitCpu(CPU cpu);
	void visitMemory(Memory memory);
	void visitBoard(Board board);
}

class PersonalVisitor implements Visitor {
	
	double totalPrice = 0.0;
	double cpuDiscount = 0.9;
	double memoryDiscount = 0.9;
	double boardDiscount = 0.85;
	
	@Override
	public void visitCpu(CPU cpu) {
		// TODO Auto-generated method stub
		totalPrice += cpu.getPrice()*cpuDiscount;
	}

	@Override
	public void visitMemory(Memory memory) {
		// TODO Auto-generated method stub
		totalPrice += memory.getPrice()*memoryDiscount;
	}

	@Override
	public void visitBoard(Board board) {
		// TODO Auto-generated method stub
		totalPrice += board.getPrice()*boardDiscount;
	}
	
}

class CorpVisitor implements Visitor {
	
	double totalPrice = 0.0;
	double cpuDiscount = 0.8;
	double memoryDiscount = 0.8;
	double boardDiscount = 0.6;
	
	@Override
	public void visitCpu(CPU cpu) {
		// TODO Auto-generated method stub
		totalPrice += cpu.getPrice()*cpuDiscount;
	}

	@Override
	public void visitMemory(Memory memory) {
		// TODO Auto-generated method stub
		totalPrice += memory.getPrice()*memoryDiscount;
	}

	@Override
	public void visitBoard(Board board) {
		// TODO Auto-generated method stub
		totalPrice += board.getPrice()*boardDiscount;
	}
	
}

public class Computer {
	ComputerPart cpu = new CPU();
	ComputerPart memory = new Memory();
	ComputerPart board = new Board();

	public void accept(Visitor v) {
		this.cpu.accept(v);
		this.memory.accept(v);
		this.board.accept(v);
	}
	
	public static void main(String[] args) {
		
		PersonalVisitor pv = new PersonalVisitor();
		CorpVisitor cv = new CorpVisitor();
		
		Computer c = new Computer();
		c.accept(pv);
		c.accept(cv);
		
		System.out.println("personal visitor get total price is: " + pv.totalPrice);
		System.out.println("corp visitor get total price is: " + cv.totalPrice);
		
	}

}


abstract class ComputerPart {
	abstract void accept(Visitor v);
	//some other operation such as: getName getBrand;
	abstract double getPrice();
}

class CPU extends ComputerPart {
	double price = 1200;
	
	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitCpu(this);
	}

	@Override
	double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}

class Memory extends ComputerPart {
	double price = 500;
	
	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitMemory(this);
	}

	@Override
	double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}

class Board extends ComputerPart {
	double price = 950;
	
	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitBoard(this);
	}

	@Override
	double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}

