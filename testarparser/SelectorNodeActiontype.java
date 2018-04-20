package testarparser;

import java.util.ArrayList;
import java.util.List;

public abstract class SelectorNodeActiontype extends SelectorNode {
	public SelectorNodeActiontype(ArrayList<SelectorNode> children) {
		super(children);
		
	}

	public abstract Action.ActionType getActiontype(State state, List<Action> availableActions, History history);

}
