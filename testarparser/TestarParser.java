package testarparser;

public class TestarParser {

	public void parseMe(String s){
		SelectorFactory sf = new SelectorFactory(s);
		ActionSelector as = sf.getActionSelector();
	}
}
