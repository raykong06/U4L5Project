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

        int searchLength = lowercaseSearch.length();
        int i = 0;
        while (i < lowercaseOrig.length() - searchLength + 1)
        {
            String test = lowercaseOrig.substring(i, i + searchLength);
            if (test.equals(lowercaseSearch))
            {
                count++;
            }
            i++;
        }
        return count;
    }

    /* Returns a String with all instances of "searchString" removed from "origString";
     matches SHOULD be case sensitive (i.e no need to convert to lowercase) */
    public String removeString(String searchString, String origString)
    {
        while (origString.indexOf(searchString) != -1)
        {
            int index = origString.indexOf(searchString);
            origString = origString.substring(0, index) + origString.substring(index + searchString.length(), origString.length());
        }
        return origString;
    }

    /* Returns a String with all instances of "searchChar" in "origString" replaced with
     "replaceChar"; matches SHOULD be case sensitive. */
    public String replaceCharacter(String searchChar, String origStr, String replaceChar)
    {
        while (origStr.indexOf(searchChar) != -1)
        {
            int index = origStr.indexOf(searchChar);
            origStr = origStr.substring(0, index) + replaceChar + origStr.substring(index + searchChar.length(), origStr.length());
        }
        return origStr;
    }
}
