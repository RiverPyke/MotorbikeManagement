
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import loginDetection.SsimCalculator;
import loginDetection.SsimException;
import org.opencv.core.Core;
import view.Login;

public class Application {

    public static void main(String[] args) {
//        try {
//            SsimCalculator sc = new SsimCalculator(new File("C:\\faceID\\admin\\resizeImage_1.png"));
//            double rs = sc.compareTo(new File("C:\\faceID\\admin\\resizeImage_1.png"));
//            System.out.println(rs);
//        } catch (SsimException ex) {
//            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Login login = new Login();
    }
}
