package Oops3Day17;

public abstract class Animal {
	public void sleep() {
		System.out.println("Sleeping");
		
	}
	public void roam() {
		System.out.println("Roaming");
	}
	abstract public void sound();
	abstract public void eat();

}
