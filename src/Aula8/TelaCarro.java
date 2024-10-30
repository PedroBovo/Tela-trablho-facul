package Aula8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCarro implements ActionListener {
    JFrame tela = new JFrame("Cadastro de carros");
    JPanel panel = new JPanel();
    JLabel lbModelo = new JLabel ("Modelo: ");
    JLabel lbAno = new JLabel ("Ano: ");
    JLabel lbValor = new JLabel ("Valor: ");

    JTextField txtModelo = new JTextField();
    JTextField txtAno = new JTextField();
    JTextField txtValor = new JTextField();

    JButton btSalvar = new JButton("Salvar");
    JButton btExibir = new JButton("Exibir");


    Carro car;
    String modelo;
    Double valor;
    int ano;


    public void criarTela(){
        tela.setSize(300,300);
        tela.setLocation(200,200);
        panel.setLayout(null);

        lbModelo.setBounds(30,20,100,30);
        txtModelo.setBounds(130,20,110,30);
        panel.add(lbModelo);
        panel.add(txtModelo);

        lbAno.setBounds(30,70,100,30);
        txtAno.setBounds(130,70,110,30);
        panel.add(lbAno);
        panel.add(txtAno);

        lbValor.setBounds(30,120,100,30);
        txtValor.setBounds(130,120,110,30);
        panel.add(lbValor);
        panel.add(txtValor);

        btSalvar.setBounds(40,180,100,30);
        btExibir.setBounds(150,180,100,30);
        btSalvar.addActionListener(this);
        btExibir.addActionListener(this);
        panel.add(btSalvar);
        panel.add(btExibir);

        tela.getContentPane().add(panel);
        tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btSalvar){
            if(txtModelo.getText().equals("") ||txtAno.getText().equals("") || txtValor.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Preencha os campos em branco");
            }else{
            modelo = txtModelo.getText();
            valor = Double.parseDouble(txtValor.getText());
            ano = Integer.parseInt(txtAno.getText());

            car = new Carro(modelo, valor, ano);
            JOptionPane.showMessageDialog(null,"Objeto salvo com sucesso!");
            txtModelo.setText("");
            txtAno.setText("");
            txtValor.setText("");
            }
        }
        if (e.getSource() == btExibir){
            JOptionPane.showMessageDialog(null,"O modelo: "+ car.getModelo() +"\nO ano: "  + car.getAno() + "\nO valor: " + car.getValor());
        }
    }
}
