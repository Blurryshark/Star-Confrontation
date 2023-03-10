package Ships;/*
*Liam Cristescu
* 3.5.2023
* I decided to have a little bit of fun with this assignment, all of the implementation is the same, except now the motif
* is Star Trek ships. The only this that has changed is that how each child of Ships.Ship (was Monster) how has two hp fields:
* shields, and hull (because every starship needs some shielding). I realize i turned in the first phase of this assignemnt
* as per the original instructions, I have gone back and retroactively changed this files, and can resubmit them upon
* request. This is the "Galaxy Class" class (a bit redundant; was the "Imp" class)
*/
import Abilities.PhaserAttack;
import Abilities.TorpedoAttack;
import Ships.Ship;

import java.util.HashMap;

public class GalaxyClass extends Ship {
    public GalaxyClass (Integer maxHull, Integer maxShields, Integer xp, HashMap<String, Integer> cargo){
        super(maxHull, maxShields, xp, cargo);
/*These values are different than those provided for Imp and Kobold, but I chose them to reflect the characteristics of the
* Galaxy-Class ship. She's tough, but can't maneuver very effectively and only has reasonable maximum damage output*/
        Integer maxStr = 12;
        Integer maxDef = 15;
        Integer maxAgi = 6;
/*Both ships will have access to either attack, which attack they use in a given bout will be determined randomly.
* Perhaps a more advanced version of this program would have the Bird of Prey show a preference for torpedoes, while
* occasionally using their phasers, and vice versa for the Galaxy-Class? */
        attack1 = new PhaserAttack(this);
        attack2 = new TorpedoAttack(this);
/*Stats are store in a HashMap for easy reference*/
        stats.put("str", maxStr);
        stats.put("def", maxDef);
        stats.put("agi", maxAgi);


//        str = super.getAttribute(str, maxStr);
//        def = super.getAttribute(def, maxDef);
//        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString(){
        return "GalaxyClass: " + super.toString();
    }
}
