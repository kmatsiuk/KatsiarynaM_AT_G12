package homework.day10.people.testng;

import homework.day10.people.ManualEngineer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestManualEngineerT {

    @Test
    public void testConstructor() {
        ManualEngineer manu = new ManualEngineer(35, 4);

        assertEquals(manu.getAge(), 35);
        assertEquals(manu.getExperience(), 4);
        assertEquals(manu.getSkill(), 8);
    }

    @Test
    public void testGetSet() {
        ManualEngineer manu = new ManualEngineer(35, 4);

        manu.setAge(20);
        manu.setExperience(2);
        manu.setSkill(2);

        assertEquals(manu.getAge(), 20);
        assertEquals(manu.getExperience(), 2);
        assertEquals(manu.getSkill(), 2);
    }
}
