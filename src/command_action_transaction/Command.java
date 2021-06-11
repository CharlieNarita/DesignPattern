package command_action_transaction;

public abstract class Command {
	public abstract void doit();	//exec run
	public abstract void undo();
}
