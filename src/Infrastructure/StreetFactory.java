package Infrastructure;

/**
 * Created by Stout on 3/3/2015.
 */
public class StreetFactory {
    public static Street makeStreet(int numberOnStreet){
        return new Street(numberOnStreet);
    }
}
