public class Frog extends Amphibian implements Carnivore
{
    public Frog(){}
    public void eatMeat(){System.out.println("munch munch crickets munch munch");}
    public void eat(){eatMeat();}
}
