package Abilities;

import Ships.Ship;

/* Liam Cristescu
 * 3.5.2023
 * I decided to have a little bit of fun with this assignment, all of the implementation is the same, except now the motif
 * is Star Trek ships. The only this that has changed is that how each child of Ships.Ship (was Monster) how has two hp fields:
 * shields, and hull (because every starship needs some shielding). I realize i turned in the first phase of this assignemnt
 * as per the original instructions, I have gone back and retroactively changed this files, and can resubmit them upon
 * request.
 * This is the Torpedo Abilities.Attack class (was the Ranged Abilities.Attack class). I figure in space there are ONLY ranged attacks. so in
 * order to maintain the desired level of variance in child classes, we will do Torpedos and Phasers instead of range and melee.
 * plus! maybe the torpedo attack will do extra damage is the shields are down? I'm going a little wild with it, just having fun.
 * Let me know if its too much.*/
public class TorpedoAttack implements Attack{
    Ship attacker;

    public TorpedoAttack(Ship attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Ship target){
        String message = attacker + " uses a torpedo attack on " + target;
        System.out.println(message);
        Integer output = attacker.getStr() - target.getAgi();
        if( output < 0 ){
            return 0;
        }
        /*The damage returned by this attack function is determined by the difference in the attackers strength and the
        * defender's agility. This is because torpedoes are slow moving and can potentially be evaded. in a more complete version
        * of this program I would write a function for evasion to reduce the damage caused by the torpedo, and for the
        * remaining damage to be reduced by the defense, but for now this is how it is.*/
        return attacker.getStr() - target.getAgi();
    }
}
