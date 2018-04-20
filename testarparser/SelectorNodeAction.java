package testarparser;

import java.util.ArrayList;
import java.util.List;

public abstract class SelectorNodeAction extends SelectorNode {
	public SelectorNodeAction(ArrayList<SelectorNode> children) {
		super(children);
		
	}

	public abstract Action getAction(State state, List<Action> availableActions, History history);
}
