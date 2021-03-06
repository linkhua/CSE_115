import java.util.ArrayList;
import java.util.Comparator;

public class PS12_OOP{

    /***
     * Note: We are abusing inner classes in this assignment by defining multiple classes inside the
     * OOPLecture1 class. In most cases it is better practice to define each class in a separate file
     ***/


    // Q1: Create an abstract class named Appliance with 2 protected instance variables, an int named "price" and
    //     a boolean named "on"
    // Q2: Add the following 4 methods to the Appliance class
    //     -A constructor that takes one int and sets the value of the int to price variable and sets "on" to false
    //     -A getter method for the variable "on" named "isOn()"
    //     -An abstract method "turnOn()" with return type void
    //     -An abstract method "turnOff()" with return type void

    public abstract class Appliance implements Comparable<Appliance>{
    	protected int price;
    	protected boolean on;
    	
    	public Appliance(int i) {
    		price = i;
    		on = false;
    	}
    	public boolean isOn() {
    		return on;
    	}
    	public abstract void turnOn();
    	public abstract void turnOff();
    	
    	public int compareTo(Appliance a) {
    		if(this.price > a.price)
    			return 1;
    		else if (this.price < a.price)
    			return -1;
    		else
				return 0;
    	}
    }


    // Q3: Create a concrete class named Fireplace that extends Appliance with the following method implementations
    //     -turnOn() sets the value of "on" to true
    //     -turnOff() sets the value of "on" to false

    public class Fireplace extends Appliance{

        public Fireplace(int price){
        	super(price);
        }
        public void turnOn() {
        	on = true;
        }
        public void turnOff() {
        	on = false;
        }
        @Override
        public String toString(){
        	if(on)
        		return "this fireplace is on";
        	return "this fireplace is off";
        }

    }


    // Q4: Create a concrete class named Television that extends Appliance with the following method implementations
    //     -turnOn() doesn't have to have any functionality (we'll complete this method later)
    //     -turnOff() sets the value of "on" to false

    public class Television extends Appliance implements Electronic{
    	private boolean pluggedIn;
    	
        public Television(int price){
        	super(price);
        }
        public void turnOn(){
        	if(pluggedIn)
        		on = true;
        }
        public void turnOff(){
        	on = false;
        }
        @Override
        public void activate(){
        	pluggedIn = true;
        }
        @Override
        public String toString(){
        	if(on)
        		return "this television is on";
        	return "this television is off";
        }
    }


    // Q5: Create an interface named Electronic with a single method named "activate" that takes no parameters and
    //     has return type void

    public interface Electronic{
    	public void activate();
    }


    // Q6 & Q7: Add functionality to the Camera class by adding:
    //     -A private instance variable named "picturesTaken" as an int
    //     -A constructor that takes no parameters and sets picturesTaken to 0;
    //     -Override the activate method to increment pictureTaken by 1

    public class Camera implements Electronic{
    	private int picturesTaken;
    	
    	public Camera(){
    		picturesTaken = 0;
    	}
    	@Override
    	public void activate(){
    		picturesTaken += 1;
    	}
    	@Override
    	public String toString(){
    		return "This camera took " + picturesTaken + " pictures";
    	}
    }


    // Q8: Have the Television class implement the Electronic interface and add functionality:
    //     -Add an instance variable to Television named "pluggedIn" as a boolean
    //     -Override the activate method to set pluggedIn to true
    //     -Implement the turnOn() method to set "on" to true only if "pluggedIn" is true
    // Q9: Override the Fireplace toString method to return
    //     -"this fireplace is on" if on is true
    //     -"this fireplace is off" if on is false
    // Q10: Override the Television toString method to return
    //     -"this television is on" if on is true
    //     -"this television is off" if on is false
    // Q11: Override the Camera toString method to return "This camera took 0 pictures" where 0 is replaced with the
    //      value of picturesTaken
    // Q12: Have the Appliance class implement the interface Comparable<Appliance> and override compareTo such that
    //      Appliances will be sorted by price in increasing order

    // Q13: write a static method named getAppliances with no parameters that returns an ArrayList<Appliance>
    //      containing a Fireplace with a price of 1000, a Television with a price of 500, and a Television with
    //      a price of 2000 in that order
    public static ArrayList<Appliance> getAppliances(){
        PS12_OOP ps = new PS12_OOP();
    	ArrayList<Appliance> appliances = new ArrayList<Appliance>();
        appliances.add(ps.new Fireplace(1000));
        appliances.add(ps.new Television(500));
        appliances.add(ps.new Television(2000));
        return appliances;
    }


    // Q14: write a static method named sortAppliances that takes an ArrayList<Appliance> and sorts the
    //      appliances by price
    public static void sortAppliances(ArrayList<Appliance> appliances){
    	appliances.sort(Comparator.naturalOrder());
    }


    // Q15: write a static method named activateElectronics that takes an ArrayList<Electronic> and activates
    //      each electronic. The method returns void
    public static void activateElectronics(ArrayList<Electronic> electronics){
    	for(Electronic e : electronics)
    		e.activate();
    }




    public static void main(String[] args){

    }

}
