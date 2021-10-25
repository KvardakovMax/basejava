package com.topjava.webapp.model;

import java.util.List;
import java.util.Objects;

public class InformationBlock extends AbstractSection {
private final List<String> infoBlocks;

    public InformationBlock(List<String> infoBlocks) {
        this.infoBlocks = infoBlocks;
    }

    public List<String> getInfoBlocks() {
        return infoBlocks;
    }

    @Override
    public String toString() {
        return "InformationBlocks{" +
                "infoBlocks=" + infoBlocks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformationBlock that = (InformationBlock) o;
        return infoBlocks.equals(that.infoBlocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoBlocks);
    }
}
