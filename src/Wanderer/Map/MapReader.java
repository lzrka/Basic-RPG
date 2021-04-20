package Wanderer.Map;

import Wanderer.Area.Floor;
import Wanderer.Area.Tile;
import Wanderer.Area.Wall;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;

public class MapReader {



    public static Tile[][] readMap(Path path) throws IOException {

        List<String>content = Files.readAllLines(path);
        Tile[][] map = new Tile[content.size()][content.size()];


             
        for (int i = 0; i < content.size() ; i++) {
            for (int j = 0; j < content.get(i).length(); j++) {

                if (content.get(i).charAt(j)== 'T') {

                    map[i][j] = new Floor();
                }
                if(content.get(i).charAt(j) == 'W') {

                    map[i][j] = new Wall();
                }
            }
        }

       return map;
    }



}
