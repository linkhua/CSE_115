
public class PS7Class{

    // This problem set will be much different than in that you will be populating this class (PS7Class) with
    // variables and methods instead of filling in predefined static methods.

    // All defined methods should be public

    // Note: Many of the questions in this problem set are correlated and you can lose points on a question if
    //       some of the previous questions haven't been completed.



    // Q1: Create private instance variables all of type int and name them x, y, and z
	private int x;
	private int y;
	private int z;

    // Q2: Write a default constructor that initializes x, y, and z all to 1
	public PS7Class() {
		x = 1;
		y = 1;
		z = 1;
	}

    // Q3: Write a constructor that take 3 ints as input and assigns these ints to x, y, and z in that order
	public PS7Class(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

    // Q4: Write getter methods for each instance variable named getX, getY, and getZ that take no parameters and return
    //     ints
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
    // Q5: Write setter methods for each instance variable names setX, setY, and setZ that take 1 int as a parameter
    //     and returns void
	public void setX(int a) {
		x = a;
	}
	public void setY(int a) {
		y = a;
	}
	public void setZ(int a) {
		z = a;
	}
    // Q6: Write a method named add that takes no parameters and returns the sum of x, y, and z as an int
	public int add() {
		return x + y + z;
	}
    // Q7: Write a method named multiply that takes no parameters and returns the multiplication of x, y, and z as an int
	public int multiply() {
		return x * y * z;
	}
    // Q8: Write a method named magnitude that takes no parameters and returns a double representing the magnitude of
    //     PS7Class if x, y, and z are interpreted as a 3d vector. The magnitude of a vector is the square root of the
    //     sum of the squares of x, y, and z (ie. the distance from (0, 0, 0)).
	public double magnitude() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}
    // Q9: Write a method named distance that takes an instance of the PS7Class as a parameter and returns a double
    //     representing the distance between this instance and the given instance if x, y, and z are interpreted as a
    //     3d vector. The distance is the square root of the sum of the squares of the differences in x, y, and z.

	public double distance(PS7Class p) {
		return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2) + Math.pow(z - p.getZ(), 2));
	}
    // Q10: Override the toString method to print the values of x, y, and z in the format (x, y, z)
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
    /*** Static methods (Some questions above must be working to get these points) ***/
    public static PS7Class Q11(int x, int y, int z){
        // return a new instance of your PS7Class with the provided x, y, and z values
        return new PS7Class(x, y, z);
    }
    public static int Q12(PS7Class input){
        // given an instance of your PS7Class, return its y value
        return input.getY();
    }
    public static double Q13(PS7Class input){
        // given an instance of your PS7Class, return its magnitude
    	return input.magnitude();
    }
    public static void Q14(PS7Class input, int x, int y, int z){
        // set the values of x, y, and z of the input object to the provided values of x, y, and z
    	input.setX(x);
    	input.setY(y);
    	input.setZ(z);
    }
    public static double Q15(PS7Class input1, PS7Class input2){
        // return the distance between the two inputs
        return input1.distance(input2);
    }
    public static void main(String[] args){

    }

}
