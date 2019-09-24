package sk.itsovy.onofrej.other;

public class FreeClass {
    public  void sayHello(){
        System.out.println("Hello");
    }

    public void sayNHello(int n){
        int i;
        for( i=1; i<=n; i++)
        {
            System.out.print("Hello ");
        }
        System.out.println();
    }
}
