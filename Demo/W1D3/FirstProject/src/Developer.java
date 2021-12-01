import java.util.ArrayList;

public class Developer {
	
	private static int numOfDeveloper = 0;
    private int mood;
    private String name;
    private String phone;
    // we can instantiate the arraylist here OR instantiate inside the constructor
    private ArrayList<Skill> skills = new ArrayList<>();
    private int health = 100;  
    private int level = 10;
    
    public Developer() {
    	numOfDeveloper++;
    }
    
	public Developer(String name) {
		this.name = name;
		numOfDeveloper++;
		
	}

	public Developer(String name, String phone) {
		this.name = name;
		this.phone = phone;
		numOfDeveloper++;
	}

	 
    public void displayStatus(){
        System.out.println("Name : " + this.name);
        System.out.println("Phone : " + this.phone);
        System.out.println("level : " + this.level);
        System.out.println("mood : " + this.mood);
        for(Skill skill : this.skills){
            System.out.println("SKills: " + skill.getName());
        }
    }
    
    //static method  |   this --> refers to non-static variable
    public static void greet(){
        System.out.println("Hello, I am awesome!");
        // System.out.println(this.name); (DO NOT UNCOMMENT THIS BECAUSE IT WILL BREAK YOUR PROGRAM)
    }
    
    //addToSkills DO NOT replace, it adds
    public void addToSkills(Skill skill){
        this.skills.add(skill);
        this.level++;
    }  
	
	
	public int getMood() {
		return mood;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Skill> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public static int getNumOfDeveloper() {
		return numOfDeveloper;
	}

	public static void setNumOfDeveloper(int numOfDeveloper) {
		Developer.numOfDeveloper = numOfDeveloper;
	} 
    
	
    

}
