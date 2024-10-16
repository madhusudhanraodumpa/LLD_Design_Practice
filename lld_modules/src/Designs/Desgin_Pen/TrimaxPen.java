package Designs.Desgin_Pen;

public class TrimaxPen  extends GelPen implements Refillable{
    WruteStaregey wruteStaregey = new TriMaxStaregey();
    @Override
    public void refile() {
        System.out.println(this.name + "pen has refilled");
    }
    @Override
    public void write() {
wruteStaregey.write();
    }
}
