package telaLogin;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuFarmacia extends JFrame {
    public MenuFarmacia() {
        setTitle("Sistema de Farmácia");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Cadastros
        JMenu cadastrosMenu = new JMenu("Cadastros");
        menuBar.add(cadastrosMenu);

        JMenuItem clientesItem = new JMenuItem("Clientes");
        cadastrosMenu.add(clientesItem);
        clientesItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirFormularioClientes();
            }
        });

        JMenuItem produtosItem = new JMenuItem("Produtos");
        cadastrosMenu.add(produtosItem);

        JMenuItem fornecedoresItem = new JMenuItem("Fornecedores");
        cadastrosMenu.add(fornecedoresItem);

        JMenuItem funcionariosItem = new JMenuItem("Funcionários");
        cadastrosMenu.add(funcionariosItem);

        // Estoque
        JMenu estoqueMenu = new JMenu("Estoque");
        menuBar.add(estoqueMenu);

        JMenuItem consultarEstoqueItem = new JMenuItem("Consultar Estoque");
        estoqueMenu.add(consultarEstoqueItem);

        JMenuItem adicionarProdutoItem = new JMenuItem("Adicionar Produto ao Estoque");
        estoqueMenu.add(adicionarProdutoItem);

        JMenuItem removerProdutoItem = new JMenuItem("Remover Produto do Estoque");
        estoqueMenu.add(removerProdutoItem);

        // Vendas
        JMenu vendasMenu = new JMenu("Vendas");
        menuBar.add(vendasMenu);

        JMenuItem realizarVendaItem = new JMenuItem("Realizar Venda");
        vendasMenu.add(realizarVendaItem);

        JMenuItem consultarVendasItem = new JMenuItem("Consultar Vendas");
        vendasMenu.add(consultarVendasItem);

        JMenuItem relatoriosVendasItem = new JMenuItem("Relatórios de Vendas");
        vendasMenu.add(relatoriosVendasItem);

        // Compras
        JMenu comprasMenu = new JMenu("Compras");
        menuBar.add(comprasMenu);

        JMenuItem registrarCompraItem = new JMenuItem("Registrar Compra");
        comprasMenu.add(registrarCompraItem);

        JMenuItem consultarComprasItem = new JMenuItem("Consultar Compras");
        comprasMenu.add(consultarComprasItem);

        JMenuItem relatoriosComprasItem = new JMenuItem("Relatórios de Compras");
        comprasMenu.add(relatoriosComprasItem);

        // Finanças
        JMenu financasMenu = new JMenu("Finanças");
        menuBar.add(financasMenu);

        JMenuItem fluxoCaixaItem = new JMenuItem("Fluxo de Caixa");
        financasMenu.add(fluxoCaixaItem);

        JMenuItem contasPagarItem = new JMenuItem("Contas a Pagar");
        financasMenu.add(contasPagarItem);

        JMenuItem contasReceberItem = new JMenuItem("Contas a Receber");
        financasMenu.add(contasReceberItem);

        // Relatórios
        JMenu relatoriosMenu = new JMenu("Relatórios");
        menuBar.add(relatoriosMenu);

        JMenuItem relatorioEstoqueItem = new JMenuItem("Relatório de Estoque");
        relatoriosMenu.add(relatorioEstoqueItem);

        JMenuItem relatorioClientesItem = new JMenuItem("Relatório de Clientes");
        relatoriosMenu.add(relatorioClientesItem);

        JMenuItem relatorioVendasItem = new JMenuItem("Relatório de Vendas");
        relatoriosMenu.add(relatorioVendasItem);

        JMenuItem relatorioComprasItem = new JMenuItem("Relatório de Compras");
        relatoriosMenu.add(relatorioComprasItem);

        // Configurações
        JMenu configuracoesMenu = new JMenu("Configurações");
        menuBar.add(configuracoesMenu);

        JMenuItem configuracoesUsuarioItem = new JMenuItem("Configurações de Usuário");
        configuracoesMenu.add(configuracoesUsuarioItem);

        JMenuItem configuracoesSistemaItem = new JMenuItem("Configurações de Sistema");
        configuracoesMenu.add(configuracoesSistemaItem);

        JMenuItem backupRestauracaoItem = new JMenuItem("Backup e Restauração");
        configuracoesMenu.add(backupRestauracaoItem);

        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(Box.createHorizontalGlue()); // Para alinhar o item "Sair" à direita
        menuBar.add(sairItem);
    }

    private void exibirFormularioClientes() {
        JFrame frameClientes = new JFrame("Cadastro de Clientes");
        frameClientes.setSize(400, 300);
        frameClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a janela de cadastro de clientes

        JPanel panelClientes = new JPanel(new GridLayout(5, 2, 10, 10)); // Exemplo de layout, pode ser ajustado conforme necessário

        JLabel labelNome = new JLabel("Nome:");
        JTextField textFieldNome = new JTextField();

        JLabel labelEmail = new JLabel("Email:");
        JTextField textFieldEmail = new JTextField();

        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField textFieldTelefone = new JTextField();

        JButton buttonSalvar = new JButton("Salvar");
        buttonSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar a lógica para salvar os dados do cliente
                JOptionPane.showMessageDialog(frameClientes, "Cliente salvo com sucesso!");
                frameClientes.dispose(); // Fecha a janela de cadastro de clientes após salvar
            }
        });

        panelClientes.add(labelNome);
        panelClientes.add(textFieldNome);
        panelClientes.add(labelEmail);
        panelClientes.add(textFieldEmail);
        panelClientes.add(labelTelefone);
        panelClientes.add(textFieldTelefone);
        panelClientes.add(buttonSalvar);

        frameClientes.add(panelClientes);
        frameClientes.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuFarmacia().setVisible(true);
            }
        });
    }
}
