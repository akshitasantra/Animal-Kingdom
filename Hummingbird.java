public class Hummingbird extends Bird implements Herbivore, Carnivore
{
    public Hummingbird(){}
    public void eatMeat(){System.out.println("munch munch small insects munch munch");}
    public void eatPlant(){System.out.println("munch munch bee balms munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void sleep(){System.out.println("torpor");}
}
