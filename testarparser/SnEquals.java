package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnEquals extends SelectorNodeBoolean {
	SelectorNodeNumber child1;
	SelectorNodeNumber child2;
	
	public SnEquals(ArrayList<SelectorNode> children){
		super(children);
		child1 = (SelectorNodeNumber)children.get(0);
		child2 = (SelectorNodeNumber)children.get(1);
	}
	
	@Override
	public boolean getValue(State state, List<Action> availableActions, History history) {
		return (child1.getValue(state, availableActions, history) == child2.getValue(state, availableActions, history));
	}

}
