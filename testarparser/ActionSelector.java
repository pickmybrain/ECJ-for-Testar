package testarparser;

import java.util.List;

public class ActionSelector {
	SelectorNodeAction mainNode;
	
	public ActionSelector(SelectorNode main){
		mainNode = (SelectorNodeAction)main;
		
	}
	public Action selectAction(State state, List<Action> availableActions, History history){
		return mainNode.getAction(state, availableActions, history);
	}
	public void print() {
		mainNode.print(0);
	}
}
