public class dualnopy {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //left spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("_");
            }
            //left numbers
            for(int j=i;j>=2;j--){
                System.out.print(j);
            }
            //right numbers
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //
    }
    
}
