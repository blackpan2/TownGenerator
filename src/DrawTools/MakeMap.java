package DrawTools;
import Town.Town;

import javax.swing.*;

import java.awt.*;
import java.lang.String;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Stout on 3/3/2015.
 */
public class MakeMap extends JPanel {

    Town town = new Town();
    private int numberOfHouses = 100;//town.getNumberOfHouses();
    Random r = new Random();
    private static int MAPSIZE = 600;
    private static int SCREENSIZE = 800;

    public void paint(Graphics g) {
        Image img = createImageWithText();
        g.drawImage(img, 20, 20, this);
    }

    private Image createImageWithText(){

        BufferedImage bufferedImage = new BufferedImage(MAPSIZE,MAPSIZE, BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        System.out.println("Number of houses: " + this.numberOfHouses);
        g.setColor(Color.GREEN);
        int housesMade = 0;
        while (housesMade != this.numberOfHouses) {
            int x = r.nextInt(MAPSIZE - 10) + 5;
            int y = r.nextInt(MAPSIZE - 10) + 5;
            g.fillRect(x, y, 10, 10);
            housesMade++;
        }
        return bufferedImage;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.getContentPane().add(new MakeMap());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREENSIZE, SCREENSIZE);
        frame.setVisible(true);
    }
}
