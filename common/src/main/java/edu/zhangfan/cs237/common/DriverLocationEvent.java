package edu.zhangfan.cs237.common;

public class DriverLocationEvent {
  private Integer blockId;
  private Integer driverId;
  private Integer latitude;
  private Integer longitude;
  private Type type;

  public DriverLocationEvent(Integer blockId, Integer driverId, Integer latitude, Integer longitude, Type type) {
    this.blockId = blockId;
    this.driverId = driverId;
    this.latitude = latitude;
    this.longitude = longitude;
    this.type = type;
  }

  public Integer getBlockId() {
    return blockId;
  }

  public void setBlockId(Integer blockId) {
    this.blockId = blockId;
  }

  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}
