package Adapter.adapter1;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        ImageViewer imageViewer = new GalleryApp();
        imageViewer.show("jpeg","madhu.pic");
    }
}
