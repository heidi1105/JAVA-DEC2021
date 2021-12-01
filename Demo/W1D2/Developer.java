// naming convention 
// java file / class -> Capitalized     MyFirstProgram
// class --> Capitalized , noun
import java.util.ArrayList;
// import java.util.*;

public class Developer{
    //private variables 
    private int mood;
    private String name;
    private String phone;
    // we can instantiate the arraylist here OR instantiate inside the constructor
    private ArrayList<Skill> skills = new ArrayList<>();
    private int health = 100;  
    private int level = 10; 

    //constructor1
    public Developer(){
        this.mood = 25;
    }

    //constructor2 with parameters
    public Developer(String name){
        this.name = name;
        this.mood = 30;
    }    

    //constructor3 with parameters
    public Developer(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.mood = 40;
    }

 

    public void displayStatus(){
        System.out.println("Name : " + this.name);
        System.out.println("Phone : " + this.phone);
        System.out.println("level : " + this.level);
        System.out.println("mood : " + this.mood);
        for(Skill skill : this.skills){
            System.out.println("SKills: " + skill.name);
        }
    }

    //static method  |   this --> refers to non-static variable
    public static void greet(){
        System.out.println("Hello, I am awesome!");
        // System.out.println(this.name); (DO NOT UNCOMMENT THIS BECAUSE IT WILL BREAK YOUR PROGRAM)
        //"this" only appears if you instantiate the class
    }

    //getter 
    public String getName(){
        return this.name;
    }
    // methods --> ()  variable --> no ()

    //setter
    public void setName(String name){
        this.name = name;
    }

    //getter
    public String getPhone(){
        return this.phone;
    }

    //setter
    public void setPhone(String phone){
        this.phone = phone;
    }

    //getter
    public int getMood(){
        return this.mood;
    }

    //setter
    public void setMood(int mood){
        this.mood = mood;
    }

    //getter 
    public int getLevel(){
        return this.level;
    }
    //setter
    public void setLevel(int level){
        this.level = level;
    }

    //getter
    public int health(){
        return this.health;
    }

    //setter
    public void setHealth(int health){
        this.health = health;
    }

    //getter for skills
    public ArrayList<Skill> getSkills(){
        return this.skills;
    }

    //setSkill replace the whole ArrayList of skills
    public void setSkills(ArrayList<Skill> skills){
        this.skills = skills;
    }

    //addToSkills DO NOT replace, it adds
    public void addToSkills(Skill skill){
        this.skills.add(skill);
        this.level++;
    }  

}