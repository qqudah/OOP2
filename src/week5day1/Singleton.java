
package week5day1;


public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("new obj has been created");
        
    }
    public static Singleton getInstance(){
    if(instance==null){
    instance = new Singleton();
    }
    return instance;
    }
    public void hello(){
        System.out.println("hello");
    }
}
