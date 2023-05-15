import java.util.*;

public class Ac2darrays {
    // spiral matrix
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        int matrix[][] = new int[1][5];
//        for(int i=0;i<matrix.length;i++)
//        {
//            for(int j=0;j<matrix[0].length;j++)
//            {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<matrix.length;i++)
//        {
//            for(int j=0;j<matrix[0].length;j++)
//            {
//                System.out.print(matrix[i][j] +"   ");
//            }
//            System.out.println();
//        }

//        int startRow = 0;
//        int startCol = 0;
//        int endRow = matrix.length -1;
//        int endCol = matrix[0].length -1;
//
//        while(startRow <= endRow && startCol <= endCol) // if we use startRow < endRow && startCol < endCol then it will leave last box for odd x odd.
//        {
//            //Top
//            for(int j=startCol;j<=endCol;j++)
//            {
//                System.out.print(matrix[startRow][j]+" ");
//            }
//            //Right
//            for(int j=startRow+1;j<=endRow;j++)
//            {
//                System.out.print(matrix[j][endCol]+" ");
//            }
//            //Bottom
//            for(int j=endCol-1;j>=startCol;j--)
//            {
//                if(startRow == endRow) //to avoid repeatition of same row.
//                    break;
//                System.out.print(matrix[endRow][j]+" ");
//            }
//            //Left
//            for(int j=endRow-1;j>=startRow+1;j--)
//            {
//                if(startCol == endCol) //to avoid repeatition of same col.
//                    break;
//                System.out.print(matrix[j][startCol]+" ");
//            }
//            startCol++;
//            startRow++;
//            endCol--;
//            endRow--;
//        }
//
//    }

        //Diagonal Sum
//        public static void main(String[] args){
//            int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//            int sum=0;
//            Method 1
//            for(int i=0;i< matrix.length;i++)
//            {
//                for(int j=0;j< matrix.length;j++)
//                {
//                    if(i==j)
//                     sum+= matrix[i][j];
//                    else if(i+j == matrix.length-1)
//                        sum+= matrix[i][j];
//                }
//            }

//            Method 2
//            for(int i=0;i< matrix.length;i++)
//            {
//                sum+=matrix[i][i];
//                if(i != matrix.length-i-1)
//                    sum+=matrix[i][matrix.length-i-1];
//            }
//            System.out.println(sum);
//        }




//    StareCase Search
//         public static void main(String[] args){
//             int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//             int key = 33;
//             int row = 0;
//             int col = matrix[0].length-1;
//             boolean ans = false;
//             while(row< matrix.length && col>=0){
//                 if(matrix[row][col] == key){
//                     ans = true;
//                     System.out.println("key is found at ("+row+","+col+")");
//                     break;
//                 }
//                 if(key < matrix[row][col])
//                     col--;
//                 else if(key > matrix[row][col])
//                     row++;
//             }
//             if(!ans)
//                 System.out.println("key not found");
//         }
}
