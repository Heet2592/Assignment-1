public class Launch4 {
    public static void main(String[] arg){
        int n=21;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j>=(n-1)/2 || i+j>=(n-1)+((n-1)/2) || (j==0 && j>=(n-1)/2) || (j==n-1 && j<=(n-1)/2)){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
