public class Turtle extends Reptile implements Carnivore, Herbivore
{
    public Turtle(){}
    public void eatMeat(){System.out.println("munch munch cooked ground beef munch munch");}
    public void eatPlant(){System.out.println("munch munch azolla munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void move(){System.out.println("slowly ig");}
}
