package com.topjava.webapp.model;

import java.util.Objects;

public class Link {
    private final String NAME;
    private final String URL;

    public Link(String NAME, String URL) {
        this.NAME = NAME;
        this.URL = URL;
    }

    public String getNAME() {
        return NAME;
    }

    public String getURL() {
        return URL;
    }

    @Override
    public String toString() {
        return "Link{" +
                "NAME='" + NAME + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return NAME.equals(link.NAME) &&
                Objects.equals(URL, link.URL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, URL);
    }
}