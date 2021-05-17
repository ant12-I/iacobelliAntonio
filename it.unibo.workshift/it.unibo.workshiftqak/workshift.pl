%====================================================================================
% workshift description   
%====================================================================================
context(ctxworkshift, "localhost",  "TCP", "8092").
 qactor( workshift, ctxworkshift, "it.unibo.workshift.Workshift").
  qactor( sender, ctxworkshift, "it.unibo.sender.Sender").
