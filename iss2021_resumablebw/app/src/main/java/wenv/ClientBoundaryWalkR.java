/*
===============================================================
ClientBoundaryWalkR.java
Use the aril language and the support specified in the
configuration file IssProtocolConfig.txt

The business logic is defined in RobotControllerArilBoundary
that is 'message-driven'
===============================================================
*/
package wenv;

import annotations.ArilRobotSpec;
import consolegui.ConsoleGui;
import interaction.IssOperations;
import supports.IssCommSupport;
import supports.RobotApplicationStarter;

@ArilRobotSpec
public class ClientBoundaryWalkR {
    private RobotInputController controller;
    private ActorRobotObserver actorObs = new ActorRobotObserver();
    private ConsoleGui console;
    //Constructor
    public ClientBoundaryWalkR(IssOperations rs){
        IssCommSupport rsComm = (IssCommSupport)rs;
        controller = new RobotInputController(rsComm, true, true );
        console = new ConsoleGui(controller);
        rsComm.registerObserver( controller );
        rsComm.registerObserver( actorObs );
        System.out.println("ClientBoundaryWebsockBasicAsynch | CREATED with rsComm=" + rsComm);
    }

    public String doBoundary(){
        System.out.println("ClientBoundaryWebsockBasicAsynch | doBoundary " + controller  );
        String result = controller.doBoundary();
        actorObs.close();
        return result;
    }



    public static void main(String args[]){
        try {
            System.out.println("ClientBoundaryWebsockBasicAsynch | main start n_Threads=" + Thread.activeCount());
            Object appl = RobotApplicationStarter.createInstance(ClientBoundaryWalkR.class);
            System.out.println("ClientBoundaryWebsockBasicSynch  | appl n_Threads=" + Thread.activeCount());
            String trip = ((ClientBoundaryWalkR)appl).doBoundary();
            System.out.println("ClientBoundaryWebsockBasicAsynch | trip="   );
            System.out.println( trip  );
            System.out.println("ClientBoundaryWebsockBasicAsynch | main end n_Threads=" + Thread.activeCount());
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
