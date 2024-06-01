package notasSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AplicativoNotas extends JFrame implements ActionListener {

    private JTextArea areaTexto;
    private JButton botaoSalvar;
    private JButton botaoCarregar;
    private JButton botaoEditar;

    public AplicativoNotas() {
        setTitle("Aplicativo de Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());

        botaoSalvar = new JButton("Salvar");
        botaoSalvar.addActionListener(this);
        painelBotoes.add(botaoSalvar);

        botaoCarregar = new JButton("Carregar");
        botaoCarregar.addActionListener(this);
        painelBotoes.add(botaoCarregar);

        botaoEditar = new JButton("Editar");
        botaoEditar.addActionListener(this);
        painelBotoes.add(botaoEditar);

        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        if (e.getSource() == botaoSalvar) {
            int resultado = fileChooser.showSaveDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                try {
                    String texto = areaTexto.getText();
                    String caminhoArquivo = fileChooser.getSelectedFile().getAbsolutePath();
                    ArquivoUtil.salvarTexto(texto, caminhoArquivo);
                    JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == botaoCarregar) {
            int resultado = fileChooser.showOpenDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                try {
                    String caminhoArquivo = fileChooser.getSelectedFile().getAbsolutePath();
                    String texto = ArquivoUtil.carregarTexto(caminhoArquivo);
                    areaTexto.setText(texto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao carregar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == botaoEditar) {
            areaTexto.setEditable(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplicativoNotas();
            }
        });
    }
}

class ArquivoUtil {
    public static void salvarTexto(String texto, String caminhoArquivo) throws Exception {
        java.io.FileWriter writer = new java.io.FileWriter(caminhoArquivo);
        writer.write(texto);
        writer.close();
    }

    public static String carregarTexto(String caminhoArquivo) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(new File(caminhoArquivo));
        String texto = scanner.useDelimiter("\\A").next();
        scanner.close();
        return texto;
    }
}
