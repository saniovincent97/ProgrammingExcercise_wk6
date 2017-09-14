import java.util.Scanner;

public class CountMovieSpaces2
{
    public static void main(String[] args)
    {
        String MovieQuote;
        int numSpaces = 0;
        int stringLength;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a movie quote:");
        MovieQuote = in.nextLine();
        stringLength = MovieQuote.length();
        for(int i = 0; i < stringLength; i++)
        {
            char ch = MovieQuote.charAt(i);
            if(ch == ' ')
                numSpaces++;
        }
        System.out.println("The number of spaces in this string are " + numSpaces);
    }
}