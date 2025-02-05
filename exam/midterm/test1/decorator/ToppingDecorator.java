package exam.midterm.test1.decorator;

public abstract class ToppingDecorator extends Bread {
	Bread bread;
	
	
	public ToppingDecorator(Bread bread) {
		this.bread = bread;
	}

	public abstract String getDescription();

	public Bread getBread() {
		return this.bread;
	}
}
