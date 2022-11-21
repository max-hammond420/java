import static org.junit.Assert.*;
import org.junit.Test;

public class PetJunitTest{
    @Test
    public void testConstructor(){
        Pet rex = new Pet("Rex", 4, 2, "dog", true);
        assertEquals("Rex", rex.getName());
        assertEquals("dog", rex.getSpecies());
        assertEquals(4, rex.getAge());
        assertTrue(rex.isHouseTrained());
    }

    @Test
    public void testNicknames(){
        Pet rex = new Pet("Rex", 4, 2, "dog", true);
        assertFalse(rex.hasNickname("Rex"));
        rex.addNickname("T-Rex");
        assertTrue(rex.hasNickname("T-Rex"));
        rex.addNickname("Rext");
        assertTrue(rex.hasNickname("Rext"));
        rex.addNickname("Rext");
        assertTrue(rex.hasNickname("Rext"));
    }

    //TODO: write the rest of the test cases according to PetTest.java
}

