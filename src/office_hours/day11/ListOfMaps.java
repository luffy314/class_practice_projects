package office_hours.day11;

import java.util.*;

public class ListOfMaps {
    public static void main(String[] args) {

        List<Map<String, String>> employees = new ArrayList<>();

        Map<String,String> emp1Data= new LinkedHashMap<>(); //keeps insertion order
        emp1Data.put("EmpID" , "123");
        emp1Data.put("EmpName" , "Mike");
        emp1Data.put("JobTitle" , "SDET");
        emp1Data.put("Salary" , "120000");

        Map<String,String> emp2Data= new HashMap<>(); //no insertion order
        emp2Data.put("EmpID" , "124");
        emp2Data.put("EmpName" , "John");
        emp2Data.put("JobTitle" , "Dev");
        emp2Data.put("Salary" , "120000");

        Map<String,String> emp3Data= new HashMap<>(); //no insertion order
        emp3Data.put("EmpID" , "125");
        emp3Data.put("EmpName" , "Jim");
        emp3Data.put("JobTitle" , "SDET");
        emp3Data.put("Salary" , "100000");

        employees.add(emp1Data);
        employees.add(emp2Data);
        employees.add(emp3Data);

        //print the list
        System.out.println(employees);

        //print the first emp by using list method
        System.out.println(employees.get(0));

        //how many employees do we have in the list
        System.out.println(employees.size());

        //how many data is stores in the first map
        System.out.println(employees.get(0).size());

        //print first employees employee name
        System.out.println(employees.get(0).get("EmpName"));

        //print the last emp salary
        System.out.println(employees.get(employees.size()-1).get("Salary"));

        //calculate total salary of all employees
        int totalSalary=0;
        for (Map<String, String> each : employees) {
            totalSalary += Integer.parseInt(each.get("Salary"));
        }
        System.out.println(totalSalary);
    }
}
