package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3}, {4,5,6}, {7,8,9}};

        //3*3
        //Rows -> 3
        //Columns -> 3

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                //System.out.println("*);
            }
            System.out.println();
        }

    }
}

//Output -
// 123
//456
//789
