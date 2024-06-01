package chatApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ChatApp extends JFrame implements ActionListener {
    private JTextField textField;
    private JTextArea textArea;
    private JButton sendButton;
    private JButton historyButton;
    private JButton clearChatButton;
    private String userName;
    private List<String> messageHistory;

    public ChatApp(String userName) {
        this.userName = userName;
        this.messageHistory = new ArrayList<>();

        setTitle("Chat - " + userName);
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        sendButton = new JButton("Send");
        sendButton.addActionListener(this);

        historyButton = new JButton("History");
        historyButton.addActionListener(this);

        clearChatButton = new JButton("Limpar Chat");
        clearChatButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(sendButton);
        panel.add(historyButton);
        panel.add(clearChatButton);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton) {
            String message = textField.getText().trim();
            if (!message.isEmpty()) {
                appendMessage(userName + ": " + message);
                messageHistory.add(userName + ": " + message);
                textField.setText("");
            }
        } else if (e.getSource() == historyButton) {
            textArea.setText("");
            for (String message : messageHistory) {
                appendMessage(message);
            }
        } else if (e.getSource() == clearChatButton) {
            textArea.setText("");
        }
    }

    private void appendMessage(String message) {
        textArea.append(message + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Enter your username:");
        if (userName != null && !userName.isEmpty()) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new ChatApp(userName);
                }
            });
        } else {
            JOptionPane.showMessageDialog(null, "Username cannot be empty. Exiting...", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}
