import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class RepeatedValuesTest {

    @Test
    public void findRepeatedStrings(){
        List<String> stringList = new ArrayList<String>(Arrays.asList("ali","mahdi","hadi","mahdi","mojtaba","mohammad","mojtaba"));
        RepeatedValues repeatedValues = new RepeatedValues();
        Set values = repeatedValues.findRepeatedValues(stringList);
        for (Object i :
                values) {
            System.out.println(i);
        }
    }

    @Test
    public void findRepeatedDecimals(){
        List<Integer> doubleslist = new ArrayList<Integer>(Arrays.asList(10, 4, 8, 1, 12, 5, 5, 8, 7, 5, 6, 9, 3, 12, 8, 87, 8));
        RepeatedValues repeatedValues = new RepeatedValues();
        Set values = repeatedValues.findRepeatedValues(doubleslist);
        for (Object i :
                values) {
            System.out.println(i);
        }
    }

}