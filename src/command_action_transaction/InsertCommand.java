package command_action_transaction;

public class InsertCommand extends Command{
	
	Content c;
	
	String strForInsert = " welcome to java world";
	
	public InsertCommand(Content c) {
		this.c = c;
	}
	
	@Override
	public void doit() {
		// TODO Auto-generated method stub
		c.msg = c.msg + strForInsert;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		c.msg = c.msg.substring(0, c.msg.length()-strForInsert.length());
	}

}
