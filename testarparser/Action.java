package testarparser;

public class Action {
	public enum ActionType {TYPE, LEFTCLICK, RIGHTCLICK}
	ActionType type;
	int executed = 0;
	
	public Action(ActionType t){		
		this.type = t;
	}

	public Action.ActionType getActiontype() {
		return type;
	}
	
	public void execute(){
		executed += 1;
	}
	
	public int getExecuted(){
		return executed;
	}
	public boolean isOfType(ActionType t){
		return (type == t);
	}

}
