public class CountMovieSpaces
{
    public static void main(String[] args)
    {
        String MovieQuote = "Why so Serious?";
        int numSpaces = 0;
        int stringLength = MovieQuote.length();

        for(int i = 0; i < stringLength; i++)
        {
            char ch = MovieQuote.charAt(i);
            if(ch == ' ')
                numSpaces++;
        }
        System.out.println("The number of spaces in this string are " + numSpaces);
    }
}