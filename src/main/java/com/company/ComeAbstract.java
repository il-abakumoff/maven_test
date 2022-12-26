package com.company;

import java.util.Objects;

public abstract class ComeAbstract implements Info{

    int comeId;
    int time;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComeAbstract that = (ComeAbstract) o;
        return comeId == that.comeId && time == that.time;
    }
    @Override
    public int hashCode() {
        return Objects.hash(comeId, time);
    }

    public abstract String getInfo();
}
