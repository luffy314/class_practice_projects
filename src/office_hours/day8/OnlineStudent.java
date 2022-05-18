package office_hours.day8;

public  class OnlineStudent extends Student {
    public static Student cool;//didn't work they way i hoped
    public static OnlineStudent test;


    public OnlineStudent(String name, int age, String batchNumber) {
        super(name, age, batchNumber);
    }

    @Override
    public void sleep() {
        System.out.println("Online student is sleeping");
    }

    @Override
    public void attendClass() {
        System.out.println("Online student is attending Classes");

    }
}
