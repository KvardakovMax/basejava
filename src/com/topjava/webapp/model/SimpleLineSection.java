package com.topjava.webapp.model;

import java.io.Serializable;
import java.util.Objects;

public class SimpleLineSection extends AbstractSection implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String textBlock;

    public SimpleLineSection(String text_block) {
        textBlock = text_block;
    }

    @Override
    public String toString() {
        return "{" + textBlock + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleLineSection that = (SimpleLineSection) o;
        return textBlock.equals(that.textBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textBlock);
    }

    public String getTextBlock() {
        return textBlock;
    }
}
