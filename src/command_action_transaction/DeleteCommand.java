package command_action_transaction;

public class DeleteCommand extends Command{

	Content c;
	
	String deleted;
	
	public DeleteCommand(Content c) {
		this.c = c;
	}
	
	@Override
	public void doit() {
		// TODO Auto-generated method stub
		deleted = c.msg.substring(0, 5);
		c.msg = c.msg.substring(5, c.msg.length());
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		c.msg = deleted + c.msg;
	}

}
