package Wanderer.Input;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Wanderer.Area.Floor;
import Wanderer.Board;
import Wanderer.Entities.Enemies;
import Wanderer.Entities.Hero;
import Wanderer.Map.Map;
import Wanderer.Services.EnemiesMovementControl;

public class KeyManager implements KeyListener{

    private boolean[] keys;
    public boolean up, down, left, right,f;
   Hero hero;
    Board board;
    Map map;
    Enemies enemies;
    int counter = 0;
    public KeyManager(Board board, Hero hero, Map map, Enemies enemies) {
        keys = new boolean[256];
        this.hero = new Hero();
        this.hero = hero;
        this.board = board;
        this.map = map;
        this.enemies = enemies;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        counter += 1;
        System.out.println("Pressed!");
        System.out.println("X : " +  hero.getX());
        System.out.println("Y :" + hero.getY());
        System.out.println(counter);
        if(counter % 2 == 0)
            EnemiesMovementControl.enemyMovement(enemies);


    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (map.getMap()[hero.getY() + 1][hero.getX()] instanceof Floor)
            hero.setY(hero.getY() + 1);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (map.getMap()[hero.getY() - 1][hero.getX()] instanceof Floor)
            hero.setY(hero.getY() - 1);
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (map.getMap()[hero.getY()][hero.getX() + 1] instanceof Floor)
            hero.setX(hero.getX() + 1);
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
          if  (map.getMap()[hero.getY()][hero.getX() - 1] instanceof Floor)
            hero.setX(hero.getX() - 1);
        }






        board.repaint();



    }
}
