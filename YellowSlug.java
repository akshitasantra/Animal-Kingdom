public class YellowSlug extends Slug implements Herbivore, Carnivore
{
    public YellowSlug(){}
    public void eatMeat(){System.out.println("munch munch fungi munch munch");}
    public void eatPlant(){System.out.println("munch munch plants munch munch");}
    public void eat(){eatMeat(); eatPlant();}
}
