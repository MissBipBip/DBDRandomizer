package perks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SurvivorPerksTest {

	@Test
	public void testNumberOfPerks() {
		assertEquals(SurvivorPerks.numberOfPerks(),50);
	}

	@Test
	public void testRandomFourSurvivorPerk() { //TODO not finished
		for(int test = 0 ; test < 1000 ; test++){
			ArrayList<SurvivorPerks> listOfPerks = SurvivorPerks.randomFourSurvivorPerk();
			assertEquals(listOfPerks.size(),4);

			ArrayList<SurvivorPerks> listOfPerks2 = new ArrayList<>();
			for(int i = 0 ; i < listOfPerks.size() ; i++){
				if(!listOfPerks2.contains(listOfPerks.get(i))){
					listOfPerks2.add(listOfPerks.get(i));
				} 
			}
			assertEquals(listOfPerks2.size(),4);
		}
	}
	
}
