package com.topjava.webapp.model;

import java.util.Objects;

public class DescriptionTextSection extends AbstractSection {
    private final String TEXT_BLOCK;

    public DescriptionTextSection(String text_block) {
        TEXT_BLOCK = text_block;
    }

    @Override
    public String toString() {
        return "DescriptionText{" +
                "TEXT_BLOCK='" + TEXT_BLOCK + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DescriptionTextSection that = (DescriptionTextSection) o;
        return TEXT_BLOCK.equals(that.TEXT_BLOCK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TEXT_BLOCK);
    }

    public String getTEXT_BLOCK() {
        return TEXT_BLOCK;
    }
}
