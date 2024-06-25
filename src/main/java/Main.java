public class Main {
    public static void main(String[] args) {
        // declaring mother
        Person mother = new Person.PersonBuilder("Mary", "Poppins", 58)
                .build();

        // declaring father
        Person father = new Person.PersonBuilder("John", "Poppins", 61)
                .build();

        // declaring siblings
        Person sister = new Person.PersonBuilder("Joan", "Poppins", 20)
                .build();

        // using builder to get the object
        Person person = new Person.PersonBuilder("Jane", "Doe", 24)
                .setGender("Female")
                .setDateOfBirth("09-03-1988")
                .setPlaceOfBirth("Sabah Malaysia")
                .setMother(mother)
                .setFather(father)
//                .addSiblings(sister)
                .build();

        System.out.println("Person: " + person.getFirstName());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Place of Birth: " + person.getPlaceOfBirth());
        System.out.println("Mother: " + person.getMother().getFirstName());
        System.out.println("Father: " + person.getFather().getFirstName());

//        for (var sibling : person.getSiblings()) {
//            System.out.println("Sibling: " + sibling.getFirstName());
//        }

    }


}
