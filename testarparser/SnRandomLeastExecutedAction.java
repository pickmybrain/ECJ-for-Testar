package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnRandomLeastExecutedAction extends SelectorNodeAction {

	public SnRandomLeastExecutedAction(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public Action getAction(State state, List<Action> availableActions,
			History history) {
		return state.getRandomAction("LEAST");
	}

}
