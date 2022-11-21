import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

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
        Point[] currentPoint = new Point[2];
        double minDistance = (Math.abs(points.get(0).x()+points.get(1).y()) + Math.abs(points.get(0).y()+points.get(1).y()));

        for (int i = 0; i < points.size(); i++) {
            for (int j = 0; j < points.size(); j++) {
                if (i != j) {
                    currentPoint[0] = points.get(i);
                    currentPoint[1] = points.get(j);
                    // get x distance
                    double xDistance = Math.abs(points.get(i).x()-points.get(j).x());
                    
                    // get y distance
                    double yDistance = Math.abs(points.get(i).y()-points.get(j).y());

                    // calculate relative distance
                    double totalDistance = xDistance + yDistance;

                    // check if distance is greater than greatestDistance
                    // if so, make new points[i] and points[j] the pair;
                    if (totalDistance < minDistance) {
                        pair = currentPoint; 
                    }

                    // else, move on
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

class Point {

    private double x;
    private double y;

    public Point(double x, double y) { this.x = x; this.y = y; }

    public double x() { return x; }

    public double y() { return y; }

    public String toString() { return "(" + x + "," + y + ")"; }

}
