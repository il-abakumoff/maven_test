package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessorTest {

    DataProcessor<Come> data = new DataProcessor<>();

    @Test
    void streamFilter() throws FilterException {

        ArrayList<Come> list = new ArrayList<>();
        assertThrows(FilterException.class, () -> data.streamFilter(list, 3, 1));

        list.add(new Come(1, 1, 4));
        list.add(new Come(2, 2, 6));
        list.add(new Come(3, 3, 2));
        list.add(new Come(4, 4, 7));
        list.add(new Come(5, 5, 2));
        list.add(new Come(6, 6, 1));

        List<ComeExport> list2 = new ArrayList<>();

        list2.add(new ComeExport(6, 1));
        list2.add(new ComeExport(3, 2));

        assertEquals(list2, data.streamFilter(list, 0, 5)); //выводится какая-то шляпа, почему выяснитьь
    }

    @Test
    void streamSearch() {

        List<Come> list = new ArrayList<>();
        list.add(new Come(1, 1, 3));

        assertEquals(false, data.streamSearch(list, 2).isPresent());
        assertEquals(true, data.streamSearch(list, 3).isPresent());

        list.add(new Come(5, 2, 6));
        list.add(new Come(3, 4, 8));

        assertEquals(list.get(1), data.streamSearch(list, 6).get());
    }
}