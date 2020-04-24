package khosro;

import java.awt.*;
import javax.swing.*;

public class CalculatorGUI {


    private JButton sevenB, eightB, nineB, divideB, fourB, fiveB, sixB, multiplyB, oneB, twoB, threeB, subtractB, zeroB, dotB, equalsB, addB, a, b, c, d,e,f,g,h,i;

    public CalculatorGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setTitle("Calculator");
        frame.setSize(350, 390);
        frame.setLocation(800, 100);
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(200, 200, 700, 800);
        JTextArea display = new JTextArea(3, 12);
        JTextArea display2 = new JTextArea(3, 12);

        display.setEditable(false);
        display2.setEditable(false);
        display.setFont(new Font("Arial", 14, 21));
        display2.setFont(new Font("Arial", 14, 30));

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel buttonPanel2 = new JPanel(new GridLayout(5, 5));
        JPanel panel22 = new JPanel();
        JPanel panel32= new JPanel();

        panel2.add(display, BorderLayout.NORTH);
        panel3.add(panel2);
        panel22.add(display2, BorderLayout.NORTH);
        panel32.add(panel22);


        //   frame.add(display, BorderLayout.NORTH);

        a = new JButton("CE");
        b = new JButton("C");
        c = new JButton("D");
        d = new JButton("/");
        sevenB = new JButton("7");
        eightB = new JButton("8");
        nineB = new JButton("9");
        divideB = new JButton("*");
        fourB = new JButton("4");
        fiveB = new JButton("5");
        sixB = new JButton("6");
        multiplyB = new JButton("-");
        oneB = new JButton("1");
        twoB = new JButton("2");
        threeB = new JButton("3");
        subtractB = new JButton("+");
        zeroB = new JButton("+/-");
        dotB = new JButton("0");
        equalsB = new JButton(".");
        addB = new JButton("=");

        buttonPanel.add(a);
        buttonPanel.add(b);
        buttonPanel.add(c);
        buttonPanel.add(d);
        buttonPanel.add(sevenB);
        buttonPanel.add(eightB);
        buttonPanel.add(nineB);
        buttonPanel.add(divideB);
        buttonPanel.add(fourB);
        buttonPanel.add(fiveB);
        buttonPanel.add(sixB);
        buttonPanel.add(multiplyB);
        buttonPanel.add(oneB);
        buttonPanel.add(twoB);
        buttonPanel.add(threeB);
        buttonPanel.add(subtractB);
        buttonPanel.add(zeroB);
        buttonPanel.add(dotB);
        buttonPanel.add(equalsB);
        buttonPanel.add(addB);
        panel3.add(buttonPanel, BorderLayout.SOUTH);
        tp.add("standard", panel3);
        frame.add(tp);
        a = new JButton("e");
        b = new JButton("p");
        c = new JButton("/");
        d = new JButton("Shift");
        e = new JButton("C");
        f = new JButton("Sin");
        sevenB = new JButton("7");
        eightB = new JButton("8");
        nineB = new JButton("9");
        divideB = new JButton("*");
        g = new JButton("Tg");
        fourB = new JButton("4");
        fiveB = new JButton("5");
        sixB = new JButton("6");
        multiplyB = new JButton("-");
        h = new JButton("Log");
        oneB = new JButton("1");
        twoB = new JButton("2");
        threeB = new JButton("3");
        subtractB = new JButton("+");
        i = new JButton("Exp");
        zeroB = new JButton("+/-");
        dotB = new JButton("0");
        equalsB = new JButton(".");
        addB = new JButton("=");

        buttonPanel2.add(a);
        buttonPanel2.add(b);
        buttonPanel2.add(c);
        buttonPanel2.add(d);
        buttonPanel2.add(e);
        buttonPanel2.add(f);
        buttonPanel2.add(sevenB);
        buttonPanel2.add(eightB);
        buttonPanel2.add(nineB);
        buttonPanel2.add(divideB);
        buttonPanel2.add(g);
        buttonPanel2.add(fourB);
        buttonPanel2.add(fiveB);
        buttonPanel2.add(sixB);
        buttonPanel2.add(multiplyB);
        buttonPanel2.add(h);
        buttonPanel2.add(oneB);
        buttonPanel2.add(twoB);
        buttonPanel2.add(threeB);
        buttonPanel2.add(subtractB);
        buttonPanel2.add(i);
        buttonPanel2.add(zeroB);
        buttonPanel2.add(dotB);
        buttonPanel2.add(equalsB);
        buttonPanel2.add(addB);
        panel32.add(buttonPanel2, BorderLayout.CENTER);
        tp.add("Scientific", panel32);
        frame.add(tp);

        //frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}