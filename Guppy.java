public class Guppy extends Fish implements Herbivore, Carnivore
{
    public Guppy(){}
    public void eatPlant(){System.out.println("munch munch Java Moss munch munch");}
    public void eatMeat(){System.out.println("munch munch insects munch munch");}
    public void eat(){eatMeat();eatPlant();}
}
