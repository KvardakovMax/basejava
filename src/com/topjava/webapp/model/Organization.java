package com.topjava.webapp.model;

import java.util.Objects;

public class Organization {
    private final Link HOME_PAGE;
    private final String DATA;
    private final String TITLE;
    private final String DESCRIPTION;

    public Organization(Link HOME_PAGE, String DATA, String TITLE, String DESCRIPTION) {
        this.HOME_PAGE = HOME_PAGE;
        this.DATA = DATA;
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return HOME_PAGE.equals(that.HOME_PAGE) &&
                DATA.equals(that.DATA) &&
                TITLE.equals(that.TITLE) &&
                Objects.equals(DESCRIPTION, that.DESCRIPTION);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HOME_PAGE, DATA, TITLE, DESCRIPTION);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "HOME_PAGE=" + HOME_PAGE +
                ", DATA='" + DATA + '\'' +
                ", TITLE='" + TITLE + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                '}';
    }
}
