public class Pattern{

    static void rectangle(int n, int m){
        for(int i = 1; i <=  m; i++){
            for(int j = 1; j <= n ; j++){
                if(i == 1 || i == m || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");


            }// inner for loop rectangle
            System.out.println();
            
        }// outter for loop rectangle
    }// end of rectangle

    
    public static void main(String[] args){


        // printing the F looking thing
        for(int i = 1; i<= 5;i++){
            for(int j = 5; j >= i;j--){
                System.out.print("* ");

            }// inner for
            System.out.println("");
        }// outer for

        // using rectangle method
        int n = 5;
        int m = 5;
        rectangle(n,m);

        // Hourglass
        int y = 5;
        int x = n*2-1;
        for(int i = 0; i < y; i++){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }// inner for loop hourglass
            for(int k = 0; k < x; k++){
                System.out.print("*");
            }
            x -= 2;
            System.out.println();
        }// outter for loop hourglass

        x = 2;
        for(int i = 1; i < y; i++){
            for(int j = i; j < y-1; j++){
                System.out.print("*");
            }
            for(int k = 0; k < x; k++){
                System.out.print("*");
            }
            x += 2;
            System.out.println();
        }




    }// end main
}// end class