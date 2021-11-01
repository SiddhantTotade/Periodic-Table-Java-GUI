import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.event.*;
import java.awt.*;

/* This is Simple (Intermidate Level) GUI code of PERIODIC TABLE.
Just click on one of the ELEMENTS and view the Information of that ELEMENT. 
Also this GUI has a Feature that Connects you to the WEB (Wikipedia) for more Information of ELEMENTS.*/

// Making connection for the WEB(Wikipedia).
public class Periodic_Table_GUI_1 extends JPanel {
    public static void Open(String URL) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {

        // Frame
        JFrame F = new JFrame("Periodic Table");
        // Option Panel (Shows the information of Element)
        JOptionPane O = new JOptionPane();
        // Toggle Button (ON and OFF for see ELEMENTS on web and local computer)
        JToggleButton T = new JToggleButton();
        // Labels (It shows the working of Labels)
        JLabel L = new JLabel("What's This..?");

        // // Magic Frame Settings (Uncomment it and See, but don't forget to comment
        // the Last Code which is at the End of Program.)
        // ImageIcon Img = new ImageIcon("Periodic1.png");
        // F.setIconImage(Img.getImage());
        // F.setSize(1300, 550);
        // F.setLocationRelativeTo(null);
        // F.setLayout(null);
        // F.setVisible(true);
        // F.getContentPane().setBackground(Color.BLACK);
        // F.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JAb = About Button which shows the Designer of This GUI.
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
        JLabel[] Group = new JLabel[19];
        int GVar = 59;
        for (int i = 1; i < Group.length; i++) {
            if (i == 1 || i == 18) {
                Group[i] = new JLabel("" + i);
                Group[i].setForeground(Color.WHITE);
                Group[i].setBounds(GVar, 33, 15, 15);
                F.add(Group[i]);
                GVar += 68;
            } else if (i == 2 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17) {
                Group[i] = new JLabel("" + i);
                Group[i].setForeground(Color.WHITE);
                Group[i].setBounds(GVar, 77, 15, 15);
                F.add(Group[i]);
                GVar += 68;
            } else {
                Group[i] = new JLabel("" + i);
                Group[i].setForeground(Color.WHITE);
                Group[i].setBounds(GVar, 162, 15, 15);
                F.add(Group[i]);
                GVar += 68;
            }
        }

        // Labels for the Periods of PERIODIC TABLE.
        JLabel[] Period = new JLabel[8];
        int PVar = 63;
        for (int i = 1; i < Period.length; i++) {
            Period[i] = new JLabel("" + i);
            Period[i].setForeground(Color.WHITE);
            Period[i].setBounds(20, PVar, 15, 15);
            F.add(Period[i]);
            PVar += 43;
        }

        // Labels for showing the type of element.
        String[] EleType = { "Reactive Nonmetals", "Alkali Metals", "Alkaline Earth Metals", "Transition Metals",
                "Post Transition Metals", "Metalloids", "Noble Gases", "Actinides", "Lanthanaids", "Halogens" };
        JLabel[] Ele = new JLabel[10];
        int VEle = -22;
        int HEle = 200;
        for (int i = 0; i < Ele.length; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
                Ele[i] = new JLabel(EleType[i]);
                Ele[i].setForeground(Color.WHITE);
                Ele[i].setBounds(325, VEle, 130, 100);
                if (i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
                    Ele[i].setBounds(525, VEle, 130, 100);
                }
                F.add(Ele[i]);
                VEle += 30;
                if (VEle >= 128) {
                    VEle = -22;
                }
            }
        }

