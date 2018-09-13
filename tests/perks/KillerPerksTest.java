package perks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class KillerPerksTest {

	/*TreeMap<KillerPerks,Integer> tm = new TreeMap<>();
	System.out.println(KillerPerks.getValues().toString());
	for(int i = 0 ; i < 1000 ; i++){
		tm.put(KillerPerks.randomKillerPerk(),1);
	}
	System.out.println(tm.toString());
	assertEquals(tm.size(),45);
	 */

	@Test
	public void testNumberOfPerks() {
		assertEquals(KillerPerks.numberOfPerks(),45);
	}

	@Test
	public void testRandomFourKillerPerk() { //TODO not finished
		for(int test = 0 ; test < 1000 ; test++){
			ArrayList<KillerPerks> listOfPerks = KillerPerks.randomFourKillerPerk();
			assertEquals(listOfPerks.size(),4);

			ArrayList<KillerPerks> listOfPerks2 = new ArrayList<>();
			for(int i = 0 ; i < listOfPerks.size() ; i++){
				if(!listOfPerks2.contains(listOfPerks.get(i))){
					listOfPerks2.add(listOfPerks.get(i));
				} 
			}
			assertEquals(listOfPerks2.size(),4);
		}
	}

}
