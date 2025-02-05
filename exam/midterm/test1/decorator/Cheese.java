package exam.midterm.test1.decorator;

public class Cheese extends ToppingDecorator {
	public Cheese(Bread bread) {
		super(bread);
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Cheese";
	}
 
	public double cost() {
		return bread.cost() + 1.0;
	}
}
