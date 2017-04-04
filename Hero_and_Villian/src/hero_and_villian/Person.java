package hero_and_villian;

public class Person {
    int health;
    int attack;
    String name;


    public Person(String person){
        
        String name = person;
        int health = 10;
        int attack = 0;

    }

    public void setattack() {

        this.attack = (int) (Math.random()*4)+1;

    }

    public int attack(Person person) {
        //determine difference in attack value
            int difference_in_attack = this.attack-person.attack;
            
            return difference_in_attack;
        
    }

    public void changehealth(int value) {
        
        this.health-=value;

    }
    public String toString () {
    String text = "Health of" + this.name + ": " + this.health + "\n";
    return text;
    }
}
