package com.sample;

import org.kie.api.runtime.KieSession;
//import org.kie.api.runtime.StatelessKieSession;
import com.sample.ShipingFurniture;

public class ShipingFurnitureTest {
	
	private static final String DRL_PATH = "rules/ShipingRules.drl";
	
	public static void main(String[] args) {
		KieSession session = TestUtil.createKieSession(DRL_PATH);
	
		ShipingFurniture shiping1 = new ShipingFurniture();
		shiping1.setSellPrice(45);
		session.insert(shiping1);
		
		ShipingFurniture shiping2 = new ShipingFurniture();
		shiping2.setSellPrice(390);
		session.insert(shiping2);
	
		ShipingFurniture shiping3 = new ShipingFurniture();
		shiping3.setSellPrice(780);
		session.insert(shiping3);
		
		// Now fire all the rules
        session.fireAllRules();

//        System.out.println(shiping1.getTotalPrice());
        /*System.out.println(shiping2.getTotalPrice());
        System.out.println(shiping3.getTotalPrice());*/
		
		 // Release resources
        session.dispose();
	}
	
	
}
