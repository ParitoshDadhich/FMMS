 


package management;


/**
 * This class is responsible for keeping the track
 * of lawyer's name, id, salary.
 */
public class Lawyer {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
 
    
    /**
     * Creates a new Lawyer object.
     * @param id id for the lawyer.
     * @param name name of the lawyer.
     * @param salary salary of the lawyer.
     */
    public Lawyer(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id of the lawyer.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the lawyer.
     */
    
    public String getName(){
        return name;
    }


    /**
     *
     * @return the salary of the lawyer.
     */
    public int getSalary(){
        return  salary;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        Firm.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of the Lawyer: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}