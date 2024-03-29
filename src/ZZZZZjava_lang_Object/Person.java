package ZZZZZjava_lang_Object;

import java.util.Objects;

public class Person {
	private String user1;
	private int age;
	private String user2;
	private String user3;
	@Override
	public int hashCode() {
		return Objects.hash(user1);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(user1, other.user1);
	}
}