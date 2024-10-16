package Singleton.SingleTonClonable;

public class Singleton extends SuperClass{
    public static Singleton instance = new Singleton();

    private Singleton()
    {
        // private constructor
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return instance;
    }
}
