package practice_solutions.canvas;

public class TestModule {
    public static void main(String[] args) {

        /*

        Not part of the original task, just a separate class to run and use the File and Module objects

         */

        Module day1 = new Module();

        File notes = new File("day1 notes", 0.4);
        day1.files.add(notes);

        System.out.println(day1.files.get(0));
        day1.files.get(0).openFile();

        /*

            ArrayList<String> list
            list.get(0).charAt(0)

         */

        day1.addFile(new File("day 1.pdf", 0.5));

        System.out.println(day1.files);



    }
}
