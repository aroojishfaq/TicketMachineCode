public class Main{
 public static void main(String args[]){
  //Starting creating objects
   TicketMachine M1=new TicketMachine(12);
   M1.setPrice(12);
   M1.getPrice();
   M1.insertMoney(12);
   M1.getBalance();
  M1.printTicket();
  M1.getTotal();
 M1.setPrice(12);
M1.insertMoney(15);
M1.printTicket();
  M1.getTotal();

TicketMachine M2=new TicketMachine(20);
   M2.setPrice(20);
   M2.getPrice();
   M2.insertMoney(25);
   M2.getBalance();
  M2.printTicket();
  M2.getTotal();
 M2.setPrice(20);
M2.insertMoney(15);
M2.printTicket();
  M2.getTotal();
}

}
