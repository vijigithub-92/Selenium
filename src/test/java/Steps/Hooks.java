package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void preScenario(Scenario sc) {
		System.out.println("TC Name :"+sc.getName());
		System.out.println("TC Line Number :"+sc.getId());
	}
	@After
	public void postScenario(Scenario sc) {
		System.out.println("TC Status :"+sc.getStatus());
	}

}
