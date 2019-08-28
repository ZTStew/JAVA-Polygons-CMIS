import java.lang.Math;

public class Polygons {
    private int numSides = 3;
    private double sideLength = 1;

    public Polygons() { }

    public Polygons(int numSides, double sideLength){
        setSideLength(sideLength);
        setNumSides(numSides);
    }

    public double getApothem(){
        /*
         * Formula: a = s/2tan(pi/n)
         * Where:
         * s = length
         * n = num of sides
         */
        return getSideLength() / (2 * Math.tan(Math.PI/this.numSides));
    }

    public double getArea(){
        /*
         * Formula: a = (1/2)AP
         * Where:
         * A = Apothem
         * P = perimeter
         */
        return (1d/2) * getApothem() * (getNumSides() * getSideLength());
    }

    public String toString(){
        /* Array of shape names based on the number of sides */
        String[] shapes = {"triangle", "square", "pentagon", "hexagon", "heptagon", "octagon", "nonagon", "decagon"};
        /*
         * creates a String named, 'shape' and is assigned the matching string found
         * in 'shapes' based on 'numSides'. The value is subtracted by 3 to allow
         * for the '0' index and side lengths 1 and 2 which are not valid shapes
         */
        String shape = shapes[this.getNumSides() - 3];

        String str = String.format("My %s specs are: [sideLength = %,.2f, numSides = %d]\n", shape, this.getSideLength(), this.getNumSides());
        str += String.format("The Area of this %s is: %,.2f\n", shape, this.getArea());
        str += String.format("Its Apothem is: %,.2f\n", this.getApothem());
        return str;
    }

    public boolean equals(Polygons polyIn){
        return this.getSideLength() == polyIn.getSideLength() && this.getNumSides() == polyIn.getNumSides();
    }


    /* Getters and Setters */
    public double getSideLength(){
        return this.sideLength;
    }
    public void setSideLength(double sideLength){
        /*
         * Ensures sideLength is at least the minimum value. If it is not, this.sideLength
         * will not be assigned the new value
         */
        if(sideLength > 0){
            this.sideLength = sideLength;
        }
    }

    public int getNumSides(){
        return this.numSides;
    }
    public void setNumSides(int numSides){
        /*
         * Ensures numSides is at least 3. If it is not, the value will remain unchanged.
         */
        if(numSides > 2){
            this.numSides = numSides;
        }
    }
}
