package ru.vsu.cs.zhikhorev_a_a;

import ru.vsu.cs.util.ArrayUtils;
import ru.vsu.cs.util.JTableUtils;
import ru.vsu.cs.util.SwingUtils;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

public class FrameMain extends JFrame {
    private JPanel panelMain;
    private JTable tableInput1;
    private JTable tableInput2;
    private JTable tableOutput;
    private JScrollPane scrollPaneTableInput1;
    private JScrollPane scrollPaneTableInput2;
    private JScrollPane scrollPaneTableOutput;
    private JButton buttonLoadInputFromFile1;
    private JButton buttonSaveInputIntoFile1;
    private JButton buttonLoadInputFromFile2;
    private JButton buttonSaveInputIntoFile2;
    private JButton buttonExecute;
    private JButton buttonSaveOutputIntoFile;
    private JButton buttonRandomInput;

    private JFileChooser fileChooserOpen;
    private JFileChooser fileChooserSave;


    public FrameMain() {
        this.setTitle("Task_9");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(700, 100, 300, 300);
        this.setResizable(true);


        this.pack();

        JTableUtils.initJTableForArray(tableInput1, 30, true, true, false, true);
        JTableUtils.initJTableForArray(tableInput2, 30, true, true, false, true);
        JTableUtils.initJTableForArray(tableOutput, 30, true, true, false, true);

        tableInput1.setRowHeight(30);
        tableInput2.setRowHeight(30);
        tableOutput.setRowHeight(30);

        fileChooserOpen = new JFileChooser();
        fileChooserSave = new JFileChooser();
        fileChooserOpen.setCurrentDirectory(new File("."));
        fileChooserSave.setCurrentDirectory(new File("."));
        FileFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooserOpen.addChoosableFileFilter(filter);
        fileChooserSave.addChoosableFileFilter(filter);


        buttonLoadInputFromFile1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (fileChooserOpen.showOpenDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
                        int[] arr = ArrayUtils.readIntArrayFromFile(fileChooserOpen.getSelectedFile().getPath());
                        JTableUtils.writeArrayToJTable(tableInput1, arr);
                    }
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


        buttonLoadInputFromFile2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (fileChooserOpen.showOpenDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
                        int[] arr = ArrayUtils.readIntArrayFromFile(fileChooserOpen.getSelectedFile().getPath());
                        JTableUtils.writeArrayToJTable(tableInput2, arr);
                    }
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


        buttonSaveInputIntoFile1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (fileChooserSave.showSaveDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
                        int[] arr = JTableUtils.readIntArrayFromJTable(tableInput1);
                        String file = fileChooserSave.getSelectedFile().getPath();
                        if (!file.toLowerCase().endsWith(".txt")) {
                            file += ".txt";
                        }
                        ArrayUtils.writeArrayToFile(file, arr);
                    }
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


        buttonSaveInputIntoFile2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (fileChooserSave.showSaveDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
                        int[] arr = JTableUtils.readIntArrayFromJTable(tableInput2);
                        String file = fileChooserSave.getSelectedFile().getPath();
                        if (!file.toLowerCase().endsWith(".txt")) {
                            file += ".txt";
                        }
                        ArrayUtils.writeArrayToFile(file, arr);
                    }
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


        buttonSaveOutputIntoFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (fileChooserSave.showSaveDialog(panelMain) == JFileChooser.APPROVE_OPTION) {
                        int[] arr = JTableUtils.readIntArrayFromJTable(tableOutput);
                        String file = fileChooserSave.getSelectedFile().getPath();
                        if (!file.toLowerCase().endsWith(".txt")) {
                            file += ".txt";
                        }
                        ArrayUtils.writeArrayToFile(file, arr);
                    }
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


        buttonExecute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    CreatorOfNewList creatorOfNewList = new CreatorOfNewList();
                    ListUtils listUtils = new ListUtils();
                    int[] array1 = JTableUtils.readIntArrayFromJTable(tableInput1);
                    int[] array2 = JTableUtils.readIntArrayFromJTable(tableInput2);
                    List<Integer> list1 = listUtils.convertArrayToList(array1);
                    List<Integer> list2 = listUtils.convertArrayToList(array2);
                    List<Integer> resultList = creatorOfNewList.createNewList(list1, list2);
                    int[] resultArray = listUtils.convertListToArray(resultList);
                    JTableUtils.writeArrayToJTable(tableOutput, resultArray);
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


        buttonRandomInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int[] inputArr1 = ArrayUtils.createRandomIntArray(tableInput1.getColumnCount(), -99, 99);
                    int[] inputArr2 = ArrayUtils.createRandomIntArray(tableInput2.getColumnCount(), -99, 99);
                    JTableUtils.writeArrayToJTable(tableInput1, inputArr1);
                    JTableUtils.writeArrayToJTable(tableInput2, inputArr2);
                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });
    }
}