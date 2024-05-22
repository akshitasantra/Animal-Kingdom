public class GardenSnail extends Snail implements Herbivore
{
    public GardenSnail(){}
    public void eatPlant(){System.out.println("munch munch leaves munch munch");}
    public void eat(){eatPlant();}
}
