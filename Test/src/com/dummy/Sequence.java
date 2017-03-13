package com.dummy;

public class Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CountSequences("abcabc"));
		
		System.out.println( "abc".startsWith("a"));
	}

	public static int CountSequences(String input)
    {
        char[] chars = input.toCharArray();
        int count = 0;
       count= CountSequences(chars, 0, 'a',  count);
        return count;
    }
    //abcabc
    private static int CountSequences(char[] chars, int startIndex, char lookupChar,  int count)
    {
        if (lookupChar > 'c') return 0;
        for (int currentIndex = startIndex; currentIndex < chars.length; currentIndex++)
        {
            if (chars[currentIndex] == lookupChar) //found a match
            {
                if (lookupChar == 'c')
                {
                    count++;
                }
                else
                {
                    CountSequences(chars, currentIndex + 1, (char)(lookupChar + 1),  count);
                }
                CountSequences(chars, currentIndex + 1, lookupChar,  count);
            }
        }
        return count;
    }
}
