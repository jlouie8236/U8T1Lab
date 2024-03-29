public class NewRunner {
    public static void main(String[] args)
    {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        for (int i = 0; i < testArr1.length; i++)
        {
            for (int k = 0; k < testArr1[0].length; k++)
            {
                System.out.println(testArr1[i][k]);
            }
        }

        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        for (int[] rows : testArr1)
        {
            for (int col : rows)
            {
                System.out.println(col);
            }
        }

        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        for (int i = 0; i < testArr1[0].length; i++)
        {
            for (int k = 0; k < testArr1.length; k++)
            {
                System.out.println(testArr1[k][i]);
            }
        }



        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

        for (String[] row : testArr2)
        {
            for (String col : row)
            {
                System.out.println(col);
            }
        }

        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        for (int i = 0; i < testArr2.length; i++)
        {
            for (int col = 0; col < testArr2[0].length; col++){
                System.out.println(testArr2[i][col]);
            }
        }


    }
}
