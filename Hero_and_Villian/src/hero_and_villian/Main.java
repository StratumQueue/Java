package hero_and_villian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person hero = new Person("Hero");
        Person villian = new Person("Villian");

        System.out.println("The hero and villian meet");
        System.out.println("enter 'a' to attack");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (hero.health > 0 && villian.health >0) {

            if (input.equals("a")) {
                hero.setattack();
                villian.setattack();
                int attack = hero.attack(villian);
                if (attack == 0) {
                    hero.changehealth(attack);
                    villian.changehealth(attack);

                } else if (attack > 0) {
                    hero.changehealth(attack);
                } else {
                    villian.changehealth((attack * -1));
                }
                System.out.println(hero);
                System.out.println(villian);
            } else {

                System.out.println("Please enter 'a' to attack villian.");

            }
        }
        
        //declare winner
        if(hero.health>villian.health){
            
            System.out.println(hero.name + " has been declared the winner.");
        
        }
        else{
            System.out.println(villian.name + " has been declared the winner.");
        }
    }

}
