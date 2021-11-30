

public class DeveloperTest{
    public static void main(String[] args){
        Developer heidi = new Developer();
        heidi.name = "Heidi";
        heidi.phone = "1234567890";
        System.out.println(heidi.name +" : " + heidi.phone);
        System.out.println("Mood: " + heidi.mood);
        System.out.println("level: " + heidi.level);
        System.out.println("health: " + heidi.health);
    
        // Developer sadie = new Developer("Sadie");
        // System.out.println(sadie.name);
        // System.out.println("Mood: " + sadie.mood);

        // Developer jake = new Developer("Jake", "1112223333");
        // System.out.println(jake.name);
        // System.out.println(jake.phone);
        // System.out.println("Mood: " + jake.mood);

        Skill joke = new Skill("Joke");
        heidi.addToSkills(new Skill("Java"));
        heidi.skills.add(joke);
        heidi.displayStatus();
    }
}