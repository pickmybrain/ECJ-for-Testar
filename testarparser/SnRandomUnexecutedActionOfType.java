package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnRandomUnexecutedActionOfType extends SelectorNodeAction {
	SelectorNodeActiontype child1;
	
	public SnRandomUnexecutedActionOfType(ArrayList<SelectorNode> children) {
		super(children);
		child1 = (SelectorNodeActiontype)children.get(0);
	}

	@Override
	public Action getAction(State state, List<Action> availableActions,
			History history) {
		return state.getRandomAction(child1.getActiontype(state, availableActions, history), "unexecuted");
	}

}
