package ru.oop.task2;

/**
 * Транспорт
 */

public interface Transport extends Positioned {
    /**
     * движение в выбранную точку
     *
     * @param destination местоназначения
     */
    void moveTo(Position destination);
}
