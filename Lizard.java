public class Lizard extends Reptile implements Carnivore, Herbivore
{
    public Lizard(){}
    public void eatMeat(){System.out.println("munch munch insects munch munch");}
    public void eatPlant(){System.out.println("munch munch lettuce munch munch");}
    public void eat(){eatMeat();eatPlant();}
    public void move(){System.out.println("crawl using their four limbs and tail");}
}
