import java.util.Arrays;

public class Runner
{
    public static void main(String[] args) {
        /*
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"},
                                    {"Brian", "Elenor", "Harry", "Lenny"},
                                    {"Cathy", "Fred", "Jill", "Matt"}};
        for (String[] rows : seatingChart)
        {
            System.out.println(Arrays.toString(rows));
        }
        System.out.println();
        seatingChart[1][2] = "Paul";
        for (String[] rows : seatingChart) {
            System.out.println(Arrays.toString(rows));
        }
        System.out.println();
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        for (String[] rows : seatingChart)
        {
            System.out.println(Arrays.toString(rows));
        }
        System.out.println();
        String[] temp1 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp1;
        for (String[] rows : seatingChart)
        {
            System.out.println(Arrays.toString(rows));
        }
        */
        /*
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        for (int[] rows : arr1)
        {
            System.out.println(Arrays.toString(rows));
        }
        for(int[] rows : arr2)
        {
            System.out.println(Arrays.toString(rows));
        }
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        System.out.println();
        for (int[] rows : arr1)
        {
            System.out.println(Arrays.toString(rows));
        }
        for(int[] rows : arr2)
        {
            System.out.println(Arrays.toString(rows));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
        */
        /*
        int[][] arr1 ={{5, 2},
                {1, 3},
                {7, 9}};
        int[][] arr2 ={{1, 2, 3},
                {6, 5, 4}};
        int[][] arr3 ={{1, 2, 3, 4},
                {7, 8, 9, 10}};
        int[][] arr4 ={{4, 5, 2},
                {1, 9, 7},
                {8, 10, 13}};
        int[][] arr5 ={{4, 5, 2, 4, 1},
                {1, 9, 7, 8, 2},
                {8, 10, 13, 4, 3}};
        int[][] arr6 ={{4, 5, 2, 4, 8, 9, 10},
                {1, 9, 7, 8, 6, 1, 2}};
        int[][] arr7 ={{4},
                {7},
                {8},
                {2}};
        int[][] arr8 ={{4}};
        int[][] arr9 = {{}};

        System.out.println(FunWith2DArrays.totalElements(arr1));
        System.out.println(FunWith2DArrays.totalElements(arr2));
        System.out.println(FunWith2DArrays.totalElements(arr3));
        System.out.println(FunWith2DArrays.totalElements(arr4));
        System.out.println(FunWith2DArrays.totalElements(arr5));
        System.out.println(FunWith2DArrays.totalElements(arr6));
        System.out.println(FunWith2DArrays.totalElements(arr7));
        System.out.println(FunWith2DArrays.totalElements(arr8));
        System.out.println(FunWith2DArrays.totalElements(arr9));
        */
        /*
        String[][] arr1 = {{"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}};
        String[][] arr2 = {{"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}};
        String[][] arr3 = {{"phone", "mouse", "keyboard"}};
        String[][] arr4 = {{"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}};
        String[][] arr5 = {{"time"}};

        FunWith2DArrays.fourCorners(arr1);
        FunWith2DArrays.fourCorners(arr2);
        FunWith2DArrays.fourCorners(arr3);
        FunWith2DArrays.fourCorners(arr4);
        FunWith2DArrays.fourCorners(arr5);
        */

        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));

    }
}
