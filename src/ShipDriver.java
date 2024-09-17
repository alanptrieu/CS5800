public class ShipDriver{
    public static void main(String[] args){
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Queen Mary", "1990");
        ships[1] = new CruiseShip("Carnival", "2001", 5000);
        ships[2] = new CargoShip("Titanic", "2010", 20000);

        for (int i = 0; i < ships.length; i++){
            ships[i].print();
        }
    }
}
