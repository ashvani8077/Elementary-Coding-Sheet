public class EvenCount {
    public static void main(String[] args) {
        int n1=3;
        int ans=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
