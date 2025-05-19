package homework.day10.people.junit;

import homework.day10.people.AutomatedEngineer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAutomatedEngineerJ {

    @Test
    public void testConstructor() {
        AutomatedEngineer eng = new AutomatedEngineer(35, 4);

        assertEquals(35, eng.getAge());
        assertEquals(4, eng.getExperience());
        assertEquals(12, eng.getSkill());
    }

    @Test
    public void testGetSet() {
        AutomatedEngineer eng = new AutomatedEngineer(35, 4);

        eng.setAge(20);
        eng.setExperience(2);
        eng.setSkill(2);

        assertEquals(20, eng.getAge());
        assertEquals(2, eng.getExperience());
        assertEquals(2, eng.getSkill());
    }
}
