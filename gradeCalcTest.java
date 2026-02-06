package GithubPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class gradeCalcTest {

    gradeCalc grCalculation;

    @BeforeEach
    void setUp() {
        grCalculation = new gradeCalc();
    }

    @Test
    @DisplayName("Tests for if else if")
    void testforO() {
        assertEquals("O", grCalculation.grade(99));
        System.out.println("Grade O...");
        assertNotEquals("A", grCalculation.grade(99));
        System.out.println("Grade O not A");
    }

    @Test
    void testforAA() {
        assertEquals("A+", grCalculation.grade(85));
        System.out.println("Grade A+");
    }

    @Test
    void testforA() {
        assertEquals("A", grCalculation.grade(79));
        System.out.println("Grade A");
    }

    @Test
    void testforB() {
        assertEquals("B", grCalculation.grade(69));
        System.out.println("Grade B");
    }

    @Test
    void testforC() {
        assertEquals("C", grCalculation.grade(58));
        System.out.println("Grade C");
    }

    @Test
    void testforD() {
        assertEquals("D", grCalculation.grade(45));
        System.out.println("Grade D");
    }

    @Test
    void testforBorderCase() {
        assertEquals("F", grCalculation.grade(39));
        System.out.println("Grade F Border Case");
    }

    @Test
    void testforF() {
        assertEquals("F", grCalculation.grade(10));
        System.out.println("Grade F");
    }

    @Test
    void testforZero() {
        assertEquals("F", grCalculation.grade(0));
        System.out.println("Grade F for Zero ...");
    }

    @Test
    void testforNegNum() {
        assertThrows(IllegalArgumentException.class, () -> {
            grCalculation.grade(-1);
        });
        System.out.println("Test for negative number");
    }
}
