public class Goldfish extends Fish implements Carnivore, Herbivore
{
    public Goldfish(){}
    public void eatMeat(){System.out.println("munch munch insects munch munch");}
    public void eatPlant(){System.out.println("munch munch duckweed munch munch");}
    public void eat(){eatMeat(); eatPlant();}
}
