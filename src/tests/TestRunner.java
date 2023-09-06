/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 6, 2023
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestEmployeeLogic.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
		}
}