package Zoho.Round2;

import java.awt.Point;

public class DistanceCalculator {
    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(4, 10);

        double distance = calculateDistance(point1, point2);
        long roundedDistance = Math.round(distance);

        System.out.println("Output: " + roundedDistance);
    }

    public static double calculateDistance(Point point1, Point point2) {
        int x1 = point1.x;
        int y1 = point1.y;
        int x2 = point2.x;
        int y2 = point2.y;

        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}