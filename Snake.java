public class Snake extends Reptile implements Carnivore
{
    public Snake(){}
    public void eatMeat(){System.out.println("munch munch birds munch munch");}
    public void eat(){eatMeat();}
    public void move(){System.out.println("glides");}
}
