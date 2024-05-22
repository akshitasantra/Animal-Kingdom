public class Fly extends Insect implements Herbivore, Carnivore
{
    public Fly(){}
    public void eatMeat(){System.out.println("I eat dead things");}
    public void eatPlant(){System.out.println("munch munch fruit munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void sleep(){System.out.println("upside down zzz");}
    public void move(){System.out.println("hover");}
    public void reproduce(){System.out.println("The female lays her eggs in manure or other decaying, moist, organic matter.");}
}
