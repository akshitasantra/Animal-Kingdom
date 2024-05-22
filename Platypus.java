public class Platypus extends Mammal implements Carnivore
{
    public Platypus(){}
    public void eatMeat(){System.out.println("munch munch insects munch munch");}
    public void eat(){eatMeat();}
    public void move(){System.out.println("swim");}
}
