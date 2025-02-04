package testarparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class State {
	List<Action> actions = new ArrayList<Action>();
	
	public static enum Status {UNEX, LEAST, MOST};
	
	public void setActions(List<Action> actions){
		this.actions = actions;
	}
	
	public void addAction(Action action){
		actions.add(action);
	}

	public boolean getAvailable(Action.ActionType actiontype) {
		boolean result = false;
		for (Action a : actions){
			if (a.isOfType(actiontype)){
				result = true;
			}
		}
		return result;
	}

	public int getNumberOfActions() {
		return actions.size();
	}

	public int getNumberOfActions(Action.ActionType actiontype) {
		List<Action> a = getActionsOfType(actiontype);
		return a.size();
	}

	public int getNumberOfActions(Action.ActionType actiontype, String status) {
		Status st = Status.valueOf(status);
		int result = 0;
		switch(st){
		case UNEX:
			for (Action a : actions){
				if (a.isOfType(actiontype) && a.getExecuted() == 0){
					result += 1;
				}
			}
			break;
		default:
			break;
		}
		return result;
	}

	public Action getRandomAction(Action.ActionType actiontype) {
		Random r = new Random();
		List<Action> at = getActionsOfType(actiontype);
		return at.get(r.nextInt(at.size()));
	}

	public Action getRandomAction() {
		Random r = new Random();
		return actions.get(r.nextInt(actions.size()));
	}

	public Action getRandomActionOfTypeOtherThan(Action.ActionType actiontype) {
		List<Action> at = new ArrayList<>();
		for (Action a : actions){
			if (!a.isOfType(actiontype)){
				at.add(a);
			}
		}
		Random r = new Random();

		return at.get(r.nextInt(at.size()));
	}
	public Action getRandomAction(String status) {
		return getRandomAction(status, actions);
	}

	public Action getRandomAction(String string, List<Action> acs) {
		Status s = Status.valueOf(string);
		int i = -1;
		int e;
		switch (s){
			case UNEX:
				i = 0;
				break;
		case LEAST:
			for (Action a: actions){
				e = a.getExecuted();
				if (i == -1 || e < i){
					i = e;
				}
			}
			break;
		case MOST:
			for (Action a: actions){
				e = a.getExecuted();
				if (i == -1 || e > i){
					i = e;
				}
			}
			break;
		default:
			break;
		}
		if (i != -1){
			List<Action> as = new ArrayList<>();
			for (Action a : acs){
				e = a.getExecuted();
				if (e == i){
					as.add(a);
				}
			}
			Random r = new Random();
			return as.get(r.nextInt(as.size()));
		} else {
			return null;
		}
		
	}

	public Action getRandomAction(Action.ActionType actiontype, String string) {
		return getRandomAction(string, getActionsOfType(actiontype));
	}
	
	public List<Action> getActionsOfType(Action.ActionType type){
		List<Action> actionsoftype = new ArrayList<>();
		for (Action a : actions){
			if (a.isOfType(type)){
				actionsoftype.add(a);
			}
		}
		return actionsoftype;
	}

}
