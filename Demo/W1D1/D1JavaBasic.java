/*
- Intro to Java & version
- What is Java (interpreted Vs Compiled)
- JDK, JVM, JRE
- strongly typed language
- Create a file, naming convention 
- primitive Data types - int, boolean, double, char
- Object Data types - String, Integer, Double, Boolean ***** especially in database
- if / for loop
- String methods - length(), String.format, concat, indexOf, trim(), toLowerCase(), equals
*/



// **** naming conversion 
// CLASS --> JavaBasic.java   / MyFirstProgram.java
public class D1JavaBasic{
    //point of entry method
    public static void main(String[] args){
        //primitive Data types
        // int
        int age = 13;
        // boolean
        boolean alive = true;
        // double
        double price = 99.99;
        // char
        char letter = 'A';


        //Object Data Types
        
        //String 
        String name = "Pepper";
        String name2 = new String("Kitty");
        //String methods - 
        //length() 
        System.out.println(name.length());
        //String.format, 
        String someText = String.format("%s costs %.2f", "A cup", 69.99);
        System.out.println(someText+name);

        System.out.println(name == "Pepper");
        System.out.println(name2.equals("kitty"));
        // equals

        //if 
        if(alive){
            System.out.println(name + " is alive.");
        }else{
            System.out.println(name + " is not alive.");
        }
        //for loop

        // for(int i =0; i< 5; i++){
        //     System.out.println(i);
        // }

        //type casting 
        // implicit casting -- int: 10 --> double 10.00
        int intPrice = 10;
        double doublePrice = intPrice;
        System.out.println(intPrice);
        System.out.println(doublePrice);


        // explicit casting 
        double doubleWeight = 100.5;
        int intWeight = (int) doubleWeight;
        System.out.println(doubleWeight);
        System.out.println(intWeight);
    }
} 

