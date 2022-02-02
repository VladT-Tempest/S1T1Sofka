public class BankAccount {
    /** 
     * Abstracción de una cuenta bancaria y sus característics fundamentales
     * @ author Aljendro Aguilera W
     */

    //atributos
    private int accountNumber;
    protected boolean activated;
    /**
     * Construyctor de la clase cuenta de banco
     * @param accountNumber número de la cuenta
     * @param activated true si la cuenta activada, false caso opuesto
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    //getters and setters
    /**
     * Retorna número de cuenta
     * @return número de cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Configura número de cuenta
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Guarda estado de activación de una cuenta
     * @return estado de activación: true / false
     */
    public boolean isActivated() {
        return activated;
    }
    /**
     * Configura estado de activación de cuenta
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }    
}
