package abstractFactory.Factory1;

public class Client {
    public static void main(String[] args) {

        MilkShakeFactory milkShakeFactory = new MilkShakeFactory();
       MilkShake milkShake= milkShakeFactory.createMilkShake(MilkShakeName.APPLEMILKSHAKE);
       milkShake.prepareMilkShake();
    }
}
