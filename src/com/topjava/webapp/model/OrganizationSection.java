package com.topjava.webapp.model;

import java.util.List;
import java.util.Objects;
import java.util.Arrays;

public class OrganizationSection extends AbstractSection {
    private static final long serialVersionUID = 1L;

    private final List<Organization> organizations;

    public OrganizationSection(List<Organization> organizations) {
        Objects.requireNonNull(organizations, "organizations must not be null");
        this.organizations = organizations;
    }

    public OrganizationSection(Organization... organizations) {
        this(Arrays.asList(organizations));
    }

    public List<Organization> getOrganization() {
        return organizations;
    }

    @Override
    public String toString() {
        return "" + organizations + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationSection that = (OrganizationSection) o;
        return organizations.equals(that.organizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizations);
    }
}
