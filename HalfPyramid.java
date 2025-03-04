public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4;
       // int m = 5;
        for(int i = 1; i<= n; i++ ){
            for(int j =i; j<=n; j++){
                if(i ==j){
                    System.out.print("*");   
                }
              //  System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
