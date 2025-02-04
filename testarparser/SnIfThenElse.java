package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnIfThenElse extends SelectorNodeAction {
	SelectorNodeBoolean child1;
	SelectorNodeAction child2;
	SelectorNodeAction child3;
	
	public SnIfThenElse(ArrayList<SelectorNode> children){
		super(children);
		child1 = (SelectorNodeBoolean)children.get(0);
		child2 = (SelectorNodeAction)children.get(1);
		child3 = (SelectorNodeAction)children.get(2);
	}
	@Override
	public Action getAction(State state, List<Action> availableActions, History history) {
		if (child1.getValue(state, availableActions, history)){
			return child2.getAction(state, availableActions, history);
		} else {
			return child3.getAction(state, availableActions, history);
		}
	}

}
