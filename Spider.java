public class Spider extends Arachnid implements Herbivore, Carnivore
{
    public Spider(){}
    public void eatMeat(){System.out.println("munch munch insects munch munch");}
    public void eatPlant(){System.out.println("munch munch honeydew munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void sleep(){System.out.println("zzz");}
    public void rest(){System.out.println("lower their metabolic rate to conserve energy");}
}
