package aula82;

import Aula8.Carro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMarca implements ActionListener {
    JFrame tela = new JFrame("Cadastro de carros");
    JPanel panel = new JPanel();
    JLabel lbCodigo = new JLabel ("Codigo: ");
    JLabel lbNome = new JLabel ("Nome: ");

    JTextField txtCodigo = new JTextField();
    JTextField txtNome = new JTextField();

    JButton btSalvar = new JButton("Salvar");

    Marca marca;
    Integer codigo;
    String nome;

    public void mostraTela(){
        tela.setSize(300,300);
        tela.setLocation(200,200);
        panel.setLayout(null);
        lbCodigo.setBounds(30,20,100,30);
        txtCodigo.setBounds(30,40,110,30);
        lbNome.setBounds(30,70,100,30);
        txtNome.setBounds(30,90,110,30);
        panel.add(lbCodigo);
        panel.add(txtCodigo);
        panel.add(lbNome);
        panel.add(txtNome);
        btSalvar.setBounds(100,130,70,50);
        panel.add(btSalvar);
        btSalvar.addActionListener(this);
        tela.getContentPane().add(panel);
        tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btSalvar){
            if(txtCodigo.getText().equals("") ||txtNome.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Preencha os campos em branco");
            }else{
                codigo =Integer.parseInt( txtCodigo.getText());
                nome = txtNome.getText();


                marca = new Marca(codigo, nome);
                JOptionPane.showMessageDialog(null,"Objeto salvo com sucesso!");
                JOptionPane.showMessageDialog(null,"O codgio: "+ marca.getCodigo() +"\nO nome: "  + marca.getNome());
                txtCodigo.setText("");
                txtNome.setText("");

            }
        }
    }
}
