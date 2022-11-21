import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Point {
    private double x;
    private double y; 
    public Point(double x, double y) { this.x = x; this.y = y; } 
    
    public double x() { return x; }
    public double y() { return y; }
    public String toString() { return "(" + x + "," + y + ")"; }
}

public class ClosestPair {

    public static List<? extends Point> generatePoints(int n) {
        List<Point> points = new ArrayList<Point>();
        Random r = new Random();
        for(int i = 0; i < n; i++) {
            points.add(new Point(r.nextDouble(), r.nextDouble()));  
        }
        return points;
    }

    public static Point[] closestPair(List<? extends Point> points) {
        Point[] pair = new Point[2];
        double min = 0.0;
        if(points.size() >= 2) {
            //Initialise min to first pair
            min = Math.sqrt( Math.pow(points.get(0).x() - points.get(1).x(), 2) + Math.pow(points.get(0).y() - points.get(1).y(), 2));
            pair[0] = points.get(0);
            pair[1] = points.get(1);
        }
        
        //Find closest pair, ignoring same point
        for(int i = 0; i < points.size(); i++) {
            for(int j = 0; j < points.size(); j++) {
                if(i != j) {
                    double dist = Math.sqrt( Math.pow(points.get(i).x() - points.get(j).x(), 2) + Math.pow(points.get(i).y() - points.get(j).y(), 2));
                    if( dist < min ) {
                        min = dist;
                        pair[0] = points.get(i);
                        pair[1] = points.get(j);
                    }
                }
            }
        }
        return pair;
    }
    
    public static void main(String[] args) {
        Point[] pair = closestPair(generatePoints(30));
        for(Point p : pair) {
            System.out.println(p);
        }
    }
}
