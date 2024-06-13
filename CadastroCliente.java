package telaLogin;

import java.awt.EventQueue;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

public class CadastroCliente extends JFrame {



private JPanel contentPane;

private JTextField txtNome;

private JTextField txtEmail;

private JTextField txtTelefone;

private JTextField txtEndereco;

private JTextField txtCidade;

private JTextField txtEstado;

private JTextField txtCEP;

private JTextField txtPais;



public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

CadastroCliente frame = new CadastroCliente();

frame.setVisible(true);

} catch (Exception e) {

e.printStackTrace();

}

}

});

}


public CadastroCliente() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 450, 300);

contentPane = new JPanel();

contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);

contentPane.setLayout(null);



JLabel lblNomeDoCliente = new JLabel("Nome do Cliente:");

lblNomeDoCliente.setBounds(10, 11, 91, 14);

contentPane.add(lblNomeDoCliente);



JLabel lblEmail = new JLabel("Email:");

lblEmail.setBounds(10, 36, 46, 14);

contentPane.add(lblEmail);



JLabel lblTelefone = new JLabel("Telefone:");

lblTelefone.setBounds(10, 61, 46, 14);

contentPane.add(lblTelefone);



JLabel lblEndereo = new JLabel("Endere\u00E7o:");

lblEndereo.setBounds(10, 86, 91, 14);

contentPane.add(lblEndereo);



JLabel lblCidade = new JLabel("Cidade:");

lblCidade.setBounds(10, 111, 46, 14);

contentPane.add(lblCidade);



JLabel lblEstado = new JLabel("Estado:");

lblEstado.setBounds(10, 136, 46, 14);

contentPane.add(lblEstado);



JLabel lblCep = new JLabel("CEP:");

lblCep.setBounds(10, 161, 46, 14);

contentPane.add(lblCep);



JLabel lblPas = new JLabel("Pa\u00EDs:");

lblPas.setBounds(10, 186, 46, 14);

contentPane.add(lblPas);



JButton btnCadastrar = new JButton("Cadastrar");

btnCadastrar.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent arg0) {



String nome = txtNome.getText();

String email = txtEmail.getText();

String telefone = txtTelefone.getText();

String endereco = txtEndereco.getText();

String cidade = txtCidade.getText();

String estado = txtEstado.getText();

String cep = txtCEP.getText();

String pais = txtPais.getText();




System.out.println("Nome: " + nome);

System.out.println("Email: " + email);

System.out.println("Telefone: " + telefone);

System.out.println("Endereço: " + endereco);

System.out.println("Cidade: " + cidade);

System.out.println("Estado: " + estado);

System.out.println("CEP: " + cep);

System.out.println("País: " + pais);



}

});

btnCadastrar.setBounds(10, 225, 414, 23);

contentPane.add(btnCadastrar);



txtNome = new JTextField();

txtNome.setBounds(111, 8, 313, 20);

contentPane.add(txtNome);

txtNome.setColumns(10);



txtEmail = new JTextField();

txtEmail.setBounds(111, 33, 313, 20);

contentPane.add(txtEmail);

txtEmail.setColumns(10);



txtTelefone = new JTextField();

txtTelefone.setBounds(111, 58, 313, 20);

contentPane.add(txtTelefone);

txtTelefone.setColumns(10);



txtEndereco = new JTextField();

txtEndereco.setBounds(111, 83, 313, 20);

contentPane.add(txtEndereco);

txtEndereco.setColumns(10);



txtCidade = new JTextField();

txtCidade.setBounds(111, 108, 313, 20);

contentPane.add(txtCidade);

txtCidade.setColumns(10);



txtEstado = new JTextField();

txtEstado.setBounds(111, 133, 313, 20);

contentPane.add(txtEstado);

txtEstado.setColumns(10);



txtCEP = new JTextField();

txtCEP.setBounds(111, 158, 313, 20);

contentPane.add(txtCEP);

txtCEP.setColumns(10);



txtPais = new JTextField();

txtPais.setBounds(111, 183, 313, 20);

contentPane.add(txtPais);

txtPais.setColumns(10);

}

}