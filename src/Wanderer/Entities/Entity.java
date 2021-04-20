package Wanderer.Entities;


import Wanderer.Components.Position;

import java.util.Random;

public abstract class Entity implements Drawable{

    public static Random RANDOM = new Random();
    public Position position;
    protected Integer HP;
    protected Integer DP;
    protected Integer SP;
    protected Integer d6;



    public Entity() {

    }

    public int getX() {
        return position.getX();
    }
    public int getY() {
        return position.getY();
    }

    public void setX(int position) {
        this.position.x = position;
    }
    public void setY(int position) {
        this.position.y = position;
    }
}
