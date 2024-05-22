public class Lobster extends Crustacean implements Herbivore, Carnivore
{
    public Lobster(){}
    public void eatMeat(){System.out.println("munch munch fish munch munch");}
    public void eatPlant(){System.out.println("munch munch zooplankton munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void reproduce(){System.out.println("laying lobster eggs");}
}
