package edu.zhangfan.cs237.common;

public class MatchEvent {
  Integer riderId;
  Integer driverId;

  public MatchEvent(Integer riderId, Integer driverId) {
    this.riderId = riderId;
    this.driverId = driverId;
  }

  public Integer getRiderId() {
    return riderId;
  }

  public void setRiderId(Integer riderId) {
    this.riderId = riderId;
  }

  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }
}
