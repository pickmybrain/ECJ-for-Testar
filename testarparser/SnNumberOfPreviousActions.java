package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnNumberOfPreviousActions extends SelectorNodeNumber {

	public SnNumberOfPreviousActions(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public int getValue(State state, List<Action> availableActions, History history) {
		return availableActions.size();
	}

}
