package RecursionInjava;

public class TowerOfHanoi {
    public static void disk(String src,String help, String Dest,int n){
        if(n==1){
           System.out.println("Transferring disk "+ n +"from" + src + "to"+ Dest);
           return;
        }
          disk(src, Dest, help, n-1);
          System.out.println("Transferring disk "+ n +"from" + src + "to" + Dest);
          disk(help,src, Dest, n-1);

    }
    public static void main(String[] args) {
        int n =3;
        disk("S", "H", "D", n);
    }
} 
