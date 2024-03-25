package generics;

public class GenericVsLegacy {
    public static void main(String[] args) {
        Box normalBox = new Box();
        normalBox.setItem("String");

        int normalBoxItem = (int) normalBox.getItem();

        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.setItem("String");
//        int  genericItem = genericBox.getItem();


    }

}
