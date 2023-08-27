package Adapter.adapter1;

public class ImageViewerAdapter implements ImageViewer {

    AdvanceImageViewer advanceImageViewer;
    @Override
    public void show(String format, String fileName) {
        advanceImageViewer = ImageCreator.getImageViewer(format);
        advanceImageViewer.createImage(format,fileName);

    }
}
