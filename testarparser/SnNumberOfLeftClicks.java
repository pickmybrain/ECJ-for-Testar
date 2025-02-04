package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnNumberOfLeftClicks extends SelectorNodeNumber {

	public SnNumberOfLeftClicks(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public int getValue(State state, List<Action> availableActions, History history) {
		return state.getNumberOfActions(Action.ActionType.LEFTCLICK);
	}

}
