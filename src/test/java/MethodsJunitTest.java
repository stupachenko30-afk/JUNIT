import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MethodsJunitTest {

    public static String insertFrom(String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index,ins);
        return sb.toString();
    }

    public static boolean isPalindrome(String s){


        s = s.replace(" ","");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return s.equalsIgnoreCase(rev);
    }
    @Test
          void testIsPalindrome(){
        fail(" Not yet implemented");

//        assertFalse(isPalindrome(" hello"));
//        assertTrue(isPalindrome( "level"));


    }
    @Test
      void testInsertFrom(){
        fail(" Not yet implemented");

    }}
