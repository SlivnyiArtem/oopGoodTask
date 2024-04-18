package ru.oop.task1;

public interface Car {

    /**
     * движение машины в заданную точку по дорогам
     *
     * @param destination место назначения
     */
    void driveToPoint(Position destination);

    /**
     * перемещение к владельцу
     *
     * @param owner владелец
     */

    void driveToOwner(Person owner);

    /**
     * получить позицию машины
     */
    Position getCarPosition();
}
