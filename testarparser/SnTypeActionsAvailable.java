package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnTypeActionsAvailable extends SelectorNodeBoolean {

	public SnTypeActionsAvailable(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public boolean getValue(State state, List<Action> availableActions,
			History history) {
		return state.getAvailable(Action.ActionType.TYPE);
	}

}
