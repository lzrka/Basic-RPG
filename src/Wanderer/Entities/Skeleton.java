package Wanderer.Entities;

import Wanderer.Components.Position;

public class Skeleton extends Entity  {

    int level = 1;
    boolean hasKey = false;

    public Skeleton(){

        d6 = RANDOM.nextInt(6) + 1;
        position = new Position();
        position.x = 100;
        position.y = 100;
        HP = 2 * level * d6;
        DP = level/2 * d6;
        SP = level + d6;



    }


}
