package testarparser;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class Unittest {
	public Unittest(){};
	
	@Test
	public void createSelector(){
		String strategy = "IfThenElse:GreaterThan:NumberOfLeftClicks:NumberOfTypeActions:RandomActionOfType:ClickAction:RandomActionOfType:TypeAction:";
		SelectorFactory sf = new SelectorFactory(strategy);
		ActionSelector as = sf.getActionSelector();
		State state = new State();
		Action a1 = new Action(Action.ActionType.TYPE);
		Action a2 = new Action(Action.ActionType.TYPE);
		Action a3 = new Action(Action.ActionType.LEFTCLICK);
		Action a4 = new Action(Action.ActionType.LEFTCLICK);
		Action a5 = new Action(Action.ActionType.TYPE);
		
		List<Action> al = new ArrayList<>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		
		state.setActions(al);
		History history = new History();
		System.out.println("Number of actions:"+state.getNumberOfActions());
		System.out.println(state.getActionsOfType(Action.ActionType.TYPE));
		System.out.println(state.getActionsOfType(Action.ActionType.LEFTCLICK));
		Action a = as.selectAction(state, al, history);
		
		
		assertTrue(a == a1 || a == a2 || a == a5);
	}
	@Test
	public void createSelector2(){
		String strategy = "IfThenElse:GreaterThan:NumberOfUnexecutedLeftClicks:NumberOfUnexecutedTypeActions:RandomActionOfType:ClickAction:RandomActionOfType:TypeAction:";
		SelectorFactory sf = new SelectorFactory(strategy);
		ActionSelector as = sf.getActionSelector();
		State state = new State();
		
		Action a1 = new Action(Action.ActionType.TYPE);
		Action a2 = new Action(Action.ActionType.TYPE);
		Action a3 = new Action(Action.ActionType.LEFTCLICK);
		Action a4 = new Action(Action.ActionType.LEFTCLICK);
		Action a5 = new Action(Action.ActionType.TYPE);
		
		List<Action> al = new ArrayList<>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		
		state.setActions(al);
		History history = new History();
		System.out.println("Number of actions:"+state.getNumberOfActions());
		System.out.println(state.getActionsOfType(Action.ActionType.TYPE));
		System.out.println(state.getActionsOfType(Action.ActionType.LEFTCLICK));
		Action a = as.selectAction(state, al, history);
		
		
		assertTrue(a == a1 || a == a2 || a == a5);
	}

}
