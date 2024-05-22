public class BlackSlug extends Slug implements Herbivore, Carnivore
{
    public BlackSlug(){}
    public void eatMeat(){System.out.println("munch munch fungi munch munch");}
    public void eatPlant(){System.out.println("munch munch leaves munch munch");}
    public void eat(){eatMeat();eatPlant();}
}
