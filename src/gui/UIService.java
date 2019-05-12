package gui;

import com.fmi.project.car.Car;
import com.fmi.project.services.Service;
import com.fmi.project.services.ServiceDieselDB;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UIService {

    private JPanel mainPanel;
    private JPanel Find;
    private JTextField textFieldProblems;
    private JTable userTable;
    private JButton ccarsWithMoreThan150HP;
    private JButton ecoCars;
    private JButton skodaCars;
    private JButton carsWhichStayMoreDays;
    private JButton carsWithMoreThan100KKm;
    private JButton findCarsButton;
    private JTextField editText;
    private JLabel haveProblems;
    private JTextField textFieldForbidden;
    private JButton UPDATEDieselCarButton;
    private JButton INSERTDieselCarButton;
    private JTextField textFieldTurbines;
    private JButton DELETEDieselsButton;
    private JButton SELECTDieselCarButton;
    private JLabel isForbidden;
    private JLabel numberOfTurbines;
    private JPanel dbStorage;
    private JScrollPane mainJScrollPane1;
    private JTabbedPane tabbedPane;

    public UIService() {
        skodaCars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Car>, String> stringSwingWorker = new SwingWorker<List<Car>, String>() {
                    @Override
                    protected List<Car> doInBackground() throws Exception {

                        return Service.getInstance().skodaCars();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Car> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Brand");
                                    defaultTableModel.addColumn("Model");
                                    defaultTableModel.addColumn("Euro");
                                    defaultTableModel.addColumn("Color");
                                    defaultTableModel.addColumn("Horse Power");
                                    defaultTableModel.addColumn("Cilindrical Capacity");
                                    defaultTableModel.addColumn("Number of kilometres");
                                    defaultTableModel.addColumn("Consumption");
                                    defaultTableModel.addColumn("Price to full");

                                    for (Car car : result) {
                                        defaultTableModel.addRow(new Object[]{car.getBrand(), car.getModel(),
                                                car.getEuro(), car.getColor(),
                                                car.getHorsePower(), car.getCilindricalCapacity(),
                                                car.getNumberOfKilometres(), car.getConsumption(),
                                                car.getPriceToFull()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });

                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });

        ccarsWithMoreThan150HP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Car>, String> stringSwingWorker = new SwingWorker<List<Car>, String>() {
                    @Override
                    protected List<Car> doInBackground() throws Exception {

                        return Service.getInstance().carsWithMoreThan150HP();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Car> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Brand");
                                    defaultTableModel.addColumn("Model");
                                    defaultTableModel.addColumn("Euro");
                                    defaultTableModel.addColumn("Color");
                                    defaultTableModel.addColumn("Horse Power");
                                    defaultTableModel.addColumn("Cilindrical Capacity");
                                    defaultTableModel.addColumn("Number of kilometres");
                                    defaultTableModel.addColumn("Consumption");
                                    defaultTableModel.addColumn("Price to full");

                                    for (Car car : result) {
                                        defaultTableModel.addRow(new Object[]{car.getBrand(), car.getModel(),
                                                car.getEuro(), car.getColor(),
                                                car.getHorsePower(), car.getCilindricalCapacity(),
                                                car.getNumberOfKilometres(), car.getConsumption(),
                                                car.getPriceToFull()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };

                stringSwingWorker.execute();

            }
        });

        ecoCars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Car>, String> stringSwingWorker = new SwingWorker<List<Car>, String>() {
                    @Override
                    protected List<Car> doInBackground() throws Exception {

                        return Service.getInstance().ecoCars();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Car> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Brand");
                                    defaultTableModel.addColumn("Model");
                                    defaultTableModel.addColumn("Euro");
                                    defaultTableModel.addColumn("Color");
                                    defaultTableModel.addColumn("Horse Power");
                                    defaultTableModel.addColumn("Cilindrical Capacity");
                                    defaultTableModel.addColumn("Number of kilometres");
                                    defaultTableModel.addColumn("Consumption");
                                    defaultTableModel.addColumn("Price to full");

                                    for (Car car : result) {
                                        defaultTableModel.addRow(new Object[]{car.getBrand(), car.getModel(),
                                                car.getEuro(), car.getColor(),
                                                car.getHorsePower(), car.getCilindricalCapacity(),
                                                car.getNumberOfKilometres(), car.getConsumption(),
                                                car.getPriceToFull()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });


                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }

                    }
                };
                stringSwingWorker.execute();
            }
        });

        carsWhichStayMoreDays.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Car>, String> stringSwingWorker = new SwingWorker<List<Car>, String>() {
                    @Override
                    protected List<Car> doInBackground() throws Exception {

                        return Service.getInstance().carsMoreThan10DaysInService();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Car> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Brand");
                                    defaultTableModel.addColumn("Model");
                                    defaultTableModel.addColumn("Euro");
                                    defaultTableModel.addColumn("Color");
                                    defaultTableModel.addColumn("Horse Power");
                                    defaultTableModel.addColumn("Cilindrical Capacity");
                                    defaultTableModel.addColumn("Number of kilometres");
                                    defaultTableModel.addColumn("Consumption");
                                    defaultTableModel.addColumn("Price to full");

                                    for (Car car : result) {
                                        defaultTableModel.addRow(new Object[]{car.getBrand(), car.getModel(),
                                                car.getEuro(), car.getColor(),
                                                car.getHorsePower(), car.getCilindricalCapacity(),
                                                car.getNumberOfKilometres(), car.getConsumption(),
                                                car.getPriceToFull()});
                                    }

                                    userTable.setModel(defaultTableModel);
                                }
                            });
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });

        carsWithMoreThan100KKm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<Car>, String> stringSwingWorker = new SwingWorker<List<Car>, String>() {
                    @Override
                    protected List<Car> doInBackground() throws Exception {

                        return Service.getInstance().carsWithMoreThan100kKm();
                    }

                    @Override
                    protected void done() {

                        try {
                            List<Car> result = get();

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    DefaultTableModel defaultTableModel = new DefaultTableModel() {
                                        @Override
                                        public boolean isCellEditable(int row, int column) {
                                            return false; //super.isCellEditable(row, column);
                                        }
                                    };

                                    defaultTableModel.addColumn("Brand");
                                    defaultTableModel.addColumn("Model");
                                    defaultTableModel.addColumn("Euro");
                                    defaultTableModel.addColumn("Color");
                                    defaultTableModel.addColumn("Horse Power");
                                    defaultTableModel.addColumn("Cilindrical Capacity");
                                    defaultTableModel.addColumn("Number of kilometres");
                                    defaultTableModel.addColumn("Consumption");
                                    defaultTableModel.addColumn("Price to full");

                                    for (Car car : result) {
                                        defaultTableModel.addRow(new Object[]{car.getBrand(), car.getModel(),
                                                car.getEuro(), car.getColor(),
                                                car.getHorsePower(), car.getCilindricalCapacity(),
                                                car.getNumberOfKilometres(), car.getConsumption(),
                                                car.getPriceToFull()});
                                    }
                                    userTable.setModel(defaultTableModel);
                                }
                            });

                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } catch (ExecutionException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                stringSwingWorker.execute();
            }
        });

