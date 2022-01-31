package hello.core.singleton;

public class SingletonService
{
    private static final SingletonService instance = new SingletonService();
    //자기 자식을 static을

    private SingletonService()
    {

    }
    public static  SingletonService getInstance()
    {
        return instance;
    }
    public void logic()
    {

    }

}
