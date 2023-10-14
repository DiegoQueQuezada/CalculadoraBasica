
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Calculadora extends javax.swing.JFrame {

    static String textoProceso = "";
    static int tamañoExpr;
    static String intento = "";
    static ArrayList<String> operandos = new ArrayList<>();

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nueve = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        pot = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        div = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        borrarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        proceso = new javax.swing.JTextPane();
        cero = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        intentoExpr = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exportar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        blanco = new javax.swing.JMenuItem();
        negro = new javax.swing.JMenuItem();
        verde = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        dev = new javax.swing.JMenuItem();
        ap = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora1.0");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(null
        );
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        nueve.setBackground(new java.awt.Color(255, 255, 204));
        nueve.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        tres.setBackground(new java.awt.Color(255, 255, 204));
        tres.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        pot.setBackground(new java.awt.Color(255, 255, 204));
        pot.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        pot.setText("^");
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        mult.setBackground(new java.awt.Color(255, 255, 204));
        mult.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        mult.setText("*");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        calcular.setBackground(new java.awt.Color(255, 204, 204));
        calcular.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        calcular.setText("=");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular(evt);
            }
        });
        calcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcularKeyPressed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(255, 255, 204));
        cinco.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(255, 255, 204));
        ocho.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        uno.setBackground(new java.awt.Color(255, 255, 204));
        uno.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        resta.setBackground(new java.awt.Color(255, 255, 204));
        resta.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        suma.setBackground(new java.awt.Color(255, 255, 204));
        suma.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        dos.setBackground(new java.awt.Color(255, 255, 204));
        dos.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        punto.setBackground(new java.awt.Color(255, 255, 204));
        punto.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        div.setBackground(new java.awt.Color(255, 255, 204));
        div.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        seis.setBackground(new java.awt.Color(255, 255, 204));
        seis.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(255, 255, 204));
        nuevo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nuevo.setText("De nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTodo(evt);
            }
        });

        siete.setBackground(new java.awt.Color(255, 255, 204));
        siete.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        borrarC.setBackground(new java.awt.Color(255, 255, 204));
        borrarC.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        borrarC.setText("<-");
        borrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCaracter(evt);
            }
        });

        proceso.setEditable(false);
        proceso.setBackground(new java.awt.Color(255, 255, 255));
        proceso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        proceso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(proceso);

        cero.setBackground(new java.awt.Color(255, 255, 204));
        cero.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(255, 255, 204));
        cuatro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCaracter(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(suma, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nueve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese la expresion:");

        intentoExpr.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        intentoExpr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        intentoExpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intentoExprActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new Color(220,240,220));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jMenu1.setText("Archivo");

        exportar.setBackground(new Color(220,240,220));
        exportar.setText("Guardar como txt");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionarItem(evt);
            }
        });
        jMenu1.add(exportar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Fondo");

        blanco.setBackground(new Color(220,240,220));
        blanco.setText("Blanco");
        blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionarItem(evt);
            }
        });
        jMenu2.add(blanco);

        negro.setBackground(new Color(220,240,220));
        negro.setText("Negro");
        negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionarItem(evt);
            }
        });
        jMenu2.add(negro);

        verde.setBackground(new Color(220,240,220));
        verde.setText("Verde");
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionarItem(evt);
            }
        });
        jMenu2.add(verde);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de");

        dev.setBackground(new Color(220,240,220));
        dev.setText("Desarrollador");
        dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionarItem(evt);
            }
        });
        jMenu3.add(dev);

        ap.setBackground(new Color(220,240,220));
        ap.setText("Aplicación");
        ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionarItem(evt);
            }
        });
        jMenu3.add(ap);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(intentoExpr))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(intentoExpr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarCaracter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarCaracter
        if (evt.getSource() == uno) {
            intento += "1";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == dos) {
            intento += "2";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == tres) {
            intento += "3";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == cuatro) {
            intento += "4";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == cinco) {
            intento += "5";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == seis) {
            intento += "6";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == siete) {
            intento += "7";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == ocho) {
            intento += "8";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == nueve) {
            intento += "9";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == cero) {
            intento += "0";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == suma) {
            intento += "+";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == resta) {
            intento += "-";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == mult) {
            intento += "*";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == div) {
            intento += "/";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == pot) {
            intento += "^";
            intentoExpr.setText(intento);
        }
        if (evt.getSource() == punto) {
            intento += ".";
            intentoExpr.setText(intento);
        }

    }//GEN-LAST:event_insertarCaracter

    private void Calcular(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular
        if (evt.getSource() == calcular) {

            double resultado;                           // Valor donde se almacenara el resultado
            String intentoAl = intentoExpr.getText();     //Se extrae el texto del JTextField intentoExpr (el campo donde se introduce la expresion)

            /*PRIMERO: Se valida la expresion mediante validarExpr()
            y se verifica que el String "intento" no este VACIO
            ya que si esta vacio quiere decir que aun no se a
            presionado ni un boton de numeros entonces no hay
            expresion alguna*/
            if (validarExpr(intentoAl) && !intento.isEmpty()) {

                resultado = OperarExpresion(operandos);               //Devuelve un double y se almacena en "resultado"
                intentoExpr.setText(Double.toString(resultado));    //en el JTextArea "intentoExpr" se seteara el "resultado" parseado a String
                operandos.clear();                                  //Se vacia el ArrayList<String> "operandos"
                intento = Double.toString(resultado);                 //el valor double "resultado" se parsea a String y se almacena en el String "intento"

            } else {
                proceso.setText("Error: No hay expresion");         // Si el metodo devule false o el String esta vacio entonces el JTextPane proceso seteara el siguient texto
            }

            System.out.println(operandos.toString());               //La consola imprimira el ArrayList<String> inicial "operandos"

            StyledDocument doc = proceso.getStyledDocument();       //Se extrae el objeto StyledDocument con ese metodo y se almacena en "doc" variable del mismo tipo

            Style estilo = doc.addStyle("miEstilo", null);           // Crear un estilo para las cadenas " -" con la clase Style creando una variable estilo                                                         
            StyleConstants.setForeground(estilo, Color.RED);

            String texto = proceso.getText();                       // Obtener el texto del JTextPane
            char[] abc = {'a', 'b', 'c', 'e', 'd', 'f', 'g', 'h', 'i', 'j', 'l', 'm', 'n',
                'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
                'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'L', 'M', 'N',
                'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
                'Z', ':'};
            ArrayList<Character> car = new ArrayList<>();
            for (char a : abc) {
                car.add(a);
            }
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (c == '*' || c == '/' || c == '-' || c == '+' || c == '^') {
                    doc.setCharacterAttributes(i, 1, estilo, false);
                }

                if (car.contains(c)) {
                    doc.setCharacterAttributes(i, 1, estilo, false);
                }

            }
        }
    }//GEN-LAST:event_Calcular

    private void borrarTodo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTodo

        intentoExpr.setText("");
        proceso.setText("");
        intento = "";
        textoProceso = "";
        operandos.clear();
    }//GEN-LAST:event_borrarTodo

    private void borrarCaracter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCaracter

        String nuevaExpr;
        nuevaExpr = intentoExpr.getText();
        if (!nuevaExpr.isEmpty()) {
            nuevaExpr = nuevaExpr.substring(0, nuevaExpr.length() - 1);
        }
        intentoExpr.setText(nuevaExpr);
    }//GEN-LAST:event_borrarCaracter

    private void presionarItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presionarItem

        JButton[] botones = {uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, suma, resta, mult, div, pot, calcular, borrarC, nuevo, punto};
        JMenuItem[] items = {blanco, negro, verde, exportar, ap, dev};
        JMenu[] menus = {jMenu1, jMenu2, jMenu3};
        JLabel[] labels = { jLabel2};

        //Para el fondo blanco 
        if (evt.getSource() == blanco) {

            for (int i = 0; i < botones.length; i++) {
                botones[i].setBackground(Color.black);
                botones[i].setForeground(Color.white);
                if (i < items.length) {
                    items[i].setBackground(Color.white);
                    items[i].setForeground(Color.black);
                }
                if (i < menus.length) {
                    menus[i].setBackground(Color.white);
                    menus[i].setForeground(Color.black);
                }
                if (i < labels.length) {
                    labels[i].setForeground(Color.black);
                }
            }
            jMenuBar1.setBackground(Color.white);
            jMenuBar1.setBorder(BorderFactory.createLineBorder(Color.black));
            this.getContentPane().setBackground(Color.white);
            jPanel1.setBackground(new Color(220, 220, 220));
            proceso.setBackground(new Color(220, 220, 220));
            intentoExpr.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        }

        //Para el fondo negro
        if (evt.getSource() == negro) {
            intentoExpr.setForeground(Color.black);
            for (int i = 0; i < botones.length; i++) {
                botones[i].setBackground(Color.white);
                botones[i].setForeground(Color.black);
                if (i < items.length) {
                    items[i].setBackground(Color.black);
                    items[i].setForeground(Color.white);
                }
                if (i < menus.length) {
                    menus[i].setBackground(Color.black);
                    menus[i].setForeground(Color.white);
                }
                if (i < labels.length) {
                    labels[i].setForeground(Color.white);
                }
            }
            jMenuBar1.setBackground(Color.BLACK);
            jMenuBar1.setBorder(BorderFactory.createLineBorder(Color.white));
            this.getContentPane().setBackground(Color.black);

            jPanel1.setBackground(null);
            proceso.setBackground(Color.white);
            intentoExpr.setBorder(BorderFactory.createLineBorder(Color.white));
            intentoExpr.setCaretColor(Color.black);
        }
        if (evt.getSource() == verde) {
            for (int i = 0; i < botones.length; i++) {
                botones[i].setBackground(new Color(255, 255, 204));
                botones[i].setForeground(new Color(6, 133, 0));
                if (i < items.length) {
                    items[i].setBackground(new Color(220, 240, 220));
                    items[i].setForeground(new Color(0, 102, 0));
                }
                if (i < menus.length) {
                    menus[i].setBackground(new Color(220, 240, 220));
                    menus[i].setForeground(new Color(0, 102, 0));
                }
                if (i < labels.length) {
                    labels[i].setForeground(new Color(0, 51, 0));
                }
            }
            jMenuBar1.setBackground(new Color(220, 240, 220));
            jMenuBar1.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 0)));
            this.getContentPane().setBackground(new Color(220, 240, 220));
            jPanel1.setBackground(null);
            proceso.setBackground(Color.white);
            intentoExpr.setForeground(null);
            intentoExpr.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 0)));
            intentoExpr.setCaretColor(new Color(0, 102, 0));
            calcular.setBackground(new Color(250, 200, 200));

        }
        if (evt.getSource() == dev) {
            JOptionPane.showMessageDialog(null, "Hecho por Diego Quezada\nContactame en diegodavid0404@hotmail.com");
        }
        if (evt.getSource() == ap) {
            JOptionPane.showMessageDialog(null, "Hecho en netbeans 8.2\nen lenguaje Java");
        }
        if (evt.getSource()==exportar) {
                JFileChooser jFileChooser = new JFileChooser();
            if (jFileChooser.showDialog(null, "Guardar archivo") == 0) {
                File file = jFileChooser.getSelectedFile();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    String contenido = proceso.getText();
                    try {
                        fileOutputStream.write(contenido.getBytes());
                    } catch (IOException ex) {
                        Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Archivo guardado");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_presionarItem

    private void calcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_calcularKeyPressed

    private void intentoExprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intentoExprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intentoExprActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Calculadora c = new Calculadora();
                c.setVisible(true);
                c.setLocationRelativeTo(null);
                c.getContentPane().setBackground(new Color(220, 240, 220));

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ap;
    private javax.swing.JMenuItem blanco;
    private javax.swing.JButton borrarC;
    private javax.swing.JButton calcular;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JMenuItem dev;
    private javax.swing.JButton div;
    private javax.swing.JButton dos;
    private javax.swing.JMenuItem exportar;
    private javax.swing.JTextField intentoExpr;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mult;
    private javax.swing.JMenuItem negro;
    private javax.swing.JButton nueve;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton ocho;
    private javax.swing.JButton pot;
    private javax.swing.JTextPane proceso;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    private javax.swing.JMenuItem verde;
    // End of variables declaration//GEN-END:variables

    private boolean validarExpr(String intentoAl) {
        boolean hayOperador = true;
        String num = "";

        for (int i = 0; i < intentoAl.length(); i++) {

            if (intentoAl.charAt(i) == '+' || intentoAl.charAt(i) == '*'
                    || intentoAl.charAt(i) == '/' || intentoAl.charAt(i) == '^'
                    || (intentoAl.charAt(i) == '-' && !hayOperador)) {

                if (!num.equals("")) {
                    operandos.add(num);
                }
                operandos.add(String.valueOf(intentoAl.charAt(i)));
                hayOperador = true;
                num = "";

            } else if (intentoAl.charAt(i) == '-' && hayOperador == true
                    || (intentoAl.charAt(i) == '-' && operandos.isEmpty())) {
                num += "" + intentoAl.charAt(i);
                hayOperador = false;

            } else if (intentoAl.charAt(i) == '.' && num != "") {

                num += "" + intentoAl.charAt(i);
                hayOperador = false;

            } else if (esDigito(intentoAl.charAt(i))) {
                num += "" + intentoAl.charAt(i);
                if (i == intento.length() - 1) {
                    operandos.add(num);
                }
                hayOperador = false;

            } else if (hayOperador && esDecimal(num)) {

            } else {
                System.out.println("caracter invalido ctm");
                return false;
            }
        }
        for (int i = 1; i < operandos.size() - 1; i++) {
            if (operandos.get(i).equals("/") || operandos.get(i).equals("*")
                    || operandos.get(i).equals("-") || operandos.get(i).equals("+")
                    || operandos.get(i).equals("^")) {
                if (esDecimal(operandos.get(i - 1)) && esDecimal(operandos.get(i + 1))) {

                } else {
                    return false;
                }
            }
        }
        System.out.println(operandos.toString());
        return true;
    }

    private double OperarExpresion(ArrayList<String> expresion) {

        double n1, n2;
        double res = 0;

        System.out.println(operandos.toString());
        mostrarOperacion(operandos);

        //Primero se hacen las potencias se recorre el ArrayList con un for esperando encontrar un caracter '^'
        for (tamañoExpr = expresion.size() - 1; tamañoExpr > 0; tamañoExpr--) {

            if (expresion.get(tamañoExpr).equals("^")) {
                n1 = Double.parseDouble(expresion.get(tamañoExpr - 1));
                n2 = Double.parseDouble(expresion.get(tamañoExpr + 1));
                res = Math.pow(n1, n2);
                expresion.set(tamañoExpr, Double.toString(res));
                expresion.remove(tamañoExpr - 1);
                expresion.remove(tamañoExpr);
                /*System.out.println(res+"/");
                System.out.println(operandos.toString());*/
                OperarExpresion(expresion);
            }
        }

        //Luego se hacen las potencias se recorre el ArrayList con un for esperando encontrar un caracter '^'
        for (int i = 0; i < expresion.size() - 1; i++) {
            if (expresion.get(i).equals("/")) {
                n1 = Double.parseDouble(expresion.get(i - 1));
                n2 = Double.parseDouble(expresion.get(i + 1));
                res = n1 / n2;
                expresion.set(i, Double.toString(res));
                expresion.remove(i - 1);
                expresion.remove(i);
                /*System.out.println(res+"/");
                System.out.println(operandos.toString());*/
                OperarExpresion(expresion);
            }
        }

        for (int i = 0; i < expresion.size() - 1; i++) {
            if (expresion.get(i).equals("*")) {
                n1 = Double.parseDouble(expresion.get(i - 1));
                n2 = Double.parseDouble(expresion.get(i + 1));
                res = n1 * n2;
                expresion.set(i, Double.toString(res));
                expresion.remove(i - 1);
                expresion.remove(i);
                OperarExpresion(expresion);
            }
        }

        for (int i = 0; i < expresion.size() - 1; i++) {
            if (expresion.get(i).equals("-")) {
                n1 = Double.parseDouble(expresion.get(i - 1));
                n2 = Double.parseDouble(expresion.get(i + 1));
                res = n1 - n2;
                expresion.set(i, Double.toString(res));
                expresion.remove(i - 1);
                expresion.remove(i);
                OperarExpresion(expresion);
            }
        }

        for (int i = 0; i < expresion.size() - 1; i++) {
            if (expresion.get(i).equals("+")) {
                n1 = Double.parseDouble(expresion.get(i - 1));
                n2 = Double.parseDouble(expresion.get(i + 1));
                res = n1 + n2;
                expresion.set(i, Double.toString(res));
                expresion.remove(i - 1);
                expresion.remove(i);
                OperarExpresion(expresion);
            }
        }
        return Double.parseDouble(expresion.get(0));
    }

    private boolean esDigito(char intento) {
        int resultado;

        try {
            Character.getNumericValue(intento);
        } catch (Exception e) {
            proceso.setText("Error:" + e.getMessage());
            return false;
        }
        return true;
    }

    private boolean esDecimal(String intento) {
        try {
            Double.parseDouble(intento);
        } catch (Exception e) {
            proceso.setText("Error:" + e.getMessage());
            return false;
        }
        return true;
    }

    public void mostrarOperacion(ArrayList<String> op) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        DecimalFormatSymbols decimalFormatSymbols=new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        for (int i = 0; i < op.size(); i++) {
            if (op.get(i).contains("*")
                    || op.get(i).contains("/")
                    || op.get(i).contains("+")
                    || op.get(i).contains("-")
                    || op.get(i).contains("^")) {
                System.out.println("Se encontro algo");
                textoProceso += op.get(i);
            } else if (EsEntero(op.get(i))) {
                textoProceso += op.get(i);
            } else {
                textoProceso += decimalFormat.format(Double.parseDouble(op.get(i)));

            }
        }
        textoProceso += "\n";
        proceso.setText(textoProceso);
    }

    private boolean EsEntero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
