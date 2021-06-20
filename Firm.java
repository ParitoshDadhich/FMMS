 
package management;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and student
 * using an ArrayList.
 */
public class Firm {

    private List<Lawyer> lawyers;
    private List<Client> clients;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * 
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public Firm(List<Lawyer> lawyers, List<Client> clients) {
        this.lawyers = lawyers;
        this.clients = clients;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public List<Lawyer> getTeachers() {
        return lawyers;
    }
 
    
    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Lawyer teacher) {
    	lawyers.add(teacher);
    }
 
    /**
     * 
     * @return the list of students in the school.
     */
    public List<Client> getStudents() {
        return clients;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Client client) {
    	clients.add(client);
    }
 
    /**
     * 
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
