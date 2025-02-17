package JUnit.testing.calculator.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestingListTest {

    private List<Integer>list;
    @BeforeEach
    void setup(){
        list=new ArrayList<>();
    }
    @Test
    void testaddElement(){
        ListManager.addElement(list,2);
        assertTrue(list.contains(2));

    }
    @Test
    void testremoveElement(){
        ListManager.removeElement(list,2);
        assertFalse(list.contains(2));
    }
    @Test
    void testSizeOfList() {
        ListManager.addElement(list, 2);
        ListManager.addElement(list, 4);
        ListManager.addElement(list, 6);

        assertEquals(3, ListManager.sizeofList(list));
    }


}