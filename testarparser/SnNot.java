package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnNot extends SelectorNodeBoolean {
	SelectorNodeBoolean child1;

	public SnNot(ArrayList<SelectorNode> children) {
		super(children);
		child1 = (SelectorNodeBoolean)children.get(0);
	}

	@Override
	public boolean getValue(State state, List<Action> availableActions, History history) {
		return !(child1.getValue(state, availableActions, history));
	}

}
