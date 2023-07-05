package BuilderDesignPattern;

public class User {
    private String userName;
    private String userEmail;
    private String address;

    private User(UserBuilder builder){
        this.userName=builder.userName;
        this.userEmail=builder.userEmail;
        this.address=builder.address;

    }
    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
//innerClass

    static class UserBuilder {
        private String userName;
        private String userEmail;
        private String address;

        public UserBuilder(){

        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }
    }

}
