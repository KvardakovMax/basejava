package com.topjava.webapp.model;

public class ResumeTestData {
    private static final String UUID = "uuid1";
    private static final Resume RESUME;

    static {
        RESUME = new Resume(UUID, "Григорий Кислин");
        RESUME.addContacts(ContactType.PHONE, "7(921) 855-0482");
        RESUME.addContacts(ContactType.SKYPE, "grigory.kislin");
        RESUME.addContacts(ContactType.MAIL, "gkislin@yandex.ru");
        RESUME.addSections(SectionType.ACHIEVEMENT, new InformationBlockSection("ACHIEVEMENT1", "ACHIEVEMENT2", "ACHIEVEMENT3"));
        RESUME.addSections(SectionType.EDUCATION, new InformationBlockSection("EDUCATION1", "EDUCATION2", "EDUCATION3"));
        RESUME.addSections(SectionType.OBJECTIVE, new DescriptionTextSection("OBJECTIVE"));
        RESUME.addSections(SectionType.PERSONAL, new DescriptionTextSection("PERSONAL"));
    }

    public static void main(String[] args) {
        System.out.println(RESUME.getContacts(ContactType.PHONE));
        System.out.println(RESUME.getContacts(ContactType.SKYPE));
        System.out.println(RESUME.getContacts(ContactType.MAIL));
        System.out.println(RESUME.getSections(SectionType.ACHIEVEMENT));
        System.out.println(RESUME.getSections(SectionType.EDUCATION));
        System.out.println(RESUME.getSections(SectionType.OBJECTIVE));
        System.out.println(RESUME.getSections(SectionType.PERSONAL));
    }
}