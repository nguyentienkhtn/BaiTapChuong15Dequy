import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Chuong15Test {

    @Test
    void maxElement() {
        ArrayList<Integer> testData = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++)
            testData.add(random.nextInt(100));
        int expected = Collections.max(testData);
        int[] input = new int[10];
        for(int i = 0; i < 10; i++)
            input[i] = testData.get(i);
        int actual = Chuong15.maxElement(input);
        assertEquals(expected, actual);

    }
    @Test
    void count()
    {
        String input = "Gradle Daemon";
        char c1 = 'a';
        char c2 = 'A';
        assertEquals(Chuong15.count(input, c1), 2);
        assertEquals(Chuong15.count(input, c2), 0);

    }

    @Test
    void pow()
    {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int expected = (int) Math.pow(x, y);
        assertEquals(expected, Chuong15.pow(x, y));

    }


}