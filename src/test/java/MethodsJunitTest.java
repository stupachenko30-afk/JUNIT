import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MethodsJunitTest {

    public static String insertFrom(String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index,ins);
        return sb.toString();
    }

    public static boolean isPalindrome(String s){
        if(s == null || s.isBlank()){
            return false;
        }


        s = s.replace(" ","");
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

        res = MethodsJunitTest.isPalindrome("Name now one man");
        assertTrue(res);

        res = MethodsJunitTest.isPalindrome("\"!Name now one man!\"");
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
        assertTrue(res);







    }
    @Test
      void testInsertFrom(){
       // fail(" Not yet implemented");

    }}
