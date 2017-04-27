package teamWork;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-04-27.
 */
public class ChangeTest {
    @Test
    public void getChangeNominals_simple() throws Exception {
        //given
        int ammount = 11;
        int[] expectedNominals = new int[]{10, 1};

        //when
        List<Integer> changeNominals = Change.getChangeNominals(ammount); //dla statycznej
        //List<Integer> changeNominals = new Change().getChangedNominals(amount) //dla nie statycznej
        //then

        assertEquals(changeNominals.size(), 2);
        assertTrue(changeNominals.contains(10));
        assertTrue(changeNominals.contains(1));
    }

    public void checkReturnedNominals(int[] expected, List<Integer> returned) {
        assertEquals(expected.length, returned.size());

        for (int expectedNominal : expected) {
            assertTrue(returned.contains(expectedNominal));
        }

    }


}