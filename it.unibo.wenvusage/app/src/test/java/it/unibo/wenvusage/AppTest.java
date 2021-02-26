/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unibo.wenvusage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Before public void setup(){
        System.out.println("setup");

    }
    @After public void terminate(){
        System.out.println("terminate");

    }
    @Test public void testAppHasAGreeting() {
        System.out.println("testAppHasAGreeting");
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    /*@Test public void testAnotherKO() {
        System.out.println("testAnoteherKO");
        fail();
    }*/
    @Test public void testAnotherOK() {
        System.out.println("testAnoteherOk");
        assertTrue(true);
    }

}
