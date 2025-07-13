package DSA.Basic;

public class Patterns12 {
    public static void main(String[] args) {
        int n = 5;
        int spaces=2*(n-1);

        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
}
