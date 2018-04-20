package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnClickAction extends SelectorNodeActiontype {
	public SnClickAction(ArrayList<SelectorNode> children) {
		super(children);
	}

	public Action.ActionType getActiontype(State state, List<Action> availableActions, History history){
		return Action.ActionType.LEFTCLICK;
	}
}
