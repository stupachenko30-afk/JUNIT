import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitMethods {



    @Test
    public void concatStringArray(){
        String[] ar = {"hello", "bye", "money", "happy", "life"};
        String res = MethodsForTest.concatStringArray(ar,0,2);
        assertEquals("hellomaney",res);


    }

        @Test
        public void sumElementsArray() {





    }

}
