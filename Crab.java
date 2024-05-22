public class Crab extends Crustacean implements Herbivore, Carnivore
{
    public Crab(){}
    public void eatMeat(){System.out.println("munch munch fish munch munch");}
    public void eatPlant(){System.out.println("munch munch algae munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void reproduce(){System.out.println("sperm flows over them and they become fertilised");}
}
