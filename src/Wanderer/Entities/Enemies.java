package Wanderer.Entities;

import Wanderer.Services.ImageAssets;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Enemies {


    List<Entity> enemyList;

    public Enemies() {

        enemyList = new ArrayList<>();
        enemyList.add(new Boss());
        enemyList.add(new Skeleton());
        enemyList.add(new Skeleton());
        enemyList.add(new Skeleton());

    }

    public void chooseKeyOwner() {
        int i = 0;
        while (!(enemyList.get(i) instanceof Skeleton)) {

            for (i = 0; i < enemyList.size(); i++) {
                if (enemyList.get(Entity.RANDOM.nextInt(4)) == enemyList.get(i) && enemyList.get(i) instanceof Skeleton)
                    ((Skeleton) enemyList.get(i)).hasKey = true;
            }
        }

    }

    public void drawEnemies(Graphics g) {
        for (Entity entity : enemyList) {
            if (entity instanceof Skeleton)
            g.drawImage(ImageAssets.skeleton,entity.getX() * 72,entity.getY() * 72,null);
            if(entity instanceof Boss)
                g.drawImage(ImageAssets.boss,entity.getX() * 72,entity.getY() * 72,null);
        }
    }


    public List<Entity> getEnemyList() {
        return enemyList;
    }

}
