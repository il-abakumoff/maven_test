package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataProcessor<T extends Come> {

    public List<ComeExport> streamFilter(List<T> list, int min, int max) throws FilterException {
        if (min > max){
            throw new FilterException("\n!!! The minimum value cannot be greater than the maximum");
        }
        return list.stream()
                .filter(element -> element.time > min && element.time < max)
                .sorted(Comparator.comparing(element -> element.time))
                .limit(2)
                .map(element -> new ComeExport(element.comeId, element.time))
                .collect(Collectors.toList());
    }

    public Optional<T> streamSearch(List<T> list, int x){
        return list.stream()
                .filter(element -> element.time == x)
                .findFirst();
    }
}
