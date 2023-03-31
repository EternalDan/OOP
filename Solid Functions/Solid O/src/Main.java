public class Main {
    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica);
    }
    static void  workInTaxi(Car car){
        car.workInTaxi();

    }
}
interface Car {
    void workInTaxi();
}
class Toyota implements Car{
    void getPassengers(){
        System.out.println("get Passengers");
    }
    @Override
    public void workInTaxi(){
        getPassengers();
    }
}
class Celica extends Toyota{
    @Override
    public void workInTaxi(){
        getPassengers();
    }
    void getPassengers(){
        System.out.println("get one Passenger");
    }
}