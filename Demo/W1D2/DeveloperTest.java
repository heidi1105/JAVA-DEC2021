/*
1. constructed classes 
2. attributes & methods
3. overloading constructors
4. static method
5. private variables

*/
import java.util.*;
public class DeveloperTest{
    public static void main(String[] args){
        Developer heidi = new Developer(); //go to constructor 1
        heidi.setName("Heidi");
        heidi.setPhone("1112223333");
        // The below 2 lines won't work anymore with private variables
        // heidi.name = "Heidi"; 
        // heidi.phone = "1234567890";

    
        Developer sadie = new Developer("Sadie");//go to constructor 2
        System.out.println(sadie.getName());
        Developer jake = new Developer("Jake", "1112223333");//go to constructor 3

        Skill joke = new Skill("Joke");
        ArrayList<Skill> tempSkills = new ArrayList<>();
        tempSkills.add(joke);
        heidi.addToSkills(new Skill("Java"));
        heidi.setSkills(tempSkills);
        //setSkills replace the skills, addToSkills add to the current skills

        heidi.displayStatus();

        //static method works even if you do not instantiate
        // NOTE: when we construct static method /attributes, DO NOT USE THIS.
        heidi.greet();
        Developer.greet();


    }
}