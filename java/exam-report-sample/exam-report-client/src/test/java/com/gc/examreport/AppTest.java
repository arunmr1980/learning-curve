package com.gc.examreport;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.gc.examreport.model.*;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App app = new App();
        Empty result = app.getExamReport("18");
        System.out.println(result);
        assertTrue( true );
    }
}
