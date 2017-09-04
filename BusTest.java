import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;

  @Before
  public void before(){
    bus = new Bus(26);
    passenger = new Passenger();
  }



  @Test
  public void hasRoute(){
    assertEquals( 26, bus.getRoute() );
  }

  @Test
  public void busStartsEmpty(){
    assertEquals( 0, bus.passengerCount() );
  }

  @Test
  public void passengerCanBoardBus(){
    bus.acceptPassenger(passenger);
    assertEquals( 1, bus.passengerCount() );
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i<10; i++){
      bus.acceptPassenger(passenger);
    }
    assertEquals( true, bus.isBusFull() );
  }

  @Test
  public void noMorePassengersWhenBusIsFull(){
    for(int i = 0; i < 15; i++){
      bus.acceptPassenger(passenger);
    }
    assertEquals( 10, bus.passengerCount() );
  }

  @Test
  public void canBusEmpty(){
    bus.acceptPassenger(passenger);
    bus.endOfRoute();
    assertEquals( 0, bus.passengerCount() );
  }








}
