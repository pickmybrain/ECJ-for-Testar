package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnRandomAction extends SelectorNodeAction {

	public SnRandomAction(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public Action getAction(State state, List<Action> availableActions,
			History history) {
		return state.getRandomAction();
	}

}
