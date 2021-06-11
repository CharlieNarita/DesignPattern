package intepreter;

public class Interpreter {
	public static void main(String[] args) {
		
	}
}

//abstract expression class
interface ExpressionInterface {
	public void interpret(String info);
}


class TerminalExpression implements ExpressionInterface {

	@Override
	public void interpret(String info) {
		// TODO Auto-generated method stub
		//processing the info
	}
	
}

class NonterminalExpression implements ExpressionInterface {
	private ExpressionInterface exp1;
	private ExpressionInterface exp2;
	

	@Override
	public void interpret(String info) {
		// TODO Auto-generated method stub
		//processing the info
	}
	
}

//environment class
class Context {
	private ExpressionInterface exp;
	
	public Context() {
		//initialized the data
	}
	
	public void operation(String info) {
		//call the related interpret methods
	}
}

