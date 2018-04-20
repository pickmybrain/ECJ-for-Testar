package testarparser;

import java.util.ArrayList;
import java.util.List;

public class History {
	List<Action> previousActions = new ArrayList<>();
	
	public void addPreviousAction(Action a){
		previousActions.add(a);
	}

	public Action previousAction() {

		return previousActions.get(previousActions.size() - 1);
		
	}

}
