package Designs.Desgin_Pen;

public class Client {
    public static void main(String[] args) {
        Pen pen = PenFActory.getPen(PenType.BUTTERFLOWPEN);
        pen.setName("Eloks Gel");
        pen.setBrand("Eloks");
        pen.setCost(10);
        pen.setType(PenType.BUTTERFLOWPEN);

        pen.write();
        System.out.println(pen.getName());
        System.out.println(pen.brand);
        System.out.println(pen.getCost());
    }
}
