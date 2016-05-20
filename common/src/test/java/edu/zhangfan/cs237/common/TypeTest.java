package edu.zhangfan.cs237.common;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

public class TypeTest {
  private Gson gson;

  @Before
  public void setUp() throws Exception {
    gson = new Gson();
  }

  @Test
  public void testDeserialization() throws Exception {
    Type type;
    try (InputStreamReader in = new InputStreamReader(Resources.getResource("type.json").openStream())) {
      type = gson.fromJson(in, Type.class);
    }
    assertEquals(Type.DRIVER_LOCATION, type);
  }
}