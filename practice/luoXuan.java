package practice;

import java.util.Scanner;

public class luoXuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        n=scanner.nextInt();
        scanner.close();
        int count=0;
        int number = 1;
        int hang = 0;
        int lie = 0;
        int[][] arr3 = new int[n][n];
        for(int j = 0; j < 4 && count<2*n-1; j++,count++){
            if(j == 0){
                for(int k = 0; k < n; k++){
                    if(arr3[hang][k] == 0){
                        arr3[hang][k] = number;
                        number++;
                        lie = k;

                    }
                }
            }
            if(j == 1){
                for(int k = 0; k < n; k++){
                    if(arr3[k][lie] == 0){
                        arr3[k][lie] = number;
                        number++;
                        hang=k;
                    }
                }
            }
            if(j == 2){
                for(int k = 0; k < n; k++){
                    if(arr3[hang][n-1-k] == 0){
                        arr3[hang][n-1-k] = number;
                        number++;
                        lie=n-k-1;
                    }
                }
            }
            if(j == 3){
                j=-1;
                for(int k = 0; k < n; k++){
                    if(arr3[n-1-k][lie] == 0){
                        arr3[n-1-k][lie] = number;
                        number++;
                        hang=n-k-1;
                        
                    }
                }
            }

        }
        for(int m = 0; m < n; m++){
            for(int s = 0; s < n; s++){
                System.out.printf("%-9d",arr3[m][s]);
            }
            System.out.println();
            
        }

    }
        
    
}
