public class Bus{

  private int route;
  private Passenger[] passengers;

  public Bus(int route){
    this.route = route;
    this.passengers = new Passenger[10];
  }


  public int getRoute(){
    return this.route;
  }

  public int passengerCount(){
    int count = 0;
    for( Passenger passenger: passengers ){
      if( passenger != null ){
        count++;
      }
    }
    return count;
  }

  public void acceptPassenger(Passenger passenger){
    if( this.isBusFull() ){
      return;
    }
    int passengerCount = passengerCount();
    passengers[passengerCount] = passenger;
  }

  public boolean isBusFull(){
    return this.passengerCount() == this.passengers.length;
  }

  public void endOfRoute(){
    for(int i = 0; i < passengers.length; i++){
      passengers[i] = null;
    }
  }




}
