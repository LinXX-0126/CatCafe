import java.time.LocalDate;
import java.time.LocalTime;

public class Customer {

    String name;
    int ruaTimes;
    LocalDate arrival = LocalDate.now();
    LocalTime arrivalTime = LocalTime.now();



    public Customer(String name,int ruaTimes,LocalDate arrival,LocalTime arrivalTime){
       this.name = name;
       this.ruaTimes = ruaTimes;
       this.arrival = arrival;
       this.arrivalTime = arrivalTime;
    }

    public void Arrival(Customer p){

        System.out.println(p);
    }

    public void rua(Cat c){
    }

    @Override
    public String toString() {
        return "顾客"+this.name+"在"+this.arrival+"的"+this.arrivalTime+"到店，想要rua猫"+this.ruaTimes +"次。";
    }



}
