import edu.princeton.cs.algs4.StdDraw;

public class MouseFollower {
    public static void main(String[] args)
    {
        StdDraw.enableDoubleBuffering();
        while(true)
        {
            if(StdDraw.isMousePressed())
            {
                StdDraw.setPenColor(StdDraw.CYAN);
            }
            else
            {
                StdDraw.setPenColor(StdDraw.BLUE);
            }
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            StdDraw.filledCircle(x, y, 0.05);
            
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}