public class Opposum extends Mammal implements Herbivore, Carnivore
{
    public Opposum(){}

    public void eatMeat(){System.out.println("munch munch dead animals munch munch");}

    public void eatPlant() {System.out.println("munch munch potatoes munch munch");}

    public void eat(){eatMeat(); eatPlant();}

    public void move(){System.out.println("slow moving");}
}
