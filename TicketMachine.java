public class TicketMachine
{
    
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    //disount offer
    private int discount;

    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
      
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
 public void prompt(){
    System.out.println("Please insert the correct amount of money.");
}
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
          if (amount<=0){
         prompt();}

    }
    

    
    public void setDiscount(int amount)
    {
        discount = amount;
        price=price-discount;
    }
    public int getDiscount()
    {
        return price;
    }
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
 public void printTicket()
    { int amountLeftToPay= price-balance;
        // Simulate the printing of a ticket.
        if (amountLeftToPay<=0){
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        balance = 0;
}
else {
    System.out.println("Amount left to pay");
        
    }
}
       public void getTotal(){
           System.out.println("#Total balance " + total + " cents.");
    }
    public void getEmptyMachine(){
       getTotal();
      total=0;
    }
  
   
     

}