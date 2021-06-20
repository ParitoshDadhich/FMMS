 
package management;

/**
 * This class is responsible for keeping the
 * track of client's fees, name ,caseNumber & fees
 * paid.
 *
 */
public class Client {

    private int id;
    private String name;
    private int caseNumber;
    private int feesPaid;
    private int feesTotal;
    
    /**
     * To create a new client by initialising.
     * Fees for every client is $30,000.
     * @param id id for the client: unique.
     * @param name name of the client.
     * @param caseNumber caseNumber of the client.
     */
    public Client(int id, String name,int caseNumber){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.caseNumber=caseNumber;

    }

    //Not going to alter client's name, client's id.

 
    
    /**
     * Used to update the client's caseNumber.
     * @param caseNumber new caseNumber of the client
     */
    
    public void setGrade(int caseNumber){
        this.caseNumber=caseNumber;
    }


     
    /**
     * Keep adding the fees to feesPaid Field (feesPaid = 10,000 + 5000 + 15000)
     * Add the fees to the fees paid.
     * The client is going receive the funds.
     * @param fees the fees that the client pays.
     */
    
    public void payFees(int fees){
        feesPaid+=fees;
        Firm.updateTotalMoneyEarned(feesPaid);	// HERE updateTotalMoneyEarned is the static method
    }

    
    /**
     *
     * @return id of the client.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the client.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the caseNumber of the client.
     */
    public int getGrade() {
        return caseNumber;
    }

    /**
     *
     * @return fees paid by the client.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the client.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

  
    public String toString() {
        return "Client's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}