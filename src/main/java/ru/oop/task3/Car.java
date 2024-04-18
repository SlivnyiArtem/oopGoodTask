package ru.oop.task3;

public class Car implements Transport{
    public Car(Person person) {
    }

    /**
     * движение в выбранную точку
     *
     * @param destination - точка назначения
     * @param passenger   - перевозимый пассажир
     */
    @Override
    public void drivePassengerToPoint(Position destination, Person passenger) {

    }

    /**
     * Текущее местоположение
     */
    @Override
    public Position getPosition() {
        return null;
    }
}
