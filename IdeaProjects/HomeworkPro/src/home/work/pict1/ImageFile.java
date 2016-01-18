package home.work.pict1;

/**
 * Created by Vitalik on 16.12.2015.
 */
public class ImageFile extends File {

    public String imageType;

    public ImageFile(String extension, int size, String name) {
        super(extension, size, name);
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public void look(){
        System.out.println("Looked");
    }


    @Override
    public void open() {
        System.out.println("Open image file");
    }

    @Override
    public void close() {
        System.out.println("Close image file");
    }

    @Override
    public void edit() {
        System.out.println("Edit image file");
    }

    @Override
    public void copy() {
        System.out.println("Copy image file");
    }
}