//        DB Storage
        INSERTDieselCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ServiceDieselDB.getInstance().insertDieselCarDB(Integer
                                    .parseInt(textFieldProblems.getText())
                            , Integer.parseInt(textFieldForbidden.getText()),
                            Integer.parseInt(textFieldTurbines.getText()));
                    JOptionPane.showMessageDialog(null,
                            "Diesel car successfully inserted !",
                            "Atenție", JOptionPane.INFORMATION_MESSAGE);

                    textFieldProblems.setText("");
                    textFieldForbidden.setText("");
                    textFieldTurbines.setText("");

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        DELETEDieselsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer id = Integer.parseInt(textFieldProblems.getText());
                if (id >= 0) {
                    try {
                        ServiceDieselDB.getInstance().deleteDieselsBDByid(id);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "Diesel car was successfully deleted !",
                            "Atenție", JOptionPane.INFORMATION_MESSAGE);

                    textFieldProblems.setText("");
                    textFieldForbidden.setText("");
                    textFieldTurbines.setText("");
                }
            }
        });

        UPDATEDieselCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer id = Integer.parseInt(textFieldProblems.getText());

                if (id >= 0) {
                    try {
                        ServiceDieselDB.getInstance().updateDieselsBDById(id);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "Diesel car successfully updated !",
                            "Atenție", JOptionPane.INFORMATION_MESSAGE);

                    textFieldProblems.setText("");
                    textFieldForbidden.setText("");
                    //textFieldTelephone.setText("");
                    textFieldTurbines.setText("");
                }
            }
        });

    }
        public void initGUI () {
            JFrame jFrame = new JFrame("Service cars");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setPreferredSize(new Dimension(800, 600));
            jFrame.setContentPane(this.mainPanel);
            // set prefered size, otherwise your jFrame is going to be something small in a corner
            jFrame.setPreferredSize(new Dimension(800, 600));

            // make the jFrame visible
            jFrame.pack();
            jFrame.setVisible(true);
        }

        public static void main (String args[]){
            UIService mainFrame = new UIService();

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    mainFrame.initGUI();
                }
            });
        }

        private void createUIComponents () {
            JButton oneButton = new JButton("do something!!!!");
            oneButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("button 'do something!!!!' was pressed!");
                }
            });
            // create manually a new panel, like we already said, this is custom
            Find = new JPanel();
            Find.add(oneButton);
        }
    }