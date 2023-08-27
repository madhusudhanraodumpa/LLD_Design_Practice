package Adapter.adapter1;

public class CngImageViewer implements AdvanceImageViewer{
    @Override
    public void createImage(String format, String fileName) {
        System.out.println("image "+fileName+" is created "+format+" format");
    }
}
