package Wanderer.Entities;

import Wanderer.Components.Position;

public class Boss extends Entity {

   int level = 1;



    public Boss() {

        d6 = RANDOM.nextInt(6) + 1;
        position = new Position();
        position.x = 100;
        position.y = 100;
        HP = 2 * level * d6 + d6;
        DP = level/2 * d6 + d6/2;
        SP = level + d6 + level;
    }

}
