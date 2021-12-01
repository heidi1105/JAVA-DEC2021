import java.util.ArrayList;

public class DeveloperTest {

	public static void main(String[] args) {
        Developer heidi = new Developer(); //go to constructor 1
        heidi.setName("Heidi");
        heidi.setPhone("1112223333");
        
        Developer sadie = new Developer("Sadie");//go to constructor 2
        System.out.println(sadie.getName());
        
        Developer jake = new Developer("Jake", "1112223333");
        
        Skill joke = new Skill("Joke");
        ArrayList<Skill> tempSkills = new ArrayList<>();
        tempSkills.add(joke);
        heidi.addToSkills(new Skill("Java"));
        heidi.setSkills(tempSkills);
        
        heidi.displayStatus();

        //static method works even if you do not instantiate
        // NOTE: when we construct static method /attributes, DO NOT USE THIS.

        Developer.greet();
        System.out.println("Number of Developers: " + Developer.getNumOfDeveloper() );
        Developer.setNumOfDeveloper(10);
        System.out.println("Number of Developers: " + Developer.getNumOfDeveloper() );
        
        SeniorDeveloper max = new SeniorDeveloper("max");
        max.displayStatus();
        


	}

}
