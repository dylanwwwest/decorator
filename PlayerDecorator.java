package decoratordesignpattern;

public abstract class PlayerDecorator extends Player {
	/*
	 * returns name
	 */
	public String toString()
	{
		return name;
	}
	/*
	 * upgrades power
	 */
	public double getPower()
	{
		return attack * 3 + defense + intellect / 2;
	}

}