        // Buttons for show which type of element is that.
        JButton[] ButtEle = new JButton[10];
        Color[] Col = { Color.RED, Color.PINK, Color.ORANGE, Color.CYAN, Color.GREEN.darker(), Color.YELLOW,
                Color.MAGENTA, Color.BLUE.darker(), Color.MAGENTA.darker(), Color.LIGHT_GRAY.darker() };
        int VerEle = 20;
        int HorEle = 200;
        for (int i = 0; i < ButtEle.length; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
                ButtEle[i] = new JButton();
                ButtEle[i].setBackground(Col[i]);
                ButtEle[i].setBounds(300, VerEle, 15, 15);
                if (i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
                    ButtEle[i].setBackground(Col[i]);
                    ButtEle[i].setBounds(500, VerEle, 15, 15);
                }
                ButtEle[i].setFocusPainted(false);
                ButtEle[i].setBorderPainted(false);
                F.add(ButtEle[i]);
                VerEle += 30;
                if (VerEle >= 170) {
                    VerEle = 20;
                }
            }
        }

        // Here I am Explaining the only one Part of the Code and Rest will be the Same.


        // CODE - 1.
        // EleStr1 = Element String which holds the Elements of the PERIODIC TABLE.
        String[][] EleStr1 = { { "H", "Li", "Na" }, { "Be", "Mg", " " } };
        // DcrStr1 = Description String which holds the information of Elements of the
        // PERIODIC TABLE.
        String[][] DcrStr1 = { {
                "Discovered by - Henry Cavendish in 1766\nElement - Hydrogen\nSymbol - H\nGroup - 1\nPeriod - 1\nBlock - S\nAtomic Number - 1\nAtomic Mass - 1.008 u\nDensity (g/cm3) - 0.000082\nBoiling Point -  -252.879 C, -423.182 F, 20.271 K\nMelting Point -  -259.16 C, -434.49 F, 13.99 K",
                "Discovered by - Johan August Arfvedson in 1817\nElement - Lithium\nSymbol - Li\nGroup - 1\nPeriod - 2\nBlock - S\nAtomic Number - 3\nAtomic Mass - 6.94 u\nDensity (g/cm3) - 0.534\nBoiling Point -  1342 C, 2448 F, 1615 K\nMelting Point - 180.50 C, 356.90 F, 453.65 K",
                "Discovered by - Humphry Davy in 1807\nElement - Sodium\nSymbol - Na\nGroup - 1\nPeriod - 3\nBlock - S\nAtomic Number - 11\nAtomic Mass - 22.990 u\nDensity (g/cm3) - 0.97\nBoiling Point -  882.940 C, 1621.292 F, 1156.090 K\nMelting Point -  97.794 C, 208.029 F, 370.944 K" },
                { "Discovered by - Nicholas Louis Vauquelin in 1797\nElement - Beryllium\nSymbol - Be\nGroup - 2\nPeriod - 2\nBlock - S\nAtomic Number - 4\nAtomic Mass - 9.012 u\nDensity (g/cm3) - 1.85\nBoiling Point -  2468 C, 4474 F, 2741 K\nMelting Point - 1287 C, 2349 F, 1560 K",
                        "Discovered by - Joseph Black in 1755\nElement - Magnesium\nSymbol - Mg\nGroup - 2\nPeriod - 3\nBlock - S\nAtomic Number - 12\nAtomic Mass - 24.305 u\nDensity (g/cm3) - 1.74\nBoiling Point -  1090 C, 1994 F, 1363 K\nMelting Point -  650 C, 1202 F, 923 K",
                        " " } };
        // LinkStr1 = Link String which holds the URL of the Elements of PERIODIC TABLE.
        String[][] LinkStr1 = {
                { "https://en.wikipedia.org/wiki/Hydrogen", "https://en.wikipedia.org/wiki/Lithium",
                        "https://en.wikipedia.org/wiki/Sodium" },
                { "https://en.wikipedia.org/wiki/Beryllium", "https://en.wikipedia.org/wiki/Magnesium", " " } };
        // TitleStr1 = Title String which holds the Name of the Elements and their
        // Symbol which show on the top of the OptionPane of the PERIODIC TABLE.
        String[][] TitStr1 = { { "Hydrogen (H)", "Lithium (Li)", "Sodium (Na)" },
                { "Beryllium", "Magnesium (Mg)", " " } };
        // Horizontal Distance.
        int Hor1 = 30;
        // Vertical Distance.
        int Ver1 = 50;
        // ColStr1 = Color String Which holds the Color of Elements.  
        Color[] ColStr1 = { Color.RED, Color.PINK, Color.ORANGE };
        // JB1 = Button Array for Setting Elements and Linking Elements to the Web and Local.
        JButton[][] JB1 = new JButton[3][3];
        for (int i = 0; i < JB1.length; i++) {
            for (int j = 0; j < JB1.length; j++) {
                JB1[i][j] = new JButton(EleStr1[i][j]);
                JB1[i][j].setFont(new Font("Serif", Font.BOLD, 20));
                JB1[i][j].setBackground(Color.BLACK);
                JB1[i][j].setForeground(Color.RED);
                if (JB1[i][j].getText() == "Li" || JB1[i][j].getText() == "Na") {
                    JB1[i][j].setForeground(ColStr1[1]);
                } else if (JB1[i][j].getText() == "Be" || JB1[i][j].getText() == "Mg") {
                    JB1[i][j].setForeground(ColStr1[2]);
                }
                JB1[i][j].setBounds(Hor1, Ver1, 65, 40);
                if (Ver1 >= 136) {
                    Ver1 = 50;
                }
                JB1[i][j].setFocusPainted(false);
                F.add(JB1[i][j]);
                int k = i;
                int l = j;
                JB1[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Ae) {
                        if (T.isSelected()) {
                            Open(LinkStr1[k][l]);
                        } else {
                            O.showMessageDialog(F, DcrStr1[k][l], TitStr1[k][l], JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                });
                Ver1 += 43;
            }
            if (Hor1 >= 98) {
                break;
            }
            Hor1 += 68;
        }

        // CODE - 2
        String[][] EleStr2 = { { "B", "Al", "", "", "", "" }, { "C", "Si", "", "", "", "" },
                { "N", "P", "", "", "", "" }, { "O", "S", "", "", "", "" }, { "F", "Cl", "", "", "", "" },
                { "He", "Ne", "Ar", "", "", "" } };
        String[][] DcrStr2 = { {
                "Discovered by - Louis-Josef Gay-Lussac and Louis-Jacques Thenard in Paris, France, and Humphry Davy in London, UK in 1808\nElement - Boron\nSymbol - B\nGroup - 13\nPeriod - 2\nBlock - P\nAtomic Number - 5\nAtomic Mass - 10.81 u\nDensity (g/cm3) - 2.34\nBoiling Point -  4000 C, 7232 F, 4273 K\nMelting Point - 2077 C, 3771 F, 2350 K",
                "Discovered by - Hans Oersted in 1825\nElement - Aluminium\nSymbol - Al\nGroup - 13\nPeriod - 3\nBlock - P\nAtomic Number - 13\nAtomic Mass - 26.982 u\nDensity (g/cm3) - 2.70\nBoiling Point -  2519 C, 4566 F, 2792 K\nMelting Point -  660.323 C, 1220.581 F, 933.473 K",
                "", "", "", "" },
                { "Discovered by - Antoine Lavoisier in 1789\nElement - Carbon\nSymbol - C\nGroup - 14\nPeriod - 2\nBlock - P\nAtomic Number - 6\nAtomic Mass - 12.011 u\nDensity (g/cm3) - 3.513 (diamond) and 2.2 (graphite)\nBoiling Point -  Sublimes at 3825 C, 6917 F, 4098 K\nMelting Point - Sublimes at 3825 C, 6917 F, 4098 K",
                        "Discovered by - Jons Jacob Berzelius in 1824\nElement - Silicon\nSymbol - Si\nGroup - 14\nPeriod - 3\nBlock - P\nAtomic Number - 14\nAtomic Mass - 28.085 u\nDensity (g/cm3) - 2.3296\nBoiling Point -  3265 C, 5909 F, 3538 K\nMelting Point -  1414 C, 2577 F, 1687 K",
                        " ", "", "", "" },
                { "Discovered by - Daniel Rutherford in 1772\nElement - Nitrogen\nSymbol - N\nGroup - 15\nPeriod - 2\nBlock - P\nAtomic Number - 7\nAtomic Mass - 14.007 u\nDensity (g/cm3) - 0.001145\nBoiling Point -  -195.795 C, -320.431 F, 77.355 K\nMelting Point -  -210.0 C, -346.0 F, 63.2 K",
                        "Discovered by - Hennig Brandt in 1669\nElement - Phosphorus\nSymbol - P\nGroup - 15\nPeriod - 3\nBlock - P\nAtomic Number - 15\nAtomic Mass - 30.974 u\nDensity (g/cm3) - 1.823 (White)\nBoiling Point -  280.5 C, 536.9 F, 553.7 K\nMelting Point -  44.15 C, 111.47 F, 317.3 K",
                        " ", "", "", "" },
                { "Discovered by - Joseph Priestley in Wiltshire, England and independently by Carl Wilhelm Scheele in Uppsala, Sweden in 1774\nElement - Oxygen\nSymbol - O\nGroup - 16\nPeriod - 2\nBlock - P\nAtomic Number - 8\nAtomic Mass - 15.999 u\nDensity (g/cm3) - 0.001308\nBoiling Point -  -182.962 C, -297.332 F, 90.188 K\nMelting Point -  -218.79 C, -361.82 F, 54.36 K",
                        "Discovered by - Antoine Lavoisier in 1777\nElement - Sulphur\nSymbol - S\nGroup - 16\nPeriod - 3\nBlock - P\nAtomic Number - 16\nAtomic Mass - 32.06 u\nDensity (g/cm3) - 2.07\nBoiling Point -  444.61 C, 832.3 F, 717.76 K\nMelting Point -  115.21 C, 239.38 F, 388.36 K",
                        " ", "", "", "" },
                { "Discovered by - Henri Moissan in 1886\nElement - Fluroine\nSymbol - F\nGroup - 17\nPeriod - 2\nBlock - P\nAtomic Number - 9\nAtomic Mass - 18.998 u\nDensity (g/cm3) - 0.001553\nBoiling Point -  -188.11 C, -306.6 F, 85.04 K\nMelting Point -  -219.67 C, -363.41 F, 53.48 K",
                        "Discovered by - Carl Wilhelm Scheele in 1774\nElement - Chlorine\nSymbol - Cl\nGroup - 17\nPeriod - 3\nBlock - P\nAtomic Number - 17\nAtomic Mass - 35.45 u\nDensity (g/cm3) - 0.002898\nBoiling Point -  −34.04 C, −29.27 F, 239.11 K\nMelting Point -  -101.5 C, -150.7 F, 171.7 K",
                        " ", "", "", "" },
                { "Discovered by - Sir William Ramsay in London, and independently by Per Teodor Cleve and Nils Abraham Langlet in Uppsala, Sweden in 1895\nElement - Helium\nSymbol - He\nGroup - 18\nPeriod - 1\nBlock - S\nAtomic Number - 2\nAtomic Mass - 4.003 u\nDensity (g/cm3) - 0.000164\nBoiling Point -  -268.928 C, -452.07 F, 4.222 K\nMelting Point -  -272.20 C, -457.96 F, 0.95 K",
                        "Discovered by - Sir William Ramsay and Morris Travers in 1898\nElement - Neon\nSymbol - Ne\nGroup - 18\nPeriod - 2\nBlock - P\nAtomic Number - 10\nAtomic Mass - 20.180 u\nDensity (g/cm3) - 0.000825\nBoiling Point -  -246.046 C, -410.883 F, 27.104 K\nMelting Point -  -248.59 C, -415.46 F, 24.56 K",
                        "Discovered by - Lord Rayleigh and Sir William Ramsay in 1894\nElement - Argon\nSymbol - Ar\nGroup - 18\nPeriod - 3\nBlock - P\nAtomic Number - 18\nAtomic Mass - 39.95 u\nDensity (g/cm3) - 0.001633\nBoiling Point -  -185.848 C, -302.526 F, 87.302 K\nMelting Point -  -189.34 C, -308.81 F, 83.81 K",
                        "", "", "" } };
        String[][] LinkStr2 = {
                { "https://en.wikipedia.org/wiki/Boron", "https://en.wikipedia.org/wiki/Aluminium", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Carbon", "https://en.wikipedia.org/wiki/Silicon", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Nitrogen", "https://en.wikipedia.org/wiki/Phosphorus", "", "", "",
                        "" },
                { "https://en.wikipedia.org/wiki/Oxygen", "https://en.wikipedia.org/wiki/Sulphur", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Fluorine", "https://en.wikipedia.org/wiki/Chlorine", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Helium", "https://en.wikipedia.org/wiki/Neon",
                        "https://en.wikipedia.org/wiki/Argon", "", "", "" } };
        String[][] TitStr2 = { { "Boron (B)", "Aluminium (Al)", "", "", "", "" },
                { "Carbon (C)", "Silicon (Si)", "", "", "", "" },
                { "Nitrogen (N)", "Phosphorus (P)", " ", " ", " ", " " },
                { "Oxygen (O)", "Sulphur (S)", " ", " ", " ", " " },
                { "Fluorine (F)", "Chlorine (Cl)", " ", "", "", "" },
                { "Helium (He)", "Neon (Ne)", "Argon (Ar)", "", "", "" } };
        Color[] ColStr2 = { Color.CYAN, Color.LIGHT_GRAY, Color.YELLOW, Color.GREEN.darker(), Color.MAGENTA };
        int Hor2 = 846;
        int Ver2 = 93;
        JButton[][] JB2 = new JButton[6][6];
        for (int i = 0; i < JB2.length; i++) {
            for (int j = 0; j < JB2.length; j++) {
                JB2[i][j] = new JButton(EleStr2[i][j]);
                JB2[i][j].setFont(new Font("Serif", Font.BOLD, 20));
                JB2[i][j].setBackground(Color.BLACK);
                JB2[i][j].setForeground(ColStr1[0]);
                JB2[i][j].setBounds(Hor2, Ver2, 65, 40);
                if (JB2[i][j].getText() == "B" || JB2[i][j].getText() == "Si") {
                    JB2[i][j].setForeground(ColStr2[2]);
                } else if (JB2[i][j].getText() == "F" || JB2[i][j].getText() == "Cl") {
                    JB2[i][j].setForeground(ColStr2[1]);
                } else if (JB2[i][j].getText() == "He" || JB2[i][j].getText() == "Ne" || JB2[i][j].getText() == "Ar") {
                    JB2[i][j].setForeground(ColStr2[4]);
                } else if (JB2[i][j].getText() == "Al") {
                    JB2[i][j].setForeground(ColStr2[3]);
                }
                if (Ver2 >= 136) {
                    Ver2 = 50;
                }
                JB2[i][j].setFocusPainted(false);
                F.add(JB2[i][j]);
                int k = i;
                int l = j;
                JB2[i][j].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent Ae) {
                        if (T.isSelected()) {
                            Open(LinkStr2[k][l]);
                        } else {
                            O.showMessageDialog(F, DcrStr2[k][l], TitStr2[k][l], JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                });
                Ver2 += 43;
            }
            if (Hor2 >= 1186) {
                break;
            }
            Hor2 += 68;
            if (Hor2 == 1186) {
                Ver2 = 50;
            }
        }

        // CODE - 3
        String[][] EleStr3 = {
                { "K", "Rb", "Cs", "Fr", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Ba", "Ra", "Ca", "Sr", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Sc", "Y", "*", "* *", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Hf", "Rf", "Ti", "Zr", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "V", "Nb", "Ta", "Db", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "W", "Sg", "Cr", "Mo", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Mn", "Tc", "Re", "Bh", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Os", "Hs", "Fe", "Ru", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Co", "Rh", "Ir", "Mt", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Pt", "Ds", "Ni", "Pd", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Cu", "Ag", "Au", "Rg", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Hg", "Cn", "Zn", "Cd", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Ga", "In", "Tl", "Nh", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Pb", "Fl", "Ge", "Sn", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "As", "Sb", "Bi", "Mc", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Po", "Lv", "Se", "Te", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Br", "I", "At", "Ts", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " },
                { "Rn", "Og", "Kr", "Xe", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " } };
        String[][] DcrStr3 = { {
                "Discovered by - Humphry Davy in 1807\nElement - Potassium\nSymbol - K\nGroup - 1\nPeriod - 4\nBlock - S\nAtomic Number - 19\nAtomic Mass - 39.098 u\nDensity (g/cm3) - 0.89\nBoiling Point -  759 C, 1398 F, 1032 K\nMelting Point -  63.5 C, 146.3 F, 336.7 K",
                "Discovered by - Gustav Kirchhoff and Robert Bunsen in 1861\nElement - Rubidium\nSymbol - Rb\nGroup - 1\nPeriod - 5\nBlock - S\nAtomic Number - 37\nAtomic Mass - 85.468 u\nDensity (g/cm3) - 1.53\nBoiling Point -  688 C, 1270 F, 961 K \nMelting Point -  39.30 C, 102.74 F, 312.45 K",
                "Discovered by - Gustav Kirchhoff and Robert Bunsen in 1860\nElement - Caesium\nSymbol - Cs\nGroup - 1\nPeriod - 6\nBlock - S\nAtomic Number - 55\nAtomic Mass - 132.905 u\nDensity (g/cm3) - 1.873\nBoiling Point -  671 C, 1240 F, 944 K\nMelting Point -  28.5 C, 83.3 F, 301.7 K",
                "Discovered by - Marguerite Perey in 1939\nElement - Francium\nSymbol - Fr\nGroup - 1\nPeriod - 7\nBlock - S\nAtomic Number - 87\nAtomic Mass - [223] u\nDensity (g/cm3) - 2.48 (estimated)\nBoiling Point -  650 C, 1202 F, 923 K\nMelting Point -  21 C, 70 F, 294 K",
                " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Humphry Davy in 1808\nElement - Barium\nSymbol - Ba\nGroup - 2\nPeriod - 6\nBlock - S\nAtomic Number - 56\nAtomic Mass - 137.327 u\nDensity (g/cm3) - 3.62\nBoiling Point -  1845 C, 3353 F, 2118 K\nMelting Point -  727 C, 1341 F, 1000 K",
                        "Discovered by - Pierre and Marie Curie in 1898\nElement - Radium\nSymbol - Ra\nGroup - 2\nPeriod - 7\nBlock - S\nAtomic Number - 88\nAtomic Mass - [226] u\nDensity (g/cm3) - 5\nBoiling Point -  1500 C, 2732 F, 1773 K\nMelting Point -  696 C, 1285 F, 969 K",
                        "Discovered by - Humphry Davy in 1808\nElement - Calcium\nSymbol - Ca\nGroup - 2\nPeriod - 4\nBlock - S\nAtomic Number - 20\nAtomic Mass - 40.078 u\nDensity (g/cm3) - 1.54\nBoiling Point -  1484 C, 2703 F, 1757 K\nMelting Point -  842 C, 1548 F, 1115 K",
                        "Discovered by - Adair Crawford in 1790\nElement - Scrontium\nSymbol - Sr\nGroup - 2\nPeriod - 5\nBlock - S\nAtomic Number - 38\nAtomic Mass - 87.62 u\nDensity (g/cm3) - 2.64\nBoiling Point -  1377 C, 2511 F, 1650 K\nMelting Point -  777 C, 1431 F, 1050 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Lars Frederik Nilson in 1879\nElement - Scandium\nSymbol - Sc\nGroup - 3\nPeriod - 4\nBlock - D\nAtomic Number - 21\nAtomic Mass - 44.956 u\nDensity (g/cm3) - 2.99\nBoiling Point -  2836 C, 5137 F, 3109 K\nMelting Point -  1541 C, 2806 F, 1814 K",
                        "Discovered by - Johan Gadolin in 1794\nElement - Yttrium\nSymbol - Y\nGroup - 3\nPeriod - 5\nBlock - D\nAtomic Number - 39\nAtomic Mass - 88.906 u\nDensity (g/cm3) - 4.47\nBoiling Point -  3345 C, 6053 F, 3618 K\nMelting Point -  1522 C, 2772 F, 1795 K",
                        "Lanthanides", "Actinides", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " " },
                { "Discovered by - George Charles de Hevesy and Dirk Coster in 1923\nElement - Hafnium\nSymbol - Hf\nGroup - 4\nPeriod - 6\nBlock - D\nAtomic Number - 72\nAtomic Mass - 178.486 u\nDensity (g/cm3) - 13.3\nBoiling Point -  4600 C, 8312 F, 4873 K\nMelting Point -  2233 C, 4051 F, 2506 K",
                        "Discovered by - Georgy Flerov and colleagues and at Dubna, near Moscow, Russia, and independently by Albert Ghiorso and colleagues at Berkeley, California, USA in 1964\nElement - Rutherfordium\nSymbol - Rf\nGroup - 4\nPeriod - 7\nBlock - D\nAtomic Number - 104\nAtomic Mass - [267] u\nDensity (g/cm3) - 23 \nBoiling Point -  5500 C, 9900 F, 5800 K\nMelting Point -  2100 C, 3800 F, 2400 K",
                        "Discovered by - William Gregor in 1791\nElement - Titanium\nSymbol - Ti\nGroup - 4\nPeriod - 4\nBlock - D\nAtomic Number - 22\nAtomic Mass - 47.867 u\nDensity (g/cm3) - 4.506\nBoiling Point -  3287 C, 5949 F, 3560 K\nMelting Point -  1670 C, 3038 F, 1943 K",
                        "Discovered by - Martin Heinrich Klaproth in 1789\nElement - Zirconium\nSymbol - Zr\nGroup - 4\nPeriod - 5\nBlock - D\nAtomic Number - 40\nAtomic Mass - 91.224 u\nDensity (g/cm3) - 6.52\nBoiling Point -  4406 C, 7963 F, 4679 K\nMelting Point -  1854 C, 3369 F, 2127 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Andres Manuel del Rio in 1801\nElement - Vanadium\nSymbol - V\nGroup - 5\nPeriod - 4\nBlock - D\nAtomic Number - 23\nAtomic Mass - 50.942 u\nDensity (g/cm3) - 6.0\nBoiling Point -  3407 C, 6165 F, 3680 K\nMelting Point -  1910 C, 3470 F, 2183 K",
                        "Discovered by - Charles Hatchett in 1801\nElement - Niobium\nSymbol - Nb\nGroup - 5\nPeriod - 5\nBlock - D\nAtomic Number - 41\nAtomic Mass - 92.906 u\nDensity (g/cm3) - 8.57\nBoiling Point -  4741 C, 8566 F, 5014 K\nMelting Point -  2477 C, 4491 F, 2750 K",
                        "Discovered by - Anders Gustav Ekeberg in 1802\nElement - Tantalum\nSymbol - Ta\nGroup - 5\nPeriod - 6\nBlock - D\nAtomic Number - 73\nAtomic Mass - 180.948 u\nDensity (g/cm3) - 16.4\nBoiling Point -  5455 C, 9851 F, 5728 K\nMelting Point -  3017 C, 5463 F, 3290 K",
                        "Discovered by - Scientists at both Berkeley, California, USA, and Dubna, near Moscow, Russia in 1968-1970\nElement - Dubnium\nSymbol - Db\nGroup - 5\nPeriod - 7\nBlock - D\nAtomic Number - 105\nAtomic Mass - [268] u\nDensity (g/cm3) - 21.6\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Juan and Fausto Elhuyar in 1783\nElement - Tungsten\nSymbol - W\nGroup - 6\nPeriod - 6\nBlock - D\nAtomic Number - 74\nAtomic Mass - 183.84 u\nDensity (g/cm3) - 19.3\nBoiling Point -  5555 C, 10031 F, 5828 K\nMelting Point -  3414 C, 6177 F, 3687 K",
                        "Discovered by - Albert Ghiorso and colleagues in 1974\nElement - Seaborgium\nSymbol - Sg\nGroup - 6\nPeriod - 7\nBlock - D\nAtomic Number - 106\nAtomic Mass - [269] u\nDensity (g/cm3) - 23-24\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        "Discovered by - Nicholas Louis Vauquelin in 1798\nElement - Chromium\nSymbol - Cr\nGroup - 6\nPeriod - 4\nBlock - D\nAtomic Number - 24\nAtomic Mass - 51.996 u\nDensity (g/cm3) - 7.15\nBoiling Point -  2671 C, 4840 F, 2944 K\nMelting Point -  1907 C, 3465 F, 2180 K",
                        "Discovered by - Peter Jacob Hjelm in 1781\nElement - Molybdenum\nSymbol - Mo\nGroup - 6\nPeriod - 5\nBlock - D\nAtomic Number - 42\nAtomic Mass - 95.95 u\nDensity (g/cm3) - 10.2\nBoiling Point -  4639 C, 8382 F, 4912 K\nMelting Point -  2622 C, 4752 F, 2895 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Johan Gottlieb Gahn in 1774\nElement - Manganese\nSymbol - Mn\nGroup - 7\nPeriod - 4\nBlock - D\nAtomic Number - 25\nAtomic Mass - 54.938 u\nDensity (g/cm3) - 7.3\nBoiling Point -  2061 C, 3742 F, 2334 K\nMelting Point -  1246 C, 2275 F, 1519 K",
                        "Discovered by - Carlo Perrier and Emilio Segre in 1937\nElement - Technetium\nSymbol - Tc\nGroup - 7\nPeriod - 5\nBlock - D\nAtomic Number - 43\nAtomic Mass - [98] u\nDensity (g/cm3) - 11\nBoiling Point -  4262 C, 7704 F, 4535 K\nMelting Point -  2157 C, 3915 F, 2430 K",
                        "Discovered by - Walter Noddack, Ida Tacke and Otto Berg in 1925\nElement - Rhenium\nSymbol - Re\nGroup - 7\nPeriod - 6\nBlock - D\nAtomic Number - 75\nAtomic Mass - 186.207 u\nDensity (g/cm3) - 20.8\nBoiling Point -  5590 C, 10094 F, 5863 K\nMelting Point -  3185 C, 5765 F, 3458 K",
                        "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1981\nElement - Bohrium\nSymbol - Bh\nGroup - 6\nPeriod - 7\nBlock - D\nAtomic Number - 107\nAtomic Mass - [270] u\nDensity (g/cm3) - 26-27\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Smithson Tennant in 1803\nElement - Osmium\nSymbol - Os\nGroup - 8\nPeriod - 6\nBlock - D\nAtomic Number - 76\nAtomic Mass - 190.23 u\nDensity (g/cm3) - 22.5872\nBoiling Point -  5008 C, 9046 F, 5281 K\nMelting Point -  3033 C, 5491 F, 3306 K",
                        "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1984\nElement - Hassium\nSymbol - Hs\nGroup - 8\nPeriod - 7\nBlock - D\nAtomic Number - 108\nAtomic Mass - [269] u\nDensity (g/cm3) - 27-29\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        "Discovered by - Known since ancient times (approx 3500BC)\nElement - Iron\nSymbol - Fe\nGroup - 8\nPeriod - 4\nBlock - D\nAtomic Number - 26\nAtomic Mass - 55.845 u\nDensity (g/cm3) - 7.87\nBoiling Point -  2861 C, 5182 F, 3134 K\nMelting Point -  1538 C, 2800 F, 1811 K",
                        "Discovered by - Karl Karlovich Klaus in 1844\nElement - Ruthenium\nSymbol - Ru\nGroup - 8\nPeriod - 5\nBlock - D\nAtomic Number - 44\nAtomic Mass - 101.07 u\nDensity (g/cm3) - 12.1\nBoiling Point -  4147 C, 7497 F, 4420 K\nMelting Point -  2333 C, 4231 F, 2606 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Georg Brandt in 1739\nElement - Cobalt\nSymbol - Co\nGroup - 9\nPeriod - 4\nBlock - D\nAtomic Number - 27\nAtomic Mass - 58.933 u\nDensity (g/cm3) - 8.86\nBoiling Point -  2927 C, 5301 F, 3200 K\nMelting Point -  1495 C, 2723 F, 1768 K",
                        "Discovered by - William Hyde Wollaston in 1803\nElement - Rhodium\nSymbol - Rh\nGroup - 9\nPeriod - 5\nBlock - D\nAtomic Number - 45\nAtomic Mass - 102.906 u\nDensity (g/cm3) - 12.4\nBoiling Point -  3695 C, 6683 F, 3968 K\nMelting Point -  1963 C, 3565 F, 2236 K",
                        "Discovered by - Smithson Tennant in 1803\nElement - Iridium\nSymbol - Ir\nGroup - 9\nPeriod - 6\nBlock - D\nAtomic Number - 77\nAtomic Mass - 192.217 u\nDensity (g/cm3) - 22.5622\nBoiling Point -  4428 C, 8002 F, 4701 K\nMelting Point -  2446 C, 4435 F, 2719 K",
                        "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1982\nElement - Meitnerium\nSymbol - Mt\nGroup - 9\nPeriod - 7\nBlock - D\nAtomic Number - 109\nAtomic Mass - [278] u\nDensity (g/cm3) - 27-28\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Antonio de Ulloa in 1735\nElement - Platinum\nSymbol - Pt\nGroup - 10\nPeriod - 6\nBlock - D\nAtomic Number - 78\nAtomic Mass - 195.084 u\nDensity (g/cm3) - 21.5\nBoiling Point -  3825 C, 6917 F, 4098 K\nMelting Point -  1768.2 C, 3214.8 F, 2041.4 K",
                        "Discovered by - Sigurd Hofmann, Peter Armbruster and Gottfried Munzenberg in 1994\nElement - Darmstadtium\nSymbol - Ds\nGroup - 10\nPeriod - 7\nBlock - D\nAtomic Number - 110\nAtomic Mass - [281] u\nDensity (g/cm3) - 26 - 27\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        "Discovered by - Axel Fredrik Cronstedt in 1751\nElement - Nickel\nSymbol - Ni\nGroup - 10\nPeriod - 4\nBlock - D\nAtomic Number - 28\nAtomic Mass - 58.693 u\nDensity (g/cm3) - 8.90\nBoiling Point -  2913 C, 5275 F, 3186 K\nMelting Point -  1455 C, 2651 F, 1728 K",
                        "Discovered by - William Hyde Wollaston in 1803\nElement - Palladium\nSymbol - Pd\nGroup - 10\nPeriod - 5\nBlock - D\nAtomic Number - 46\nAtomic Mass - 106.42 u\nDensity (g/cm3) - 12.0\nBoiling Point -  2963 C, 5365 F, 3236 K\nMelting Point -  1554.8 C, 2830.6 F, 1828 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Known since ancient times (Prehistoric)\nElement - Copper\nSymbol - Cu\nGroup - 11\nPeriod - 4\nBlock - D\nAtomic Number - 29\nAtomic Mass - 63.546 u\nDensity (g/cm3) - 8.96\nBoiling Point -  2560 C, 4640 F, 2833 K\nMelting Point -  1084.62 C, 1984.32 F, 1357.77 K",
                        "Discovered by - (approx 3000BC)\nElement - Silver\nSymbol - Ag\nGroup - 11\nPeriod - 5\nBlock - D\nAtomic Number - 47\nAtomic Mass - 107.868 u\nDensity (g/cm3) - 10.5\nBoiling Point -  2162 C, 3924 F, 2435 K\nMelting Point -  961.78 C, 1763.2 F, 1234.93 K",
                        "Discovered by - (approx 3000BC)\nElement - Gold\nSymbol - Au\nGroup - 11\nPeriod - 6\nBlock - D\nAtomic Number - 79\nAtomic Mass - 196.967 u\nDensity (g/cm3) - 19.3\nBoiling Point -  2836 C, 5137 F, 3109 K\nMelting Point -  1064.18 C, 1947.52 F, 1337.33 K",
                        "Discovered by - Peter Armbruster, Gottfried Munzenberg and colleagues in 1994\nElement - Roentgenium\nSymbol - Rg\nGroup - 11\nPeriod - 7\nBlock - D\nAtomic Number - 111\nAtomic Mass - [280] u\nDensity (g/cm3) - 28.7\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - (approx 1500BC)\nElement - Mercury\nSymbol - Hg\nGroup - 12\nPeriod - 6\nBlock - D\nAtomic Number - 80\nAtomic Mass - 200.592 u\nDensity (g/cm3) - 13.5336\nBoiling Point -  356.619 C, 673.914 F, 629.769 K\nMelting Point -  -38.829 C, -37.892 F, 234.321 K",
                        "Discovered by - Sigurd Hofmann and colleagues in 1996\nElement - Copernicium\nSymbol - Cn\nGroup - 12\nPeriod - 7\nBlock - D\nAtomic Number - 112\nAtomic Mass - [285] u\nDensity (g/cm3) - 14.0\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        "Discovered by - Andreas Marggraf (Identified as an element in 1746, but known to the Greeks and Romans before 20BC)\nElement - Zinc\nSymbol - Zn\nGroup - 12\nPeriod - 4\nBlock - D\nAtomic Number - 30\nAtomic Mass - 65.38 u\nDensity (g/cm3) - 7.134\nBoiling Point -  907 C, 1665 F, 1180 K\nMelting Point -  419.527 C, 787.149 F, 692.677 K",
                        "Discovered by - Friedrich Stromeyer in 1817\nElement - Cadmium\nSymbol - Cd\nGroup - 12\nPeriod - 5\nBlock - D\nAtomic Number - 48\nAtomic Mass - 112.414 u\nDensity (g/cm3) - 8.69\nBoiling Point -  767 C, 1413 F, 1040 K\nMelting Point -  321.069 C, 609.924 F, 594.219 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Paul-Emile Lecoq de Boisbaudran in 1875\nElement - Gallium\nSymbol - Ga\nGroup - 13\nPeriod - 4\nBlock - P\nAtomic Number - 31\nAtomic Mass - 69.723 u\nDensity (g/cm3) - 5.91\nBoiling Point -  2229 C, 4044 F, 2502 K\nMelting Point -  29.7646 C, 85.5763 F, 302.9146 K",
                        "Discovered by - Ferdinand Reich and Hieronymous Richter in 1863\nElement - Indium\nSymbol - In\nGroup - 13\nPeriod - 5\nBlock - P\nAtomic Number - 49\nAtomic Mass - 114.818 u\nDensity (g/cm3) - 7.31\nBoiling Point -  2027 C, 3681 F, 2300 K\nMelting Point -  156.60 C, 313.88 F, 429.75 K",
                        "Discovered by - William Crookes in 1861\nElement - Thallium\nSymbol - Tl\nGroup - 13\nPeriod - 6\nBlock - P\nAtomic Number - 81\nAtomic Mass - 204.38 u\nDensity (g/cm3) - 11.8\nBoiling Point -  1473 C, 2683 F, 1746 K\nMelting Point -  304 C, 579 F, 577 K",
                        "Discovered by - Scientists from RIKEN (The Institute of Physical and Chemical Research) in Japan in 2004\nElement - Nihonium\nSymbol - Nh\nGroup - 13\nPeriod - 7\nBlock - P\nAtomic Number - 113\nAtomic Mass - [286] u\nDensity (g/cm3) - 16\nBoiling Point -  Unknown\nMelting Point -  Unknown",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Ancient\nElement - Lead\nSymbol - Pb\nGroup - 14\nPeriod - 6\nBlock - P\nAtomic Number - 82\nAtomic Mass - 207.2 u\nDensity (g/cm3) - 11.3\nBoiling Point -  1749 C, 3180 F, 2022 K\nMelting Point -  327.462 C, 621.432 F, 600.612 K",
                        "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia and the Lawrence Livermore National Laboratory, California, USA in 1999\nElement - Flerovium\nSymbol - Fl\nGroup - 14\nPeriod - 7\nBlock - P\nAtomic Number - 114\nAtomic Mass - [289] u\nDensity (g/cm3) - 9.928\nBoiling Point -  107 C, 224 F, 380 K\nMelting Point -  -73 C, -100 F, 200 K",
                        "Discovered by - Clemens Winkler in 1886\nElement - Germanium\nSymbol - Ge\nGroup - 14\nPeriod - 4\nBlock - P\nAtomic Number - 32\nAtomic Mass - 72.630 u\nDensity (g/cm3) - 5.3234\nBoiling Point -  2833 C, 5131 F, 3106 K\nMelting Point -  938.25 C, 1720.85 F, 1211.4 K",
                        "Discovered by - (approx 2100BC)\nElement - Tin\nSymbol - In\nGroup - 14\nPeriod - 5\nBlock - P\nAtomic Number - 50\nAtomic Mass - 118.710 u\nDensity (g/cm3) - 7.287\nBoiling Point -  2586 C, 4687 F, 2859 K\nMelting Point -  231.928 C, 449.47 F, 505.078 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Albertus Magnus in (approx 1250)\nElement - Arsenic\nSymbol - As\nGroup - 15\nPeriod - 4\nBlock - P\nAtomic Number - 33\nAtomic Mass - 74.922 u\nDensity (g/cm3) - 5.75\nBoiling Point -  Sublimes at 616 C, 1141 F, 889 K\nMelting Point -  Sublimes at 616 C, 1141 F, 889 K",
                        "Discovered by - (approx 1600BC)\nElement - Antimony\nSymbol - Sb\nGroup - 15\nPeriod - 5\nBlock - P\nAtomic Number - 51\nAtomic Mass - 121.760 u\nDensity (g/cm3) - 6.68\nBoiling Point -  1587 C, 2889 F, 1860 K\nMelting Point -  630.628 C, 1167.13 F, 903.778 K",
                        "Discovered by - approx 1500\nElement - Bismuth\nSymbol - Bi\nGroup - 15\nPeriod - 6\nBlock - P\nAtomic Number - 83\nAtomic Mass - 208.980 u\nDensity (g/cm3) - 9.79\nBoiling Point -  1564 C, 2847 F, 1837 K\nMelting Point -  271.406 C, 520.531 F, 544.556 K",
                        "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, the Lawrence Livermore National Laboratory in California, USA, and Oak Ridge National Laboratory in Tennessee, USA in 2010\nElement - Moscovium\nSymbol - Mc\nGroup - 15\nPeriod - 7\nBlock - P\nAtomic Number - 115\nAtomic Mass - [289] u\nDensity (g/cm3) - 13.5\nBoiling Point -  ~1100 C, ~2000 F, ~1400 K\nMelting Point -  400 C, 750 F, 670 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Marie Curie in 1898\nElement - Polonium\nSymbol - Po\nGroup - 16\nPeriod - 6\nBlock - P\nAtomic Number - 84\nAtomic Mass - [209] u\nDensity (g/cm3) - 9.20\nBoiling Point -  962 C, 1764 F, 1235 K\nMelting Point -  254 C, 489 F, 527 K",
                        "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia and the Lawrence Livermore National Laboratory, California, USA in 2000\nElement - Livermorium\nSymbol - Lv\nGroup - 16\nPeriod - 7\nBlock - P\nAtomic Number - 116\nAtomic Mass - [293] u\nDensity (g/cm3) - 12.9\nBoiling Point -  762-862 C, 1043-1853 F, 1035-1135 K\nMelting Point -  364-507 C, 687-944 F, 637-780 K",
                        "Discovered by - Jons Jacob Berzelius in 1817\nElement - Selenium\nSymbol - Se\nGroup - 16\nPeriod - 4\nBlock - P\nAtomic Number - 34\nAtomic Mass - 78.971 u\nDensity (g/cm3) - 4.809\nBoiling Point -  685 C, 1265 F, 958 K\nMelting Point -  220.8 C, 429.4 F, 494 K",
                        "Discovered by - Franz-Joseph Muller von Reichenstein in 1783\nElement - Tellurium\nSymbol - Te\nGroup - 16\nPeriod - 5\nBlock - P\nAtomic Number - 52\nAtomic Mass - 127.60 u\nDensity (g/cm3) - 6.232\nBoiling Point -  988 C, 1810 F, 1261 K\nMelting Point -  449.51 C, 841.12 F, 722.66 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Antoine-Jerome Balard in Montpellier, France and Carl Lowig in Heidelberg, Germany in 1826\nElement - Bromine\nSymbol - Br\nGroup - 17\nPeriod - 4\nBlock - P\nAtomic Number - 35\nAtomic Mass - 79.904 u\nDensity (g/cm3) - 3.1028\nBoiling Point -  58.8 C, 137.8 F, 332 K\nMelting Point -  -7.2 C, 19 F, 266 K",
                        "Discovered by - Bernard Courtois in 1811\nElement - Iodine\nSymbol - I\nGroup - 17\nPeriod - 5\nBlock - P\nAtomic Number - 53\nAtomic Mass - 126.904 u\nDensity (g/cm3) - 4.933\nBoiling Point -  184.4 C, 363.9 F, 457.6 K\nMelting Point -  113.7 C, 236.7 F, 386.9 K",
                        "Discovered by - Dale R. Corson, Kenneth Ross MacKenzie, Emilio Segre in 1940\nElement - Astatine\nSymbol - At\nGroup - 17\nPeriod - 6\nBlock - P\nAtomic Number - 85\nAtomic Mass - [210] u\nDensity (g/cm3) - Unknown\nBoiling Point -  350 C, 662 F, 623 K\nMelting Point -  300 C, 572 F, 573 K",
                        "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, the Lawrence Livermore National Laboratory in California, USA, and Oak Ridge National Laboratory in Tennessee, USA in 2010\nElement - Tennessine\nSymbol - Ts\nGroup - 17\nPeriod - 7\nBlock - P\nAtomic Number - 117\nAtomic Mass - [294] u\nDensity (g/cm3) - 7.1-7.3\nBoiling Point -  610 C, 1130 F, 883 K\nMelting Point -  350-550 C, 662-1022 F, 623-823 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Friedrich Ernst Dorn in 1900\nElement - Radon\nSymbol - Rn\nGroup - 18\nPeriod - 6\nBlock - P\nAtomic Number - 86\nAtomic Mass - [222] u\nDensity (g/cm3) - 0.009074\nBoiling Point -  -61.7 C, -79.1 F, 211.5 K\nMelting Point -  -71 C, -96 F, 202 K",
                        "Discovered by - Scientists from the Joint Institute for Nuclear Research in Dubna, Russia, and the Lawrence Livermore National Laboratory in California, USA in 2006\nElement - Oganesson\nSymbol - Og\nGroup - 18\nPeriod - 7\nBlock - P\nAtomic Number - 118\nAtomic Mass - [294] u\nDensity (g/cm3) - 7.1-7.3\nBoiling Point -  177 +(-) 10 C, 350 +(-) 18 F, 450 +(-) 10 K\nMelting Point -  52 +(-) 15 C, 125 +(-) 27 F, 325 +(-) 15 K",
                        "Discovered by - Sir William Ramsay and Morris Travers in 1898\nElement - Krypton\nSymbol - Kr\nGroup - 18\nPeriod - 4\nBlock - P\nAtomic Number - 36\nAtomic Mass - 83.798 u\nDensity (g/cm3) - 0.003425\nBoiling Point -  -153.415 C, -244.147 F, 119.735 K\nMelting Point -  -157.37 C, -251.27 F, 115.78 K",
                        "Discovered by - Sir William Ramsay and Morris Travers in 1898\nElement - Xenon\nSymbol - Xe\nGroup - 18\nPeriod - 5\nBlock - P\nAtomic Number - 54\nAtomic Mass - 131.293 u\nDensity (g/cm3) - 0.005366\nBoiling Point -  -108.099 C, -162.578 F, 165.051 K\nMelting Point -  -111.75 C, -169.15 F, 161.4 K",
                        " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " } };
        String[][] LinkStr3 = {
                { "https://en.wikipedia.org/wiki/Potassium", "https://en.wikipedia.org/wiki/Rubidium",
                        "https://en.wikipedia.org/wiki/Caesium", "https://en.wikipedia.org/wiki/Francium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Barium", "https://en.wikipedia.org/wiki/Radium",
                        "https://en.wikipedia.org/wiki/Calcium", "https://en.wikipedia.org/wiki/Strontium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Scandium", "https://en.wikipedia.org/wiki/Yttrium", "", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Hafnium", "https://en.wikipedia.org/wiki/Rutherfordium",
                        "https://en.wikipedia.org/wiki/Titanium", "https://en.wikipedia.org/wiki/Zicronium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Vanadium", "https://en.wikipedia.org/wiki/Niobium",
                        "https://en.wikipedia.org/wiki/Tantalum", "https://en.wikipedia.org/wiki/Dubnium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Tungsten", "https://en.wikipedia.org/wiki/Seaborgium",
                        "https://en.wikipedia.org/wiki/Chromium", "https://en.wikipedia.org/wiki/Molybdenum", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Manganese", "https://en.wikipedia.org/wiki/Technetium",
                        "https://en.wikipedia.org/wiki/Rhenium", "https://en.wikipedia.org/wiki/Bohrium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Osmium", "https://en.wikipedia.org/wiki/Hassium",
                        "https://en.wikipedia.org/wiki/Iron", "https://en.wikipedia.org/wiki/Ruthenium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Cobalt", "https://en.wikipedia.org/wiki/Rhodium",
                        "https://en.wikipedia.org/wiki/Iridium", "https://en.wikipedia.org/wiki/Meitnerium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Platinum", "https://en.wikipedia.org/wiki/Darmstadtium",
                        "https://en.wikipedia.org/wiki/Nickel", "https://en.wikipedia.org/wiki/Palladium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Copper", "https://en.wikipedia.org/wiki/Silver",
                        "https://en.wikipedia.org/wiki/Gold", "https://en.wikipedia.org/wiki/Roentgenium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Mercury", "https://en.wikipedia.org/wiki/Copernicium",
                        "https://en.wikipedia.org/wiki/Zinc", "https://en.wikipedia.org/wiki/Cadmium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Gallium", "https://en.wikipedia.org/wiki/Indium",
                        "https://en.wikipedia.org/wiki/Thallium", "https://en.wikipedia.org/wiki/Nihonium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Lead", "https://en.wikipedia.org/wiki/Flerovium",
                        "https://en.wikipedia.org/wiki/Germanium", "https://en.wikipedia.org/wiki/Tin", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Arsenic", "https://en.wikipedia.org/wiki/Antimony",
                        "https://en.wikipedia.org/wiki/Bismuth", "https://en.wikipedia.org/wiki/Moscovium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Polonium", "https://en.wikipedia.org/wiki/Livermorium",
                        "https://en.wikipedia.org/wiki/Selenium", "https://en.wikipedia.org/wiki/Tellurium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Bromine", "https://en.wikipedia.org/wiki/Iodine",
                        "https://en.wikipedia.org/wiki/Astatine", "https://en.wikipedia.org/wiki/Tennessine", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Radon", "https://en.wikipedia.org/wiki/Oganesson",
                        "https://en.wikipedia.org/wiki/Krypton", "https://en.wikipedia.org/wiki/Xenon", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "" } };
        String[][] TitStr3 = {
                { "Potassium (K)", "Rubidium (Rb)", "Caesium (Cs)", "Francium (Fr)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Barium (Ba)", "Radium (Ra)", "Calcium (Ca)", "Strontium (Sr)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Scandium (Sc)", "Yttrium (Y)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" },
                { "Hafnium (Hf)", "Rutherfordium (Rf)", "Titanium (Ti)", "Zicronium (Zr)", "", "", "", "", "", "", "",
                        "", "", "", "", "", "", "" },
                { "Vanadium (V)", "Niobium (Nb)", "Tantalum (Ta)", "Dubnium (Db)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Tungsten (W)", "Seaborgium (Sg)", "Chromium (Cr)", "Molybdenum (Mo)", "", "", "", "", "", "", "", "",
                        "", "", "", "", "", "" },
                { "Manganese (Mn)", "Technetium (Tc)", "Rhenium (Re)", "Bohrium (Bh)", "", "", "", "", "", "", "", "",
                        "", "", "", "", "", "" },
                { "Osmium (Os)", "Hassium (Hs)", "Iron (Fe)", "Ruthenium (Ru)", "", "", "", "", "", "", "", "", "", "",
                        "", "", "", "" },
                { "Cobalt (Co)", "Rhodium (Rh)", "Iridium (Ir)", "Meitnerium (Mt)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Platinum (Pt)", "Darmstadtium (Ds)", "Nickel (Ni)", "Palladium (Pd)", "", "", "", "", "", "", "", "",
                        "", "", "", "", "", "" },
                { "Copper (Cu)", "Silver (Ag)", "Gold (Au)", "Roentgenium (Rg)", "", "", "", "", "", "", "", "", "", "",
                        "", "", "", "" },
                { "Mercury (Hg)", "Copernicium (Cn)", "Zinc (Zn)", "Cadmium (Cd)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Gallium (Ga)", "Indium (In)", "Thallium (Tl)", "Nihonium (Nh)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Lead (Pb)", "Flerovium (Fl)", "Germanium (Ge)", "Tin (Sn)", "", "", "", "", "", "", "", "", "", "",
                        "", "", "", "" },
                { "Arsenic (As)", "Antimony (Sb)", "Bismuth (Bi)", "Moscovium (Mc)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Polonium (Po)", "Livermorium (Lv)", "Selenium (Sc)", "Tellurium (Te)", "", "", "", "", "", "", "",
                        "", "", "", "", "", "", "" },
                { "Bromine (Br)", "Iodine (I)", "Astatine (At)", "Tennessine (Ts)", "", "", "", "", "", "", "", "", "",
                        "", "", "", "", "" },
                { "Radon (Rn)", "Ognesson (Og)", "Krypton (K)", "Xenon (Xe)", "", "", "", "", "", "", "", "", "", "",
                        "", "", "", "" } };
        Color[] ColStr3 = { Color.MAGENTA.darker(), Color.BLUE };
        int Hor3 = 30;
        int Ver3 = 179;
        JButton[][] JB3 = new JButton[18][18];
        for (int i = 0; i < JB3.length; i++) {
            for (int j = 0; j < JB3.length; j++) {
                JB3[i][j] = new JButton(EleStr3[i][j]);
                JB3[i][j].setFont(new Font("Serif", Font.BOLD, 20));
                JB3[i][j].setBackground(Color.BLACK);
                JB3[i][j].setBounds(Hor3, Ver3, 65, 40);
                if (JB3[i][j].getText() == "K" || JB3[i][j].getText() == "Rb" || JB3[i][j].getText() == "Cs"
                        || JB3[i][j].getText() == "Fr") {
                    JB3[i][j].setForeground(ColStr1[1]);
                } else if (JB3[i][j].getText() == "Ca" || JB3[i][j].getText() == "Sr" || JB3[i][j].getText() == "Ba"
                        || JB3[i][j].getText() == "Ra") {
                    JB3[i][j].setForeground(ColStr1[2]);
                } else if (JB3[i][j].getText() == "Ga" || JB3[i][j].getText() == "In" || JB3[i][j].getText() == "Tl"
                        || JB3[i][j].getText() == "Nh" || JB3[i][j].getText() == "Sn" || JB3[i][j].getText() == "Pb"
                        || JB3[i][j].getText() == "Fl" || JB3[i][j].getText() == "Bi" || JB3[i][j].getText() == "Mc"
                        || JB3[i][j].getText() == "Po" || JB3[i][j].getText() == "Lv") {
                    JB3[i][j].setForeground(ColStr2[3]);
                } else if (JB3[i][j].getText() == "Ge" || JB3[i][j].getText() == "As" || JB3[i][j].getText() == "Sb"
                        || JB3[i][j].getText() == "Te") {
                    JB3[i][j].setForeground(ColStr2[2]);
                } else if (JB3[i][j].getText() == "*") {
                    JB3[i][j].setForeground(ColStr3[0]);
                } else if (JB3[i][j].getText() == "Br" || JB3[i][j].getText() == "At" || JB3[i][j].getText() == "I"
                        || JB3[i][j].getText() == "Ts") {
                    JB3[i][j].setForeground(ColStr2[1]);
                } else if (JB3[i][j].getText() == "* *") {
                    JB3[i][j].setForeground(ColStr3[1]);
                } else if (JB3[i][j].getText() == "Kr" || JB3[i][j].getText() == "Xe" || JB3[i][j].getText() == "Rn"
                        || JB3[i][j].getText() == "Og") {
                    JB3[i][j].setForeground(ColStr2[4]);
                } else if (JB3[i][j].getText() == "Se") {
                    JB3[i][j].setForeground(ColStr1[0]);
                } else {
                    JB3[i][j].setForeground(ColStr2[0]);
                }
                if (Ver3 >= 308) {
                    Ver3 = 136;
                }
                JB3[i][j].setFocusPainted(false);
                F.add(JB3[i][j]);
                int k = i;
                int l = j;
                JB3[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Ae) {
                        if (T.isSelected()) {
                            Open(LinkStr3[k][l]);
                        } else {
                            O.showMessageDialog(F, DcrStr3[k][l], TitStr3[k][l], JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                });
                Ver3 += 43;
            }
            if (Hor3 >= 1186) {
                break;
            }
            Hor3 += 68;
        }

        // CODE - 4
        String[][] EleStr4 = {
                { "La", "Ac", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Ce", "Th", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Pr", "Pa", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Nd", "U", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Pm", "Np", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Sm", "Pu", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Eu", "Am", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Gd", "Cm", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Tb", "Bk", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Dy", "Cf", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Ho", "Es", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Er", "Fm", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Tm", "Md", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Yb", "No", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Lu", "Lr", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " " } };
        String[][] DcrStr4 = { {
                "Discovered by - Carl Gustav Mosander in 1839\nElement - Lanthanum\nSymbol - La\nGroup - Lanthanides\nPeriod - 6\nBlock - D\nAtomic Number - 57\nAtomic Mass - 138.905 u\nDensity (g/cm3) - 6.15\nBoiling Point -  3464 C, 6267 F, 3737 K\nMelting Point -  920 C, 1688 F, 1193 K",
                "Discovered by - Andrew Debierne in 1899\nElement - Actinium\nSymbol - Ac\nGroup - Actinides\nPeriod - 7\nBlock - D\nAtomic Number - 89\nAtomic Mass - [227] u\nDensity (g/cm3) - 10\nBoiling Point -  3200 C, 5792 F, 3473 K\nMelting Point -  1050 C, 1922 F, 1323 K",
                "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Jons Jacob Berzelius and Wilhelm Hisinger in 1803\nElement - Cerium\nSymbol - Ce\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 58\nAtomic Mass - 140.116 u\nDensity (g/cm3) - 6.77\nBoiling Point -  3443 C, 6229 F, 3716 K\nMelting Point -  799 C, 1470 F, 1072 K",
                        "Discovered by - Jons Jacob Berzelius in 1829\nElement - Thorium\nSymbol - Th\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 90\nAtomic Mass - 232.038 u\nDensity (g/cm3) - 11.7\nBoiling Point -  4785 C, 8645 F, 5058 K\nMelting Point -  1750 C, 3182 F, 2023 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Carl Auer von Welsbach in 1885\nElement - Praseodymium\nSymbol - Pr\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 59\nAtomic Mass - 140.908 u\nDensity (g/cm3) - 6.77\nBoiling Point -  3520 C, 6368 F, 3793 K\nMelting Point -  931 C, 1708 F, 1204 K",
                        "Discovered by - Kasimir Fajans and Otto Gohring in 1913\nElement - Protactinium\nSymbol - Pa\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 91\nAtomic Mass - 231.036 u\nDensity (g/cm3) - 15.4\nBoiling Point -  4000 C, 7232 F, 4273 K\nMelting Point -  1572 C, 2862 F, 1845 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Carl Auer von Welsbach in 1885\nElement - Neodymium\nSymbol - Nd\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 60\nAtomic Mass - 144.242 u\nDensity (g/cm3) - 7.01\nBoiling Point -  3074 C, 5565 F, 3347 K\nMelting Point -  1016 C, 1861 F, 1289 K",
                        "Discovered by - Martin Heinrich Klaproth in 1789\nElement - Uranium\nSymbol - U\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 92\nAtomic Mass - 238.029 u\nDensity (g/cm3) - 19.1\nBoiling Point -  4131 C, 7468 F, 4404 K\nMelting Point -  1135 C, 2075 F, 1408 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Jacob .A. Marinsky, Lawrence E. Glendenin, and Charles D. Coryell in 1945\nElement - Promethium\nSymbol - Pm\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 61\nAtomic Mass - [145] u\nDensity (g/cm3) - 7.26\nBoiling Point -  3000 C, 5432 F, 3273 K\nMelting Point -  1042 C, 1908 F, 1315 K",
                        "Discovered by - Edwin McMillan and Philip Abelson in 1940\nElement - Neptunium\nSymbol - Np\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 93\nAtomic Mass - [237] u\nDensity (g/cm3) - 20.2\nBoiling Point -  3902 C, 7056 F, 4175 K\nMelting Point -  644 C, 1191 F, 917 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Paul-Emile Lecoq de Boisbaudran in 1879\nElement - Samarium\nSymbol - Sm\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 62\nAtomic Mass - 150.36 u\nDensity (g/cm3) - 7.52\nBoiling Point -  1794 C, 3261 F, 2067 K\nMelting Point -  1072 C, 1962 F, 1345 K",
                        "Discovered by - Glenn Seaborg and colleagues in 1940\nElement - Plutonium\nSymbol - Pu\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 94\nAtomic Mass - [244] u\nDensity (g/cm3) - 19.7\nBoiling Point -  3228 C, 5842 F, 3501 K\nMelting Point -  640 C, 1184 F, 913 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Eugene-Anatole Demarcay in 1901\nElement - Europium\nSymbol - Eu\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 63\nAtomic Mass - 151.964 u\nDensity (g/cm3) - 5.24\nBoiling Point -  1529 C, 2784 F, 1802 K\nMelting Point -  822 C, 1512 F, 1095 K",
                        "Discovered by - Glenn Seaborg and colleagues in 1944\nElement - Americium\nSymbol - Am\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 95\nAtomic Mass - [243] u\nDensity (g/cm3) - 12\nBoiling Point -  2011 C, 3652 F, 2284 K\nMelting Point -  1176 C, 2149 F, 1449 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Jean Charles Galissard de Marignac in 1880\nElement - Gadolinium\nSymbol - Gd\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 64\nAtomic Mass - 157.25 u\nDensity (g/cm3) - 7.90\nBoiling Point -  3273 C, 5923 F, 3546 K\nMelting Point -  1313 C, 2395 F, 1586 K",
                        "Discovered by - Glenn Seaborg and colleagues in 1944\nElement - Curium\nSymbol - Cm\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 96\nAtomic Mass - [247] u\nDensity (g/cm3) - 13.51\nBoiling Point -  ~3100 C, 5600 F, ~3400 K\nMelting Point -  1345 C, 2453 F, 1618 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Carl Gustav Mosander in 1843\nElement - Terbium\nSymbol - Tb\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 65\nAtomic Mass - 158.925 u\nDensity (g/cm3) - 8.23\nBoiling Point -  3230 C, 5846 F, 3503 K\nMelting Point -  1359 C, 2478 F, 1632 K",
                        "Discovered by - Stanley Thompson, Albert Ghiorso, and Glenn Seaborg in 1949\nElement - Berkrlium\nSymbol - Bk\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 97\nAtomic Mass - [247] u\nDensity (g/cm3) - 14.78\nBoiling Point -  2627 C, 4760 F, 2900 K\nMelting Point -  986 C, 1807 F, 1259 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Paul-Emile Lecoq de Boisbaudran in 1886\nElement - Dysprosium\nSymbol - Dy\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 66\nAtomic Mass - 162.500 u\nDensity (g/cm3) - 8.55\nBoiling Point -  2567 C, 4653 F, 2840 K\nMelting Point -  1412 C, 2574 F, 1685 K",
                        "Discovered by - Stanley Thompson, Albert Ghiorso, and Glenn Seaborg in 1950\nElement - Californium\nSymbol - Cf\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 98\nAtomic Mass - [251] u\nDensity (g/cm3) - 15.1\nBoiling Point -  1470 C, 2678 F, 1743 K\nMelting Point -  900 C, 1652 F, 1173 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Per Teodor Cleve at Uppsala, Sweden and independently by Marc Delafontaine and Louis Soret in Geneva, Switzerland in 1878\nElement - Holmium\nSymbol - Ho\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 67\nAtomic Mass - 164.930 u\nDensity (g/cm3) - 8.80\nBoiling Point -  2700 C, 4892 F, 2973 K\nMelting Point -  1472 C, 2682 F, 1745 K",
                        "Discovered by - Albert Ghiorso and colleagues in 1952\nElement - Einsteinium\nSymbol - Es\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 99\nAtomic Mass - [252] u\nDensity (g/cm3) - 8.84\nBoiling Point -  996 C, 1825 F, 1269 K\nMelting Point -  860 C, 1580 F, 1133 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Carl Gustav Mosander in 1843\nElement - Erbium\nSymbol - Er\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 68\nAtomic Mass - 167.259 u\nDensity (g/cm3) - 9.07\nBoiling Point -  2868 C, 5194 F, 3141 K\nMelting Point -  1529 C, 2784 F, 1802 K",
                        "Discovered by - Albert Ghiorso and colleagues in 1953\nElement - Fermium\nSymbol - Fm\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 100\nAtomic Mass - [257] u\nDensity (g/cm3) - 9.7(1)\nBoiling Point -  Unknown\nMelting Point -  1527 C, 2781 F, 1800 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Per Teodor Cleve in 1879\nElement - Thulium\nSymbol - Tm\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 69\nAtomic Mass - 168.934 u\nDensity (g/cm3) - 9.32\nBoiling Point -  1950 C, 3542 F, 2223 K\nMelting Point -  1545 C, 2813 F, 1818 K",
                        "Discovered by - Albert Ghiorso and colleagues in 1955\nElement - Mendelevium\nSymbol - Md\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 101\nAtomic Mass - [258] u\nDensity (g/cm3) - 10.3(7)\nBoiling Point -  Unknown\nMelting Point -  827 C, 1521 F, 1100 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Jean Charles Galissard de Marignac in 1878\nElement - Ytterbium\nSymbol - Yb\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 70\nAtomic Mass - 173.045 u\nDensity (g/cm3) - 6.90\nBoiling Point -  1196 C, 2185 F, 1469 K\nMelting Point -  824 C, 1515 F, 1097 K",
                        "Discovered by - Georgy Flerov and colleagues and at Dubna, near Moscow, Russia, and independently by Albert Ghiorso and colleagues at Berkeley, California, USA in 1963\nElement - Nobelium\nSymbol - No\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 102\nAtomic Mass - [259] u\nDensity (g/cm3) - 9.9(4)\nBoiling Point -  Unknown\nMelting Point -  827 C, 1521 F, 1100 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "Discovered by - Georges Urbain in Paris, France and independently by Charles James in New Hampshire, USA in 1907\nElement - Lutetium\nSymbol - Lu\nGroup - Lanthanides\nPeriod - 6\nBlock - F\nAtomic Number - 71\nAtomic Mass - 174.967 u\nDensity (g/cm3) - 9.84\nBoiling Point -  3402 C, 6156 F, 3675 K\nMelting Point -  1663 C, 3025 F, 1936 K",
                        "Discovered by - Georgy Flerov and colleagues and at Dubna, near Moscow, Russia, and independently by Albert Ghiorso and colleagues at Berkeley, California, USA in 1965\nElement - Lawrencium\nSymbol - Lr\nGroup - Actinides\nPeriod - 7\nBlock - F\nAtomic Number - 103\nAtomic Mass - [262] u\nDensity (g/cm3) - 14.4\nBoiling Point -  Unknown\nMelting Point -  1627 C, 2961 F, 1900 K",
                        "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " } };
        String[][] LinkStr4 = {
                { "https://en.wikipedia.org/wiki/Lanthanum", "https://en.wikipedia.org/wiki/Actinium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Cerium", "https://en.wikipedia.org/wiki/Thorium", "", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Praseodymium", "https://en.wikipedia.org/wiki/Protactinium", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Neodymium", "https://en.wikipedia.org/wiki/Uranium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Promethium", "https://en.wikipedia.org/wiki/Neptunium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Samarium", "https://en.wikipedia.org/wiki/Plutonium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Europium", "https://en.wikipedia.org/wiki/Americium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Gadolinium", "https://en.wikipedia.org/wiki/Curium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Terbium", "https://en.wikipedia.org/wiki/Berkelium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Dysprosium", "https://en.wikipedia.org/wiki/Californium", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Holmium", "https://en.wikipedia.org/wiki/Einsteinium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Erbium", "https://en.wikipedia.org/wiki/Fermium", "", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Thullium", "https://en.wikipedia.org/wiki/Mendelevium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Yetterbium", "https://en.wikipedia.org/wiki/Nobelium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" },
                { "https://en.wikipedia.org/wiki/Lutetium", "https://en.wikipedia.org/wiki/Lawrencium", "", "", "", "",
                        "", "", "", "", "", "", "", "", "", "", "", "" } };
        String[][] TitStr4 = {
                { "Lanthanum (La)", "Actinium (Ac)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " " },
                { "Cerium (Ce)", "Thorium (Th)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Praseodymium (Pr)", "Protactinium (Pa)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " ", " ", " " },
                { "Neodymium (Nd)", "Uranium (U)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Promethium (Pm)", "Neptunium (Np)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " ", " " },
                { "Samarium (Sm)", "Plutonium (Pu)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Europium (Eu)", "Americium (Am)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Gadolinium (Gd)", "Curium (Cm)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Terbium (Tb)", "Berkelium (Bk)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Dysprosium (Dy)", "Californium (Cf)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " ", " " },
                { "Holmium (Ho)", "Einsteinium (Es)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " ", " " },
                { "Erbium (Er)", "Fermium (Fm)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Thulium (Tm)", "Mendelevium (Md)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " ", " " },
                { "Ytterbium (Yb)", "Nobelium (No)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " " },
                { "Lutetium (Lu)", "Lawrencium (Lr)", "", "", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                        " ", " ", " ", " ", " " } };
        int Hor4 = 166;
        int Ver4 = 370;
        int Count = 0;
        JButton[][] JB4 = new JButton[18][18];
        for (int i = 0; i < JB4.length; i++) {
            for (int j = 0; j < JB4.length; j++) {
                JB4[i][j] = new JButton();
                JB4[i][j] = new JButton(EleStr4[i][j]);
                JB4[i][j].setFont(new Font("Serif", Font.BOLD, 20));
                JB4[i][j].setBackground(Color.BLACK);
                JB4[i][j].setForeground(ColStr3[0]);
                JB4[i][j].setBounds(Hor4, Ver4, 65, 40);
                if (Ver4 >= 413) {
                    JB4[i][j].setForeground(ColStr3[1]);
                    Ver4 = 327;
                }
                JB4[i][j].setFocusPainted(false);
                F.add(JB4[i][j]);
                int k = i;
                int l = j;
                JB4[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Ae) {
                        if (T.isSelected()) {
                            Open(LinkStr4[k][l]);
                        } else {
                            O.showMessageDialog(F, DcrStr4[k][l], TitStr4[k][l], JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                });
                Ver4 += 43;
                Count++;
            }
            if (Count % 2 == 0) {
                Hor4 += 68;
            }
            if (Hor4 >= 1186) {
                break;
            }
        }

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