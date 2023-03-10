/*
* Liam Cristescu
* 3.8.2023
* This is a driver class that instantiates the two ships taking part in the battle, starts the fight, and declares the winner
*/
import Ships.BirdofPrey;
import Ships.GalaxyClass;
import Ships.Ship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        /*This code creates a HashMap that represents the cargo the starships are hauling. It doesn't have any bearing on
        * the program as it stands, but it is in here as part of the prompt of the assignment*/
        HashMap<String,Integer> cargo = new HashMap<>();
        cargo.put("dilithium", 5);
        List<Ship> ships = new ArrayList<>();
        /*Instantiating new ships that will take part in the fight. Their hull and shield values are hard coded here. In a
        * more 'complete' version of the program, these values would be coded into the ship objects themselves, so that
        * they can be added more easily. But they are coded in here as part of the prompt.*/
        ships.add(new GalaxyClass(7,15,100,cargo));
        ships.add(new BirdofPrey(6,10,20,cargo));

        for (Ship m : ships) {
            System.out.println(m); // list the ships out before the fight begins
        }

        System.out.println();

        /*This while loop keeps the fight going while both ships still have hull integrity. The loop fails when one or
        * both ships are destroyed, because in space war there is no diplomatic options*/
        while ((ships.get(0).getHull() > 0 && (ships.get(1).getHull() > 0))){
            ships.get(0).attackTarget(ships.get(1));
            ships.get(1).attackTarget(ships.get(0));
            System.out.println();
        }
        if(ships.get(0).getHull() < 0 && ships.get(1).getHull() < 0){
            System.out.println("\nBoth ships were destroyed in the heat of interstellar battle!");
        } else if(ships.get(0).getHull() > 0){
            System.out.println("\n" + ships.get(0).toString() + " wins!");
        } else {
            System.out.println("\n" + ships.get(1).toString() + " Wins!");
        }
    }
}
