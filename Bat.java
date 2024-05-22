public class Bat extends Mammal implements Carnivore, Herbivore
{
    public Bat(){}
    public void eatMeat(){System.out.println("munch munch frogs munch munch");}
    public void eatPlant(){System.out.println("munch munch calabash munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void move(){System.out.println("fly by “rowing” through the air");}
}
