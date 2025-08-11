public class IsPrime {
    public static void main(String[] args) {
        int n=5;
        int f=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                f=0;
                break;
            }
        }
        if(f==0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
