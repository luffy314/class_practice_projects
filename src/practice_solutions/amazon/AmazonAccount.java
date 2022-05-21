package practice_solutions.amazon;

/*
create a class AmazonAccount

	instance variables:
		- userName (String)
		- email (String)
		- hasPrime (boolean)

	constructor:
		- initialize the fields

	encapsulate AmazonAccount

	methods: toString()

 */

public class AmazonAccount {

    private String username;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String username, String email, boolean hasPrime) {
        this.username = username;
        this.email = email;
        this.hasPrime = hasPrime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    @Override
    public String toString() {
        return  "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", " + (hasPrime ? "Has Prime" : "No Prime");
    }
}
