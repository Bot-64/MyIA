// Vihaan Kerekatte
// IB Computer Science IA - Financial planner/organizer
// Main file/runner

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyProgram {
    public static void main(String[] args) {
        //Creating instance of JFrame
        JFrame frame = new JFrame("Financial Portal");
        JPanel buttonPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Balance Sheet Tab
        JPanel balanceSheetPanel = new JPanel(new BorderLayout());
        
        // Setup table to track balance sheet
        Table model = new Table();
        JTable table = new JTable(model);
        table.setRowHeight(30);
        
        // Drop-down menu
        JComboBox<String> assetOptions = new JComboBox<>(new String[] {
            "Day-to-day additions (salary, gifts, etc.)",
            "Cash in checking/savings accounts",
            "Money in brokerage accounts",
            "Retirement accounts",
            "Value of your house",
            "Investment properties",
            "Value of your car",
            "Life insurance cash value",
            "Valuables/collectibles",
            "Other"
        });
        JComboBox<String> liabilityOptions = new JComboBox<>(new String[] {
            "Day-to-day expenses (food, gas, etc.)",
            "Mortgage loan",
            "Auto loan",
            "Student loans",
            "Personal loans",
            "Credit cards",
            "Unpaid medical bills",
            "Unpaid taxes",
            "Home equity loan",
            "Other"
        });
        
        // Implement drop-down menus using JScrollPane
        table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(assetOptions));
        table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(liabilityOptions));
        
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Lambda expressions and ActionEvents can be used to simplify and shorten the code for allowing the button to perform an action when clicked
        // "Add Row" button
        JButton addRowButton = new JButton("Add Row");
        addRowButton.addActionListener((ActionEvent e) -> model.addRow(new Object[] {null, null, null, null}));
        // "Delete Row" button with confirmation and error messages
        JButton deleteRowButton = new JButton("Delete Row");
        deleteRowButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                int confirm = JOptionPane.showConfirmDialog(
                    frame,
                    "Are you sure you want to delete the selected row?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    model.deleteRow(selectedRow);
                }
            }
            else {
                JOptionPane.showMessageDialog(frame, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // "Calculate Net Worth" button
        // Loops through each row to add all assets and subtract all liabilities
        JButton calculateNetWorthButton = new JButton("Calculate Net Worth");
        JLabel netWorthLabel = new JLabel("Net Worth:  |  Assets:  |  Liabilities: ");
        calculateNetWorthButton.addActionListener(e -> {
            double totalAssets = 0;
            double totalLiabilities = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 2) != null && !model.getValueAt(i, 2).toString().isEmpty()) {
                    double amount = Double.parseDouble(model.getValueAt(i, 2).toString());
                    if (model.getValueAt(i, 0) != null && !model.getValueAt(i, 0).toString().isEmpty()) {
                        totalAssets += amount;
                    }
                    else if (model.getValueAt(i, 1) != null && !model.getValueAt(i, 1).toString().isEmpty()) {
                        totalLiabilities += amount;
                    }
                }
            }
            double netWorth = totalAssets - totalLiabilities;
            netWorthLabel.setText("Net Worth: " + String.format("%.2f", netWorth) + "  |  Assets: " + String.format("%.2f", totalAssets) + "  |  Liabilities: " + String.format("%.2f", totalLiabilities));
        });
        
        // Add all buttons to panel
        buttonPanel.add(addRowButton);
        buttonPanel.add(deleteRowButton);
        buttonPanel.add(calculateNetWorthButton);
        buttonPanel.add(netWorthLabel);
        
        // Add table and buttons to Balance Sheet tab
        balanceSheetPanel.add(scrollPane, BorderLayout.CENTER);
        balanceSheetPanel.add(buttonPanel, BorderLayout.SOUTH);
        tabbedPane.add("Balance Sheet", balanceSheetPanel);
        
        // Compound Interst Tab
        JPanel interestPanel = new JPanel();
        interestPanel.setLayout(new GridLayout(0, 2, 10, 10));
        
        JLabel principalLabel = new JLabel("Principal Amount:");
        JTextField principalField = new JTextField();
        
        JLabel rateLabel = new JLabel("Annual Interest Rate (%):");
        JTextField rateField = new JTextField();
        
        JLabel timeLabel = new JLabel("Time (years):");
        JTextField timeField = new JTextField();
        
        JLabel compoundLabel = new JLabel("Times Compounded per Year:");
        JTextField compoundField = new JTextField();
        
        JLabel interestResultLabel = new JLabel("Compound Interest:");
        JTextField interestResultField = new JTextField();
        JButton calculateInterestButton = new JButton("Calculate Interest");
        calculateInterestButton.addActionListener(e -> {
            // Sends error popup if missing input or false input
            try {
                double principal = Double.parseDouble(principalField.getText());
                double rate = Double.parseDouble(rateField.getText()) / 100;
                int time = Integer.parseInt(timeField.getText());
                int compounds = Integer.parseInt(compoundField.getText());
                // Using compounding interest formula
                double amount = principal * Math.pow(1 + (rate / compounds), compounds * time);
                interestResultField.setText(String.format("%.2f", amount - principal));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // Add all buttons and fields to panel
        interestPanel.add(principalLabel);
        interestPanel.add(principalField);
        interestPanel.add(rateLabel);
        interestPanel.add(rateField);
        interestPanel.add(timeLabel);
        interestPanel.add(timeField);
        interestPanel.add(compoundLabel);
        interestPanel.add(compoundField);
        interestPanel.add(interestResultLabel);
        interestPanel.add(interestResultField);
        interestPanel.add(new JLabel());
        interestPanel.add(calculateInterestButton);
        
        // Add buttons to Compound Interest tab
        tabbedPane.add("Compound Interest", interestPanel);
        
        frame.add(tabbedPane);
        frame.setVisible(true);
        
    }
}
