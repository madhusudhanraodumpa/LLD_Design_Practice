package Designs.Design_ParkingLot.dto;

import Designs.Design_ParkingLot.model.VechileType;

public class TicketGenerateRequestDto {
    private int vechicleNumber;
    private int gateId;
    private VechileType vechileType;

    private String vechileOwnerName;

    public String getVechileOwnerName() {
        return vechileOwnerName;
    }

    public void setVechileOwnerName(String vechileOwnerName) {
        this.vechileOwnerName = vechileOwnerName;
    }

    public int getVechicleNumber() {
        return vechicleNumber;
    }

    public void setVechicleNumber(int vechicleNumber) {
        this.vechicleNumber = vechicleNumber;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }
}
