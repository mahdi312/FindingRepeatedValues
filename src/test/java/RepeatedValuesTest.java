import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsCollectionWithSize;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
class RepeatedValuesTest {
    @Test
    void findRepeatedStrings(){
        List<String> stringList = new ArrayList<>
                (Arrays.asList("ali", "mahdi", "hadi", "mahdi", "mojtaba", "mohammad", "mojtaba"));

        RepeatedValues<String> repeatedValues = new RepeatedValues<>();
        Set<String> values = repeatedValues.findRepeatedValues(stringList);

        MatcherAssert.assertThat(values, IsIterableContainingInOrder.contains("mahdi", "mojtaba"));
        MatcherAssert.assertThat(values, IsCollectionWithSize.hasSize(2));
    }

    @Test
    void findRepeatedNumbers(){
        List<Integer> numbers = new ArrayList<>
                (Arrays.asList(5,20,48,6,2,7,9,3,2,6,8,5,12,8));

        RepeatedValues<Integer> repeatedValues = new RepeatedValues<>();
        Set<Integer> values = repeatedValues.findRepeatedValues(numbers);

        MatcherAssert.assertThat(values , IsCollectionContaining.hasItems(2,5,6,8));
        MatcherAssert.assertThat(values, IsCollectionWithSize.hasSize(4));
    }

}