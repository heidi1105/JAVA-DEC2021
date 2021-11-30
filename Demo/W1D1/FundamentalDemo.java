/*
1. METHOD (signature, return type, overloading)
2. modularization 
3. fixed array 
4. ArrayList (getter setter, <Integer> , <Object> type) .size(), remove(0)
5. demo (if time allows)

*/
// method vs function 
import java.util.ArrayList;

public class FundamentalDemo{

    public void printGreeting(){
        System.out.println("Greeting here");
        //void -- DO NOT RETURN ANYTHING
    }    

    public String greeting(){
        String greetingMessage = "First greeting method without parameters";
        return greetingMessage;
        //greeting without arguments
    }


    public String greeting(String whatever){
        String greetingMessage = "Second greeting, " + whatever;
        return greetingMessage;
        //greeting with a string inside parameters
    }


    public String greeting(int whatever){
        String greetingMessage = "Third greeting, " + whatever;
        return greetingMessage;
        //greeting with an integer inside (   )
    }

    public String greeting(String name, String language){
        String greetingMessage = language + "! " + name;
        return greetingMessage;
        //greeting with 2 strings inside parameters
    }

    public void testing(Object whatever){
        if(whatever.getClass().getSimpleName() == "String"){
            System.out.println(whatever+ " is a string");
        }
        System.out.println(whatever.getClass().getSimpleName());
    }

    public void fixedArr(){
        //int[] double[] 
        int[] myArr; // creating an array of integer
        myArr = new int[3]; //this array will have a size of 3
        myArr[0] = 10;
        myArr[1] = 20;
        myArr[2] = 30;
        
        myArr[2] = 100;

        for(int i = 0; i<myArr.length ; i++){
             System.out.println(myArr[i]);            
        }
        int sum =0 ;
        for(int i = 0; i<myArr.length ; i++){
            sum+= myArr[i];   
            // Cafe Business Logic #1        
        }
        System.out.println(sum);
    }

    public void dynamicArray(){
        //import java.util.ArrayList
        int[] myArr =  new int[3]; //creating fixed array
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(100);
        myArrayList.add(200);
        myArrayList.add(300);

        // System.out.println(myArrayList.get(1));
        // myArrayList.set(1, 2000);
        // System.out.println(myArrayList.get(1));

        for(int i =0 ; i< myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));
        }

        for(Integer element : myArrayList){
            System.out.println(element);
        }


        //int --> primitive 
        //Integer --> Wrapper class
        // .add(whatever)
        // .get(index) 
        //.set 
        // .size()
    }







}