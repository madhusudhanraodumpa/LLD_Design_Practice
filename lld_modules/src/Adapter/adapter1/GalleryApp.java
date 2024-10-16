package Adapter.adapter1;

public class GalleryApp implements ImageViewer{
    ImageViewerAdapter imageViewerAdapter = new ImageViewerAdapter();
    @Override
    public void show(String format, String fileName) {

        if(!format.equalsIgnoreCase("jpeg")){
            imageViewerAdapter.show(format,fileName);
        }else{
            System.out.println("image "+fileName+" is created "+format+" format");
        }
    }
}
