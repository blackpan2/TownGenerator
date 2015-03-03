package Infrastructure;

public class StreetFactory {
    public static Street makeStreet(int numberOnStreet){
        return new Street(numberOnStreet);
    }
}
