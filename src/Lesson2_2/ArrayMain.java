package Lesson2_2;

public class ArrayMain
{

    public static void main(String[] args)
    {

        String[][] strArr;

        strArr = new String[][]
        {
            { "1", "2", "3" },
            { "4", "5", "6"},
            { "7", "Hey", "8"}
        };

        int[][] intArr = new int[3][3];

        for (int i = 0; i < strArr.length; i++)
        {

        for (int j = 0; j < strArr.length; j++)
        {
            try
            {
                intArr[i][j] = Integer.parseInt(strArr[i][j]);
            }   catch (Exception e)
            {
                try {
                    throw new MyExc("Найден символ" + " " + strArr[i][j] + "!" + " По координате " + "Х:" + i + " "  + "Y:" + (j));
                } catch (MyExc myExc) {
                    myExc.printStackTrace();
                }
            }
            System.out.print(intArr[i][j] + " ");
        }
            System.out.println();
        }
    }
}
