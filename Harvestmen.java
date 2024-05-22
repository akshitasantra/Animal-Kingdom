public class Harvestmen extends Arachnid implements Carnivore
{
    public Harvestmen(){}
    public void eatMeat(){System.out.println("munch munch live invertebrate prey munch munch");}
    public void eat(){eatMeat();}
    public void sleep(){System.out.println("zzz");}
    public void rest(){System.out.println("not sleeping ig");}
}
