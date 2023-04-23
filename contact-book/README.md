# Contact Book

The purpose of this exercise is to train using nested classes.

Estimated workload of this exercise is _60 min_.

### Description

In this exercise we are going to manage contacts information.

A [`Contact`](src/main/java/com/epam/rd/contactbook/Contact.java) is a class containing
different information of how to reach a person or a company: phone number, emails, social media.

A contact has a name, which is provided via the class constructor.
Also, a contact contains limited amount of entries:
- a phone number (only a single one)
- emails (up to 3 entries)
- social media links (up to 5 entries)

A contact info entry is described with [`ContactInfo`](src/main/java/com/epam/rd/contactbook/ContactInfo.java) interface.
Each entry has a title and a value. 
You need to implemented them as nested classes of the `Contact` class:
- `Contact.NameContactInfo` - A `ContactInfo` implementation providing the name of the contact.
  Implement as private non-static nested class. Use `"Name"` for the entry title.
  It must not have its own fields. It must use fields of the bounded `Contact` instance instead.
- `Contact.Email` - A `ContactInfo` implementation containing an email.
  Implement as public static nested class. Use `"Email"` for the entry title.
- `Contact.Social` - A `ContactInfo` implementation containing a social media link/id.
  Implement as public static nested class. Let the user of the class define the title.
- Other implementations must be anonymous. Do not provide other non-anonymous classes.

It is possible to add contact info entries via `add*` methods.
All such methods return the created entry as the result, `null` if nothing was added to the contact.  
- `addEmail(String localPart, String domain)`\
  Adds an email entry.\
  `addEmail("someone", "somewhere.com").getValue()` will result to `someone@somewhere.com`. 
- `addEpamEmail(String firstname, String lastname)`\
  Adds a special email entry with "epam.com" domain.
  Please, implement this method using an anonymous extension of the `Email` class.
  Use `"Epam Email"` for the entry title.\
  `addEpamEmail("some", "one").getValue()` will result to `some_one@epam.com`
- `addPhoneNumber(int code, String number)`\
  Adds a contact info entry for the phone number.
  Please, implement this method using an anonymous class.
  Use `"Tel"` for the entry title.\
  `addPhoneNumber(44, "444 444-44-44").getValue()` will result to `+44 444 444-44-44`
- `addTwitter(String twitterId)`\
  Adds a contact info entry for the Twitter social media id.
  Use `"Twitter"` for the entry title, the given id for the value.
- `addInstagram(String instagramId)`\
  Adds a contact info entry for the Instagram social media id.
  Use `"Instagram"` for the entry title, the given id for the value.
- `addSocialMedia(String title, String id)`\
  Adds a contact info entry for the generic social media id.
  Use the given title for the entry title, the given id for the value.

Note that it is possible to rename contact with the `rename` method.
Make sure it is not possible to rename contact to have `null` or empty value as the name.

One more method that the `Contact` class have is the `getInfo()` method.
This method returns an array containing the `ContactInfo` entries in the following order:
- name contact info
- phone number contact info (if set)
- email entries in order of addition (if any added)
- social media entries in order of addition (if any added)
Resulting array must not contain any null values.

**Important restriction:** Note that in this exercise you **may not** use *Collections* and *Streams*.

### Examples

See usage examples in tests inside [src/test/java](src/test/java).
