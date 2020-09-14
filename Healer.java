package decoratordesignpattern;
public class Healer extends Player {
	/*
	 * sets base stats of healer
	 */
public String healer(String name)
{
	intellect = 8;
	attack = 2;
	defense = 3;
	weapon = "Staf";
	armor = "Rober";
	return name;
}
/*
 * returns healer and name with string
 */
public String toString()
{
	return "Healer:" + name + "Carries a weapon and wears armor";
	
}
}
