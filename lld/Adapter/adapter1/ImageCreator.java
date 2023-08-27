package Adapter.adapter1;

public class ImageCreator {
    public static AdvanceImageViewer getImageViewer(String format){

        if(format.equalsIgnoreCase("jpg")){
            return new JpgImageViewer();
        }else{
            return new CngImageViewer();
        }

    }
}
