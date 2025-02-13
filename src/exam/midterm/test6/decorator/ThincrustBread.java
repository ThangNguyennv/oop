package exam.midterm.test6.decorator;

public class ThincrustBread extends Bread {
  
	public ThincrustBread() {
		description = "Thin crust bread, with tomato sauce";
	}
  
	public double cost() {
		return 20.0;
	}
}

