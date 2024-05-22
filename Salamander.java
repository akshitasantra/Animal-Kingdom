public class Salamander extends Amphibian implements Carnivore
{
    public Salamander(){}
    public void eatMeat(){System.out.println("munch munch maggots munch munch");}
    public void eat(){eatMeat();}
}
