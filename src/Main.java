import java.awt.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setCost(2000);
        game.addList();
        game.game();
    }
}