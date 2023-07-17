public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Example exampleOne = new Example();
        exampleOne.normalVariable = 5;
        exampleOne.staticVariable = "Harshit Jain";
        System.out.println("the value of example One static variable :"+exampleOne.staticVariable);
        Example exampleTwo = new Example();
        exampleTwo.normalVariable = 15;
        exampleTwo.staticVariable = "Yashu Jain";

        Example exampleThree=new Example();
        exampleThree.normalVariable =25;
        exampleThree.staticVariable = "yash jain";
        System.out.println("the value of example One static variable :"+exampleThree.staticVariable);
        System.out.println("the value of example One normal variable :"+exampleOne.normalVariable);
        System.out.println("the value of example Two normal variables :"+exampleTwo.normalVariable);
        System.out.println("the value of example One static variable :"+exampleOne.staticVariable);
        System.out.println("the value of example Two static variables :"+exampleTwo.staticVariable);



    }
}