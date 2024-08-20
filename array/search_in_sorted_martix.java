package array;
public class search_in_sorted_martix {

    /**
     * @param matrix
     * @param key
     * @return
     */
    public static boolean stairCaseSearch(int matrix[][],int key){

        // method-1 left and bottom

        // int row=0, col=matrix[0].length-1;
        // while(row< matrix.length && col>=0){
        //     if(key==matrix[row][col])
        //     {
        //         System.out.println("(" + row+","+col+")");
        //         return true;
        //     }
        //     else if(key<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }

        // method-2 top and right

        int col=0, row=matrix[0].length-1;
        while(col<matrix.length && row>=0){
            if(key==matrix[row][col]){
                System.out.println("("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }

        System.out.println("Not found ");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key=33;
        stairCaseSearch(matrix,key);
    }
}
