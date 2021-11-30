// naming convention 
// java file / class -> Capitalized     MyFirstProgram
// class --> Capitalized , noun
import java.util.ArrayList;
// import java.util.*;

public class Developer{
    public int mood;
    public String name;
    public String phone;
    public String email; 
    public ArrayList<Skill> skills = new ArrayList<>();
    public int health = 100;  
    public int level = 10; 

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

    public void addToSkills(Skill skill){
        this.skills.add(skill);
        this.level++;
    }   

    public void displayStatus(){
        System.out.println("Name : " + this.name);
        System.out.println("level : " + this.level);
        System.out.println("mood : " + this.mood);
        for(Skill skill : this.skills){
            System.out.println("SKills: " + skill.name);
        }
    }

}