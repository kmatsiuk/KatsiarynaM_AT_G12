package homework.day10.people.testng;

import homework.day10.people.AutomatedEngineer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAutomatedEngineerT {

    @Test
    public void testConstructor() {
        AutomatedEngineer eng = new AutomatedEngineer(35, 4);

        assertEquals(eng.getAge(), 35);
        assertEquals(eng.getExperience(), 4);
        assertEquals(eng.getSkill(), 12);
    }

    @Test
    public void testGetSet() {
        AutomatedEngineer eng = new AutomatedEngineer(35, 4);

        eng.setSkill(2);
        eng.setExperience(2);
        eng.setAge(20);

        assertEquals(eng.getSkill(), 2);
        assertEquals(eng.getExperience(), 2);
        assertEquals(eng.getAge(), 20);
    }
}
