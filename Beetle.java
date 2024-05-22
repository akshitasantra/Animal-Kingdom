public class Beetle extends Insect implements Herbivore, Carnivore
{
    public Beetle(){}
    public void eatMeat(){System.out.println("munch munch dead organic matter munch munch");}
    public void eatPlant(){System.out.println("munch munch leaves munch munch");}
    public void eat(){eatMeat(); eatPlant();}
    public void sleep(){System.out.println("sleep");}
    public void move(){System.out.println("fly in a slow clumsy manner");}
    public void reproduce(){System.out.println("sexually, where the offspring are created by the joining of sperm from the father and eggs from the mother");}
}
