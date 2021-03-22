/*
===============================================================
RobotObserver.java
handles messages received on the cmdsocket-8091
===============================================================
*/
package wenv;
import interaction.IssObserver;
import org.json.JSONObject;

public class ActorRobotObserver implements IssObserver {
    private ActorNaive handler;

    public ActorRobotObserver(){
        //Activate the handler
        handler = new ActorNaive();
        handler.start();
    }

    @Override
    public void handleInfo(String infoJson) {
        handler.put( infoJson );
    }
    @Override
    public void handleInfo(JSONObject infoJson) {
        handleInfo( infoJson.toString() );
    }


    public void close(){
        handler.terminate();
    }

}
