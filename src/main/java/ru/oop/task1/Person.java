package ru.oop.task1;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person extends GarageOwner {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    void updatePositionData(Position currentPosition);

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);
}
