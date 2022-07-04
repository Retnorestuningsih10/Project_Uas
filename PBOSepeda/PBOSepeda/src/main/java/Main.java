import frame.SepedaViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args) {
        Koneksi.getConnection();
        SepedaViewFrame viewFrame = new SepedaViewFrame();
        viewFrame.setVisible(true);
    }
}
