import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Service s = new Service("Poland");
        String weatherJson = s.getWeather("Warsaw");
        Double rate1 = s.getRateFor("EUR");
        Double rate2 = s.getNBPRate();
        // ...
        // część uruchamiająca GUI
        System.out.println("DZIEŃ DOBRY");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Window window = null;
                try {
                    window = new Window(rate2,s);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                window.frame.setVisible(true);
            }
        });
    }
}