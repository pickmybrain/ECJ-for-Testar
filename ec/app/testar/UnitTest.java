package ec.app.testar;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Test;

public class UnitTest {

	@Test
	public void testReader(){
		ResultsReader reader = new ResultsReader();
		TreeMap<String, String> result;
		
		result = reader.getResults(25);
		
		for (String key : result.keySet()){
			System.out.println(key + ": " + result.get(key));
		}
		assertNotNull(result);
	}

}
