package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnNumberOfTypeActions extends SelectorNodeNumber {

	public SnNumberOfTypeActions(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public int getValue(State state, List<Action> availableActions, History history) {
		return state.getNumberOfActions(Action.ActionType.TYPE);
	}

}
