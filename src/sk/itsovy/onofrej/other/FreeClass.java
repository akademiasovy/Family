package sk.itsovy.onofrej.other;

import java.util.Random;

public class FreeClass {
    public  void sayHello(){
        System.out.println("Hello");
    }

    public void sayNHello(int n){
        int i;
        for( i=1; i<=n; i++)  // cyklus ...opakovanie
        {
            System.out.print("Hello ");
        }
        System.out.println();  // odriadkovanie
    }

    public  void sayHi(){
        System.out.println("Hi");
    }

    public void sayNHi(int n){
        int i=1;
        while(  i<=n)  // cyklus ...opakovanie
        {
            System.out.print("Hi ");
            i++;
        }
        System.out.println();  // odriadkovanie
    }

    public int getÉvenNumber(int number){
        /*if(number%2==0)
            return number;
        else
            return number+1;*/
        return number%2==0?number:number+1;

    }

    public String generatePassword(int n){
        if(n<6 || n>30)  // kontrola dlzky hesla
            n = 10;
        String passwd="";
        int count=0;
        int digits=0;
        int upper=0;
        int lower=0;
        int num=0;
        Random rnd=new Random();
        do{
            int type=rnd.nextInt(3);
            switch(type){
                case 0: num=rnd.nextInt(10)+'0'; digits++; break;
                case 1: num=rnd.nextInt(26)+'A'; upper++; break;
                case 2: num=rnd.nextInt(26)+'a'; lower++; break;
            }
            char c=(char)num;
            passwd+=c;
            count++;
            if(count==n && (digits==0 || upper==0 || lower==0)){
                count=digits=upper=lower=0;
                passwd="";
            }

        } while(count<n);

        return passwd;
    }

}
