package com.topjava.webapp.model;

import java.time.Month;

public class ResumeTestData {
/*    private static final String UUID = "uuid1";
    private static final Resume RESUME;

    static {
        RESUME = new Resume(UUID, "Григорий Кислин");
        RESUME.addContacts(ContactType.PHONE, "7(921) 855-0482");
        RESUME.addContacts(ContactType.SKYPE, "grigory.kislin");
        RESUME.addContacts(ContactType.MAIL, "gkislin@yandex.ru");
        RESUME.addContacts(ContactType.HOME_PAGE, "Моя страница");
        RESUME.addContacts(ContactType.PROFILE_GITHUB, "Мой гит");
        RESUME.addContacts(ContactType.PROFILE_LINKEDIN, "Мой линкет");
        RESUME.addContacts(ContactType.PROFILE_STACKOVERFLOW, "Мой стэк");
        RESUME.addSections(SectionType.ACHIEVEMENT, new BulletedListSection("ACHIEVEMENT1", "ACHIEVEMENT2", "ACHIEVEMENT3"));
        RESUME.addSections(SectionType.EDUCATION, new BulletedListSection("EDUCATION1", "EDUCATION2", "EDUCATION3"));
        RESUME.addSections(SectionType.OBJECTIVE, new SimpleLineSection("OBJECTIVE"));
        RESUME.addSections(SectionType.PERSONAL, new SimpleLineSection("PERSONAL"));
        RESUME.addSections(SectionType.QUALIFICATIONS, new BulletedListSection("Java", "SQL"));
        RESUME.addSections(SectionType.EXPERIENCE, new OrganizationSection(new Organization("work1", "https://yandex.ru",
                new Organization.Position(2000, Month.APRIL, 2001, Month.FEBRUARY, "Software engineer", "Hard-worker"),
                new Organization.Position(2002, Month.APRIL, 2010, Month.FEBRUARY, "Manager", "Hard-worker"))));
    }*/


    public static Resume getCompletedResume(String uuid, String fullName) {
        Resume resume = new Resume(uuid, fullName);
        resume.addContacts(ContactType.PHONE, "7(921) 855-0482");
        resume.addContacts(ContactType.SKYPE, "grigory.kislin");
        resume.addContacts(ContactType.MAIL, "gkislin@yandex.ru");
        resume.addContacts(ContactType.HOME_PAGE, "Моя страница");
        resume.addContacts(ContactType.PROFILE_GITHUB, "Мой гит");
        resume.addContacts(ContactType.PROFILE_LINKEDIN, "Мой линкет");
        resume.addContacts(ContactType.PROFILE_STACKOVERFLOW, "Мой стэк");
        resume.addSections(SectionType.ACHIEVEMENT, new BulletedListSection("ACHIEVEMENT1", "ACHIEVEMENT2", "ACHIEVEMENT3"));
        resume.addSections(SectionType.EDUCATION, new BulletedListSection("EDUCATION1", "EDUCATION2", "EDUCATION3"));
        resume.addSections(SectionType.OBJECTIVE, new SimpleLineSection("OBJECTIVE"));
        resume.addSections(SectionType.PERSONAL, new SimpleLineSection("PERSONAL"));
        resume.addSections(SectionType.QUALIFICATIONS, new BulletedListSection("Java", "SQL"));
        resume.addSections(SectionType.EXPERIENCE, new OrganizationSection(new Organization("work1", "https://yandex.ru",
                new Organization.Position(2000, Month.APRIL, 2001, Month.FEBRUARY, "Software engineer", "Hard-worker"),
                new Organization.Position(2002, Month.APRIL, 2010, Month.FEBRUARY, "Manager", "Hard-worker"))));

        return resume;
    }

    public static void main(String[] args) {
       /* System.out.println(RESUME.getContacts(ContactType.SKYPE));

        for (ContactType type : EnumSet.allOf(ContactType.class)) {
            System.out.println(RESUME.getContacts(type));
        }

        for (SectionType type : EnumSet.allOf(SectionType.class)) {
            System.out.println(RESUME.getSections(type));
        }*/
    }
}