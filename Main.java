 

package management;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
    								//  id, name, salary
        Lawyer louis = new Lawyer(1,"Louis",500);
        Lawyer mike = new Lawyer(2,"Mike",700);
        Lawyer harvey = new Lawyer(3,"Harvey",600);

        List<Lawyer> teacherList = new ArrayList<>();
        teacherList.add(louis);
        teacherList.add(mike);
        teacherList.add(harvey);

        							  // id, name, caseNumber
        Client paritosh = new Client(1,"Paritosh",4);
        Client raj = new Client(2,"Raj",12);
        Client kushi = new Client(3,"Kushi",5);
        List<Client> studentList = new ArrayList<>();

        studentList.add(paritosh);
        studentList.add(raj);
        studentList.add(kushi);



        // passing Lawyer list and Client list for creating a new Firm object
        Firm psl = new Firm(teacherList,studentList);

        Lawyer megan = new Lawyer(6,"Megan", 900);

        psl.addTeacher(megan);


        paritosh.payFees(5000);
        raj.payFees(6000);
        System.out.println("Pearson Specter Lit has earned $"+ psl.getTotalMoneyEarned());

        System.out.println();
        System.out.println("------Making Firm PAY SALARY----");
        louis.receiveSalary(louis.getSalary());
        System.out.println("Pearson Specter Lit has spent for salary to " + louis.getName()
        +" and now has $" + psl.getTotalMoneyEarned());

        harvey.receiveSalary(harvey.getSalary());
        System.out.println("Pearson Specter Lit has spent for salary to " + harvey.getName()
                +" and now has $" + psl.getTotalMoneyEarned());


        System.out.println();
        System.out.println(raj);

        mike.receiveSalary(mike.getSalary());

        System.out.println(mike);


    }
}