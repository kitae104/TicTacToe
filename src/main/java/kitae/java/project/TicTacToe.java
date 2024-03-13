package kitae.java.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    private JButton[] b = new JButton[9];
    private JButton btnNew;
    private int k = 0, x = 8, y = 28;
    private int a = 0;  // O, X 판별
    int z = 0, z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0, z7 = 0, z8 = 0;  // 9개의 버튼
    int l = 70;     //
    public TicTacToe(){
        setTitle("TIC TAC TOE Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 600);
        setLocationRelativeTo(null);

        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[k] = new JButton();
                b[k].setSize(100, 100);
                b[k].setLocation(x, y);
                b[k].setFont(new Font("", Font.BOLD, 40));
                add(b[k]);

                b[k].addActionListener(this);
                b[k].setBackground(new Color(255, 141, 28));    // 오렌지 색
                k++;
                x += 100;
            }
            x = 8;
            y += 100;
        }

        btnNew = new JButton("New Game");
        btnNew.setSize(150, 40);
        btnNew.setLocation(500, 300);
        btnNew.setFont(new Font("", Font.BOLD, 20));
        btnNew.setForeground(Color.BLACK);
        btnNew.addActionListener(this);
        add(btnNew);

        setVisible(true);
    }
    public static void main(String[] args) {
        new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 새로운 게임
        if(e.getSource() == btnNew){
            for (int i = 0; i <= 8; i++) {
                b[i].setLabel("");
            }
            z = 0; z1 = 0; z2 = 0; z3 = 0; z4 = 0; z5 = 0; z6 = 0; z7 = 0; z8 = 0;
        }

        // 1번째 버튼
        if(e.getSource() == b[0] && z == 0){
            if(a % 2 == 0){
                b[0].setText("O");
            } else {
                b[0].setText("X");
            }
            z++;
            a++;
        }
        // 2번째 버튼
        if(e.getSource() == b[1] && z1 == 0){
            if(a % 2 == 0){
                b[1].setText("O");
            } else {
                b[1].setText("X");
            }
            z1++;
            a++;
        }
        // 3번째 버튼
        if(e.getSource() == b[2] && z2 == 0){
            if(a % 2 == 0){
                b[2].setText("O");
            } else {
                b[2].setText("X");
            }
            z2++;
            a++;
        }
        // 4번째 버튼
        if(e.getSource() == b[3] && z3 == 0){
            if(a % 2 == 0){
                b[3].setText("O");
            } else {
                b[3].setText("X");
            }
            z3++;
            a++;
        }
        // 5번째 버튼
        if(e.getSource() == b[4] && z4 == 0){
            if(a % 2 == 0){
                b[4].setText("O");
            } else {
                b[4].setText("X");
            }
            z4++;
            a++;
        }
        // 6번째 버튼
        if(e.getSource() == b[5] && z5 == 0){
            if(a % 2 == 0){
                b[5].setText("O");
            } else {
                b[5].setText("X");
            }
            z5++;
            a++;
        }
        // 7번째 버튼
        if(e.getSource() == b[6] && z6 == 0){
            if(a % 2 == 0){
                b[6].setText("O");
            } else {
                b[6].setText("X");
            }
            z6++;
            a++;
        }
        // 8번째 버튼
        if(e.getSource() == b[7] && z7 == 0){
            if(a % 2 == 0){
                b[7].setText("O");
            } else {
                b[7].setText("X");
            }
            z7++;
            a++;
        }
        // 9번째 버튼
        if(e.getSource() == b[8] && z8 == 0){
            if(a % 2 == 0){
                b[8].setText("O");
            } else {
                b[8].setText("X");
            }
            z8++;
            a++;
        }

        // 승리 조건
        // 0-1-2
        if(b[0].getText().equals(b[1].getText()) && b[0].getText().equals(b[2].getText())){
            if(b[0].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[0].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 3-4-5
        if(b[3].getText().equals(b[4].getText()) && b[3].getText().equals(b[5].getText())){
            if(b[3].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[3].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 6-7-8
        if(b[6].getText().equals(b[7].getText()) && b[6].getText().equals(b[8].getText())){
            if(b[6].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[6].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 0-3-6
        if(b[0].getText().equals(b[3].getText()) && b[0].getText().equals(b[6].getText())){
            if(b[0].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[0].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 1-4-7
        if(b[1].getText().equals(b[4].getText()) && b[1].getText().equals(b[7].getText())){
            if(b[1].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[1].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 2-5-8
        if(b[2].getText().equals(b[5].getText()) && b[2].getText().equals(b[8].getText())){
            if(b[2].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[2].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 0-4-8
        if(b[0].getText().equals(b[4].getText()) && b[0].getText().equals(b[8].getText())){
            if(b[0].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[0].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
        // 2-4-6
        if(b[2].getText().equals(b[4].getText()) && b[2].getText().equals(b[6].getText())){
            if(b[2].getText().equals("O")){
                JOptionPane.showMessageDialog(null, "O Win!");
            } else if(b[2].getText() == "X"){
                JOptionPane.showMessageDialog(null, "X Win!");
            }
        }
    }
}
