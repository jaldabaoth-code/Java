package ZZZZZjava_object;

import java.util.Objects;

public class Person {

    private Object firstname;
    private Object lastname;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) // null check
        {
            return false;
        }
        if (this == obj) // self check
        {
            return true;
        }
        if (getClass() != obj.getClass()) {// type check
            return false;
        }
        // type check and cast
        Person person = (Person) obj; // cast to Person



        return Objects.equals(firstname, person.firstname)
            && Objects.equals(lastname, person.lastname);
    }
}