package command_action_transaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Content c = new Content();
		
		Command insertCommand = new InsertCommand(c);
		insertCommand.doit();
		insertCommand.undo();
		
		Command copyCommand = new CopyCommand(c);
		copyCommand.doit();
		copyCommand.undo();
		
		Command deleteCommand = new DeleteCommand(c);
		deleteCommand.doit();
		deleteCommand.undo();
		
		System.out.println(c.msg);
		
	}

}
