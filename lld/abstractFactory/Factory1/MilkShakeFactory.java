package abstractFactory.Factory1;

import java.util.HashMap;
import java.util.Map;

public class MilkShakeFactory {

    Map<MilkShakeName,MilkShake> milkShakeMap = null;
    MilkShakeFactory(){
        milkShakeMap = new HashMap<>();
        loadAllMilkshakes();
    }

    private void loadAllMilkshakes() {
        milkShakeMap.put(MilkShakeName.APPLEMILKSHAKE,new AppleMilkShake());
        milkShakeMap.put(MilkShakeName.OREOMILKSHAKE,new OreoMilkShake());

    }

    public MilkShake createMilkShake(MilkShakeName milkShakeName){

       return milkShakeMap.get(milkShakeName);


    }
}
