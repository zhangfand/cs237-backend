package edu.zhangfan.cs237.common;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import org.junit.*;

import java.io.InputStreamReader;


public class EventTest {

  private Gson gson;
  @Before
  public void setUp() throws Exception {
    gson = new Gson();
  }

  @Test
  public void testDeserialization() throws Exception {
    InputStreamReader reader = new InputStreamReader( Resources.getResource("event.json").openStream() );
    Event event = gson.fromJson(reader, Event.class);
  }

  @Test
  public void testRequestRideEvent() throws Exception {
    InputStreamReader reader = new InputStreamReader( Resources.getResource("ride-request-event.json").openStream() );
    Event event = gson.fromJson(reader, Event.class);
    Assert.assertNull(event.getStatus());
  }
}