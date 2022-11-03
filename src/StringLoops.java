public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!
      */
    public int countCharacters(String character, String searchString)
    {
        int count = 0;
        for (int i = 0; i < searchString.length(); i++)
        {
            String test = searchString.substring(i, i + 1);
            if (test.equals(character))
            {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed
    */
    public String reverseString(String origString)
    {
        String reverse = "";
        for (int i = origString.length() - 1; i >= 0; i--)
        {
            String add = origString.substring(i, i + 1);
            reverse = reverse + add;
        }
        return reverse;
    }

    // Returns original string reversed, but in the loop I count up instead
    public String reverseString2(String origString)
    {
        String reverse = "";
        for (int i = 0; i < origString.length(); i++)
        {
            String add = origString.substring(i, i + 1);
            reverse = add + reverse;
        }
        return reverse;
    }

    /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
    matches should NOT be case-sensitive.
    */
    public int countVowels(String origString)
    {
        int count = 0;
        for (int i = 0; i < origString.length(); i++)
        {
            String test = origString.substring(i, i + 1);
            if (test.equals("A")||test.equals("E")||test.equals("I")||test.equals("O")||test.equals("U")||
                    test.equals("a")||test.equals("e")||test.equals("i")||test.equals("o")||test.equals("u"))
            {
                count++;
            }
        }
        return count;
    }
    /* Returns the number of times "searchString" appears in "origString";
     matches should NOT be case sensitive.
    */
    public int countString(String searchString, String origString)
    {
        int count = 0;
        String lowercaseOrig = origString.toLowerCase();
        String lowercaseSearch = searchString.toLowerCase();
        int i = 0;
        int indexOf = 0;
        while (indexOf != -1)
        {
            String test = lowercaseOrig.substring(i);
            indexOf = test.indexOf(lowercaseSearch);
            if (indexOf != -1)
            {
                count++;
            }
            i = indexOf + 1;
        }
        return count;
    }
}
