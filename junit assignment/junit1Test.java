package armnum;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    class junit1Test
    {
        junit1 m1;
        @BeforeEach
        void init()
        {
            m1 = new junit1();
        }
        @Test
        void findMinMax()
        {

            int[] sample={31,7,1,8};
            int[] expected={1,31};
            int[] actual=m1.findMinMax(sample);
            assertArrayEquals(expected,actual);
        }
        @Test
        void findMax()
        {
            int[] sample={31,7,1,8};
            int expected=31;
            int actual=m1.maximum(sample);
            assertEquals(expected,actual);
        }
        @Test
        void findMin()
        {
            int[] sample={31,7,1,8};
            int expected=1;
            int actual=m1.minimum(sample);
            assertEquals(expected,actual);
        }



    }



