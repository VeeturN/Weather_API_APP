import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame frame = new JFrame();
    JPanel topPanel;
    JLabel weatherLabel;
    JLabel rateLabel;
    JLabel nbpLabel;
    JLabel countryLabel;
    JLabel cityLabel;
    String textCountry;
    String textCity;
    String textRate;
    Double newCurrency;
    JLabel labelSuper;
    WebView webView;

    public Window(Double rate2, Service s) throws Exception {

        textRate=s.getWaluta();
        frame.setTitle("Window");
        frame.setSize(1400, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Górny panel z kraj i miasto
        topPanel = new JPanel(new GridLayout(1, 2));
        topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        topPanel.setPreferredSize(new Dimension(frame.getWidth(), 80));
        cityLabel = new JLabel("MIASTO: "+s.getCity(), SwingConstants.CENTER);
        countryLabel = new JLabel("KRAJ: "+s.getCountry(), SwingConstants.CENTER);
        topPanel.add(countryLabel);
        topPanel.add(cityLabel);
        frame.add(topPanel, BorderLayout.NORTH);

        // Środkowy panel z większym układem
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        centerPanel.setBackground(Color.BLACK);

        // Lewy duży prostokąt z polami tekstowymi
        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        GridBagConstraints gbcLeft = new GridBagConstraints();
        gbcLeft.insets = new Insets(5, 60, 5, 60);
        gbcLeft.fill = GridBagConstraints.HORIZONTAL;
        gbcLeft.gridx = 0;
        gbcLeft.weightx = 1;
        gbcLeft.gridy = GridBagConstraints.RELATIVE;

        JLabel titleLabel = new JLabel("ZMIANA DANYCH", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbcLeft.gridwidth = 2;
        leftPanel.add(titleLabel, gbcLeft);
        gbcLeft.gridwidth = 1;

        JLabel label1 = new JLabel("PAŃSTWO:");
        JTextField field1 = new JTextField(10);
        JButton button1 = new JButton("OK");

        JLabel label2 = new JLabel("MIASTO:");
        JTextField field2 = new JTextField(10);
        JButton button2 = new JButton("OK");

        JLabel label3 = new JLabel("WALUTA:");
        JTextField field3 = new JTextField(10);
        JButton button3 = new JButton("OK");

        labelSuper = new JLabel("SUPER", SwingConstants.CENTER);
        labelSuper.setFont(new Font("Arial", Font.BOLD, 16));

        Dimension textFieldSize = new Dimension(100, 40); // Zmniejszona szerokość, zwiększona wysokość
        field1.setPreferredSize(textFieldSize);
        field2.setPreferredSize(textFieldSize);
        field3.setPreferredSize(textFieldSize);

        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        button1.setFocusPainted(false);
        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.WHITE);
        button2.setFocusPainted(false);
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

        button3.setBackground(Color.BLUE);
        button3.setForeground(Color.WHITE);
        button3.setFocusPainted(false);
        button3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

        leftPanel.add(label1, gbcLeft);
        leftPanel.add(field1, gbcLeft);
        leftPanel.add(button1, gbcLeft);
        leftPanel.add(label2, gbcLeft);
        leftPanel.add(field2, gbcLeft);
        leftPanel.add(button2, gbcLeft);
        leftPanel.add(label3, gbcLeft);
        leftPanel.add(field3, gbcLeft);
        leftPanel.add(button3, gbcLeft);
        leftPanel.add(labelSuper, gbcLeft);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 2;
        gbc.weighty = 2;
        centerPanel.add(leftPanel, gbc);

// Trzy małe prostokąty
        JPanel smallPanel1 = new JPanel();
        smallPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        weatherLabel = new JLabel(
                "<html><span style='font-size:24px;'>Pogoda</span><br><span style='font-size:18px;'>"+s.getCity()+"<br></span><br><span style='font-size:16px;'>"+s.getWeather(s.getCity())+"</span></html>"
        );
        smallPanel1.add(weatherLabel);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        centerPanel.add(smallPanel1, gbc);

        JPanel smallPanel2 = new JPanel();
        smallPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rateLabel = new JLabel(
                "<html><span style='font-size:24px;'>Kurs:</span> <br><span style='font-size:18px;'>"+s.getWaluta()+"/"+s.countrySkr+"</span><br><br><span style='font-size:18px;'>"+s.getRateFor(s.getWaluta())+"</span></html>"
        );

        smallPanel2.add(rateLabel);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        centerPanel.add(smallPanel2, gbc);

        JPanel smallPanel3 = new JPanel();
        smallPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nbpLabel = new JLabel("<html><span style='font-size:24px;'>Kurs NBP:</span> <br><br><span style='font-size:18px;'>"+s.getNBPRate()+"</span></html>");
        smallPanel3.add(nbpLabel);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        centerPanel.add(smallPanel3, gbc);

// Dolny duży prostokąt
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JFXPanel fxPanel = new JFXPanel();

        bottomPanel.add(fxPanel);

// JavaFX
        Platform.runLater(() -> {
            webView = new WebView();
            webView.getEngine().load("https://en.wikipedia.org/wiki/"+s.getCountry());
            Scene scene = new Scene(webView);
            fxPanel.setScene(scene);
        });

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 3;
        gbc.weighty = 2;
        centerPanel.add(bottomPanel, gbc);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        //AKcja przycisku

        button1.addActionListener(e -> {
            textCountry = field1.getText();
            String tmp = s.getCountry();
            try {
                s.setCountry(textCountry);
                changeAll(s,labelSuper);
                System.out.println(s.getCountry());
                Platform.runLater(() -> {
                    webView = new WebView();
                    webView.getEngine().load("https://en.wikipedia.org/wiki/"+s.getCountry());
                    Scene scene = new Scene(webView);
                    fxPanel.setScene(scene);
                });
            } catch (Exception ex) {
                s.setCountry(tmp);
            }
        });

        button2.addActionListener(e -> {
            textCity = field2.getText();
            String tmp = s.getCity();
            try {
                s.setCity(textCity);
                changeAll(s,labelSuper);
            } catch (Exception ex) {
                s.setCity(tmp);
                System.out.println(s.getCity());
            }
        });

        button3.addActionListener(e -> {
            textRate = field3.getText();
            String tmp = s.getWaluta();
            try {
                s.setWaluta(textRate);
                changeAll(s,labelSuper);
            } catch (Exception ex) {
                s.setWaluta(tmp);
            }
        });
    }
    public void changeAll(Service s,JLabel jLabelSuper) throws Exception {
        Boolean isOk = true;
        if (s.getRateFor(s.getWaluta())==2.0) {
            jLabelSuper.setText("API nie ma takiej waluty: "+s.getWaluta());
            isOk=false;
            throw new Exception();
        }else if (s.getRateFor(s.getWaluta())==0.0){
            jLabelSuper.setText("API nie ma kraju: "+s.getCountry());
            isOk=false;
        }else {
            Double rate = s.getRateFor(s.getWaluta());
            rateLabel.setText("<html><span style='font-size:24px;'>Kurs:</span> <br><span style='font-size:18px;'>"+s.getWaluta()+"/"+s.countrySkr+"</span><br><br><span style='font-size:18px;'>"+rate+"</span></html>");
            countryLabel.setText("KRAJ: "+s.getCountry());
        }
        if (s.getNBPRate()==0.0) {
            jLabelSuper.setText("W API NBP nie ma kraju: "+s.getCountry());
            nbpLabel.setText("<html><span style='font-size:24px;'>BRAK</span> <br><span style='font-size:18px;'> DANYCH </span></html>");
            isOk=false;
        } else {
            nbpLabel.setText("<html><span style='font-size:24px;'>Kurs NBP:</span> <br><br><span style='font-size:18px;'>"+s.getNBPRate()+"</span></html>");
        }
        if (s.getWeather(s.getCity())==null) {
            jLabelSuper.setText("Pogodowe API nie ma miasta: "+s.getCity());
            throw new Exception();
        } else {
            weatherLabel.setText("<html><span style='font-size:24px;'>Pogoda</span><br><span style='font-size:18px;'>"+s.getCity()+"<br></span><br><span style='font-size:16px;'>"+s.getWeather(s.getCity())+"</span></html>");
            cityLabel.setText("MIASTO: "+s.getCity());
            jLabelSuper.setText("Zmiany zapisane");
        }

        if (isOk) {
            jLabelSuper.setText("Zmiany zapisane");
        }

    }
}