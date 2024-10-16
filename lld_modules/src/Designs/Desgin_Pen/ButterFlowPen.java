package Designs.Desgin_Pen;

public class ButterFlowPen extends GelPen implements Refillable{

    WruteStaregey wruteStaregey = new ButterflowStartegey();
    @Override
    public void refile() {
        System.out.println(this.name + "pen has refilled");
    }
    @Override
    public void write() {
        refile();
        wruteStaregey.write();
    }
}
