package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnTypeOfActionOf extends SelectorNodeActiontype {
	SelectorNodeAction child1;

	public SnTypeOfActionOf(ArrayList<SelectorNode> children) {
		super(children);
		child1 = (SelectorNodeAction)children.get(0);
	}

	@Override
	public Action.ActionType getActiontype(State state, List<Action> availableActions,
			History history) {
		return child1.getAction(state, availableActions, history).getActiontype();
	}

}
