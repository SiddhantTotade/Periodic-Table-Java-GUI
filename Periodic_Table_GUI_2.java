import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.event.*;
import java.awt.*;

/* This is Simple (Intermidate Level) GUI code of PERIODIC TABLE.
Just click on one of the ELEMENTS and view the Information of that ELEMENT. 
Also this GUI has a Feature that Connects you to the WEB (Wikipedia) for more Information of ELEMENTS.*/

// Making connection for the WEB(Wikipedia).
public class Periodic_Table_GUI_2 extends JPanel {
    public static void Open(String URL) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {

        // Frame
        JFrame F = new JFrame("Periodic Table");
        // Option Panel (Shows the inner content)
        JOptionPane O = new JOptionPane();
        // Toggle Button (ON and OFF for see ELEMENTS on web and local computer)
        JToggleButton T = new JToggleButton();
        // Labels (It shows the working of Labels)
        JLabel L = new JLabel("What's This..?");

        // // Magic Frame Settings (Uncomment it and See, but don't forget to comment the Last Code which is at the End of Program.)
        // ImageIcon Img = new ImageIcon("Periodic1.png");
        // F.setIconImage(Img.getImage());
        // F.setSize(1300, 550);
        // F.setLocationRelativeTo(null);
        // F.setLayout(null);
        // F.setVisible(true);
        // F.getContentPane().setBackground(Color.BLACK);
        // F.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // About Button
        JButton JAb = new JButton("About");
        JAb.setBackground(Color.PINK);
        JAb.setBounds(1188, 470, 68, 20);
        JAb.setFocusPainted(false);
        // JAb.setBorderPainted(false);
        JAb.setBackground(Color.BLACK);
        JAb.setForeground(Color.WHITE);
        F.add(JAb);
        JAb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                O.showMessageDialog(F, "This GUI is made by SIDDHANT TOTADE", "About", JOptionPane.PLAIN_MESSAGE);
            }
        });
        // Labels for the Groups of PERIODIC TABLE.
        JLabel G1 = new JLabel("1"); // Creating JLabel for Groups
        G1.setForeground(Color.WHITE); // Setting Foreground Color (Text Color)
        G1.setBounds(59, -9, 100, 100); // Setting Postion, width, Height of Label
        F.add(G1); // Adding in the Frame
        JLabel G2 = new JLabel("2");
        G2.setForeground(Color.WHITE);
        G2.setBounds(127, 35, 100, 100);
        F.add(G2);
        JLabel G3 = new JLabel("3");
        G3.setForeground(Color.WHITE);
        G3.setBounds(195, 120, 100, 100);
        F.add(G3);
        JLabel G4 = new JLabel("4");
        G4.setForeground(Color.WHITE);
        G4.setBounds(263, 120, 100, 100);
        F.add(G4);
        JLabel G5 = new JLabel("5");
        G5.setForeground(Color.WHITE);
        G5.setBounds(331, 120, 100, 100);
        F.add(G5);
        JLabel G6 = new JLabel("6");
        G6.setForeground(Color.WHITE);
        G6.setBounds(399, 120, 100, 100);
        F.add(G6);
        JLabel G7 = new JLabel("7");
        G7.setForeground(Color.WHITE);
        G7.setBounds(467, 120, 100, 100);
        F.add(G7);
        JLabel G8 = new JLabel("8");
        G8.setForeground(Color.WHITE);
        G8.setBounds(535, 120, 100, 100);
        F.add(G8);
        JLabel G9 = new JLabel("9");
        G9.setForeground(Color.WHITE);
        G9.setBounds(603, 120, 100, 100);
        F.add(G9);
        JLabel G10 = new JLabel("10");
        G10.setForeground(Color.WHITE);
        G10.setBounds(666, 120, 100, 100);
        F.add(G10);
        JLabel G11 = new JLabel("11");
        G11.setForeground(Color.WHITE);
        G11.setBounds(734, 120, 100, 100);
        F.add(G11);
        JLabel G12 = new JLabel("12");
        G12.setForeground(Color.WHITE);
        G12.setBounds(802, 120, 100, 100);
        F.add(G12);
        JLabel G13 = new JLabel("13");
        G13.setForeground(Color.WHITE);
        G13.setBounds(870, 35, 100, 100);
        F.add(G13);
        JLabel G14 = new JLabel("14");
        G14.setForeground(Color.WHITE);
        G14.setBounds(938, 35, 100, 100);
        F.add(G14);
        JLabel G15 = new JLabel("15");
        G15.setForeground(Color.WHITE);
        G15.setBounds(1006, 35, 100, 100);
        F.add(G15);
        JLabel G16 = new JLabel("16");
        G16.setForeground(Color.WHITE);
        G16.setBounds(1074, 35, 100, 100);
        F.add(G16);
        JLabel G17 = new JLabel("17");
        G17.setForeground(Color.WHITE);
        G17.setBounds(1142, 35, 100, 100);
        F.add(G17);
        JLabel G18 = new JLabel("18");
        G18.setForeground(Color.WHITE);
        G18.setBounds(1215, -9, 100, 100);
        F.add(G18);

        // Labels for the Periods of PERIODIC TABLE.
        JLabel P1 = new JLabel("1");// Creating JLabel for Period
        P1.setForeground(Color.WHITE); // Setting Foreground Color (Text Color)
        P1.setBounds(20, 20, 100, 100); // Setting Postion, width, Height of Label
        F.add(P1); // Adding Label in the Frame
        JLabel P2 = new JLabel("2");
        P2.setForeground(Color.WHITE);
        P2.setBounds(20, 65, 100, 100);
        F.add(P2);
        JLabel P3 = new JLabel("3");
        P3.setForeground(Color.WHITE);
        P3.setBounds(20, 105, 100, 100);
        F.add(P3);
        JLabel P4 = new JLabel("4");
        P4.setForeground(Color.WHITE);
        P4.setBounds(20, 150, 100, 100);
        F.add(P4);
        JLabel P5 = new JLabel("5");
        P5.setForeground(Color.WHITE);
        P5.setBounds(20, 192, 100, 100);
        F.add(P5);
        JLabel P6 = new JLabel("6");
        P6.setForeground(Color.WHITE);
        P6.setBounds(20, 235, 100, 100);
        F.add(P6);
        JLabel P7 = new JLabel("7");
        P7.setForeground(Color.WHITE);
        P7.setBounds(20, 280, 100, 100);
        F.add(P7);

        // Labels for showing the type of element.
        JLabel LRN = new JLabel("Reactive Nonmetals"); // Creating JLabel for ELEMENTS Type
        LRN.setForeground(Color.WHITE); // Setting Foreground Color (Text Color)
        LRN.setBounds(325, -23, 120, 100); // Setting Postion, width, Height of Label
        F.add(LRN); // Adding Label in the Frame
        JLabel LAM = new JLabel("Alkali Metals");
        LAM.setForeground(Color.WHITE);
        LAM.setBounds(325, 8, 100, 100);
        F.add(LAM);
        JLabel LAeM = new JLabel("Alkaline Earth Metals");
        LAeM.setForeground(Color.WHITE);
        LAeM.setBounds(325, 38, 120, 100);
        F.add(LAeM);
        JLabel LTM = new JLabel("Transition Metals");
        LTM.setForeground(Color.WHITE);
        LTM.setBounds(325, 68, 100, 100);
        F.add(LTM);
        JLabel LPtM = new JLabel("Post Transition Metals");
        LPtM.setForeground(Color.WHITE);
        LPtM.setBounds(325, 98, 130, 100);
        F.add(LPtM);
        JLabel LM = new JLabel("Metalloids");
        LM.setForeground(Color.WHITE);
        LM.setBounds(525, -23, 100, 100);
        F.add(LM);
        JLabel LNG = new JLabel("Noble Gases");
        LNG.setForeground(Color.WHITE);
        LNG.setBounds(525, 8, 100, 100);
        F.add(LNG);
        JLabel LA = new JLabel("Actinoids");
        LA.setForeground(Color.WHITE);
        LA.setBounds(525, 38, 100, 100);
        F.add(LA);
        JLabel LL = new JLabel("Lantanoids");
        LL.setForeground(Color.WHITE);
        LL.setBounds(525, 68, 100, 100);
        F.add(LL);
        JLabel LH = new JLabel("Halogens");
        LH.setForeground(Color.WHITE);
        LH.setBounds(525, 98, 100, 100);
        F.add(LH);

        // Buttons for show which type of element is that.
        JButton BRN = new JButton(); // Cretaing Buttons for ELEMENT Type
        BRN.setBackground(Color.RED); // Setting color for Button
        BRN.setBounds(300, 20, 15, 15); // Setting Position, Width, Height
        BRN.setFocusPainted(false); // Remove the lines around button
        BRN.setBorderPainted(false);
        F.add(BRN); // Adding Button in the Frame
        JButton BAM = new JButton();
        BAM.setBackground(Color.PINK);
        BAM.setBounds(300, 50, 15, 15);
        BAM.setFocusPainted(false);
        BAM.setBorderPainted(false);
        F.add(BAM);
        JButton BAeM = new JButton();
        BAeM.setBackground(Color.ORANGE);
        BAeM.setBounds(300, 80, 15, 15);
        BAeM.setFocusPainted(false);
        BAeM.setBorderPainted(false);
        F.add(BAeM);
        JButton BTM = new JButton();
        BTM.setBackground(Color.CYAN);
        BTM.setBounds(300, 110, 15, 15);
        BTM.setFocusPainted(false);
        BTM.setBorderPainted(false);
        F.add(BTM);
        JButton BPtM = new JButton();
        BPtM.setBackground(Color.GREEN.darker());
        BPtM.setBounds(300, 140, 15, 15);
        BPtM.setFocusPainted(false);
        BPtM.setBorderPainted(false);
        F.add(BPtM);
        JButton BM = new JButton();
        BM.setBackground(Color.YELLOW);
        BM.setBounds(500, 20, 15, 15);
        BM.setFocusPainted(false);
        BM.setBorderPainted(false);
        F.add(BM);
        JButton BH = new JButton();
        BH.setBackground(Color.MAGENTA);
        BH.setBounds(500, 50, 15, 15);
        BH.setFocusPainted(false);
        BH.setBorderPainted(false);
        F.add(BH);
        JButton BNG = new JButton();
        BNG.setBackground(Color.BLUE.darker());
        BNG.setBounds(500, 80, 15, 15);
        BNG.setFocusPainted(false);
        BNG.setBorderPainted(false);
        F.add(BNG);
        JButton BL = new JButton();
        BL.setBackground(Color.MAGENTA.darker());
        BL.setBounds(500, 110, 15, 15);
        BL.setFocusPainted(false);
        BL.setBorderPainted(false);
        F.add(BL);
        JButton BA = new JButton();
        BA.setBackground(Color.LIGHT_GRAY.darker());
        BA.setBounds(500, 140, 15, 15);
        BA.setFocusPainted(false);
        BA.setBorderPainted(false);
        F.add(BA);

        // Group - 1 : Elements
        JButton B1 = new JButton("H"); // Creating Button for 1st Element
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                // setting the Button Operation (if it is TRUE then show Information on WEB and
                // if it is FALSE the show the Local Information.)
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Hydrogen");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Henry Cavendish in 1766\nElement - Hydrogen\nSymbol - H\nGroup - 1\nPeriod - 1\nBlock - S\nAtomic Number - 1\nAtomic Mass - 1.008 u\nDensity (g/cm3) - 0.000082\nBoiling Point -  -252.879 C, -423.182 F, 20.271 K\nMelting Point -  -259.16 C, -434.49 F, 13.99 K",
                            "Hydrogen (H)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B1.setFont(new Font("Serif", Font.BOLD, 20)); // Setting of Font and Font size
        B1.setBackground(Color.BLACK); // Background Color of Button.
        B1.setForeground(Color.RED); // Foregroung Color of Button (H in Red Color)
        B1.setBounds(30, 50, 65, 40); // Setting Position, Width, Height of Button
        B1.setFocusPainted(false); // Remove the lines around Button
        F.add(B1); // Adding Button in the Frame
        JButton B3 = new JButton("Li");
        B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Lithium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Johan August Arfvedson in 1817\nElement - Lithium\nSymbol - Li\nGroup - 1\nPeriod - 2\nBlock - S\nAtomic Number - 3\nAtomic Mass - 6.94 u\nDensity (g/cm3) - 0.534\nBoiling Point -  1342 C, 2448 F, 1615 K\nMelting Point - 180.50 C, 356.90 F, 453.65 K",
                            "Lithium (Li)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B3.setFont(new Font("Serif", Font.BOLD, 20));
        B3.setBackground(Color.BLACK);
        B3.setForeground(Color.PINK);
        B3.setBounds(30, 93, 65, 40);
        B3.setFocusPainted(false);
        F.add(B3);
        JButton B11 = new JButton("Na");
        B11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Sodium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Humphry Davy in 1807\nElement - Sodium\nSymbol - Na\nGroup - 1\nPeriod - 3\nBlock - S\nAtomic Number - 11\nAtomic Mass - 22.990 u\nDensity (g/cm3) - 0.97\nBoiling Point -  882.940 C, 1621.292 F, 1156.090 K\nMelting Point -  97.794 C, 208.029 F, 370.944 K",
                            "Sodium (Na)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B11.setFont(new Font("Serif", Font.BOLD, 20));
        B11.setBackground(Color.BLACK);
        B11.setForeground(Color.PINK);
        B11.setBounds(30, 136, 65, 40);
        B11.setFocusPainted(false);
        F.add(B11);
        JButton B19 = new JButton("K");
        B19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Potassium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Humphry Davy in 1807\nElement - Potassium\nSymbol - K\nGroup - 1\nPeriod - 4\nBlock - S\nAtomic Number - 19\nAtomic Mass - 39.098 u\nDensity (g/cm3) - 0.89\nBoiling Point -  759 C, 1398 F, 1032 K\nMelting Point -  63.5 C, 146.3 F, 336.7 K",
                            "Potassium (K)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B19.setFont(new Font("Serif", Font.BOLD, 20));
        B19.setBackground(Color.BLACK);
        B19.setForeground(Color.PINK);
        B19.setBounds(30, 179, 65, 40);
        B19.setFocusPainted(false);
        F.add(B19);
        JButton B37 = new JButton("Rb");
        B37.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Rubidium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Gustav Kirchhoff and Robert Bunsen in 1861\nElement - Rubidium\nSymbol - Rb\nGroup - 1\nPeriod - 5\nBlock - S\nAtomic Number - 37\nAtomic Mass - 85.468 u\nDensity (g/cm3) - 1.53\nBoiling Point -  688 C, 1270 F, 961 K \nMelting Point -  39.30 C, 102.74 F, 312.45 K",
                            "Rubidium (Rb)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B37.setFont(new Font("Serif", Font.BOLD, 20));
        B37.setBackground(Color.BLACK);
        B37.setForeground(Color.PINK);
        B37.setBounds(30, 222, 65, 40);
        B37.setFocusPainted(false);
        F.add(B37);
        JButton B55 = new JButton("Cs");
        B55.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Caesium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Gustav Kirchhoff and Robert Bunsen in 1860\nElement - Caesium\nSymbol - Cs\nGroup - 1\nPeriod - 6\nBlock - S\nAtomic Number - 55\nAtomic Mass - 132.905 u\nDensity (g/cm3) - 1.873\nBoiling Point -  671 C, 1240 F, 944 K\nMelting Point -  28.5 C, 83.3 F, 301.7 K",
                            "Caesium (Cs)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B55.setFont(new Font("Serif", Font.BOLD, 20));
        B55.setBackground(Color.BLACK);
        B55.setForeground(Color.PINK);
        B55.setBounds(30, 265, 65, 40);
        B55.setFocusPainted(false);
        F.add(B55);
        JButton B87 = new JButton("Fr");
        B87.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Francium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Marguerite Perey in 1939\nElement - Francium\nSymbol - Fr\nGroup - 1\nPeriod - 7\nBlock - S\nAtomic Number - 87\nAtomic Mass - [223] u\nDensity (g/cm3) - 2.48 (estimated)\nBoiling Point -  650 C, 1202 F, 923 K\nMelting Point -  21 C, 70 F, 294 K",
                            "Francium (Fr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B87.setFont(new Font("Serif", Font.BOLD, 20));
        B87.setBackground(Color.BLACK);
        B87.setForeground(Color.PINK);
        B87.setBounds(30, 308, 65, 40);
        B87.setFocusPainted(false);
        F.add(B87);

        // Group - 2 : Elements
        JButton B4 = new JButton("Be");
        B4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Beryllium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Nicholas Louis Vauquelin in 1797\nElement - Beryllium\nSymbol - Be\nGroup - 2\nPeriod - 2\nBlock - S\nAtomic Number - 4\nAtomic Mass - 9.012 u\nDensity (g/cm3) - 1.85\nBoiling Point -  2468 C, 4474 F, 2741 K\nMelting Point - 1287 C, 2349 F, 1560 K",
                            "Beryllium (Be)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B4.setFont(new Font("Serif", Font.BOLD, 20));
        B4.setBackground(Color.BLACK);
        B4.setForeground(Color.ORANGE);
        B4.setBounds(98, 93, 65, 40);
        B4.setFocusPainted(false);
        F.add(B4);
        JButton B12 = new JButton("Mg");
        B12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Magnesium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Joseph Black in 1755\nElement - Magnesium\nSymbol - Mg\nGroup - 2\nPeriod - 3\nBlock - S\nAtomic Number - 12\nAtomic Mass - 24.305 u\nDensity (g/cm3) - 1.74\nBoiling Point -  1090 C, 1994 F, 1363 K\nMelting Point -  650 C, 1202 F, 923 K",
                            "Magnesium (Mg)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B12.setFont(new Font("Serif", Font.BOLD, 20));
        B12.setBackground(Color.BLACK);
        B12.setForeground(Color.ORANGE);
        B12.setBounds(98, 136, 65, 40);
        B12.setFocusPainted(false);
        F.add(B12);
        JButton B20 = new JButton("Ca");
        B20.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Calcium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Humphry Davy in 1808\nElement - Calcium\nSymbol - Ca\nGroup - 2\nPeriod - 4\nBlock - S\nAtomic Number - 20\nAtomic Mass - 40.078 u\nDensity (g/cm3) - 1.54\nBoiling Point -  1484 C, 2703 F, 1757 K\nMelting Point -  842 C, 1548 F, 1115 K",
                            "Calcium (Ca)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B20.setFont(new Font("Serif", Font.BOLD, 20));
        B20.setBackground(Color.BLACK);
        B20.setForeground(Color.ORANGE);
        B20.setBounds(98, 179, 65, 40);
        B20.setFocusPainted(false);
        F.add(B20);
        JButton B38 = new JButton("Sr");
        B38.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Scrontium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Adair Crawford in 1790\nElement - Scrontium\nSymbol - Sr\nGroup - 2\nPeriod - 5\nBlock - S\nAtomic Number - 38\nAtomic Mass - 87.62 u\nDensity (g/cm3) - 2.64\nBoiling Point -  1377 C, 2511 F, 1650 K\nMelting Point -  777 C, 1431 F, 1050 K",
                            "Scrontium (Sr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B38.setFont(new Font("Serif", Font.BOLD, 20));
        B38.setBackground(Color.BLACK);
        B38.setForeground(Color.ORANGE);
        B38.setBounds(98, 222, 65, 40);
        B38.setFocusPainted(false);
        F.add(B38);
        JButton B56 = new JButton("Ba");
        B56.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Barium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Humphry Davy in 1808\nElement - Barium\nSymbol - Ba\nGroup - 2\nPeriod - 6\nBlock - S\nAtomic Number - 56\nAtomic Mass - 137.327 u\nDensity (g/cm3) - 3.62\nBoiling Point -  1845 C, 3353 F, 2118 K\nMelting Point -  727 C, 1341 F, 1000 K",
                            "Barium (Ba)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B56.setFont(new Font("Serif", Font.BOLD, 20));
        B56.setBackground(Color.BLACK);
        B56.setForeground(Color.ORANGE);
        B56.setBounds(98, 265, 65, 40);
        B56.setFocusPainted(false);
        F.add(B56);
        JButton B88 = new JButton("Ra");
        B88.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Radium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Pierre and Marie Curie in 1898\nElement - Radium\nSymbol - Ra\nGroup - 2\nPeriod - 7\nBlock - S\nAtomic Number - 88\nAtomic Mass - [226] u\nDensity (g/cm3) - 5\nBoiling Point -  1500 C, 2732 F, 1773 K\nMelting Point -  696 C, 1285 F, 969 K",
                            "Radium (Ra)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B88.setFont(new Font("Serif", Font.BOLD, 20));
        B88.setBackground(Color.BLACK);
        B88.setForeground(Color.ORANGE);
        B88.setBounds(98, 308, 65, 40);
        B88.setFocusPainted(false);
        F.add(B88);

        // Group - 3 : Elements
        JButton B21 = new JButton("Sc");
        B21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Scandium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Lars Frederik Nilson in 1879\nElement - Scandium\nSymbol - Sc\nGroup - 3\nPeriod - 4\nBlock - D\nAtomic Number - 21\nAtomic Mass - 44.956 u\nDensity (g/cm3) - 2.99\nBoiling Point -  2836 C, 5137 F, 3109 K\nMelting Point -  1541 C, 2806 F, 1814 K",
                            "Scandium (Sc)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B21.setFont(new Font("Serif", Font.BOLD, 20));
        B21.setBackground(Color.BLACK);
        B21.setForeground(Color.CYAN);
        B21.setBounds(166, 179, 65, 40);
        B21.setFocusPainted(false);
        F.add(B21);
        JButton B39 = new JButton("Y");
        B39.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Yttrium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Johan Gadolin in 1794\nElement - Yttrium\nSymbol - Y\nGroup - 3\nPeriod - 5\nBlock - D\nAtomic Number - 39\nAtomic Mass - 88.906 u\nDensity (g/cm3) - 4.47\nBoiling Point -  3345 C, 6053 F, 3618 K\nMelting Point -  1522 C, 2772 F, 1795 K",
                            "Yttrium (Y)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B39.setFont(new Font("Serif", Font.BOLD, 20));
        B39.setBackground(Color.BLACK);
        B39.setForeground(Color.CYAN);
        B39.setBounds(166, 222, 65, 40);
        B39.setFocusPainted(false);
        F.add(B39);
        JButton BLan = new JButton("*");
        BLan.setFont(new Font("Serif", Font.BOLD, 20));
        BLan.setBackground(Color.BLACK);
        BLan.setForeground(Color.MAGENTA.darker());
        BLan.setBounds(166, 265, 65, 40);
        BLan.setFocusPainted(false);
        F.add(BLan);
        JButton BAct = new JButton("* *");
        BAct.setFont(new Font("Serif", Font.BOLD, 20));
        BAct.setBackground(Color.BLACK);
        BAct.setForeground(Color.BLUE);
        BAct.setBounds(166, 308, 65, 40);
        BAct.setFocusPainted(false);
        F.add(BAct);
        JButton B57 = new JButton("La");
        B57.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Lanthanum");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carl Gustav Mosander in 1839\nElement - Lanthanum\nSymbol - La\nGroup - Lanthanides\nPeriod - 6\nBlock - D\nAtomic Number - 57\nAtomic Mass - 138.905 u\nDensity (g/cm3) - 6.15\nBoiling Point -  3464 C, 6267 F, 3737 K\nMelting Point -  920 C, 1688 F, 1193 K",
                            "Lanthanum (La)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B57.setFont(new Font("Serif", Font.BOLD, 20));
        B57.setBackground(Color.BLACK);
        B57.setForeground(Color.MAGENTA.darker());
        B57.setBounds(166, 370, 65, 40);
        B57.setFocusPainted(false);
        F.add(B57);
        JButton B89 = new JButton("Ac");
        B89.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Actinium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Andrew Debierne in 1899\nElement - Actinium\nSymbol - Ac\nGroup - Actinides\nPeriod - 7\nBlock - D\nAtomic Number - 89\nAtomic Mass - [227] u\nDensity (g/cm3) - 10\nBoiling Point -  3200 C, 5792 F, 3473 K\nMelting Point -  1050 C, 1922 F, 1323 K",
                            "Actinium (Ac)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B89.setFont(new Font("Serif", Font.BOLD, 20));
        B89.setBackground(Color.BLACK);
        B89.setForeground(Color.BLUE);
        B89.setBounds(166, 413, 65, 40);
        B89.setFocusPainted(false);
        F.add(B89);

        // Group - 4 : Elements
        JButton B22 = new JButton("Ti");
        B22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Titanium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - William Gregor in 1791\nElement - Titanium\nSymbol - Ti\nGroup - 4\nPeriod - 4\nBlock - D\nAtomic Number - 22\nAtomic Mass - 47.867 u\nDensity (g/cm3) - 4.506\nBoiling Point -  3287 C, 5949 F, 3560 K\nMelting Point -  1670 C, 3038 F, 1943 K",
                            "Titanium (Ti)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B22.setFont(new Font("Serif", Font.BOLD, 20));
        B22.setBackground(Color.BLACK);
        B22.setForeground(Color.CYAN);
        B22.setBounds(234, 179, 65, 40);
        B22.setFocusPainted(false);
        F.add(B22);
        JButton B40 = new JButton("Zr");
        B40.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Ziconium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Martin Heinrich Klaproth in 1789\nElement - Zirconium\nSymbol - Zr\nGroup - 4\nPeriod - 5\nBlock - D\nAtomic Number - 40\nAtomic Mass - 91.224 u\nDensity (g/cm3) - 6.52\nBoiling Point -  4406 C, 7963 F, 4679 K\nMelting Point -  1854 C, 3369 F, 2127 K",
                            "Zirconium (Zr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B40.setFont(new Font("Serif", Font.BOLD, 20));
        B40.setBackground(Color.BLACK);
        B40.setForeground(Color.CYAN);
        B40.setBounds(234, 222, 65, 40);
        B40.setFocusPainted(false);
        F.add(B40);
        JButton B58 = new JButton("Ce");
        B58.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Cerium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jons Jacob Berzelius and Wilhelm Hisinger in 1803\nElement - Cerium\nSymbol - Ce\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 58\nAtomic Mass - 140.116 u\nDensity (g/cm3) - 6.77\nBoiling Point -  3443 C, 6229 F, 3716 K\nMelting Point -  799 C, 1470 F, 1072 K",
                            "Cerium (Ce)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B58.setFont(new Font("Serif", Font.BOLD, 20));
        B58.setBackground(Color.BLACK);
        B58.setForeground(Color.MAGENTA.darker());
        B58.setBounds(234, 370, 65, 40);
        B58.setFocusPainted(false);
        F.add(B58);
        JButton B72 = new JButton("Hf");
        B72.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Hafnium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - George Charles de Hevesy and Dirk Coster in 1923\nElement - Hafnium\nSymbol - Hf\nGroup - 4\nPeriod - 6\nBlock - D\nAtomic Number - 72\nAtomic Mass - 178.486 u\nDensity (g/cm3) - 13.3\nBoiling Point -  4600 C, 8312 F, 4873 K\nMelting Point -  2233 C, 4051 F, 2506 K",
                            "Hafnium (Hf)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B72.setFont(new Font("Serif", Font.BOLD, 20));
        B72.setBackground(Color.BLACK);
        B72.setForeground(Color.CYAN);
        B72.setBounds(234, 265, 65, 40);
        B72.setFocusPainted(false);
        F.add(B72);
        JButton B90 = new JButton("Th");
        B90.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Thorium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jons Jacob Berzelius in 1829\nElement - Thorium\nSymbol - Th\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 90\nAtomic Mass - 232.038 u\nDensity (g/cm3) - 11.7\nBoiling Point -  4785 C, 8645 F, 5058 K\nMelting Point -  1750 C, 3182 F, 2023 K",
                            "Thorium (Th)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B90.setFont(new Font("Serif", Font.BOLD, 20));
        B90.setBackground(Color.BLACK);
        B90.setForeground(Color.BLUE);
        B90.setBounds(234, 413, 65, 40);
        B90.setFocusPainted(false);
        F.add(B90);
        JButton B104 = new JButton("Rf");
        B104.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Rutherfordium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Georgy Flerov and colleagues and at Dubna, near Moscow, Russia, and independently by Albert Ghiorso and colleagues at Berkeley, California, USA in 1964\nElement - Rutherfordium\nSymbol - Rf\nGroup - 4\nPeriod - 7\nBlock - D\nAtomic Number - 104\nAtomic Mass - [267] u\nDensity (g/cm3) - 23 \nBoiling Point -  5500 C, 9900 F, 5800 K\nMelting Point -  2100 C, 3800 F, 2400 K",
                            "Rutherfordium (Rf)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B104.setFont(new Font("Serif", Font.BOLD, 20));
        B104.setBackground(Color.BLACK);
        B104.setForeground(Color.CYAN);
        B104.setBounds(234, 308, 65, 40);
        B104.setFocusPainted(false);
        F.add(B104);

        // Group - 5 : Elements
        JButton B23 = new JButton("V");
        B23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Vanadium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Andres Manuel del Rio in 1801\nElement - Vanadium\nSymbol - V\nGroup - 5\nPeriod - 4\nBlock - D\nAtomic Number - 23\nAtomic Mass - 50.942 u\nDensity (g/cm3) - 6.0\nBoiling Point -  3407 C, 6165 F, 3680 K\nMelting Point -  1910 C, 3470 F, 2183 K",
                            "Vanadium (V)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B23.setFont(new Font("Serif", Font.BOLD, 20));
        B23.setBackground(Color.BLACK);
        B23.setForeground(Color.CYAN);
        B23.setBounds(302, 179, 65, 40);
        B23.setFocusPainted(false);
        F.add(B23);
        JButton B41 = new JButton("Nb");
        B41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Niobium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Charles Hatchett in 1801\nElement - Niobium\nSymbol - Nb\nGroup - 5\nPeriod - 5\nBlock - D\nAtomic Number - 41\nAtomic Mass - 92.906 u\nDensity (g/cm3) - 8.57\nBoiling Point -  4741 C, 8566 F, 5014 K\nMelting Point -  2477 C, 4491 F, 2750 K",
                            "Niobium (Nb)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B41.setFont(new Font("Serif", Font.BOLD, 20));
        B41.setBackground(Color.BLACK);
        B41.setForeground(Color.CYAN);
        B41.setBounds(302, 222, 65, 40);
        B41.setFocusPainted(false);
        F.add(B41);
        JButton B59 = new JButton("Pr");
        B59.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Praseodimium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carl Auer von Welsbach in 1885\nElement - Praseodymium\nSymbol - Pr\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 59\nAtomic Mass - 140.908 u\nDensity (g/cm3) - 6.77\nBoiling Point -  3520 C, 6368 F, 3793 K\nMelting Point -  931 C, 1708 F, 1204 K",
                            "Praseodymium (Pr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B59.setFont(new Font("Serif", Font.BOLD, 20));
        B59.setBackground(Color.BLACK);
        B59.setForeground(Color.MAGENTA.darker());
        B59.setBounds(302, 370, 65, 40);
        B59.setFocusPainted(false);
        F.add(B59);
        JButton B73 = new JButton("Ta");
        B73.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Tantalum");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Anders Gustav Ekeberg in 1802\nElement - Tantalum\nSymbol - Ta\nGroup - 5\nPeriod - 6\nBlock - D\nAtomic Number - 73\nAtomic Mass - 180.948 u\nDensity (g/cm3) - 16.4\nBoiling Point -  5455 C, 9851 F, 5728 K\nMelting Point -  3017 C, 5463 F, 3290 K",
                            "Tantalum (Ta)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B73.setFont(new Font("Serif", Font.BOLD, 20));
        B73.setBackground(Color.BLACK);
        B73.setForeground(Color.CYAN);
        B73.setBounds(302, 265, 65, 40);
        B73.setFocusPainted(false);
        F.add(B73);
        JButton B91 = new JButton("Pa");
        B91.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Protactinium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Kasimir Fajans and Otto Gohring in 1913\nElement - Protactinium\nSymbol - Pa\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 91\nAtomic Mass - 231.036 u\nDensity (g/cm3) - 15.4\nBoiling Point -  4000 C, 7232 F, 4273 K\nMelting Point -  1572 C, 2862 F, 1845 K",
                            "Protactinium (Pa)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B91.setFont(new Font("Serif", Font.BOLD, 20));
        B91.setBackground(Color.BLACK);
        B91.setForeground(Color.BLUE);
        B91.setBounds(302, 413, 65, 40);
        B91.setFocusPainted(false);
        F.add(B91);
        JButton B105 = new JButton("Db");
        B105.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Dubnium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists at both Berkeley, California, USA, and Dubna, near Moscow, Russia in 1968-1970\nElement - Dubnium\nSymbol - Db\nGroup - 5\nPeriod - 7\nBlock - D\nAtomic Number - 105\nAtomic Mass - [268] u\nDensity (g/cm3) - 21.6\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Dubnium (Db)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B105.setFont(new Font("Serif", Font.BOLD, 20));
        B105.setBackground(Color.BLACK);
        B105.setForeground(Color.CYAN);
        B105.setBounds(302, 308, 65, 40);
        B105.setFocusPainted(false);
        F.add(B105);

        // Group - 6 : Elements
        JButton B24 = new JButton("Cr");
        B24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Chromium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Nicholas Louis Vauquelin in 1798\nElement - Chromium\nSymbol - Cr\nGroup - 6\nPeriod - 4\nBlock - D\nAtomic Number - 24\nAtomic Mass - 51.996 u\nDensity (g/cm3) - 7.15\nBoiling Point -  2671 C, 4840 F, 2944 K\nMelting Point -  1907 C, 3465 F, 2180 K",
                            "Chromium (Cr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B24.setFont(new Font("Serif", Font.BOLD, 20));
        B24.setBackground(Color.BLACK);
        B24.setForeground(Color.CYAN);
        B24.setBounds(370, 179, 65, 40);
        B24.setFocusPainted(false);
        F.add(B24);
        JButton B42 = new JButton("Mo");
        B42.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Molybdenum");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Peter Jacob Hjelm in 1781\nElement - Molybdenum\nSymbol - Mo\nGroup - 6\nPeriod - 5\nBlock - D\nAtomic Number - 42\nAtomic Mass - 95.95 u\nDensity (g/cm3) - 10.2\nBoiling Point -  4639 C, 8382 F, 4912 K\nMelting Point -  2622 C, 4752 F, 2895 K",
                            "Molybdenum (Mo)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B42.setFont(new Font("Serif", Font.BOLD, 20));
        B42.setBackground(Color.BLACK);
        B42.setForeground(Color.CYAN);
        B42.setBounds(370, 222, 65, 40);
        B42.setFocusPainted(false);
        F.add(B42);
        JButton B60 = new JButton("Nd");
        B60.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Neodymium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carl Auer von Welsbach in 1885\nElement - Neodymium\nSymbol - Nd\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 60\nAtomic Mass - 144.242 u\nDensity (g/cm3) - 7.01\nBoiling Point -  3074 C, 5565 F, 3347 K\nMelting Point -  1016 C, 1861 F, 1289 K",
                            "Neodymium (Nd)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B60.setFont(new Font("Serif", Font.BOLD, 20));
        B60.setBackground(Color.BLACK);
        B60.setForeground(Color.MAGENTA.darker());
        B60.setBounds(370, 370, 65, 40);
        B60.setFocusPainted(false);
        F.add(B60);
        JButton B74 = new JButton("W");
        B74.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Tungsten");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Juan and Fausto Elhuyar in 1783\nElement - Tungsten\nSymbol - W\nGroup - 6\nPeriod - 6\nBlock - D\nAtomic Number - 74\nAtomic Mass - 183.84 u\nDensity (g/cm3) - 19.3\nBoiling Point -  5555 C, 10031 F, 5828 K\nMelting Point -  3414 C, 6177 F, 3687 K",
                            "Tungsten (W)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B74.setFont(new Font("Serif", Font.BOLD, 20));
        B74.setBackground(Color.BLACK);
        B74.setForeground(Color.CYAN);
        B74.setBounds(370, 265, 65, 40);
        B74.setFocusPainted(false);
        F.add(B74);
        JButton B92 = new JButton("U");
        B92.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Uranium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Martin Heinrich Klaproth in 1789\nElement - Uranium\nSymbol - U\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 92\nAtomic Mass - 238.029 u\nDensity (g/cm3) - 19.1\nBoiling Point -  4131 C, 7468 F, 4404 K\nMelting Point -  1135 C, 2075 F, 1408 K",
                            "Uranium (U)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B92.setFont(new Font("Serif", Font.BOLD, 20));
        B92.setBackground(Color.BLACK);
        B92.setForeground(Color.BLUE);
        B92.setBounds(370, 413, 65, 40);
        B92.setFocusPainted(false);
        F.add(B92);
        JButton B106 = new JButton("Sg");
        B106.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Seaborgium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Albert Ghiorso and colleagues in 1974\nElement - Seaborgium\nSymbol - Sg\nGroup - 6\nPeriod - 7\nBlock - D\nAtomic Number - 106\nAtomic Mass - [269] u\nDensity (g/cm3) - 23–24\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Seaborgium (Sg)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B106.setFont(new Font("Serif", Font.BOLD, 20));
        B106.setBackground(Color.BLACK);
        B106.setForeground(Color.CYAN);
        B106.setBounds(370, 308, 65, 40);
        B106.setFocusPainted(false);
        F.add(B106);

        // Group - 7 : Elements
        JButton B25 = new JButton("Mn");
        B25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Manganese");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Johan Gottlieb Gahn in 1774\nElement - Manganese\nSymbol - Mn\nGroup - 7\nPeriod - 4\nBlock - D\nAtomic Number - 25\nAtomic Mass - 54.938 u\nDensity (g/cm3) - 7.3\nBoiling Point -  2061 C, 3742 F, 2334 K\nMelting Point -  1246 C, 2275 F, 1519 K",
                            "Manganese (Mn)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B25.setFont(new Font("Serif", Font.BOLD, 20));
        B25.setBackground(Color.BLACK);
        B25.setForeground(Color.CYAN);
        B25.setBounds(438, 179, 65, 40);
        B25.setFocusPainted(false);
        F.add(B25);
        JButton B43 = new JButton("Tc");
        B43.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Technetium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carlo Perrier and Emilio Segre in 1937\nElement - Technetium\nSymbol - Tc\nGroup - 7\nPeriod - 5\nBlock - D\nAtomic Number - 43\nAtomic Mass - [98] u\nDensity (g/cm3) - 11\nBoiling Point -  4262 C, 7704 F, 4535 K\nMelting Point -  2157 C, 3915 F, 2430 K",
                            "Technetium (Tc)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B43.setFont(new Font("Serif", Font.BOLD, 20));
        B43.setBackground(Color.BLACK);
        B43.setForeground(Color.CYAN);
        B43.setBounds(438, 222, 65, 40);
        B43.setFocusPainted(false);
        F.add(B43);
        JButton B61 = new JButton("Pm");
        B61.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Promethium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jacob .A. Marinsky, Lawrence E. Glendenin, and Charles D. Coryell in 1945\nElement - Promethium\nSymbol - Pm\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 61\nAtomic Mass - [145] u\nDensity (g/cm3) - 7.26\nBoiling Point -  3000 C, 5432 F, 3273 K\nMelting Point -  1042 C, 1908 F, 1315 K",
                            "Promethium (Pm)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B61.setFont(new Font("Serif", Font.BOLD, 20));
        B61.setBackground(Color.BLACK);
        B61.setForeground(Color.MAGENTA.darker());
        B61.setBounds(438, 370, 65, 40);
        B61.setFocusPainted(false);
        F.add(B61);
        JButton B75 = new JButton("Re");
        B75.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Rhenium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Walter Noddack, Ida Tacke and Otto Berg in 1925\nElement - Rhenium\nSymbol - Re\nGroup - 7\nPeriod - 6\nBlock - D\nAtomic Number - 75\nAtomic Mass - 186.207 u\nDensity (g/cm3) - 20.8\nBoiling Point -  5590 C, 10094 F, 5863 K\nMelting Point -  3185 C, 5765 F, 3458 K",
                            "Rhenium (Re)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B75.setFont(new Font("Serif", Font.BOLD, 20));
        B75.setBackground(Color.BLACK);
        B75.setForeground(Color.CYAN);
        B75.setBounds(438, 265, 65, 40);
        B75.setFocusPainted(false);
        F.add(B75);
        JButton B93 = new JButton("Np");
        B93.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Neptunium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Edwin McMillan and Philip Abelson in 1940\nElement - Neptunium\nSymbol - Np\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 93\nAtomic Mass - [237] u\nDensity (g/cm3) - 20.2\nBoiling Point -  3902 C, 7056 F, 4175 K\nMelting Point -  644 C, 1191 F, 917 K",
                            "Neptunium (Np)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B93.setFont(new Font("Serif", Font.BOLD, 20));
        B93.setBackground(Color.BLACK);
        B93.setForeground(Color.BLUE);
        B93.setBounds(438, 413, 65, 40);
        B93.setFocusPainted(false);
        F.add(B93);
        JButton B107 = new JButton("Bh");
        B107.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Bohrium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1981\nElement - Bohrium\nSymbol - Bh\nGroup - 6\nPeriod - 7\nBlock - D\nAtomic Number - 107\nAtomic Mass - [270] u\nDensity (g/cm3) - 26 - 27\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Bohrium (Bh)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B107.setFont(new Font("Serif", Font.BOLD, 20));
        B107.setBackground(Color.BLACK);
        B107.setForeground(Color.CYAN);
        B107.setBounds(438, 308, 65, 40);
        B107.setFocusPainted(false);
        F.add(B107);

        // Group - 8 : Elements
        JButton B26 = new JButton("Fe");
        B26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Iron");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Known since ancient times (approx 3500BC)\nElement - Iron\nSymbol - Fe\nGroup - 8\nPeriod - 4\nBlock - D\nAtomic Number - 26\nAtomic Mass - 55.845 u\nDensity (g/cm3) - 7.87\nBoiling Point -  2861 C, 5182 F, 3134 K\nMelting Point -  1538 C, 2800 F, 1811 K",
                            "Iron (Fe)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B26.setFont(new Font("Serif", Font.BOLD, 20));
        B26.setBackground(Color.BLACK);
        B26.setForeground(Color.CYAN);
        B26.setBounds(506, 179, 65, 40);
        B26.setFocusPainted(false);
        F.add(B26);
        JButton B44 = new JButton("Ru");
        B44.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Ruthenium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Karl Karlovich Klaus in 1844\nElement - Ruthenium\nSymbol - Ru\nGroup - 8\nPeriod - 5\nBlock - D\nAtomic Number - 44\nAtomic Mass - 101.07 u\nDensity (g/cm3) - 12.1\nBoiling Point -  4147 C, 7497 F, 4420 K\nMelting Point -  2333 C, 4231 F, 2606 K",
                            "Ruthenium (Ru)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B44.setFont(new Font("Serif", Font.BOLD, 20));
        B44.setBackground(Color.BLACK);
        B44.setForeground(Color.CYAN);
        B44.setBounds(506, 222, 65, 40);
        B44.setFocusPainted(false);
        F.add(B44);
        JButton B62 = new JButton("Sm");
        B62.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Samarium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Paul-Emile Lecoq de Boisbaudran in 1879\nElement - Samarium\nSymbol - Sm\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 62\nAtomic Mass - 150.36 u\nDensity (g/cm3) - 7.52\nBoiling Point -  1794 C, 3261 F, 2067 K\nMelting Point -  1072 C, 1962 F, 1345 K",
                            "Samarium (Sm)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B62.setFont(new Font("Serif", Font.BOLD, 20));
        B62.setBackground(Color.BLACK);
        B62.setForeground(Color.MAGENTA.darker());
        B62.setBounds(506, 370, 65, 40);
        B62.setFocusPainted(false);
        F.add(B62);
        JButton B76 = new JButton("Os");
        B76.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Osmium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Smithson Tennant in 1803\nElement - Osmium\nSymbol - Os\nGroup - 8\nPeriod - 6\nBlock - D\nAtomic Number - 76\nAtomic Mass - 190.23 u\nDensity (g/cm3) - 22.5872\nBoiling Point -  5008 C, 9046 F, 5281 K\nMelting Point -  3033 C, 5491 F, 3306 K",
                            "Osmium (Os)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B76.setFont(new Font("Serif", Font.BOLD, 20));
        B76.setBackground(Color.BLACK);
        B76.setForeground(Color.CYAN);
        B76.setBounds(506, 265, 65, 40);
        B76.setFocusPainted(false);
        F.add(B76);
        JButton B94 = new JButton("Pu");
        B94.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Plutonium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Glenn Seaborg and colleagues in 1940\nElement - Plutonium\nSymbol - Pu\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 94\nAtomic Mass - [244] u\nDensity (g/cm3) - 19.7\nBoiling Point -  3228 C, 5842 F, 3501 K\nMelting Point -  640 C, 1184 F, 913 K",
                            "Plutonium (Pu)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B94.setFont(new Font("Serif", Font.BOLD, 20));
        B94.setBackground(Color.BLACK);
        B94.setForeground(Color.BLUE);
        B94.setBounds(506, 413, 65, 40);
        B94.setFocusPainted(false);
        F.add(B94);
        JButton B108 = new JButton("Hs");
        B108.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Hassium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1984\nElement - Hassium\nSymbol - Hs\nGroup - 8\nPeriod - 7\nBlock - D\nAtomic Number - 108\nAtomic Mass - [269] u\nDensity (g/cm3) - 27–29\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Hassium (Hs)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B108.setFont(new Font("Serif", Font.BOLD, 20));
        B108.setBackground(Color.BLACK);
        B108.setForeground(Color.CYAN);
        B108.setBounds(506, 308, 65, 40);
        B108.setFocusPainted(false);
        F.add(B108);

        // Group - 9 : Elements
        JButton B27 = new JButton("Co");
        B27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Cobalt");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Georg Brandt in 1739\nElement - Cobalt\nSymbol - Co\nGroup - 9\nPeriod - 4\nBlock - D\nAtomic Number - 27\nAtomic Mass - 58.933 u\nDensity (g/cm3) - 8.86\nBoiling Point -  2927 C, 5301 F, 3200 K\nMelting Point -  1495 C, 2723 F, 1768 K",
                            "Cobalt (Co)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B27.setFont(new Font("Serif", Font.BOLD, 20));
        B27.setBackground(Color.BLACK);
        B27.setForeground(Color.CYAN);
        B27.setBounds(574, 179, 65, 40);
        B27.setFocusPainted(false);
        F.add(B27);
        JButton B45 = new JButton("Rh");
        B45.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Rhodium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - William Hyde Wollaston in 1803\nElement - Rhodium\nSymbol - Rh\nGroup - 9\nPeriod - 5\nBlock - D\nAtomic Number - 45\nAtomic Mass - 102.906 u\nDensity (g/cm3) - 12.4\nBoiling Point -  3695 C, 6683 F, 3968 K\nMelting Point -  1963 C, 3565 F, 2236 K",
                            "Rhodium (Rh)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B45.setFont(new Font("Serif", Font.BOLD, 20));
        B45.setBackground(Color.BLACK);
        B45.setForeground(Color.CYAN);
        B45.setBounds(574, 222, 65, 40);
        B45.setFocusPainted(false);
        F.add(B45);
        JButton B63 = new JButton("Eu");
        B63.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Europium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Eugene-Anatole Demarcay in 1901\nElement - Europium\nSymbol - Eu\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 63\nAtomic Mass - 151.964 u\nDensity (g/cm3) - 5.24\nBoiling Point -  1529 C, 2784 F, 1802 K\nMelting Point -  822 C, 1512 F, 1095 K",
                            "Europium (Eu)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B63.setFont(new Font("Serif", Font.BOLD, 20));
        B63.setBackground(Color.BLACK);
        B63.setForeground(Color.MAGENTA.darker());
        B63.setBounds(574, 370, 65, 40);
        B63.setFocusPainted(false);
        F.add(B63);
        JButton B77 = new JButton("Ir");
        B77.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Iridium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Smithson Tennant in 1803\nElement - Iridium\nSymbol - Ir\nGroup - 9\nPeriod - 6\nBlock - D\nAtomic Number - 77\nAtomic Mass - 192.217 u\nDensity (g/cm3) - 22.5622\nBoiling Point -  4428 C, 8002 F, 4701 K\nMelting Point -  2446 C, 4435 F, 2719 K",
                            "Iridium (Ir)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B77.setFont(new Font("Serif", Font.BOLD, 20));
        B77.setBackground(Color.BLACK);
        B77.setForeground(Color.CYAN);
        B77.setBounds(574, 265, 65, 40);
        B77.setFocusPainted(false);
        F.add(B77);
        JButton B95 = new JButton("Am");
        B95.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Americium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Glenn Seaborg and colleagues in 1944\nElement - Americium\nSymbol - Am\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 95\nAtomic Mass - [243] u\nDensity (g/cm3) - 12\nBoiling Point -  2011 C, 3652 F, 2284 K\nMelting Point -  1176 C, 2149 F, 1449 K",
                            "Americium (Am)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B95.setFont(new Font("Serif", Font.BOLD, 20));
        B95.setBackground(Color.BLACK);
        B95.setForeground(Color.BLUE);
        B95.setBounds(574, 413, 65, 40);
        B95.setFocusPainted(false);
        F.add(B95);
        JButton B109 = new JButton("Mt");
        B109.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Meitnerium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1982\nElement - Meitnerium\nSymbol - Mt\nGroup - 9\nPeriod - 7\nBlock - D\nAtomic Number - 109\nAtomic Mass - [278] u\nDensity (g/cm3) - 27–28\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Meitnerium (Mt)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B109.setFont(new Font("Serif", Font.BOLD, 20));
        B109.setBackground(Color.BLACK);
        B109.setForeground(Color.CYAN);
        B109.setBounds(574, 308, 65, 40);
        B109.setFocusPainted(false);
        F.add(B109);

        // Group - 10 : Elements
        JButton B28 = new JButton("Ni");
        B28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Nickel");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Axel Fredrik Cronstedt in 1751\nElement - Nickel\nSymbol - Ni\nGroup - 10\nPeriod - 4\nBlock - D\nAtomic Number - 28\nAtomic Mass - 58.693 u\nDensity (g/cm3) - 8.90\nBoiling Point -  2913 C, 5275 F, 3186 K\nMelting Point -  1455 C, 2651 F, 1728 K",
                            "Nikel (Ni)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B28.setFont(new Font("Serif", Font.BOLD, 20));
        B28.setBackground(Color.BLACK);
        B28.setForeground(Color.CYAN);
        B28.setBounds(642, 179, 65, 40);
        B28.setFocusPainted(false);
        F.add(B28);
        JButton B46 = new JButton("Pd");
        B46.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Palladium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - William Hyde Wollaston in 1803\nElement - Palladium\nSymbol - Pd\nGroup - 10\nPeriod - 5\nBlock - D\nAtomic Number - 46\nAtomic Mass - 106.42 u\nDensity (g/cm3) - 12.0\nBoiling Point -  2963 C, 5365 F, 3236 K\nMelting Point -  1554.8 C, 2830.6 F, 1828 K",
                            "Palladium (Pd)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B46.setFont(new Font("Serif", Font.BOLD, 20));
        B46.setBackground(Color.BLACK);
        B46.setForeground(Color.CYAN);
        B46.setBounds(642, 222, 65, 40);
        B46.setFocusPainted(false);
        F.add(B46);
        JButton B64 = new JButton("Gd");
        B64.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Gadolinium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jean Charles Galissard de Marignac in 1880\nElement - Gadolinium\nSymbol - Gd\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 64\nAtomic Mass - 157.25 u\nDensity (g/cm3) - 7.90\nBoiling Point -  3273 C, 5923 F, 3546 K\nMelting Point -  1313 C, 2395 F, 1586 K",
                            "Gadolinium (Gd)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B64.setFont(new Font("Serif", Font.BOLD, 20));
        B64.setBackground(Color.BLACK);
        B64.setForeground(Color.MAGENTA.darker());
        B64.setBounds(642, 370, 65, 40);
        B64.setFocusPainted(false);
        F.add(B64);
        JButton B78 = new JButton("Pt");
        B78.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Platinum");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Antonio de Ulloa in 1735\nElement - Platinum\nSymbol - Pt\nGroup - 10\nPeriod - 6\nBlock - D\nAtomic Number - 78\nAtomic Mass - 195.084 u\nDensity (g/cm3) - 21.5\nBoiling Point -  3825 C, 6917 F, 4098 K\nMelting Point -  1768.2 C, 3214.8 F, 2041.4 K",
                            "Platinum (Pt)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B78.setFont(new Font("Serif", Font.BOLD, 20));
        B78.setBackground(Color.BLACK);
        B78.setForeground(Color.CYAN);
        B78.setBounds(642, 265, 65, 40);
        B78.setFocusPainted(false);
        F.add(B78);
        JButton B96 = new JButton("Cm");
        B96.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Curium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Glenn Seaborg and colleagues in 1944\nElement - Curium\nSymbol - Cm\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 96\nAtomic Mass - [247] u\nDensity (g/cm3) - 13.51\nBoiling Point -  ~3100 C, 5600 F, ~3400 K\nMelting Point -  1345 C, 2453 F, 1618 K",
                            "Curium (Cm)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B96.setFont(new Font("Serif", Font.BOLD, 20));
        B96.setBackground(Color.BLACK);
        B96.setForeground(Color.BLUE);
        B96.setBounds(642, 413, 65, 40);
        B96.setFocusPainted(false);
        F.add(B96);
        JButton B110 = new JButton("Ds");
        B110.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Dramstadtium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Sigurd Hofmann, Peter Armbruster and Gottfried Munzenberg in 1994\nElement - Darmstadtium\nSymbol - Ds\nGroup - 10\nPeriod - 7\nBlock - D\nAtomic Number - 110\nAtomic Mass - [281] u\nDensity (g/cm3) - 26–27\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Darmstadtium (Ds)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B110.setFont(new Font("Serif", Font.BOLD, 20));
        B110.setBackground(Color.BLACK);
        B110.setForeground(Color.CYAN);
        B110.setBounds(642, 308, 65, 40);
        B110.setFocusPainted(false);
        F.add(B110);

        // Group - 11 : Elements
        JButton B29 = new JButton("Cu");
        B29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Copper");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Known since ancient times (Prehistoric)\nElement - Copper\nSymbol - Cu\nGroup - 11\nPeriod - 4\nBlock - D\nAtomic Number - 29\nAtomic Mass - 63.546 u\nDensity (g/cm3) - 8.96\nBoiling Point -  2560 C, 4640 F, 2833 K\nMelting Point -  1084.62 C, 1984.32 F, 1357.77 K",
                            "Copper (Cu)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B29.setFont(new Font("Serif", Font.BOLD, 20));
        B29.setBackground(Color.BLACK);
        B29.setForeground(Color.CYAN);
        B29.setBounds(710, 179, 65, 40);
        B29.setFocusPainted(false);
        F.add(B29);
        JButton B47 = new JButton("Ag");
        B47.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/silver");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - (approx 3000BC)\nElement - Silver\nSymbol - Ag\nGroup - 11\nPeriod - 5\nBlock - D\nAtomic Number - 47\nAtomic Mass - 107.868 u\nDensity (g/cm3) - 10.5\nBoiling Point -  2162 C, 3924 F, 2435 K\nMelting Point -  961.78 C, 1763.2 F, 1234.93 K",
                            "Silver (Ag)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B47.setFont(new Font("Serif", Font.BOLD, 20));
        B47.setBackground(Color.BLACK);
        B47.setForeground(Color.CYAN);
        B47.setBounds(710, 222, 65, 40);
        B47.setFocusPainted(false);
        F.add(B47);
        JButton B65 = new JButton("Tb");
        B65.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Terbium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carl Gustav Mosander in 1843\nElement - Terbium\nSymbol - Tb\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 65\nAtomic Mass - 158.925 u\nDensity (g/cm3) - 8.23\nBoiling Point -  3230 C, 5846 F, 3503 K\nMelting Point -  1359 C, 2478 F, 1632 K",
                            "Terbium (Tb)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B65.setFont(new Font("Serif", Font.BOLD, 20));
        B65.setBackground(Color.BLACK);
        B65.setForeground(Color.MAGENTA.darker());
        B65.setBounds(710, 370, 65, 40);
        B65.setFocusPainted(false);
        F.add(B65);
        JButton B79 = new JButton("Au");
        B79.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Gold");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - (approx 3000BC)\nElement - Gold\nSymbol - Au\nGroup - 11\nPeriod - 6\nBlock - D\nAtomic Number - 79\nAtomic Mass - 196.967 u\nDensity (g/cm3) - 19.3\nBoiling Point -  2836 C, 5137 F, 3109 K\nMelting Point -  1064.18 C, 1947.52 F, 1337.33 K",
                            "Gold (Au)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B79.setFont(new Font("Serif", Font.BOLD, 20));
        B79.setBackground(Color.BLACK);
        B79.setForeground(Color.CYAN);
        B79.setBounds(710, 265, 65, 40);
        B79.setFocusPainted(false);
        F.add(B79);
        JButton B97 = new JButton("Bk");
        B97.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Berkrlium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Stanley Thompson, Albert Ghiorso, and Glenn Seaborg in 1949\nElement - Berkrlium\nSymbol - Bk\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 97\nAtomic Mass - [247] u\nDensity (g/cm3) - 14.78\nBoiling Point -  2627 C, 4760 F, 2900 K\nMelting Point -  986 C, 1807 F, 1259 K",
                            "Berkelium (Bk)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B97.setFont(new Font("Serif", Font.BOLD, 20));
        B97.setBackground(Color.BLACK);
        B97.setForeground(Color.BLUE);
        B97.setBounds(710, 413, 65, 40);
        B97.setFocusPainted(false);
        F.add(B97);
        JButton B111 = new JButton("Rg");
        B111.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Roentgenium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1994\nElement - Roentgenium\nSymbol - Rg\nGroup - 11\nPeriod - 7\nBlock - D\nAtomic Number - 111\nAtomic Mass - [280] u\nDensity (g/cm3) - 28.7\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Roentgenium (Rg)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B111.setFont(new Font("Serif", Font.BOLD, 20));
        B111.setBackground(Color.BLACK);
        B111.setForeground(Color.CYAN);
        B111.setBounds(710, 308, 65, 40);
        B111.setFocusPainted(false);
        F.add(B111);

        // Group - 12 : Elements
        JButton B30 = new JButton("Zn");
        B30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Zinc");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Andreas Marggraf (Identified as an element in 1746, but known to the Greeks and Romans before 20BC)\nElement - Zinc\nSymbol - Zn\nGroup - 12\nPeriod - 4\nBlock - D\nAtomic Number - 30\nAtomic Mass - 65.38 u\nDensity (g/cm3) - 7.134\nBoiling Point -  907 C, 1665 F, 1180 K\nMelting Point -  419.527 C, 787.149 F, 692.677 K",
                            "Zinc (Zn)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B30.setFont(new Font("Serif", Font.BOLD, 20));
        B30.setBackground(Color.BLACK);
        B30.setForeground(Color.CYAN);
        B30.setBounds(778, 179, 65, 40);
        B30.setFocusPainted(false);
        F.add(B30);
        JButton B48 = new JButton("Cd");
        B48.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Cadmium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Friedrich Stromeyer in 1817\nElement - Cadmium\nSymbol - Cd\nGroup - 12\nPeriod - 5\nBlock - D\nAtomic Number - 48\nAtomic Mass - 112.414 u\nDensity (g/cm3) - 8.69\nBoiling Point -  767 C, 1413 F, 1040 K\nMelting Point -  321.069 C, 609.924 F, 594.219 K",
                            "Cadmium (Cd)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B48.setFont(new Font("Serif", Font.BOLD, 20));
        B48.setBackground(Color.BLACK);
        B48.setForeground(Color.CYAN);
        B48.setBounds(778, 222, 65, 40);
        B48.setFocusPainted(false);
        F.add(B48);
        JButton B66 = new JButton("Dy");
        B66.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Dysprosium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Paul-Emile Lecoq de Boisbaudran in 1886\nElement - Dysprosium\nSymbol - Dy\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 66\nAtomic Mass - 162.500 u\nDensity (g/cm3) - 8.55\nBoiling Point -  2567 C, 4653 F, 2840 K\nMelting Point -  1412 C, 2574 F, 1685 K",
                            "Dysprosium (Dy)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B66.setFont(new Font("Serif", Font.BOLD, 20));
        B66.setBackground(Color.BLACK);
        B66.setForeground(Color.MAGENTA.darker());
        B66.setBounds(778, 370, 65, 40);
        B66.setFocusPainted(false);
        F.add(B66);
        JButton B80 = new JButton("Hg");
        B80.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Mercury");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - (approx 1500BC)\nElement - Mercury\nSymbol - Hg\nGroup - 12\nPeriod - 6\nBlock - D\nAtomic Number - 80\nAtomic Mass - 200.592 u\nDensity (g/cm3) - 13.5336\nBoiling Point -  356.619 C, 673.914 F, 629.769 K\nMelting Point -  -38.829 C, -37.892 F, 234.321 K",
                            "Mercury (Hg)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B80.setFont(new Font("Serif", Font.BOLD, 20));
        B80.setBackground(Color.BLACK);
        B80.setForeground(Color.CYAN);
        B80.setBounds(778, 265, 65, 40);
        B80.setFocusPainted(false);
        F.add(B80);
        JButton B98 = new JButton("Cf");
        B98.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Californium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Stanley Thompson, Albert Ghiorso, and Glenn Seaborg in 1950\nElement - Californium\nSymbol - Cf\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 98\nAtomic Mass - [251] u\nDensity (g/cm3) - 15.1\nBoiling Point -  1470 C, 2678 F, 1743 K\nMelting Point -  900 C, 1652 F, 1173 K",
                            "Californium (Cf)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B98.setFont(new Font("Serif", Font.BOLD, 20));
        B98.setBounds(778, 413, 65, 40);
        B98.setBackground(Color.BLACK);
        B98.setForeground(Color.BLUE);
        B98.setFocusPainted(false);
        F.add(B98);
        JButton B112 = new JButton("Cn");
        B112.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Roentgenium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Sigurd Hofmann and colleagues in 1996\nElement - Copernicium\nSymbol - Cn\nGroup - 12\nPeriod - 7\nBlock - D\nAtomic Number - 112\nAtomic Mass - [285] u\nDensity (g/cm3) - 14.0\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Copernicium (Cn)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B112.setFont(new Font("Serif", Font.BOLD, 20));
        B112.setBackground(Color.BLACK);
        B112.setForeground(Color.CYAN);
        B112.setBounds(778, 308, 65, 40);
        B112.setFocusPainted(false);
        F.add(B112);

        // Group - 13 : Elements
        JButton B5 = new JButton("B");
        B5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Boron");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Louis-Josef Gay-Lussac and Louis-Jacques Thenard in Paris, France, and Humphry Davy in London, UK in 1808\nElement - Boron\nSymbol - B\nGroup - 13\nPeriod - 2\nBlock - P\nAtomic Number - 5\nAtomic Mass - 10.81 u\nDensity (g/cm3) - 2.34\nBoiling Point -  4000 C, 7232 F, 4273 K\nMelting Point - 2077 C, 3771 F, 2350 K",
                            "Boron (B)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B5.setFont(new Font("Serif", Font.BOLD, 20));
        B5.setBackground(Color.BLACK);
        B5.setForeground(Color.YELLOW);
        B5.setBounds(846, 93, 65, 40);
        B5.setFocusPainted(false);
        F.add(B5);
        JButton B13 = new JButton("Al");
        B13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Aluminium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Hans Oersted in 1825\nElement - Aluminium\nSymbol - Al\nGroup - 13\nPeriod - 3\nBlock - P\nAtomic Number - 13\nAtomic Mass - 26.982 u\nDensity (g/cm3) - 2.70\nBoiling Point -  2519 C, 4566 F, 2792 K\nMelting Point -  660.323 C, 1220.581 F, 933.473 K",
                            "Aluminium (Al)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B13.setFont(new Font("Serif", Font.BOLD, 20));
        B13.setBackground(Color.BLACK);
        B13.setForeground(Color.GREEN.darker());
        B13.setBounds(846, 136, 65, 40);
        B13.setFocusPainted(false);
        F.add(B13);
        JButton B31 = new JButton("Ga");
        B31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Gallium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Paul-Emile Lecoq de Boisbaudran in 1875\nElement - Gallium\nSymbol - Ga\nGroup - 13\nPeriod - 4\nBlock - P\nAtomic Number - 31\nAtomic Mass - 69.723 u\nDensity (g/cm3) - 5.91\nBoiling Point -  2229 C, 4044 F, 2502 K\nMelting Point -  29.7646 C, 85.5763 F, 302.9146 K",
                            "Gallium (Ga)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B31.setFont(new Font("Serif", Font.BOLD, 20));
        B31.setBackground(Color.BLACK);
        B31.setForeground(Color.GREEN.darker());
        B31.setBounds(846, 179, 65, 40);
        B31.setFocusPainted(false);
        F.add(B31);
        JButton B49 = new JButton("In");
        B49.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Indium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Ferdinand Reich and Hieronymous Richter in 1863\nElement - Indium\nSymbol - In\nGroup - 13\nPeriod - 5\nBlock - P\nAtomic Number - 49\nAtomic Mass - 114.818 u\nDensity (g/cm3) - 7.31\nBoiling Point -  2027 C, 3681 F, 2300 K\nMelting Point -  156.60 C, 313.88 F, 429.75 K",
                            "Indium (In)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B49.setFont(new Font("Serif", Font.BOLD, 20));
        B49.setBackground(Color.BLACK);
        B49.setForeground(Color.GREEN.darker());
        B49.setBounds(846, 222, 65, 40);
        B49.setFocusPainted(false);
        F.add(B49);
        JButton B67 = new JButton("Ho");
        B67.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Holmium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Per Teodor Cleve at Uppsala, Sweden and independently by Marc Delafontaine and Louis Soret in Geneva, Switzerland in 1878\nElement - Holmium\nSymbol - Ho\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 67\nAtomic Mass - 164.930 u\nDensity (g/cm3) - 8.80\nBoiling Point -  2700 C, 4892 F, 2973 K\nMelting Point -  1472 C, 2682 F, 1745 K",
                            "Holmium (Ho)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B67.setFont(new Font("Serif", Font.BOLD, 20));
        B67.setBackground(Color.BLACK);
        B67.setForeground(Color.MAGENTA.darker());
        B67.setBounds(846, 370, 65, 40);
        B67.setFocusPainted(false);
        F.add(B67);
        JButton B81 = new JButton("Tl");
        B81.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Thallium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - William Crookes in 1861\nElement - Thallium\nSymbol - Tl\nGroup - 13\nPeriod - 6\nBlock - P\nAtomic Number - 81\nAtomic Mass - 204.38 u\nDensity (g/cm3) - 11.8\nBoiling Point -  1473 C, 2683 F, 1746 K\nMelting Point -  304 C, 579 F, 577 K",
                            "Thallium (Tl)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B81.setFont(new Font("Serif", Font.BOLD, 20));
        B81.setBackground(Color.BLACK);
        B81.setForeground(Color.GREEN.darker());
        B81.setBounds(846, 265, 65, 40);
        B81.setFocusPainted(false);
        F.add(B81);
        JButton B99 = new JButton("Es");
        B99.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Einsteinium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Albert Ghiorso and colleagues in 1952\nElement - Einsteinium\nSymbol - Es\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 99\nAtomic Mass - [252] u\nDensity (g/cm3) - 8.84\nBoiling Point -  996 C, 1825 F, 1269 K\nMelting Point -  860 C, 1580 F, 1133 K",
                            "Einsteinium (Es)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B99.setFont(new Font("Serif", Font.BOLD, 20));
        B99.setBackground(Color.BLACK);
        B99.setForeground(Color.BLUE);
        B99.setBounds(846, 413, 65, 40);
        B99.setFocusPainted(false);
        F.add(B99);
        JButton B113 = new JButton("Nh");
        B113.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Nihonium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists from RIKEN (The Institute of Physical and Chemical Research) in Japan in 2004\nElement - Nihonium\nSymbol - Nh\nGroup - 13\nPeriod - 7\nBlock - P\nAtomic Number - 113\nAtomic Mass - [286] u\nDensity (g/cm3) - 16\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                            "Nihonium (Nh)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B113.setFont(new Font("Serif", Font.BOLD, 20));
        B113.setBackground(Color.BLACK);
        B113.setForeground(Color.GREEN.darker());
        B113.setBounds(846, 308, 65, 40);
        B113.setFocusPainted(false);
        F.add(B113);

        // Group - 14 : Elements
        JButton B6 = new JButton("C");
        B6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Carbon");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Antoine Lavoisier in 1789\nElement - Carbon\nSymbol - C\nGroup - 14\nPeriod - 2\nBlock - P\nAtomic Number - 6\nAtomic Mass - 12.011 u\nDensity (g/cm3) - 3.513 (diamond) and 2.2 (graphite)\nBoiling Point -  Sublimes at 3825 C, 6917 F, 4098 K\nMelting Point - Sublimes at 3825 C, 6917 F, 4098 K",
                            "Carbon (C)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B6.setFont(new Font("Serif", Font.BOLD, 20));
        B6.setBackground(Color.BLACK);
        B6.setForeground(Color.RED);
        B6.setBounds(914, 93, 65, 40);
        B6.setFocusPainted(false);
        F.add(B6);
        JButton B14 = new JButton("Si");
        B14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Silicon");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jons Jacob Berzelius in 1824\nElement - Silicon\nSymbol - Si\nGroup - 14\nPeriod - 3\nBlock - P\nAtomic Number - 14\nAtomic Mass - 28.085 u\nDensity (g/cm3) - 2.3296\nBoiling Point -  3265 C, 5909 F, 3538 K\nMelting Point -  1414 C, 2577 F, 1687 K",
                            "Silicon (Si)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B14.setFont(new Font("Serif", Font.BOLD, 20));
        B14.setBackground(Color.BLACK);
        B14.setForeground(Color.YELLOW);
        B14.setBounds(914, 136, 65, 40);
        B14.setFocusPainted(false);
        F.add(B14);
        JButton B32 = new JButton("Ge");
        B32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Germanium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Clemens Winkler in 1886\nElement - Germanium\nSymbol - Ge\nGroup - 14\nPeriod - 4\nBlock - P\nAtomic Number - 32\nAtomic Mass - 72.630 u\nDensity (g/cm3) - 5.3234\nBoiling Point -  2833 C, 5131 F, 3106 K\nMelting Point -  938.25 C, 1720.85 F, 1211.4 K",
                            "Germanium (Ge)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B32.setFont(new Font("Serif", Font.BOLD, 20));
        B32.setBackground(Color.BLACK);
        B32.setForeground(Color.YELLOW);
        B32.setBounds(914, 179, 65, 40);
        B32.setFocusPainted(false);
        F.add(B32);
        JButton B50 = new JButton("Sn");
        B50.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Tin");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - (approx 2100BC)\nElement - Tin\nSymbol - In\nGroup - 14\nPeriod - 5\nBlock - P\nAtomic Number - 50\nAtomic Mass - 118.710 u\nDensity (g/cm3) - 7.287\nBoiling Point -  2586 C, 4687 F, 2859 K\nMelting Point -  231.928 C, 449.47 F, 505.078 K",
                            "Tin (Sn)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B50.setFont(new Font("Serif", Font.BOLD, 20));
        B50.setBackground(Color.BLACK);
        B50.setForeground(Color.GREEN.darker());
        B50.setBounds(914, 222, 65, 40);
        B50.setFocusPainted(false);
        F.add(B50);
        JButton B68 = new JButton("Er");
        B68.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Erbium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carl Gustav Mosander in 1843\nElement - Erbium\nSymbol - Er\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 68\nAtomic Mass - 167.259 u\nDensity (g/cm3) - 9.07\nBoiling Point -  2868 C, 5194 F, 3141 K\nMelting Point -  1529 C, 2784 F, 1802 K",
                            "Erbium (Er)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B68.setFont(new Font("Serif", Font.BOLD, 20));
        B68.setBackground(Color.BLACK);
        B68.setForeground(Color.MAGENTA.darker());
        B68.setBounds(914, 370, 65, 40);
        B68.setFocusPainted(false);
        F.add(B68);
        JButton B82 = new JButton("Pb");
        B82.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Lead");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Ancient\nElement - Lead\nSymbol - Pb\nGroup - 14\nPeriod - 6\nBlock - P\nAtomic Number - 82\nAtomic Mass - 207.2 u\nDensity (g/cm3) - 11.3\nBoiling Point -  1749 C, 3180 F, 2022 K\nMelting Point -  327.462 C, 621.432 F, 600.612 K",
                            "Lead (Pb)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B82.setFont(new Font("Serif", Font.BOLD, 20));
        B82.setBackground(Color.BLACK);
        B82.setForeground(Color.GREEN.darker());
        B82.setBounds(914, 265, 65, 40);
        B82.setFocusPainted(false);
        F.add(B82);
        JButton B100 = new JButton("Fm");
        B100.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Fermium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Albert Ghiorso and colleagues in 1953\nElement - Fermium\nSymbol - Fm\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 100\nAtomic Mass - [257] u\nDensity (g/cm3) - 9.7(1)\nBoiling Point -  Unknown\nMelting Point -  1527 C, 2781 F, 1800 K",
                            "Fermium (Fm)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B100.setFont(new Font("Serif", Font.BOLD, 20));
        B100.setBackground(Color.BLACK);
        B100.setForeground(Color.BLUE);
        B100.setBounds(914, 413, 65, 40);
        B100.setFocusPainted(false);
        F.add(B100);
        JButton B114 = new JButton("Fl");
        B114.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Flerovium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia and the Lawrence Livermore National Laboratory, California, USA in 1999\nElement - Flerovium\nSymbol - Fl\nGroup - 14\nPeriod - 7\nBlock - P\nAtomic Number - 114\nAtomic Mass - [289] u\nDensity (g/cm3) - 9.928\nBoiling Point -  107 C, ​224 F, 380 K\nMelting Point -  -73 C, ​-100 F, 200 K",
                            "Flerovium (Fl)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B114.setFont(new Font("Serif", Font.BOLD, 20));
        B114.setBackground(Color.BLACK);
        B114.setForeground(Color.GREEN.darker());
        B114.setBounds(914, 308, 65, 40);
        B114.setFocusPainted(false);
        F.add(B114);

        // Group - 15 : Elements
        JButton B7 = new JButton("N");
        B7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Nitrogen");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Daniel Rutherford in 1772\nElement - Nitrogen\nSymbol - N\nGroup - 15\nPeriod - 2\nBlock - P\nAtomic Number - 7\nAtomic Mass - 14.007 u\nDensity (g/cm3) - 0.001145\nBoiling Point -  -195.795 C, -320.431 F, 77.355 K\nMelting Point -  -210.0 C, -346.0 F, 63.2 K",
                            "Nitrogen (N)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B7.setFont(new Font("Serif", Font.BOLD, 20));
        B7.setBackground(Color.BLACK);
        B7.setForeground(Color.RED);
        B7.setBounds(982, 93, 65, 40);
        B7.setFocusPainted(false);
        F.add(B7);
        JButton B15 = new JButton("P");
        B15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Phosphorus");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Hennig Brandt in 1669\nElement - Phosphorus\nSymbol - P\nGroup - 15\nPeriod - 3\nBlock - P\nAtomic Number - 15\nAtomic Mass - 30.974 u\nDensity (g/cm3) - 1.823 (White)\nBoiling Point -  280.5 C, 536.9 F, 553.7 K\nMelting Point -  44.15 C, 111.47 F, 317.3 K",
                            "Phosphorus (P)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B15.setFont(new Font("Serif", Font.BOLD, 20));
        B15.setBackground(Color.BLACK);
        B15.setForeground(Color.RED);
        B15.setBounds(982, 136, 65, 40);
        B15.setFocusPainted(false);
        F.add(B15);
        JButton B33 = new JButton("As");
        B33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Arsenic");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Albertus Magnus in (approx 1250)\nElement - Arsenic\nSymbol - As\nGroup - 15\nPeriod - 4\nBlock - P\nAtomic Number - 33\nAtomic Mass - 74.922 u\nDensity (g/cm3) - 5.75\nBoiling Point -  Sublimes at 616 C, 1141 F, 889 K\nMelting Point -  Sublimes at 616 C, 1141 F, 889 K",
                            "Arsenic (As)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B33.setFont(new Font("Serif", Font.BOLD, 20));
        B33.setBackground(Color.BLACK);
        B33.setForeground(Color.YELLOW.brighter());
        B33.setBounds(982, 179, 65, 40);
        B33.setFocusPainted(false);
        F.add(B33);
        JButton B51 = new JButton("Sb");
        B51.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Antimony");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - (approx 1600BC)\nElement - Antimony\nSymbol - Sb\nGroup - 15\nPeriod - 5\nBlock - P\nAtomic Number - 51\nAtomic Mass - 121.760 u\nDensity (g/cm3) - 6.68\nBoiling Point -  1587 C, 2889 F, 1860 K\nMelting Point -  630.628 C, 1167.13 F, 903.778 K",
                            "Antimony (Sb)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B51.setFont(new Font("Serif", Font.BOLD, 20));
        B51.setBackground(Color.BLACK);
        B51.setForeground(Color.YELLOW);
        B51.setBounds(982, 222, 65, 40);
        B51.setFocusPainted(false);
        F.add(B51);
        JButton B69 = new JButton("Tm");
        B69.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Thulium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Per Teodor Cleve in 1879\nElement - Thulium\nSymbol - Tm\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 69\nAtomic Mass - 168.934 u\nDensity (g/cm3) - 9.32\nBoiling Point -  1950 C, 3542 F, 2223 K\nMelting Point -  1545 C, 2813 F, 1818 K",
                            "Thulium (Tm)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B69.setFont(new Font("Serif", Font.BOLD, 20));
        B69.setBackground(Color.BLACK);
        B69.setForeground(Color.MAGENTA.darker());
        B69.setBounds(982, 370, 65, 40);
        B69.setFocusPainted(false);
        F.add(B69);
        JButton B83 = new JButton("Bi");
        B83.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Bismuth");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - approx 1500\nElement - Bismuth\nSymbol - Bi\nGroup - 15\nPeriod - 6\nBlock - P\nAtomic Number - 83\nAtomic Mass - 208.980 u\nDensity (g/cm3) - 9.79\nBoiling Point -  1564 C, 2847 F, 1837 K\nMelting Point -  271.406 C, 520.531 F, 544.556 K",
                            "Bismuth (Bi)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B83.setFont(new Font("Serif", Font.BOLD, 20));
        B83.setBackground(Color.BLACK);
        B83.setForeground(Color.GREEN.darker());
        B83.setBounds(982, 265, 65, 40);
        B83.setFocusPainted(false);
        F.add(B83);
        JButton B101 = new JButton("Md");
        B101.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Mendelevium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Albert Ghiorso and colleagues in 1955\nElement - Mendelevium\nSymbol - Md\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 101\nAtomic Mass - [258] u\nDensity (g/cm3) - 10.3(7)\nBoiling Point -  Unknown\nMelting Point -  827 C, 1521 F, 1100 K",
                            "Mendelevium (Md)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B101.setFont(new Font("Serif", Font.BOLD, 20));
        B101.setBackground(Color.BLACK);
        B101.setForeground(Color.BLUE);
        B101.setBounds(982, 413, 65, 40);
        B101.setFocusPainted(false);
        F.add(B101);
        JButton B115 = new JButton("Mc");
        B115.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Moscovium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, the Lawrence Livermore National Laboratory in California, USA, and Oak Ridge National Laboratory in Tennessee, USA in 2010\nElement - Moscovium\nSymbol - Mc\nGroup - 15\nPeriod - 7\nBlock - P\nAtomic Number - 115\nAtomic Mass - [289] u\nDensity (g/cm3) - 13.5\nBoiling Point -  ~1100 C, ​~2000 F, ~1400 K\nMelting Point -  400 C, ​750 F, 670 K",
                            "Moscovium (Mc)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B115.setFont(new Font("Serif", Font.BOLD, 20));
        B115.setBackground(Color.BLACK);
        B115.setForeground(Color.GREEN.darker());
        B115.setBounds(982, 308, 65, 40);
        B115.setFocusPainted(false);
        F.add(B115);

        // Group - 16 : Elements
        JButton B8 = new JButton("O");
        B8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Oxygen");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Joseph Priestley in Wiltshire, England and independently by Carl Wilhelm Scheele in Uppsala, Sweden in 1774\nElement - Oxygen\nSymbol - O\nGroup - 16\nPeriod - 2\nBlock - P\nAtomic Number - 8\nAtomic Mass - 15.999 u\nDensity (g/cm3) - 0.001308\nBoiling Point -  -182.962 C, -297.332 F, 90.188 K\nMelting Point -  -218.79 C, -361.82 F, 54.36 K",
                            "Oxygen (O)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B8.setFont(new Font("Serif", Font.BOLD, 20));
        B8.setBackground(Color.BLACK);
        B8.setForeground(Color.RED);
        B8.setBounds(1050, 93, 65, 40);
        B8.setFocusPainted(false);
        F.add(B8);
        JButton B16 = new JButton("S");
        B16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Sulphur");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Antoine Lavoisier in 1777\nElement - Sulphur\nSymbol - S\nGroup - 16\nPeriod - 3\nBlock - P\nAtomic Number - 16\nAtomic Mass - 32.06 u\nDensity (g/cm3) - 2.07\nBoiling Point -  444.61 C, 832.3 F, 717.76 K\nMelting Point -  115.21 C, 239.38 F, 388.36 K",
                            "Sulphur (S)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B16.setFont(new Font("Serif", Font.BOLD, 20));
        B16.setBackground(Color.BLACK);
        B16.setForeground(Color.RED);
        B16.setBounds(1050, 136, 65, 40);
        B16.setFocusPainted(false);
        F.add(B16);
        JButton B34 = new JButton("Se");
        B34.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Selenium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jons Jacob Berzelius in 1817\nElement - Selenium\nSymbol - Se\nGroup - 16\nPeriod - 4\nBlock - P\nAtomic Number - 34\nAtomic Mass - 78.971 u\nDensity (g/cm3) - 4.809\nBoiling Point -  685 C, 1265 F, 958 K\nMelting Point -  220.8 C, 429.4 F, 494 K",
                            "Selenium (Se)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B34.setFont(new Font("Serif", Font.BOLD, 20));
        B34.setBackground(Color.BLACK);
        B34.setForeground(Color.RED);
        B34.setBounds(1050, 179, 65, 40);
        B34.setFocusPainted(false);
        F.add(B34);
        JButton B52 = new JButton("Te");
        B52.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Tellurium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Franz-Joseph Muller von Reichenstein in 1783\nElement - Tellurium\nSymbol - Te\nGroup - 16\nPeriod - 5\nBlock - P\nAtomic Number - 52\nAtomic Mass - 127.60 u\nDensity (g/cm3) - 6.232\nBoiling Point -  988 C, 1810 F, 1261 K\nMelting Point -  449.51 C, 841.12 F, 722.66 K",
                            "Tellurium (Te)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B52.setFont(new Font("Serif", Font.BOLD, 20));
        B52.setBackground(Color.BLACK);
        B52.setForeground(Color.YELLOW);
        B52.setBounds(1050, 222, 65, 40);
        B52.setFocusPainted(false);
        F.add(B52);
        JButton B70 = new JButton("Yb");
        B70.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Ytterbium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Jean Charles Galissard de Marignac in 1878\nElement - Ytterbium\nSymbol - Yb\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 70\nAtomic Mass - 173.045 u\nDensity (g/cm3) - 6.90\nBoiling Point -  1196 C, 2185 F, 1469 K\nMelting Point -  824 C, 1515 F, 1097 K",
                            "Ytterbium (Yb)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B70.setFont(new Font("Serif", Font.BOLD, 20));
        B70.setBackground(Color.BLACK);
        B70.setForeground(Color.MAGENTA.darker());
        B70.setBounds(1050, 370, 65, 40);
        B70.setFocusPainted(false);
        F.add(B70);
        JButton B84 = new JButton("Po");
        B84.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Bismuth");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Marie Curie in 1898\nElement - Polonium\nSymbol - Po\nGroup - 16\nPeriod - 6\nBlock - P\nAtomic Number - 84\nAtomic Mass - [209] u\nDensity (g/cm3) - 9.20\nBoiling Point -  962 C, 1764 F, 1235 K\nMelting Point -  254 C, 489 F, 527 K",
                            "Polonium (Po)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B84.setFont(new Font("Serif", Font.BOLD, 20));
        B84.setBackground(Color.BLACK);
        B84.setForeground(Color.GREEN.darker());
        B84.setBounds(1050, 265, 65, 40);
        B84.setFocusPainted(false);
        F.add(B84);
        JButton B102 = new JButton("No");
        B102.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Nobelium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Georgy Flerov and colleagues and at Dubna, near Moscow, Russia, and independently by Albert Ghiorso and colleagues at Berkeley, California, USA in 1963\nElement - Nobelium\nSymbol - No\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 102\nAtomic Mass - [259] u\nDensity (g/cm3) - 9.9(4)\nBoiling Point -  Unknown\nMelting Point -  827 C, 1521 F, 1100 K",
                            "Nobelium (No)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B102.setFont(new Font("Serif", Font.BOLD, 20));
        B102.setBackground(Color.BLACK);
        B102.setForeground(Color.BLUE);
        B102.setBounds(1050, 413, 65, 40);
        B102.setFocusPainted(false);
        F.add(B102);
        JButton B116 = new JButton("Lv");
        B116.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Livermorium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia and the Lawrence Livermore National Laboratory, California, USA in 2000\nElement - Livermorium\nSymbol - Lv\nGroup - 16\nPeriod - 7\nBlock - P\nAtomic Number - 116\nAtomic Mass - [293] u\nDensity (g/cm3) - 12.9\nBoiling Point -  762–862 C, ​1403–1583 F, 1035–1135 K\nMelting Point -  364–507 C, ​687–944 F, 637–780 K",
                            "Livermorium (Lv)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B116.setFont(new Font("Serif", Font.BOLD, 20));
        B116.setBackground(Color.BLACK);
        B116.setForeground(Color.GREEN.darker());
        B116.setBounds(1050, 308, 65, 40);
        B116.setFocusPainted(false);
        F.add(B116);

        // Group - 17 : Elements
        JButton B9 = new JButton("F");
        B9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Fluroine");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Henri Moissan in 1886\nElement - Fluroine\nSymbol - F\nGroup - 17\nPeriod - 2\nBlock - P\nAtomic Number - 9\nAtomic Mass - 18.998 u\nDensity (g/cm3) - 0.001553\nBoiling Point -  -188.11 C, -306.6 F, 85.04 K\nMelting Point -  -219.67 C, -363.41 F, 53.48 K",
                            "Fluorine (F)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B9.setFont(new Font("Serif", Font.BOLD, 20));
        B9.setBackground(Color.BLACK);
        B9.setForeground(Color.LIGHT_GRAY);
        B9.setBounds(1118, 93, 65, 40);
        B9.setFocusPainted(false);
        F.add(B9);
        JButton B17 = new JButton("Cl");
        B17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Chlorine");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Carl Wilhelm Scheele in 1774\nElement - Chlorine\nSymbol - Cl\nGroup - 17\nPeriod - 3\nBlock - P\nAtomic Number - 17\nAtomic Mass - 35.45 u\nDensity (g/cm3) - 0.002898\nBoiling Point -  −34.04 C, −29.27 F, 239.11 K\nMelting Point -  -101.5 C, -150.7 F, 171.7 K",
                            "Chlorine (Cl)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B17.setFont(new Font("Serif", Font.BOLD, 20));
        B17.setBackground(Color.BLACK);
        B17.setForeground(Color.LIGHT_GRAY);
        B17.setBounds(1118, 136, 65, 40);
        B17.setFocusPainted(false);
        F.add(B17);
        JButton B35 = new JButton("Br");
        B35.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Bromine");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Antoine-Jerome Balard in Montpellier, France and Carl Lowig in Heidelberg, Germany in 1826\nElement - Bromine\nSymbol - Br\nGroup - 17\nPeriod - 4\nBlock - P\nAtomic Number - 35\nAtomic Mass - 79.904 u\nDensity (g/cm3) - 3.1028\nBoiling Point -  58.8 C, 137.8 F, 332 K\nMelting Point -  -7.2 C, 19 F, 266 K",
                            "Bromine (Br)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B35.setFont(new Font("Serif", Font.BOLD, 20));
        B35.setBackground(Color.BLACK);
        B35.setForeground(Color.LIGHT_GRAY);
        B35.setBounds(1118, 179, 65, 40);
        B35.setFocusPainted(false);
        F.add(B35);
        JButton B53 = new JButton("I");
        B53.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Iodine");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Bernard Courtois in 1811\nElement - Iodine\nSymbol - I\nGroup - 17\nPeriod - 5\nBlock - P\nAtomic Number - 53\nAtomic Mass - 126.904 u\nDensity (g/cm3) - 4.933\nBoiling Point -  184.4 C, 363.9 F, 457.6 K\nMelting Point -  113.7 C, 236.7 F, 386.9 K",
                            "Iodine (I)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B53.setFont(new Font("Serif", Font.BOLD, 20));
        B53.setBackground(Color.BLACK);
        B53.setForeground(Color.LIGHT_GRAY);
        B53.setBounds(1118, 222, 65, 40);
        B53.setFocusPainted(false);
        F.add(B53);
        JButton B71 = new JButton("Lu");
        B71.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Lutetium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Georges Urbain in Paris, France and independently by Charles James in New Hampshire, USA in 1907\nElement - Lutetium\nSymbol - Lu\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 71\nAtomic Mass - 174.967 u\nDensity (g/cm3) - 9.84\nBoiling Point -  3402 C, 6156 F, 3675 K\nMelting Point -  1663 C, 3025 F, 1936 K",
                            "Lutetium (Lu)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B71.setFont(new Font("Serif", Font.BOLD, 20));
        B71.setBackground(Color.BLACK);
        B71.setForeground(Color.MAGENTA.darker());
        B71.setBounds(1118, 370, 65, 40);
        B71.setFocusPainted(false);
        F.add(B71);
        JButton B85 = new JButton("At");
        B85.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Astatine");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Dale R. Corson, Kenneth Ross MacKenzie, Emilio Segre in 1940\nElement - Astatine\nSymbol - At\nGroup - 17\nPeriod - 6\nBlock - P\nAtomic Number - 85\nAtomic Mass - [210] u\nDensity (g/cm3) - Unknown\nBoiling Point -  350 C, 662 F, 623 K\nMelting Point -  300 C, 572 F, 573 K",
                            "Astatine (At)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B85.setFont(new Font("Serif", Font.BOLD, 20));
        B85.setBackground(Color.BLACK);
        B85.setForeground(Color.LIGHT_GRAY);
        B85.setBounds(1118, 265, 65, 40);
        B85.setFocusPainted(false);
        F.add(B85);
        JButton B103 = new JButton("Lr");
        B103.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Lawrencium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Georgy Flerov and colleagues and at Dubna, near Moscow, Russia, and independently by Albert Ghiorso and colleagues at Berkeley, California, USA in 1965\nElement - Lawrencium\nSymbol - Lr\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 103\nAtomic Mass - [262] u\nDensity (g/cm3) - 14.4\nBoiling Point -  Unknown\nMelting Point -  1627 C, 2961 F, 1900 K",
                            "Lawrencium (Lr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B103.setFont(new Font("Serif", Font.BOLD, 20));
        B103.setForeground(Color.BLUE);
        B103.setBounds(1118, 413, 65, 40);
        B103.setBackground(Color.BLACK);
        B103.setFocusPainted(false);
        F.add(B103);
        JButton B117 = new JButton("Ts");
        B117.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Tennessine");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, the Lawrence Livermore National Laboratory in California, USA, and Oak Ridge National Laboratory in Tennessee, USA in 2010\nElement - Tennessine\nSymbol - Ts\nGroup - 17\nPeriod - 7\nBlock - P\nAtomic Number - 117\nAtomic Mass - [294] u\nDensity (g/cm3) - 7.1–7.3\nBoiling Point -  610 C, ​1130 F, 883 K\nMelting Point -  350–550 C, ​662–1022 F, 623–823 K",
                            "Tennessine (Ts)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B117.setFont(new Font("Serif", Font.BOLD, 20));
        B117.setBackground(Color.BLACK);
        B117.setForeground(Color.LIGHT_GRAY);
        B117.setBounds(1118, 308, 65, 40);
        B117.setFocusPainted(false);
        F.add(B117);

        // Group - 18 : Elements
        JButton B2 = new JButton("He");
        B2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Helium");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Sir William Ramsay in London, and independently by Per Teodor Cleve and Nils Abraham Langlet in Uppsala, Sweden in 1895\nElement - Helium\nSymbol - He\nGroup - 18\nPeriod - 1\nBlock - S\nAtomic Number - 2\nAtomic Mass - 4.003 u\nDensity (g/cm3) - 0.000164\nBoiling Point -  -268.928 C, -452.07 F, 4.222 K\nMelting Point -  -272.20 C, -457.96 F, 0.95 K",
                            "Helium (He)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B2.setFont(new Font("Serif", Font.BOLD, 20));
        B2.setBackground(Color.BLACK);
        B2.setForeground(Color.MAGENTA);
        B2.setBounds(1186, 50, 65, 40);
        B2.setFocusPainted(false);
        F.add(B2);
        JButton B10 = new JButton("Ne");
        B10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Neon");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Sir William Ramsay and Morris Travers in 1898\nElement - Neon\nSymbol - Ne\nGroup - 18\nPeriod - 2\nBlock - P\nAtomic Number - 10\nAtomic Mass - 20.180 u\nDensity (g/cm3) - 0.000825\nBoiling Point -  -246.046 C, -410.883 F, 27.104 K\nMelting Point -  -248.59 C, -415.46 F, 24.56 K",
                            "Neon (Ne)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B10.setFont(new Font("Serif", Font.BOLD, 20));
        B10.setBackground(Color.BLACK);
        B10.setForeground(Color.MAGENTA);
        B10.setBounds(1186, 93, 65, 40);
        B10.setFocusPainted(false);
        F.add(B10);
        JButton B18 = new JButton("Ar");
        B18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Argon");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Lord Rayleigh and Sir William Ramsay in 1894\nElement - Argon\nSymbol - Ar\nGroup - 18\nPeriod - 3\nBlock - P\nAtomic Number - 18\nAtomic Mass - 39.95 u\nDensity (g/cm3) - 0.001633\nBoiling Point -  -185.848 C, -302.526 F, 87.302 K\nMelting Point -  -189.34 C, -308.81 F, 83.81 K",
                            "Argon (Ar)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B18.setFont(new Font("Serif", Font.BOLD, 20));
        B18.setBackground(Color.BLACK);
        B18.setForeground(Color.MAGENTA);
        B18.setBounds(1186, 136, 65, 40);
        B18.setFocusPainted(false);
        F.add(B18);
        JButton B36 = new JButton("Kr");
        B36.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Krypton");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Sir William Ramsay and Morris Travers in 1898\nElement - Krypton\nSymbol - Kr\nGroup - 18\nPeriod - 4\nBlock - P\nAtomic Number - 36\nAtomic Mass - 83.798 u\nDensity (g/cm3) - 0.003425\nBoiling Point -  -153.415 C, −244.147 F, 119.735 K\nMelting Point -  -157.37 C, -251.27 F, 115.78 K",
                            "Krypton (Kr)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B36.setFont(new Font("Serif", Font.BOLD, 20));
        B36.setBackground(Color.BLACK);
        B36.setForeground(Color.MAGENTA);
        B36.setBounds(1186, 179, 65, 40);
        B36.setFocusPainted(false);
        F.add(B36);
        JButton B54 = new JButton("Xe");
        B54.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Xenon");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Sir William Ramsay and Morris Travers in 1898\nElement - Xenon\nSymbol - Xe\nGroup - 18\nPeriod - 5\nBlock - P\nAtomic Number - 54\nAtomic Mass - 131.293 u\nDensity (g/cm3) - 0.005366\nBoiling Point -  -108.099°C, -162.578°F, 165.051 K\nMelting Point -  -111.75°C, -169.15°F, 161.4 K",
                            "Xenon (Xe)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B54.setFont(new Font("Serif", Font.BOLD, 20));
        B54.setBackground(Color.BLACK);
        B54.setForeground(Color.MAGENTA);
        B54.setBounds(1186, 222, 65, 40);
        B54.setFocusPainted(false);
        F.add(B54);
        ;
        JButton B86 = new JButton("Rn");
        B86.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Radon");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Friedrich Ernst Dorn in 1900\nElement - Radon\nSymbol - Rn\nGroup - 18\nPeriod - 6\nBlock - P\nAtomic Number - 86\nAtomic Mass - [222] u\nDensity (g/cm3) - 0.009074\nBoiling Point -  -61.7°C, -79.1°F, 211.5 K\nMelting Point -  -71°C, -96°F, 202 K",
                            "Radon (Rn)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B86.setFont(new Font("Serif", Font.BOLD, 20));
        B86.setBackground(Color.BLACK);
        B86.setForeground(Color.MAGENTA);
        B86.setBounds(1186, 265, 65, 40);
        B86.setFocusPainted(false);
        F.add(B86);
        JButton B118 = new JButton("Og");
        B118.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Ae) {
                if (T.isSelected()) {
                    Open("https://en.wikipedia.org/wiki/Oganesson");
                } else {
                    O.showMessageDialog(F,
                            "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, and the Lawrence Livermore National Laboratory in California, USA in 2006\nElement - Oganesson\nSymbol - Og\nGroup - 18\nPeriod - 7\nBlock - P\nAtomic Number - 118\nAtomic Mass - [294] u\nDensity (g/cm3) - 7.1–7.3\nBoiling Point -  177 ± 10 C, ​350 ± 18 F, 450 ± 10 K\nMelting Point -  52 ± 15 C, ​125 ± 27 F, 325 ± 15 K",
                            "Oganesson (Og)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        B118.setFont(new Font("Serif", Font.BOLD, 20));
        B118.setBackground(Color.BLACK);
        B118.setForeground(Color.MAGENTA);
        B118.setBounds(1186, 308, 65, 40);
        B118.setFocusPainted(false);
        F.add(B118);

        // Frame Seting (Normal Frame)
        ImageIcon Img = new ImageIcon("Periodic1.png"); // Setting GUI icon
        F.setIconImage(Img.getImage()); // Setting icon in Frame
        UIManager.put("ToggleButton.select", Color.GREEN.darker()); // Toggle Button ON state (Green).
        SwingUtilities.updateComponentTreeUI(T); // For updating the Toggle Button color.
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Garamond", Font.BOLD, 20))); // Font and Font size of ELEMENTS.
        T.setBackground(Color.RED); // Toggel Button OFF state (Red).
        T.setBounds(30, 470, 15, 15); // Setting Position, Width, Heigth of Togggle Button
        L.setForeground(Color.WHITE); // Color of Label (What's This..?)
        L.setBounds(53, 427, 100, 100); // Setting Position, Width, Heigth of Text (What's This..?)
        L.setToolTipText("Turn this Feature ON to know more about ELEMENTS."); // Moving cursor on the text "What's This" will show a message.
        F.setSize(1300, 550); // Frame Size
        F.setResizable(false); // Cannot able to resize the frame
        F.add(L); // Adding Label in Frame
        F.add(T); // Adding Toggle Button in Frame
        F.setLayout(null);
        F.setLocationRelativeTo(null);
        F.setVisible(true);
        F.getContentPane().setBackground(Color.BLACK); // Frame Backgroung Color (Black)
        F.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Clicking on cross (X) will let You close the program
    }
}
