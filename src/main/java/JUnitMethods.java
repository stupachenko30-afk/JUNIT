import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitMethods {



    @Test
    public void concatStringArray(){
        String[] ar = {"hello", "", "money", "happy", " ", null};
        String res = MethodsForTest.concatStringArray(ar,0,2);
        assertEquals("hellomoney",res);

        res = MethodsForTest.concatStringArray(ar,0,0);
        assertEquals("hellohello",res);

        res = MethodsForTest.concatStringArray(ar,1,2);
        assertEquals("money",res);

        res = MethodsForTest.concatStringArray(ar,3,4);
        assertEquals("happy ",res);





        res = MethodsForTest.concatStringArray(null,1,6);
        assertNull(res);


        String[]ar1={};
        res = MethodsForTest.concatStringArray(ar1,1, 2);
        assertNull(res);
        String[]ar2= {"\0", "hello", "life"};
        res = MethodsForTest.concatStringArray(ar2,1, 2);
        assertEquals("hellolife", res);
        res = MethodsForTest.concatStringArray(ar,-1, 2);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar,1, 5);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar,1, -2);
        assertNull(res);




    }

        @Test
        public void sumElementsArray() {
        //           0  1  2   3    4  5
        int[] ar = {-1, 9, 0, 24, -56, 0, Integer.MAX_VALUE };
//positive
Integer res = MethodsForTest.sumElementsArray(ar,0,4);
assertTrue(-57 == res);

            res = MethodsForTest.sumElementsArray(ar,0,3);
            assertTrue(23 == res);
            res = MethodsForTest.sumElementsArray(ar,1,3);
            assertTrue(33 == res);
            res = MethodsForTest.sumElementsArray(ar,2,5);
            assertTrue(0 == res);
            res = MethodsForTest.sumElementsArray(ar,3,1);
            assertTrue(33 == res);
            res = MethodsForTest.sumElementsArray(ar,1,1);
            assertTrue(18 == res);
            res = MethodsForTest.sumElementsArray(ar,4,4);
            assertTrue(-112 == res);
            res = MethodsForTest.sumElementsArray(ar,2,3);
            assertTrue(24 == res);
            res = MethodsForTest.sumElementsArray(ar,4,5);
            assertTrue(-56 == res);


            //negative
            res = MethodsForTest.sumElementsArray(null,4,5);
            assertNull(res);
            int[] ar1 = {};
            res = MethodsForTest.sumElementsArray(ar1,4,5);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,0,9);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,-1,5);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,4,-1);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,0,9);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,9,5);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,ar.length,9);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,4,ar.length);
            assertNull(res);
            res = MethodsForTest.sumElementsArray(ar,6,1);
            assertNull(res);

    }
/*
1.
puplic static String concatWithSym(String s1,String s2, char sym)
s1-> "hello"
s2-> "money"
sym '#'
concat and return "hello#money"
in case any problem return null

2.
 public static String concatStrs (String[] ar1, String [] ar2,
                    0     1     2        3              int index1,int index2)
         ar1->["hello"]["bye"]["money"]["happy"]
         index1 = 2
                0      1       2
         ar2->["yes"]["no"]["maybe"]
         index2 = 1

        concat and return "moneyno"
        in case any problem return null



Write JUnit test TDD




 */
}
