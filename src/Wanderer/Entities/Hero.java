package Wanderer.Entities;

import Wanderer.Components.Position;

public class Hero extends Entity  {


    public Hero() {

        d6 = RANDOM.nextInt(6) + 1;
        position = new Position();
        position.x = 0;
        position.y = 0;
        HP = 20 + 3 * d6;
        DP = 2 * d6;
        SP = 5 + d6;
    }

}
