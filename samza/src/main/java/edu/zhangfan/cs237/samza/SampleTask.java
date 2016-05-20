package edu.zhangfan.cs237.samza;

import org.apache.samza.system.IncomingMessageEnvelope;
import org.apache.samza.system.OutgoingMessageEnvelope;
import org.apache.samza.system.SystemStream;
import org.apache.samza.task.MessageCollector;
import org.apache.samza.task.StreamTask;
import org.apache.samza.task.TaskCoordinator;

public class SampleTask implements StreamTask {
  private static final SystemStream OUTPUT_STREAM = new SystemStream("kafka", "forward");

  public void process(IncomingMessageEnvelope incomingMessageEnvelope, MessageCollector messageCollector, TaskCoordinator taskCoordinator) throws Exception {
    String message = (String) incomingMessageEnvelope.getMessage();
    messageCollector.send(new OutgoingMessageEnvelope(OUTPUT_STREAM, message));
  }
}
