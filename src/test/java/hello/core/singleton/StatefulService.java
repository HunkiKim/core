package hello.core.singleton;

public class StatefulService 
{
    

    
    public int order(String name, int price)
    {
        System.out.println("name + \"price\" + price = " + name + "price" + price);
        return price;
    }
//    public int getPrice()
//    {
//        return price;
//    }
}