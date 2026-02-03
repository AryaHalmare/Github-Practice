package GithubPractice;  

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class addTest {


    @Test
    public void testAdd() {
        

        int result = Add.add(10, 20);
        int result2 = Add.add(20, 20);
        assertEquals(30, result);
        assertEquals(40, result2);
    }



    
}
