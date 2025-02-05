package exam.midterm.test1.decorator;

public class Olives extends ToppingDecorator {
	public Olives(Bread bread) {
		super(bread);
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Olives";
	}
 
	public double cost() {
		return bread.cost() + 2.0;
	}
}
