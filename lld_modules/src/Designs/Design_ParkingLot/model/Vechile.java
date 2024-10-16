package Designs.Design_ParkingLot.model;

public class Vechile extends BaseModel {
    private int vechileNumber;
    private String vechileName;
    private String ownerName;
    private VechileType vechileType;

    public int getVechileNumber() {
        return vechileNumber;
    }

    public void setVechileNumber(int vechileNumber) {
        this.vechileNumber = vechileNumber;
    }

    public String getVechileName() {
        return vechileName;
    }

    public void setVechileName(String vechileName) {
        this.vechileName = vechileName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }
}
