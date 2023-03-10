package Ships;/*
 *Liam Cristescu
 * 3.5.2023
 * I decided to have a little bit of fun with this assignment, all of the implementation is the same, except now the motif
 * is Star Trek ships. The only this that has changed is that how each child of Ships.Ship (was Monster) how has two hp fields:
 * shields, and hull (because every starship needs some shielding). I realize i turned in the first phase of this assignemnt
 * as per the original instructions, I have gone back and retroactively changed this files, and can resubmit them upon
 * request. This is the "Bird of Prey" class (was the "Kobold" class)
 */
import Abilities.PhaserAttack;
import Abilities.TorpedoAttack;
import Ships.Ship;

import java.util.HashMap;

public class BirdofPrey extends Ship {
    public BirdofPrey (Integer maxHull, Integer maxShields, Integer xp, HashMap<String, Integer> cargo){
        super(maxHull, maxShields, xp, cargo);
/*These are not the original values for Imp or Kobold, but I chose these values to better reflect the nature of the Klingon
* Bird of Prey. She's a proper glass cannon, reasonably maneuverable and capable of putting out a great deal of firepower,
* but generally lacking defense.*/
        Integer maxStr = 18;
        Integer maxDef = 10;
        Integer maxAgi = 12;
        /*Both ships will have access to either attack, which attack they use in a given bout will be determined randomly.
         * Perhaps a more advanced version of this program would have the Bird of Prey show a preference for torpedoes, while
         * occasionally using their phasers, and vice versa for the Galaxy-Class? */
        attack1 = new PhaserAttack(this);
        attack2 = new TorpedoAttack(this);
/*stats stored in a HasmHap (hehe) for easy reference*/
        stats.put("str", maxStr);
        stats.put("def", maxDef);
        stats.put("agi", maxAgi);

    }

    @Override
    public String toString(){
        return "Bird of Prey: " + super.toString();
    }
}
