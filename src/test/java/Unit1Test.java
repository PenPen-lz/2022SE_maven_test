import static org.junit.Assert.*;

public class Unit1Test {

    @org.junit.Test
    public void isPassed() {
        Unit1 u1 = new Unit1(50);
        Unit1 u2 = new Unit1(-50);
        assertEquals("no way", u2.isPassed());
        assertEquals("not passed", u1.isPassed());
        u1.setGrade(100);
        assertEquals("passed", u1.isPassed());
        u1.setGrade(150);
        //if there were an error
        assertEquals("passed",u1.isPassed());
        System.out.println(u1.gradeAdd());
    }

    @org.junit.Test
    public void gradeAdd() {
        Unit1 u = new Unit1(-50);
        assertEquals(0, u.gradeAdd());
    }
}