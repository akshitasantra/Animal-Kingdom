public class Decapod extends Crustacean implements Herbivore, Carnivore
{
    public Decapod(){}
    public void eatMeat(){System.out.println("munch munch fish munch munch");}
    public void eatPlant(){System.out.println("munch munch algae munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void reproduce(){System.out.println("fertilized eggs are carried cemented to the abdominal appendages until they are hatched");}
}
