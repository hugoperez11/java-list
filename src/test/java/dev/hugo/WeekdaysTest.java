package dev.hugo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WeekdaysTest {
    private Weekdays weekDays;

    @BeforeEach
    public void setUp() {
        weekDays = new Weekdays();
        weekDays.createWeekDaysList();
    }

    @Test
    public void testCreateWeekDaysList() {
        List<String> days = weekDays.getWeekDays();
        assertEquals(7, days.size());
        assertEquals("Monday", days.get(0));
    }

    @Test
    public void testGetWeekDays() {
        List<String> days = weekDays.getWeekDays();
        assertEquals(7, days.size());
    }

    @Test
    public void testGetListSize() {
        assertEquals(7, weekDays.getListSize());
    }

    @Test
    public void testRemoveDay() {
        weekDays.removeDay("Wednesday");
        assertEquals(6, weekDays.getListSize());
        assertFalse(weekDays.isDayExists("Wednesday"));
    }

    @Test
    public void testGetDay() {
        assertEquals("Tuesday", weekDays.getDay(1));
        assertNull(weekDays.getDay(10)); // Índice fuera de rango
    }

    @Test
    public void testIsDayExists() {
        assertTrue(weekDays.isDayExists("Friday"));
        assertFalse(weekDays.isDayExists("Funday"));
    }

    @Test
    public void testSortWeekDays() {
        weekDays.sortWeekDays();
        List<String> sortedDays = weekDays.getWeekDays();
        assertEquals("Friday", sortedDays.get(0));
        assertEquals("Wednesday", sortedDays.get(6));
    }

    @Test
    public void testClearWeekDaysList() {
        weekDays.clearWeekDaysList();
        assertEquals(0, weekDays.getListSize());
    }
}
