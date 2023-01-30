package Ch_object;

public class PackagingBoxImpl {
    public static void main(String[] args) {
        PackagingBox myBox = new PackagingBox();

        myBox.setLength(10);
        myBox.setBreadth(20);
        myBox.setHeight(30);

        myBox.setWeight(120);

        myBox.setPrice(299);

        myBox.computeVolume();

        System.out.println("Dimensions of the Box: ");
        System.out.println("Length is: " +myBox.getLength());
        System.out.println("Breadth is: " + myBox.getBreadth());
        System.out.println("Height is: " + myBox.getHeight());

        System.out.println("Weight, price and Volume of the Box: ");
        System.out.println("Weight is: " + myBox.getWeight());
        System.out.println("Price is: " + myBox.getPrice());
        System.out.println("Volume is: " + myBox.getVolume());
    }
}
