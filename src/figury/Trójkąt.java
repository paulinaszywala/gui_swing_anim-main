package figury;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.Polygon;

public class Trójkąt extends Figura {
    public Trójkąt(Graphics2D buffer, int delay, int width, int height) {
        super(buffer,delay,width,height);
        shape = new Polygon(new int[] {10,20,30}, new int[] {100,20,100}, 3);
        area = new Area(shape);
        aft = new AffineTransform();
    }
}
