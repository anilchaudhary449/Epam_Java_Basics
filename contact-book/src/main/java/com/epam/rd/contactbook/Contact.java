package com.epam.rd.contactbook;

public class Contact {
    private String contactName;
    ContactInfo[] contactInfos;
    private static final int EMAIL_LIMIT = 3;
    private static final int PHONE_NUMBER_LIMIT = 1;
    private static final int SOCIAL_MEDIA_LIMIT = 5;
    private int amountOfPhoneNums = 0;
    private int amountOfEmails = 0;
    private int amountOfSocialMedia = 0;

    public Contact(String contactName) {
        this.contactName = contactName;
        contactInfos = new ContactInfo[EMAIL_LIMIT + PHONE_NUMBER_LIMIT + SOCIAL_MEDIA_LIMIT + 1];
        contactInfos[0] = new NameContactInfo();
    }

    public void rename(String newName) {
        if(newName != null && !newName.isEmpty()) {
            this.contactName = newName;
        }
    }

    public Email addEmail(String localPart, String domain) {
        Email email = new Email(localPart, domain);
        if(amountOfEmails < EMAIL_LIMIT) {
            contactInfos[amountOfEmails + 2] = email;
            amountOfEmails++;
            return email;
        } else
            return null;

    }

    public Email addEpamEmail(String firstname, String lastname) {
        Email epamEmail =  new Email(firstname, lastname) {
            @Override
            public String getTitle() {
                return "Epam Email";
            }

            @Override
            public String getValue() {
                return firstname + "_" + lastname + "@epam.com";
            }
        };
        if(amountOfEmails < EMAIL_LIMIT) {
            contactInfos[amountOfEmails + 2] = epamEmail;
            amountOfEmails++;
            return epamEmail;
        } else
            return null;

    }

    public ContactInfo addPhoneNumber(int code, String number) {
        ContactInfo phoneNumber = new ContactInfo() {
            @Override
            public String getTitle() {
                return "Tel";
            }

            @Override
            public String getValue() {
                return String.format("+%d %s", code, number);
            }
        };
        if(amountOfPhoneNums < PHONE_NUMBER_LIMIT) {
            contactInfos[amountOfPhoneNums + 1] = phoneNumber;
            amountOfPhoneNums++;
            return phoneNumber;
        } else
            return null;

    }

    public Social addTwitter(String twitterId) {
        Social twitter = new Social("Twitter", twitterId);
        if(amountOfSocialMedia < SOCIAL_MEDIA_LIMIT) {
            contactInfos[amountOfSocialMedia + 5] = twitter;
            amountOfSocialMedia++;
            return twitter;
        } else
            return null;

    }

    public Social addInstagram(String instagramId) {
        Social instagram = new Social("Instagram", instagramId);
        if(amountOfSocialMedia < SOCIAL_MEDIA_LIMIT) {
            contactInfos[amountOfSocialMedia + 5] = instagram;
            amountOfSocialMedia++;
            return instagram;
        } else
            return null;
    }

    public Social addSocialMedia(String title, String id) {
        Social socialMedia = new Social(title, id);
        if(amountOfSocialMedia < SOCIAL_MEDIA_LIMIT) {
            contactInfos[amountOfSocialMedia + 5] = socialMedia;
            amountOfSocialMedia++;
            return socialMedia;
        } else
            return null;
    }

    public ContactInfo[] getInfo() {
        int numsOfEntries = amountOfSocialMedia + amountOfEmails +amountOfPhoneNums +1;
        ContactInfo[] contactInfosWithoutNull = new ContactInfo[numsOfEntries];
        for(int i = 0, j = 0; i < contactInfos.length; ++i) {
            if(contactInfos[i] != null) {
                contactInfosWithoutNull[j++] = contactInfos[i];
            }
        }
        return contactInfosWithoutNull;
    }

    private class NameContactInfo implements ContactInfo {
        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return contactName;
        }
    }

    public static class Email implements ContactInfo {
        protected final String emailValue;
        public Email(String localPart, String domain) {
            this.emailValue = localPart + "@" + domain;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return emailValue;
        }
    }

    public static class Social implements ContactInfo {
        private final String title;
        private final String socialMediaId;

        public Social(String title, String id) {
            this.title = title;
            this.socialMediaId = id;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return socialMediaId;
        }
    }
}