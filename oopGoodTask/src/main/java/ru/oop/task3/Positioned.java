package ru.oop.task3;

/**
 * Обозначает что объект позиционируемый,
 * т.е. знает своё местоположение и может его изменить
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Positioned {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * обновляет текущее местоположение
     *
     * @param newPosition новое местоположение
     */
    void updatePosition(Position newPosition);
}
