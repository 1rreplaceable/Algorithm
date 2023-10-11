import java.util.Scanner;

public class baek11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int[][] arr = new int [n][2];

       for(int i = 0; i < n; i++){
           arr[i][0] = sc.nextInt();
           arr[i][1] = sc.nextInt();
       }

        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                int temp = 0;
                int temp2 = 0;
                if(arr[i][0] < arr[j][0]){
                    temp = arr[i][0];
                    temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp;
                    arr[j][1] = temp2;
                }
                else if(arr[i][0] == arr[j][0] && arr[i][1] < arr[j][1]){
                        temp = arr[i][0];
                        temp2 = arr[i][1];
                        arr[i][0] = arr[j][0];
                        arr[i][1] = arr[j][1];
                        arr[j][0] = temp;
                        arr[j][1] = temp2;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }



    }
}
