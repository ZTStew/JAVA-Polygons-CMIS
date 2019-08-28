/*
 * Program takes an polygon and returns the Apothem and Area of the polygon
 * program will also identify the polygon (up to 10 sides) by name.
 * Program can also compare the values 2 polygons and return if the contained 
 * attributes are equal or not.
 *
 * @author Stewart
 * @version JAVA 8, 7/31/2019
 */

public class PolygonsTest {
    public static void main(String[] args) {
        Polygons poly1 = new Polygons(4, 2);
        Polygons poly2 = new Polygons(10, 1.5);
        Polygons poly3 = new Polygons(3, 3.0);
        System.out.println(poly1.toString());
        System.out.println(poly2.toString());
        System.out.println(poly3.toString());

        Polygons polyE = new Polygons(10, 1.5);

        System.out.println(polyE.equals(poly2));
    }
}
