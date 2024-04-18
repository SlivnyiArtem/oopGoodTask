package ru.oop.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Гражданин, член совеременного общества
 */
public interface Citizen {
    /**
     * получение данных о всех подходящих траснпортах, доступных гражданину
     */
    List<Transport> lookForTransports();

    /**
     * формирование последовательности транспортов с
     * наименьшими издержками на трансфер до места назначения,
     * либо empty если построить последовательность невозможно
     * @param transportList список всевозможных транспортных средств
     */
    Optional<LinkedList<Transport>> makeTransferList(List<Transport> transportList,
                                                     Position currentPosition,
                                                     Position destination);
}
