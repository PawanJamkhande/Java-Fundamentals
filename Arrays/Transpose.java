public class Transpose {

    public static void main(String[] args){
    //    int[][] arr = new int[5][6];
    
       //set 
    //    arr[0][1] = 10;
    //    arr[1][0] = 20;
    //    arr[2][2] = 30;
    //    arr[3][4] = 40;
    //    arr[4][3] = 50;
    //    //get
    //    System.out.println(arr[0][1]);
    //    System.out.println(arr[1][0]);
    //    System.out.println(arr[2][2]);
    //    System.out.println(arr[3][4]);
    //    System.out.println(arr[4][3]);
    //    System.out.println(arr[0][0]);
    int[][] arr = {{1, 2, 3,10},
     {4, 5, 6,11}, 
     {7, 8, 9,12},
    {13,14,15,16}};
     transpose(arr);
     reverse(arr);
    }

        public static void transpose(int[][] arr) {
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j<i;j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void reverse(int[][] arr){
            
            for(int i = 0; i < arr.length; i++) {
                int len = (arr[i].length)-1;
                for(int j = 0; j < arr[i].length/2; j++) {

                    int temp = arr[i][j];
                    arr[i][j]= arr[i][len-j];
                    arr[i][len-j]= temp;

                }
            }

            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
