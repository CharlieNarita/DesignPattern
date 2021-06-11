package command_action_transaction;

public class CopyCommand extends Command{
	
	Content c;
	
	public CopyCommand(Content c) {
		this.c = c;
	}
	
	@Override
	public void doit() {
		// TODO Auto-generated method stub
		c.msg = c.msg + c.msg;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		c.msg = c.msg.substring(0, c.msg.length()/2);
	}

}
