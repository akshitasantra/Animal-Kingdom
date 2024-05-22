public class Columbidae extends Bird implements Herbivore
{
    public Columbidae(){}
    public void eatPlant(){System.out.println("munch munch seeds munch munch");}
    public void eat(){eatPlant();}
    public void sleep(){System.out.println("sleeping on elevated perches");}
}
