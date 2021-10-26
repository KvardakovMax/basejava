package com.topjava.webapp.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BulletedListSection extends AbstractSection {
private final List<String> infoBlocks;

    public BulletedListSection(List<String> infoBlocks) {
        this.infoBlocks = infoBlocks;
    }

    public BulletedListSection(String... infoBlocks) {
        this(Arrays.asList(infoBlocks));
    }

    public List<String> getInfoBlocks() {
        return infoBlocks;
    }

    @Override
    public String toString() {
        return "{" + infoBlocks + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BulletedListSection that = (BulletedListSection) o;
        return infoBlocks.equals(that.infoBlocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoBlocks);
    }
}
