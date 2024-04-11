package ru.oop.task3;

import java.util.LinkedList;
import java.util.Optional;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code Arrays.asList(new Car(person), new Bus("43", person),
 * new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     */
    public static void moveTo(Person person, Position destination) {
        // TODO
        Optional<LinkedList<Transport>> transferOptional = person.makeTransferList(person.lookForTransports(),
                                                                            person.getPosition(), destination);
        transferOptional.ifPresent(
                (value) -> {
                    while (!value.isEmpty()) {
                        Transport currTransport = value.pop();
                        person.walk(currTransport.getPosition());
                        currTransport.moveTo(destination, person);
                        person.updatePosition(currTransport.getPosition());
                    }
                });
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}
