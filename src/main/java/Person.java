import java.util.List;

public class Person {
    // required parameters
    private String firstName;
    private String lastName;
    private int age;

    // optional parameters
    private String gender;
    private String dateOfBirth;
    private String placeOfBirth;

    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
        this.placeOfBirth = builder.placeOfBirth;
        this.mother = builder.mother;
        this.father = builder.father;
        this.siblings = builder.siblings;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public static class PersonBuilder {
        // required parameters
        private String firstName;
        private String lastName;
        private int age;

        // optional parameters
        private String gender;
        private String dateOfBirth;
        private String placeOfBirth;

        private Person mother;
        private Person father;
        private List<Person> siblings;
        private List<Person> children;

        public PersonBuilder(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
            return this;
        }

        public PersonBuilder setMother(Person mother) {
            this.mother = mother;
            return this;
        }

        public PersonBuilder setFather(Person father) {
            this.father = father;
            return this;
        }

        public PersonBuilder setSiblings(List<Person> siblings) {
            this.siblings = siblings;
            return this;
        }

        public PersonBuilder addSiblings(Person sibling) {
            this.siblings.add(sibling);
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
