import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsForTest {
    //TDD -> test driven development
    public static String concatStringArray(
            String[] strArray,
            int indexFirst,
            int indexSecond){
        //Проверка всего массива на null
//        for(String s: strArray){
//            if (s == null){
//                return null;
//            }
    //    }

        if(strArray == null || strArray.length==0
                || indexFirst<0 || indexSecond<0
                || indexFirst >= strArray.length
                || indexSecond >= strArray.length
                || strArray[indexFirst] == null
                || strArray[indexSecond] == null
        )
        return null;
        return strArray[indexFirst]+strArray[indexSecond];
    }

   /*
                   0       1       2        3        4
    strArray-> ["Hello"]["bye"]["Money"]["happy"][" life"]
    indexFirst = 1   indexSecond = 3
    return "byehappy"
*/






    public static Integer sumElementsArray(
    int[] array,
      int indexFirst,
        int indexSecond) {


        if (array == null || array.length == 0
                || indexFirst < 0 || indexSecond < 0
                || indexFirst >= array.length
                || indexSecond >= array.length)

            return null;

        if (array[indexFirst] == Integer.MAX_VALUE && array[indexSecond] > 0)
            return null;
        if (array[indexSecond] == Integer.MAX_VALUE && array[indexFirst] > 0)
            return null;
        if (array[indexFirst] == Integer.MIN_VALUE && array[indexSecond] < 0)
            return null;
        if (array[indexSecond] == Integer.MIN_VALUE && array[indexFirst] < 0)
            return null;
        return array[indexFirst] +array[indexSecond];
    }

}




/*
           0  1  2  4  4  5       indexFirst = 2   indexSecond = 4
array ->  [9][2][7][1][4][8]
summ 7+4=11



 */

