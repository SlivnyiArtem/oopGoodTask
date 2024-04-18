package ru.oop.task2;

/**
 * Транспорт
 */

public interface Transport extends Positioned {
    /**
     * движение в выбранную точку
     * @param destination - точка назначения
     * @param passenger - перевозимый пассажир
     */
    void drivePassengerToPoint(Position destination, Person passenger);
}
