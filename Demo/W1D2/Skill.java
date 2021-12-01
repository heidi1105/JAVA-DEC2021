public class Skill{
    public String name;
    public int value = 10;

    //1
    public Skill(){}

    //2
    public Skill(String name){
        this.name = name;
    }

    //3
    public Skill(String name, int value){
        this.name = name;
        this.value = value;
    }


}