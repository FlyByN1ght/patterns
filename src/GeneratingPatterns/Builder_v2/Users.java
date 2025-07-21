package GeneratingPatterns.Builder_v2;

public class Users {

    private final String name;
    private final String lastName;
    private final String email;

    private Users(String name, String lastName, String email) {
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
        public Users build() {
            return new Users(name, lastName, email);
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
