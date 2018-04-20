package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnPreviousAction extends SelectorNodeAction {

	public SnPreviousAction(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public Action getAction(State state, List<Action> availableActions, History history) {
		return history.previousAction();
	}

}
