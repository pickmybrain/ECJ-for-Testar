package testarparser;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class SnRandomNumber extends SelectorNodeNumber {

	public SnRandomNumber(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public int getValue(State state, List<Action> previousActions,
			History history) {
		return new Random().nextInt(100);
	}

}
