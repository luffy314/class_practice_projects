package practice_solutions.amazon;

public class UseAmazon {
    public static void main(String[] args) {

        AmazonAccount account1 = new AmazonAccount("jbond", "jbond007@gmail.com", true);
        System.out.println(account1);

        AmazonAccount account2 = new AmazonAccount("batman", "secretIdentity@gmail.com", false);
        System.out.println(account2);

        // All the variables in the AmazonAccount are encapsulated, so we need to use the setters to change, and if we needed to access any we could use the getters

        account2.setUsername("BruceW");
        account2.setEmail("bruce@wayne_enterprise.com");
        account2.setHasPrime(true);
        System.out.println(account2);

    }
}
