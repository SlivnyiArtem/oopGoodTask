package ru.oop.task3;

/**
 * Транспорт
 */

public interface Transport extends Positioned {
    /**
     * движение в выбранную точку, перевозка пассажира(обновление его координаты)
     * при невохможности добраться в выбранную точку,
     * высадка пассажира на минимально возможном расстоянии
     *
     * @param destination местоназначения
     * @param passenger пассажир
     */
    void moveTo(Position destination, Person passenger);
}
