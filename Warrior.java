package decoratordesignpattern;
public class Warrior extends Player {
	/*
	 * sets base stats for warrior
	 */
	public String Warrior(String name)
	{
		intellect = 2;
		attack = 8;
		defense = 5;
		weapon = "Sword";
		armor = "Breast Plate";
		return name;
		
	}
	/*
	 * returns the string
	 */
	public String toString()
	{
		return "Warrior:" + name + "Carries a weapon, and wears armor";	
	}

}
