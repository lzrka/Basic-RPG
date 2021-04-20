package Wanderer.Services;

import Wanderer.Area.Floor;
import Wanderer.Area.Tile;
import Wanderer.Entities.Enemies;
import Wanderer.Entities.Entity;

import java.util.List;
import java.util.Map;

import static Wanderer.Entities.Entity.RANDOM;

public class EnemiesMovementControl {


    public static void generateRandomStartPosition(Enemies enemies, Tile[][] map) {

        for (int i = 0; i < enemies.getEnemyList().size(); i++) {
            do {

                int x = RANDOM.nextInt(10);
                int y = RANDOM.nextInt(3) + 7;
                enemies.getEnemyList().get(i).setX(x);
                enemies.getEnemyList().get(i).setY(y);

            } while (!(map[enemies.getEnemyList().get(i).getY()][enemies.getEnemyList().get(i).getX()] instanceof Floor));

        }
        for (int i = 0; i < enemies.getEnemyList().size(); i++) {
            enemies.getEnemyList().get(i).setX(enemies.getEnemyList().get(i).getX());
            enemies.getEnemyList().get(i).setY(enemies.getEnemyList().get(i).getY());
        }
    }


    public static void enemyMovement(Enemies enemies) {


        for (int i = 0; i < enemies.getEnemyList().size(); i++) {
            int randomNum = Entity.RANDOM.nextInt(4);
            switch (randomNum) {
                case 0:
                    enemies.getEnemyList().get(i).setX(enemies.getEnemyList().get(i).getX() + 1);
                    break;
                case 1:
                    enemies.getEnemyList().get(i).setX(enemies.getEnemyList().get(i).getX() - 1);
                    break;
                case 2:
                    enemies.getEnemyList().get(i).setY(enemies.getEnemyList().get(i).getY() - 1);
                    break;
                case 3:
                    enemies.getEnemyList().get(i).setY(enemies.getEnemyList().get(i).getY() + 1);
            }


        }
    }
}
