public class Owl extends Bird implements Carnivore
{
    public Owl(){}

    public void eatMeat(){System.out.println("munch munch small rodents munch munch");}

    public void eat(){eatMeat();}

    public void sleep(){System.out.println("sleep");}
}
