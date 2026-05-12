package ads.poo;


import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main(String[] args) throws InterruptedException {
        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);

        draw.enableDoubleBuffering();

        draw.circle(400, 400, 100);

        draw.setPenColor(Color.RED);
        draw.filledCircle(400, 400, 50);


        draw.rectangle(400, 400, 150, 150);

        //draw.line(100,100, 150, 150);
        //draw.line(150, 150, 250, 150);
        //draw.line(250, 150, 300, 100);
        //draw.line(300,100, 100, 100);


        double[] x= {100, 150, 250, 300};
        double[] y = {100, 150, 150, 100};

        draw.filledPolygon(x,y);

        draw.setPenColor(Color.BLUE);

        for (int i = 0; i < 800; i+=5) {
            draw.line(i,0,i,800);
            draw.line(0,i,800,i);
        }

        draw.show();

        draw.setFontSize(30);


        for (int i = 0; i < 1; i++) {
            draw.clear();
            draw.text(400,400, "" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }

        draw.circle(350, 400, 100);
        draw.circle(450, 400, 100);

        double[] x2 = {250, 400, 550};
        double[] y2 = {400, 400, 400};
        draw.filledPolygon(x2,y2);
        draw.show();

    }
}
