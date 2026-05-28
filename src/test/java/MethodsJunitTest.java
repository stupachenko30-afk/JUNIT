import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MethodsJunitTest {

    public static String insertFrom(String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index,ins);
        return sb.toString();
    }

    public static boolean isPalindrome(String s){
        if(s == null || s.isBlank() || s.isEmpty()){
            return false;
        }


        s = s.replace(" ","");
        s = s.replace("!", "");
        s = s.replace("?", "");
        s = s.replace(".", "");
        if(s.length() == 1)
            return false;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return s.equalsIgnoreCase(rev);
    }
    @Test
          void testIsPalindrome(){
       boolean res = MethodsJunitTest.isPalindrome("level");
       assertTrue(res);
       //positive test -> true
        res = MethodsJunitTest.isPalindrome(" level  ");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("LeVel");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("5level5");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("242");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("Name now one man.?");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("\"!Name now one man!\"");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("#$#");
        assertTrue(res);


        //negative test -> false
        res = MethodsJunitTest.isPalindrome(null);
        assertFalse(res);

        res = MethodsJunitTest.isPalindrome("");
        assertFalse(res);

        res = MethodsJunitTest.isPalindrome("  ");
        assertFalse(res);

        res = MethodsJunitTest.isPalindrome("Hello");
        assertFalse(res);

        res = MethodsJunitTest.isPalindrome("123");
        assertFalse(res);

        res = MethodsJunitTest.isPalindrome("_");
        assertFalse(res);







    }
    @Test
      void testInsertFrom(){
       String res = MethodsJunitTest.insertFrom("Hello", 5 , " world");
        assertEquals("Hello world", res);

        res = MethodsJunitTest.insertFrom("world", 0 , " Hello ");
        assertEquals("Hello world", res);
    }

}
/*
HW8
1. class MethodsForTest
public static int parseAndSum (String s1, String s2){
return 0;
}
s1-> "12"     s2->"3"
Integer.parseInt(s1)
12+3 = 15
return 15

in case any error if s1 or s2 null or "" or " " or abc -> return 0
Create tests





 */