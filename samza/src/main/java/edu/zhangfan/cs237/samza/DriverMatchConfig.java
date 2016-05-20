package edu.zhangfan.cs237.samza;

import org.apache.samza.system.SystemStream;

public class DriverMatchConfig {
    // The driver location stream
    public static final SystemStream DRIVER_LOC_STREAM = new SystemStream("kafka", "driver-locations");
    // The event stream
    public static final SystemStream EVENT_STREAM = new SystemStream("kafka", "events");
    // The output stream for task 1 and the bonus task
    public static final SystemStream MATCH_STREAM = new SystemStream("kafka", "match-stream");
}
