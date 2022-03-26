//super class 
class Animal {
	
	private int numTeeth = 0;
	private boolean spots = false;
	private int weight = 0;
	//animal method
	//number of teeth, spots? and weight set tp private
	//the 3 peremeteres have their getters and setters called
	public Animal(int numTeeth, boolean spots, int weight){
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
	}

	public int getNumTeeth(){
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}

	public boolean getSpots() {
		return spots;
	}

	public void setSpots(boolean spots) {
		this.spots = spots;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
//main method to run all the subclass methods created below
	public static void main(String[] args) {
		Lion lion = new Lion(30, false, 80);
		System.out.println(lion);

		Cheetah cheetah = new Cheetah(30, true, 45);
		System.out.println(cheetah);
	}
//An extension of the animal superclass that is specific to a lion. with if statements
//to determine if the lion (weight) is a cub, female or male
public class Lion extends Animal {

	String cub;
	String male;
	String female;

	public Lion ( int numTeeth, boolean spots, int weight) {
	super (numTeeth, spots, weight);

}
	public String type(int weight) {
		super.weight(weight);

		if (weight < 80) {
			type = "Cub";
		}
		if (weight < 120 && weight > 80) {
			type = "Female";
		}
		if (weight > 120 ) {
			type = "Male";
		}
		return type;
	}
// a toString method to return a String of th whole compilation with descriptions
	public String toString() {
		String description = "it has: " + getnumTeeth() + " number of teeth";
		description += "\n The lion has: " + getSpots() + " spots";
		description += "\n The weight of the lion is: " + getWeight();
		description += "\n The Lion, is it a male, female or a cub: " + type(getWeight());
			return description;
	}
}

//subclass cheetah that extends the animal class. Parameter are the weight, spots and the number of teeth that
//with a toString that describes the Cheetah.
public class Cheetah extends Animal{

	public Cheetah(int numTeeth, boolean spots, int weight){
		super(numTeeth, spots, weight);

	}
	public String toString(){
		String output = "it has: " + getnumTeeth() + "number of teeth";
		output += "\n The Cheetah has " + getSpots() + "number of spots";
		output += "\nThe weight of the Cheetah is: " + getWeight();
			return output;

	}

}
}







