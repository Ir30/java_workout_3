package sports;

abstract class OutdoorGame
{
    abstract void play();
}

class Football extends OutdoorGame
{
    void play()
    {
        System.out.println("playing football");
    }
}

class Cricket extends OutdoorGame
{
    void play()
    {
        System.out.println("playing cricket");
    }
}



public class DriverClass1 {

    public static void main(String args[])
    {
        System.out.println("Package Sports");

        Football f1=new Football();
        f1.play();

        Cricket c1=new Cricket();
        c1.play();
    }
}
