package com.topjava.webapp.model;

import java.util.Objects;

public class Organization {
    private final Link homePage;
    private final String data;
    private final String title;
    private final String description;

    public Organization(Link homePage, String data, String title, String description) {
        this.homePage = homePage;
        this.data = data;
        this.title = title;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return homePage.equals(that.homePage) &&
                data.equals(that.data) &&
                title.equals(that.title) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homePage, data, title, description);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "HOME_PAGE=" + homePage +
                ", DATA='" + data + '\'' +
                ", TITLE='" + title + '\'' +
                ", DESCRIPTION='" + description + '\'' +
                '}';
    }
}
