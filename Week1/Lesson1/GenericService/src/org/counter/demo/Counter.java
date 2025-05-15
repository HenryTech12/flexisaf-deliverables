package org.counter.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Counter {

    int factor = 0;

    public <T extends Number> int countOddElementInCollection(Collection<T> collection) {
        List<T> dataResult = collection.stream()
                .filter((data) -> {
                    int result = data.intValue();
                    return (result % 2) != 0;
                })
                .toList();
        printCollections(dataResult);
        return dataResult.size();
    }

    public <T extends Number> int countPrimeNumbersElementInCollection(Collection<T> collection) {
        List<T> dataResult = collection.stream()
                .filter((data) -> {
                      int value = data.intValue();
                      for(int i = 2; i < value; i++)
                       return (value%i != 0);
                      return false;
                })
                .toList();
        printCollections(dataResult);
        return dataResult.size();
    }

    public <T extends String> int countPalindromeElementInCollection(Collection<T> collection) {
       List<String> dataResult = collection.stream()
                .filter((data) -> {
                    StringBuilder stringBuilder = new StringBuilder(data);
                    String reversedString = String.valueOf(stringBuilder.reverse());

                    return (data == reversedString || data.equals(reversedString));
                })
                .map(String::toUpperCase)
                .toList();
       printCollections(dataResult);
        return dataResult.size();
    }

    public <T> void printCollections(Collection<? extends T> collection) {
        Iterator<?> it = collection.iterator();
        StringBuilder concatString = new StringBuilder();
        while (it.hasNext()) {
            concatString.append(it.next().toString()).append(",");
        }
        System.out.println("RESULT: [ "+concatString.toString()+" ]");
        System.out.println("COUNT: "+collection.size());
    }


}
