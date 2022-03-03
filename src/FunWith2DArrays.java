public class FunWith2DArrays {

    public static int totalElements(int[][] nums)
    {
        int total = 0;
        for (int[] row: nums)
        {
            total += row.length;
        }
        return total;
    }

    public static void fourCorners(String[][] str)
    {
        System.out.println(str[0][0]);
        System.out.println(str[0][str[0].length - 1]);
        System.out.println(str[str.length - 1][0]);
        System.out.println(str[str.length - 1][str[0].length - 1]);
    }

    public static double average(int[][] number)
    {
        double average = 0.0;
        double numOfNums = (double)number.length * number[0].length;
        for (int[] row : number)
        {
            for (int col : row)
            {
                average += col;
            }
        }
        average /= numOfNums;
        return average;
    }

    public static int[] indexFound(String[][] words, String target)
    {
        for (int row = 0; row < words.length; row++)
        {
            for (int col = 0; col < words[0].length; col++)
            {
                if (words[row][col].equals(target))
                {
                    int[] answer = {row, col};
                    return answer;
                }
            }
        }
        int[] noAnswer = {-1, -1};
        return noAnswer;
    }
}
