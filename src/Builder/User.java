package Builder;

public class User {

    private final String name;
    private final String lastName;
    private final String email;

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    public static class UserBuilder {
        private String name;
        private String lastName;
        private String email;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public User build() {
            return new User(name, lastName, email);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
