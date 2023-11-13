
package week5day1;


public class Demo {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
        Singleton test=Singleton.getInstance();
        test.hello();
        }
    }
    
}
