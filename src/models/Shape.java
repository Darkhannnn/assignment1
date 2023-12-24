package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    // container of Points (e.g. ArrayList<Point>)
    public Shape() {
        this.points = new ArrayList<>();
    }

    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        points.add(point);
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;
        int numOfPoints = points.size();

        for (int i = 0; i < numOfPoints; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numOfPoints);
            perimeter += currentPoint.distance(nextPoint);
        }
        return perimeter;
    }

    // getAverageSide()
    public double getAverageSide() {
        return calculatePerimeter()/points.size();
    }

    // getLongestSide()
//    public double getLongest() {
//        return 0;
//    }
}
