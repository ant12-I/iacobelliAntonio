package it.unibo.boundaryWalk;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestMoveVirtualRobot {
    private MoveVirtualRobot appl;

    @Before
    public void systemSetUp() {
        System.out.println("TestMoveVirtualRobot | setUp: robot should be at HOME-DOWN ");
        appl = new MoveVirtualRobot();
    }

    @After
    public void  terminate() {
        System.out.println("%%%  TestMoveVirtualRobot |  terminates ");
    }

   @Test
    public void testBoundaryWalk() {
       String s = new String();
       String s1 = "w*lw*lw*lw*l";
       boolean moveFailed;
       int i;
        System.out.println("TestMoveVirtualRobot | testBoundaryWalk ");
       for(i = 0; i<4; i++){
            do{
                moveFailed = appl.moveForward(600);
            }while (moveFailed == false);
           assertTrue(moveFailed);
           moveFailed = appl.moveLeft(1000);
           assertTrue(!moveFailed );
           s = s + "w*l"; }
       assertTrue(s.equals(s1));
    }
}
