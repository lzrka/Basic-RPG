package Wanderer.Map;

import Wanderer.Area.Floor;
import Wanderer.Area.Tile;
import Wanderer.Area.Wall;
import Wanderer.Board;
import Wanderer.Services.ImageAssets;
import Wanderer.Services.ImageLoader;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Map {

    int Level = 1;
   private Tile[][] map;


    public Map() throws IOException {

        map = MapReader.readMap(Paths.get("D:\\greenfox\\wanderer-java2\\maps\\level" + this.Level + ".txt"));

    }

    public void drawMap(Graphics g) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] instanceof Floor)
                    g.drawImage(ImageAssets.floor, j * Board.WIDTH / 10, i * Board.WIDTH / 10, null);
                if (map[i][j] instanceof Wall)
                    g.drawImage(ImageAssets.wall, j * Board.WIDTH / 10, i * Board.WIDTH / 10, null);
            }
        }

    }




    public int getLevel() {
        return Level;
    }

    public Tile[][] getMap() {
        return map;
    }
}






