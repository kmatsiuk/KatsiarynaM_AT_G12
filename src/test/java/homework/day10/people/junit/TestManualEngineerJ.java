package homework.day10.people.junit;

import homework.day10.people.ManualEngineer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManualEngineerJ {

    @Test
    public void testConstructor() {
        ManualEngineer manu = new ManualEngineer(35, 4);

        assertEquals(35, manu.getAge());
        assertEquals(4, manu.getExperience());
        assertEquals(8, manu.getSkill());
    }

    @Test
    public void testGetSet() {
        ManualEngineer manu = new ManualEngineer(35, 4);

        manu.setAge(20);
        manu.setExperience(2);
        manu.setSkill(2);

        assertEquals(20, manu.getAge());
        assertEquals(2, manu.getExperience());
        assertEquals(2, manu.getSkill());
    }



}
