package Wanderer;



import Wanderer.Components.Position;
import Wanderer.Entities.Enemies;
import Wanderer.Entities.Hero;
import Wanderer.Input.KeyManager;
import Wanderer.Map.Map;
import Wanderer.Services.EnemiesMovementControl;
import Wanderer.Services.ImageAssets;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class Board extends JComponent {



    public static final int WIDTH = 720;
    public static final int HEIGHT = 800;

   KeyManager keyManager;


   Enemies enemies;
    Map map;
    Hero hero;
    private Position position;


    public Board() throws IOException {
        enemies = new Enemies();
        map = new Map();
        hero = new Hero();
        EnemiesMovementControl.generateRandomStartPosition(enemies,map.getMap());
        keyManager = new KeyManager(this, hero, map,enemies);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setVisible(true);
        ImageAssets.init();

    }

    @Override
    public void paint(Graphics g) {


        super.paint(g);


        map.drawMap(g);
        enemies.drawEnemies(g);
        g.drawImage(ImageAssets.hero_down,hero.getX() * 72,hero.getY() * 72,null);



    }

    /*
    // De valójában csak ezt a függvényt használjuk a projekt során
    @Override
    public void keyReleased(KeyEvent e) {
        // Mikor megnyomódik a lefele vagy felfele gomb, a négyzetünk pozíciója változik
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 100;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 100;
        }
        // és újra rajzolódik az új koordinátákkal
        repaint();

    }*/
    public Map getMap() {
        return map;
    }

}