public class Main {
    public static void main(String[] args) {
        String name = "John";
        int age = 27;
        System.out.println(name); //print name
        System.out.println(age); //print age
        System.out.println(name + " " +age); //print HL
        float meinNum = 15.99f;
        double meinNum1 = 15.99d;
        System.out.print(meinNum);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false


        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        float myByte = (byte) myDouble;
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        System.out.println(myByte);
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}