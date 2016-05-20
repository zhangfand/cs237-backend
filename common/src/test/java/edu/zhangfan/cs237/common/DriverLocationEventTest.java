package edu.zhangfan.cs237.common;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;


public class DriverLocationEventTest {
  private Gson gson;
  private DriverLocationEvent event;

  @org.junit.Before
  public void setUp() throws Exception {
    gson = new Gson();
    event = new DriverLocationEvent(1, 1, 1, 1, Type.DRIVER_LOCATION);
  }

  @Test
  public void testDeserialization() throws Exception {
    DriverLocationEvent driverLocationEvent;
    InputStream in =  Resources.getResource("driver-location-event.json").openStream();
    driverLocationEvent = gson.fromJson(new InputStreamReader(in), DriverLocationEvent.class);
  }

  @Test
  public void testSerialization() throws Exception {

  }
}