package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest1 {

    public static void main(String[] args) {

        Address address1 = new Address(12,"ponguru","Nellore");
        Address address2 = new Address(11,"Marathalli","Bangalore");
        Address address3 = new Address(10,"Munnekollala","Bangalore");

        Employee employee1 = new Employee(101,"Venkat",address1);
        Employee employee2 = new Employee(102,"Pradeep",address2);
        Employee employee3 = new Employee(103,"Rahul",address3);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        List<Employee> list =  employeeList.stream()
            .map(t -> {
            Employee obj = new Employee();
            if(t.getName().equalsIgnoreCase("Venkat")){
                obj.setAddress(null);
                obj.setName("newVenkat");
                obj.setId(10001);
            }
            return obj;


        }).collect(Collectors.toList());

        System.out.println(list);



    }
}
