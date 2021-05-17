%====================================================================================
% workshift description   
%====================================================================================
context(ctxworkshift, "localhost",  "TCP", "8092").
 qactor( worker, ctxworkshift, "it.unibo.worker.Worker").
  qactor( sender, ctxworkshift, "it.unibo.sender.Sender").
