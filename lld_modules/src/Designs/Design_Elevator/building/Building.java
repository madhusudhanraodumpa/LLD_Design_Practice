package Designs.Design_Elevator.building;

import java.util.List;

public class Building {
    private int buildingId;
    private String buildingName;
    private List<Floor> floorList;

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public Building(int buildingId, String buildingName, List<Floor> floorList) {
        this.buildingId = buildingId;
        this.buildingName = buildingName;
        this.floorList = floorList;
    }
}
