package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnAnd extends SelectorNodeBoolean{
	SelectorNodeBoolean child1;
	SelectorNodeBoolean child2;
	
	public SnAnd(ArrayList<SelectorNode> children){
		super(children);
		child1 = (SelectorNodeBoolean)children.get(0);
		child2 = (SelectorNodeBoolean)children.get(1);
	}
	
	public boolean getValue(State state, List<Action> availableActions, History history){
		return (child1.getValue(state, availableActions, history) && child2.getValue(state, availableActions, history));
	}
}
