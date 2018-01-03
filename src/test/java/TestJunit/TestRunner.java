package TestJunit;

import TestJunit.TestJunit;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);

        //Here it is getting the run count from the result object
        System.out.println("Total number of tests " + result.getRunCount());
        //This is to get the failure count from the result object
        System.out.println("Total number of tests failed " + result.getFailureCount());

        for (Failure failure : result.getFailures()) {
            //This will print message only in case of failure
            System.out.println(failure.toString());
        }
        //This will print the overall test result
        System.out.println(result.wasSuccessful());


        Result result1 = JUnitCore.runClasses(TestJunit2.class);

        //Here it is getting the run count from the result1 object
        System.out.println("Total number of tests " + result1.getRunCount());
        //This is to get the failure count from the result1 object
        System.out.println("Total number of tests failed " + result1.getFailureCount());

        for (Failure failure : result1.getFailures()) {
            //This will print message only in case of failure
            System.out.println(failure.toString());
        }
        //This will print the overall test result
        System.out.println(result1.wasSuccessful());

    }
}





