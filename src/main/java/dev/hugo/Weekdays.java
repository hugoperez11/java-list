package dev.hugo;

import java.util.LinkedList;
import java.util.List;

public class Weekdays {
    private List<String> weekDays;

    public Weekdays() {
        weekDays = new LinkedList<>();
    }

    // Método para crear la lista de los días de la semana
    public void createWeekDaysList() {
        weekDays.clear();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
    }

    // Método que retorna los días de la semana
    public List<String> getWeekDays() {
        return new LinkedList<>(weekDays);
    }

    // Método que retorna el largo de la lista
    public int getListSize() {
        return weekDays.size();
    }

    // Método para eliminar un día de la semana
    public void removeDay(String day) {
        weekDays.remove(day);
    }

    // Método que retorna el día de la semana solicitado
    public String getDay(int index) {
        if (index >= 0 && index < weekDays.size()) {
            return weekDays.get(index);
        }
        return null;
    }

    // Método que retorna si el día solicitado existe en la lista
    public boolean isDayExists(String day) {
        return weekDays.contains(day);
    }

    // Método para ordenar la lista de días por orden alfabético
    public void sortWeekDays() {
        // Ordenamos usando un método de ordenamiento simple sin Collections.sort
        for (int i = 0; i < weekDays.size(); i++) {
            for (int j = i + 1; j < weekDays.size(); j++) {
                if (weekDays.get(i).compareTo(weekDays.get(j)) > 0) {
                    String temp = weekDays.get(i);
                    weekDays.set(i, weekDays.get(j));
                    weekDays.set(j, temp);
                }
            }
        }
    }

    // Método para vaciar la lista
    public void clearWeekDaysList() {
        weekDays.clear();
    }
}
