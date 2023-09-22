package composite;

public class Client {
    public static void main(String[] args) {
        Component hd = new Leaf("hard-drive",4000);
        Component mouse = new Leaf("mouse",300);
        Component cpu = new Leaf("cpu",3500);
        Component ram = new Leaf("ram",1800);
        Component keyboard = new Leaf("hard-drive",650);

        Composite motherBoard = new Composite("mother-board");
        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);
        Composite peri = new Composite("peri");
        peri.addComponent(mouse);
        peri.addComponent(keyboard);
        Composite cabinet = new Composite("cabinet");
        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hd);
        Composite computer = new Composite("computer");
        computer.addComponent(cabinet);
        computer.addComponent(peri);
        computer.showPrice();



    }
}
