public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {16, 21, 89, 64, 81, 3, 11, 16, 9, 2, 18, 81};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}