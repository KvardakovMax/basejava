package com.topjava.webapp.model;

public enum ContactType {
    PHONE("Тел."),
    SKYPE("Skype"),
    MAIL("Почта"),
    PROFILE_LINKEDIN("Профиль LinkedIn"),
    PROFILE_GITHUB("Профиль GitHub"),
    PROFILE_STACKOVERFLOW("Профиль Stackoverflow"),
    HOME_PAGE("Домашняя страница");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
