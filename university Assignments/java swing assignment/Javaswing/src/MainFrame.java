import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class MainFrame extends JFrame {
    private JTextField fileNameField;
    private JTextArea fileContentArea;
    private final String directoryPath = "C:/SwingFiles";

    public MainFrame() {
        setTitle("File Manager");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel fileLabel = new JLabel("File Name:");
        fileNameField = new JTextField(20);
        fileContentArea = new JTextArea(15, 40);
        fileContentArea.setBackground(Color.LIGHT_GRAY);
        JScrollPane scroll = new JScrollPane(fileContentArea);

        JButton createBtn = new JButton("Create");
        JButton writeBtn = new JButton("Write");
        JButton readBtn = new JButton("Read");
        JButton updateBtn = new JButton("Update");
        JButton deleteBtn = new JButton("Delete");

        createBtn.addActionListener(e -> createFile());
        writeBtn.addActionListener(e -> writeFile(false));
        readBtn.addActionListener(e -> readFile());
        updateBtn.addActionListener(e -> writeFile(true));
        deleteBtn.addActionListener(e -> deleteFile());

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(fileLabel);
        panel.add(fileNameField);
        panel.add(scroll);
        panel.add(createBtn);
        panel.add(writeBtn);
        panel.add(readBtn);
        panel.add(updateBtn);
        panel.add(deleteBtn);

        add(panel);
        setVisible(true);

        // Ensure directory exists
        new File(directoryPath).mkdirs();
    }

    private void createFile() {
        try {
            File file = new File(directoryPath, fileNameField.getText());
            if (file.createNewFile()) {
                showMessage("File created successfully.");
            } else {
                showMessage("File already exists.");
            }
        } catch (IOException e) {
            showMessage("Error: " + e.getMessage());
        }
    }

    private void writeFile(boolean append) {
        try (FileWriter writer = new FileWriter(new File(directoryPath, fileNameField.getText()), append)) {
            writer.write(fileContentArea.getText());
            showMessage(append ? "File updated successfully." : "Content written successfully.");
        } catch (IOException e) {
            showMessage("Error: " + e.getMessage());
        }
    }

    private void readFile() {
        try {
            File file = new File(directoryPath, fileNameField.getText());
            String content = Files.readString(file.toPath());
            fileContentArea.setText(content);
            showMessage("File read successfully.");
        } catch (IOException e) {
            showMessage("Error: " + e.getMessage());
        }
    }

    private void deleteFile() {
        File file = new File(directoryPath, fileNameField.getText());
        if (file.delete()) {
            fileContentArea.setText("");
            showMessage("File deleted successfully.");
        } else {
            showMessage("File not found or could not be deleted.");
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}