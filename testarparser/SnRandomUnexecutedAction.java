package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnRandomUnexecutedAction extends SelectorNodeAction {

	public SnRandomUnexecutedAction(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public Action getAction(State state, List<Action> availableActions,
			History history) {
		return state.getRandomAction("UNEX");
	}

}
