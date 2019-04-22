package com.company;
import javax.swing.*;
import java.awt.*;

public class Main extends JApplet {
 int WINDOW_WIDTH =20;
 int WINDOW_HEIGHT =30;
public static void main(String [] args){}
    public void paint(Graphics  g) {
        super.paint(g);
        paintHouse(g);
        paintLandscape(g);
    }
    public void paintHouse(Graphics grph){
        grph.setColor(Color.PINK);
        grph.fillRect(100,100,200,200);
        grph.setColor(Color.BLACK);
        Polygon poly = new Polygon();
        poly.addPoint(100,100);
        poly.addPoint(200,50);
        poly.addPoint(300,100);
        grph.fillPolygon(poly);
        grph.setColor(Color.BLUE);
        grph.fillRect(200,230,40,70);

        paintWindow(grph,120,120);
        paintWindow(grph,150,150);
        paintWindow(grph,200,150);
        paintWindow(grph,230,150);
    }

    public void paintWindow(Graphics gp ,int x, int y){
        gp.setColor(Color.BLUE);
        gp.fillRect(x,y,WINDOW_WIDTH,WINDOW_HEIGHT);
    }
    public void paintLandscape(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(400,130,30,170);
        g.setColor(Color.GREEN);
        g.fillOval(370,80,100,100);
        g.fillRect(0,295,500,5 );
    }
}
