package Wanderer.Services;

import java.awt.image.BufferedImage;

public class ImageAssets {

    public static final int width = 72, height = 72;
    public static BufferedImage floor,wall,hero_down,hero_up,hero_right,hero_left,skeleton,boss;

    public static void init() {

        floor = ImageLoader.loadImage("D:\\greenfox\\wanderer-java2\\img\\floor.png");
        wall = ImageLoader.loadImage("img/wall.png");
        hero_down = ImageLoader.loadImage("img/hero-down.png");
        hero_up = ImageLoader.loadImage("img/hero-up.png");
        hero_right = ImageLoader.loadImage("img/hero-right.png");
        hero_left = ImageLoader.loadImage("img/hero-left.png");
        skeleton = ImageLoader.loadImage("img/skeleton.png");
        boss = ImageLoader.loadImage("img/boss.png");
    }


}
