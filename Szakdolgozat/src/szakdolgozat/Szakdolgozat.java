package szakdolgozat;

/**
 *
 * @author Harsányi László
 */
public class Szakdolgozat {

    public static int id=0; //A felhasználó beosztásához járó id
    public static void main(String[] args) {
        login l=new login(); //Új bejelentkezés ablakot jelenít meg
        l.setVisible(true);
        l.setLocationRelativeTo(null);          
    }
    
}
