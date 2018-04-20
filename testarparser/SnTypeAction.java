package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnTypeAction extends SelectorNodeActiontype {

	public SnTypeAction(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public Action.ActionType getActiontype(State state, List<Action> availableActions,
			History history) {
		return Action.ActionType.TYPE;
	}

}
