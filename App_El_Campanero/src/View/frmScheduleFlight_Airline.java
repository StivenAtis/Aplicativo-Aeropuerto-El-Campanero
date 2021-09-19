package View;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import Classes.*;
import Controller.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Booh
 */
public class frmScheduleFlight_Airline extends javax.swing.JFrame {
    
    ctlFlightRequirement controlFlightRequirement = new ctlFlightRequirement();

    LinkedList<clsFlightRequirements> FlightRequirementObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------
    
    public frmScheduleFlight_Airline() {
        initComponents();
        showFlightList();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfCodigoVuelo = new javax.swing.JTextField();
        tfDestino = new javax.swing.JTextField();
        comboboxModeloAvion = new javax.swing.JComboBox<>();
        chboxVueloPasajeros = new javax.swing.JCheckBox();
        chboxVueloCarga = new javax.swing.JCheckBox();
        chboxVueloSalida = new javax.swing.JCheckBox();
        chboxVueloLlegada = new javax.swing.JCheckBox();
        comboBoxCapacidadAvion = new javax.swing.JComboBox<>();
        comboBoxTripulacionVuelo = new javax.swing.JComboBox<>();
        comboBoxYear = new javax.swing.JComboBox<>();
        comboBoxMonth = new javax.swing.JComboBox<>();
        comboBoxDay = new javax.swing.JComboBox<>();
        comboBoxHour = new javax.swing.JComboBox<>();
        comboBoxMinutes = new javax.swing.JComboBox<>();
        btConsult = new javax.swing.JButton();
        btRequest = new javax.swing.JButton();
        btReprogramar = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        scpData = new javax.swing.JScrollPane();
        DataFly = new javax.swing.JTextArea();
        lbEmailUserLogin = new javax.swing.JLabel();
        lbEmailUserLogin9 = new javax.swing.JLabel();
        lbEmailUserLogin1 = new javax.swing.JLabel();
        lbEmailUserLogin2 = new javax.swing.JLabel();
        lbEmailUserLogin3 = new javax.swing.JLabel();
        lbEmailUserLogin4 = new javax.swing.JLabel();
        lbEmailUserLogin5 = new javax.swing.JLabel();
        lbEmailUserLogin6 = new javax.swing.JLabel();
        lbEmailUserLogin7 = new javax.swing.JLabel();
        lbEmailUserLogin8 = new javax.swing.JLabel();
        lbrequerimientos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 160));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfCodigoVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfCodigoVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCodigoVueloMouseClicked(evt);
            }
        });
        jPanel1.add(tfCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 460, 40));

        tfDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(tfDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, 250, 40));

        comboboxModeloAvion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo de avión" }));
        jPanel1.add(comboboxModeloAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 360, 40));

        chboxVueloPasajeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloPasajeros.setText("Vuelo de pasajeros");
        chboxVueloPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloPasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 160, 40));

        chboxVueloCarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloCarga.setText("Vuelo de carga");
        chboxVueloCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloCargaActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 160, 40));

        chboxVueloSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloSalida.setText("Vuelo de salida");
        chboxVueloSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, 40));

        chboxVueloLlegada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloLlegada.setText("Vuelo de llegada");
        chboxVueloLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloLlegadaActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 160, 40));

        comboBoxCapacidadAvion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        jPanel1.add(comboBoxCapacidadAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 360, 40));

        comboBoxTripulacionVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxTripulacionVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tripulación de vuelo", "Piloto", "piloto y copiloto" }));
        jPanel1.add(comboBoxTripulacionVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 360, 40));

        comboBoxYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        jPanel1.add(comboBoxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 110, 40));

        comboBoxMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(comboBoxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 120, 40));

        comboBoxDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(comboBoxDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 110, 40));

        comboBoxHour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel1.add(comboBoxHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 120, 40));

        comboBoxMinutes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(comboBoxMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 120, 40));

        btConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/consutarSolicitud_min.jpg"))); // NOI18N
        btConsult.setContentAreaFilled(false);
        btConsult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/consutarSolicitud_min.jpg"))); // NOI18N
        btConsult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/consultarSolicitud_max.jpg"))); // NOI18N
        btConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultActionPerformed(evt);
            }
        });
        jPanel1.add(btConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 290, 120));

        btRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/SolicitarVuelo_min.jpg"))); // NOI18N
        btRequest.setContentAreaFilled(false);
        btRequest.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/SolicitarVuelo_min.jpg"))); // NOI18N
        btRequest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/SolicitarVuelo_Max.jpg"))); // NOI18N
        btRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRequestActionPerformed(evt);
            }
        });
        jPanel1.add(btRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 760, 290, 120));

        btReprogramar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramarSolicitudAirline_min.jpg"))); // NOI18N
        btReprogramar.setContentAreaFilled(false);
        btReprogramar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramarSolicitudAirline_min.jpg"))); // NOI18N
        btReprogramar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramarSolicitudAirline_max.jpg"))); // NOI18N
        jPanel1.add(btReprogramar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 760, 290, 120));

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelarVuelo_min.jpg"))); // NOI18N
        btCancel.setContentAreaFilled(false);
        btCancel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelarVuelo_min.jpg"))); // NOI18N
        btCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelarVuelo_max.jpg"))); // NOI18N
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 760, 280, 120));

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/salirVuelo_min.jpg"))); // NOI18N
        btExit.setContentAreaFilled(false);
        btExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/salirVuelo_min.jpg"))); // NOI18N
        btExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/salirVuelo_max.jpg"))); // NOI18N
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel1.add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 280, 110));

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/limpiar_min.jpg"))); // NOI18N
        btLimpiar.setContentAreaFilled(false);
        btLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/limpiar_min.jpg"))); // NOI18N
        btLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/limpiarC_max.jpg"))); // NOI18N
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 280, 120));

        DataFly.setColumns(20);
        DataFly.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        DataFly.setRows(5);
        DataFly.setFocusable(false);
        scpData.setViewportView(DataFly);

        jPanel1.add(scpData, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 380, 530));

        lbEmailUserLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin.setText("Seleccione");
        lbEmailUserLogin.setToolTipText("");
        jPanel1.add(lbEmailUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 130, 50));

        lbEmailUserLogin9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin9.setText("Especifique destino del vuelo");
        lbEmailUserLogin9.setToolTipText("");
        jPanel1.add(lbEmailUserLogin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 280, 50));

        lbEmailUserLogin1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin1.setText("Datos de vuelo");
        lbEmailUserLogin1.setToolTipText("");
        jPanel1.add(lbEmailUserLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 170, 50));

        lbEmailUserLogin2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin2.setText("Seleccione modelo de avión");
        lbEmailUserLogin2.setToolTipText("");
        jPanel1.add(lbEmailUserLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 50));

        lbEmailUserLogin3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin3.setText("Seleccione (Hora - Minutos)");
        lbEmailUserLogin3.setToolTipText("");
        jPanel1.add(lbEmailUserLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 280, 50));

        lbEmailUserLogin4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin4.setText("Seleccione tipo de vuelo");
        lbEmailUserLogin4.setToolTipText("");
        jPanel1.add(lbEmailUserLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 50));

        lbEmailUserLogin5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin5.setText("Seleccione capacidad de avión");
        lbEmailUserLogin5.setToolTipText("");
        jPanel1.add(lbEmailUserLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 50));

        lbEmailUserLogin6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin6.setText("Seleccione tripulación de vuelo");
        lbEmailUserLogin6.setToolTipText("");
        jPanel1.add(lbEmailUserLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 300, 50));

        lbEmailUserLogin7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin7.setText("Seleccione fecha de agenda");
        lbEmailUserLogin7.setToolTipText("");
        jPanel1.add(lbEmailUserLogin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 280, 50));

        lbEmailUserLogin8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin8.setText("Digite codigo vuelo");
        lbEmailUserLogin8.setToolTipText("");
        jPanel1.add(lbEmailUserLogin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 50));

        lbrequerimientos.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lbrequerimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbrequerimientos.setText("Registrar requerimientos de vuelo");
        lbrequerimientos.setToolTipText("");
        jPanel1.add(lbrequerimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ScheduleBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void cleanRegisterQuestionnaire(){
        tfCodigoVuelo.setText("");
        tfDestino.setText("");
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxTripulacionVuelo.setSelectedIndex(0);
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión"}));
        comboBoxYear.setSelectedIndex(0);
        comboBoxMonth.setSelectedIndex(0);
        comboBoxDay.setSelectedIndex(0);
        comboBoxHour.setSelectedIndex(0);
        comboBoxMinutes.setSelectedIndex(0);
    }
    
    //--------------------------------------------------------------------------
    
    private void chboxVueloPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloPasajerosActionPerformed
        if(chboxVueloPasajeros.isSelected() == true){
            
            chboxVueloCarga.setSelected(false);
            
            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] 
                { "Modelo de avión", "YV-305", "YV-366", "YX-578", "ZX-825", "AX-179", "GB-780", "UF-555", "HJ-034", "QW-826", "MK-340", "ZM-001", "VJ-931", "LP-895", "QK-428"}));
                comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión", "50", "80", "100", "150", "200", "250", "280" }));
            }
        else if (chboxVueloPasajeros.isSelected() == false){
            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión", }));
            comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        }
    }//GEN-LAST:event_chboxVueloPasajerosActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloSalidaActionPerformed
         if(chboxVueloSalida.isSelected() == true){
             chboxVueloLlegada.setSelected(false);
         }
    }//GEN-LAST:event_chboxVueloSalidaActionPerformed

    //--------------------------------------------------------------------------
    
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        frmLogin login = new  frmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btExitActionPerformed

    //--------------------------------------------------------------------------
    
    private void btConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultActionPerformed
        
        String codigoVueloEncontrado = tfCodigoVuelo.getText();
        
        if(codigoVueloEncontrado.equals("")){
            JOptionPane.showMessageDialog(this, "Debe diligenciar el codigo para poder realizar la consulta.");
        }
        else{
            clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVueloEncontrado);
            
            if (FlightRequirementsSearch == null) {
                JOptionPane.showMessageDialog(this, "¡El vuelo con codigo: " + codigoVueloEncontrado + ". No se encuentra registrado!");
                cleanRegisterQuestionnaire();
            } else {
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                    chboxVueloPasajeros.setSelected(true);
                    chboxVueloSalida.setSelected(true);
                    chboxVueloLlegada.setSelected(false);
                    chboxVueloCarga.setSelected(false);
                    
                    comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                    comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                    comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino());
                    
                    DataFly.setText("Datos de vuelo:" + "\n" +
                                    "\n" +
                                    "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                    "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                    "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                    "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                    "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                    "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                    "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                    "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                    "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                }
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
                    
                    chboxVueloCarga.setSelected(true);
                    chboxVueloLlegada.setSelected(true);
                    chboxVueloSalida.setSelected(false);
                    chboxVueloPasajeros.setSelected(false);
                    
                    comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                    comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                    comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino());
                    
                    DataFly.setText("Datos de vuelo:" + "\n" +
                                    "\n" +
                                    "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                    "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                    "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                    "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                    "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                    "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                    "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                    "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                    "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                }
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                    chboxVueloLlegada.setSelected(true);
                    chboxVueloPasajeros.setSelected(true);
                    chboxVueloCarga.setSelected(false);
                    chboxVueloSalida.setSelected(false);
                    
                    comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                    comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                    comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino());
                    
                    DataFly.setText("Datos de vuelo:" + "\n" +
                                    "\n" +
                                    "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                    "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                    "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                    "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                    "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                    "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                    "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                    "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                    "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                }
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
                    
                    chboxVueloCarga.setSelected(true);
                    chboxVueloSalida.setSelected(true);
                    chboxVueloPasajeros.setSelected(false);
                    chboxVueloLlegada.setSelected(false);
                    
                    comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                    comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                    comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino());
                    
                    DataFly.setText("Datos de vuelo:" + "\n" +
                                    "\n" +
                                    "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                    "Tipo de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                    "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" + 
                                    "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                    "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                    "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                    "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                    "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                    "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                }
            }
        }
    }//GEN-LAST:event_btConsultActionPerformed

    //--------------------------------------------------------------------------
    
    private void btRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRequestActionPerformed
        
        try {
            String codigo = tfCodigoVuelo.getText();
            String destino = tfDestino.getText();
            boolean tipovueloP = chboxVueloPasajeros.isSelected();
            boolean tipovueloC = chboxVueloCarga.isSelected();
            boolean vueloS = chboxVueloSalida.isSelected();
            boolean vueloLl = chboxVueloLlegada.isSelected();
            String modeloAvion = comboboxModeloAvion.getSelectedItem().toString();
            String capacidadAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
            String tripulacionVuelo = comboBoxTripulacionVuelo.getSelectedItem().toString();
            String anio = comboBoxYear.getSelectedItem().toString();
            String mes = comboBoxMonth.getSelectedItem().toString();
            String dia = comboBoxDay.getSelectedItem().toString();
            String hora = comboBoxHour.getSelectedItem().toString();
            String minuto = comboBoxMinutes.getSelectedItem().toString();
            
            if(codigo.equals("")){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar el codigo del vuelo!");
            }
            if(modeloAvion.equals("Modelo de avión")){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un modelo de avión!");
            }
            if (tipovueloC == false && tipovueloP == false) {
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un tipo de vuelo!");
            }
            if (vueloS == false && vueloLl == false) {
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar la clase de vuelo!");
            }
            if (capacidadAvion.equals("Capacidad de avión")) {
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar la capacidad del avión!");
            }
            if(tripulacionVuelo.equals("Tripulación de vuelo")){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar una la tripulación para el vuelo!");
            }
            if(anio.equals("Year") || mes.equals("Month") || dia.equals("Day")){
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar una fecha valida!");
            }
            if(hora.equals("Hour") || minuto.equals("Minutes")){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar una hora valida del vuelo!");
            }
            if(destino.equals("")){
                JOptionPane.showMessageDialog(this, "¡Debe ingresar un destino para el vuelo!");
            }
            else{
                if(tipovueloP==true && vueloS==true && !"".equals(codigo)){
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                    String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                    String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
                    String mesNumber = "";
                    
                    if(mesVuelo.equals("January")){
                        mesNumber = "1";
                    }
                    if(mesVuelo.equals("February")){
                        mesNumber = "2";
                    }
                    if(mesVuelo.equals("March")){
                        mesNumber = "3";
                    }
                    if(mesVuelo.equals("April")){
                        mesNumber = "4";
                    }
                    if(mesVuelo.equals("may")){
                        mesNumber = "5";
                    }
                    if(mesVuelo.equals("June")){
                        mesNumber = "6";
                    }
                    if(mesVuelo.equals("July")){
                        mesNumber = "7";
                    }
                    if(mesVuelo.equals("August")){
                        mesNumber = "8";
                    }
                    if(mesVuelo.equals("September")){
                        mesNumber = "9";
                    }
                    if(mesVuelo.equals("October")){
                        mesNumber = "10";
                    }
                    if(mesVuelo.equals("November")){
                        mesNumber = "11";
                    }
                    if(mesVuelo.equals("December")){
                        mesNumber = "12";
                    }
                    
                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
                    
                    //----------
                    clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
                        
                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }
            
                    }
                    //----------
                    else{
                        if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
                        
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                        
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    }
                    //----------
                    
                    
                    
                }
                
                //--------------------------------------------------------------
                
                if (tipovueloC==true && vueloLl==true && !"".equals(codigo)) {
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                    String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                    String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
                    String mesNumber = "";
                    
                    if(mesVuelo.equals("January")){
                        mesNumber = "1";
                    }
                    if(mesVuelo.equals("February")){
                        mesNumber = "2";
                    }
                    if(mesVuelo.equals("March")){
                        mesNumber = "3";
                    }
                    if(mesVuelo.equals("April")){
                        mesNumber = "4";
                    }
                    if(mesVuelo.equals("may")){
                        mesNumber = "5";
                    }
                    if(mesVuelo.equals("June")){
                        mesNumber = "6";
                    }
                    if(mesVuelo.equals("July")){
                        mesNumber = "7";
                    }
                    if(mesVuelo.equals("August")){
                        mesNumber = "8";
                    }
                    if(mesVuelo.equals("September")){
                        mesNumber = "9";
                    }
                    if(mesVuelo.equals("October")){
                        mesNumber = "10";
                    }
                    if(mesVuelo.equals("November")){
                        mesNumber = "11";
                    }
                    if(mesVuelo.equals("December")){
                        mesNumber = "12";
                    }
                    
                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";

                    //----------
                    clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
                        
                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());
                            
                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora() + "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }
            
                    }
                    //----------
                    else{
                    if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
                        
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                        
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    }
                }
                
                //--------------------------------------------------------------
                
                if(tipovueloP==true && vueloLl==true && !"".equals(codigo)){
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                    String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                    String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
                    String mesNumber = "";
                    
                    if(mesVuelo.equals("January")){
                        mesNumber = "1";
                    }
                    if(mesVuelo.equals("February")){
                        mesNumber = "2";
                    }
                    if(mesVuelo.equals("March")){
                        mesNumber = "3";
                    }
                    if(mesVuelo.equals("April")){
                        mesNumber = "4";
                    }
                    if(mesVuelo.equals("may")){
                        mesNumber = "5";
                    }
                    if(mesVuelo.equals("June")){
                        mesNumber = "6";
                    }
                    if(mesVuelo.equals("July")){
                        mesNumber = "7";
                    }
                    if(mesVuelo.equals("August")){
                        mesNumber = "8";
                    }
                    if(mesVuelo.equals("September")){
                        mesNumber = "9";
                    }
                    if(mesVuelo.equals("October")){
                        mesNumber = "10";
                    }
                    if(mesVuelo.equals("November")){
                        mesNumber = "11";
                    }
                    if(mesVuelo.equals("December")){
                        mesNumber = "12";
                    }
                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
                    
                    //----------
                    clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
                        
                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }
            
                    }
                    //----------
                    else{
                    if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
                         
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                        
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de pasajeros", "Vuelo de llegada", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                       controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " pasajeros" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire(); 
                    }
                    }
                }
                
                //--------------------------------------------------------------
                
                if (tipovueloC==true && vueloS==true && !"".equals(codigo)) {
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String modelAvion = comboboxModeloAvion.getSelectedItem().toString();
                    String capacidadDeAvion = comboBoxCapacidadAvion.getSelectedItem().toString();
                    String tripulacionDeAvion = comboBoxTripulacionVuelo.getSelectedItem().toString();
                    String anioVuelo = comboBoxYear.getSelectedItem().toString();
                    String mesVuelo = comboBoxMonth.getSelectedItem().toString();
                    String diaVuelo = comboBoxDay.getSelectedItem().toString();
                    String horaVuelo = comboBoxHour.getSelectedItem().toString();
                    String minutoVuelo = comboBoxMinutes.getSelectedItem().toString();
                    String mesNumber = "";
                    
                    if(mesVuelo.equals("January")){
                        mesNumber = "1";
                    }
                    if(mesVuelo.equals("February")){
                        mesNumber = "2";
                    }
                    if(mesVuelo.equals("March")){
                        mesNumber = "3";
                    }
                    if(mesVuelo.equals("April")){
                        mesNumber = "4";
                    }
                    if(mesVuelo.equals("may")){
                        mesNumber = "5";
                    }
                    if(mesVuelo.equals("June")){
                        mesNumber = "6";
                    }
                    if(mesVuelo.equals("July")){
                        mesNumber = "7";
                    }
                    if(mesVuelo.equals("August")){
                        mesNumber = "8";
                    }
                    if(mesVuelo.equals("September")){
                        mesNumber = "9";
                    }
                    if(mesVuelo.equals("October")){
                        mesNumber = "10";
                    }
                    if(mesVuelo.equals("November")){
                        mesNumber = "11";
                    }
                    if(mesVuelo.equals("December")){
                        mesNumber = "12";
                    }
                    String fecha = anioVuelo + "-" + mesNumber + "-" + diaVuelo;
                    String tiempo = horaVuelo + ":" + minutoVuelo + ":" + "00";
                    
                    //----------
                    clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
                        
                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " pasajeros" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxTripulacionVuelo.setSelectedItem(FlightRequirementsSearch.getTripulación());
                            comboboxModeloAvion.setSelectedItem(FlightRequirementsSearch.getModeloAvion());
                            comboBoxCapacidadAvion.setSelectedItem(FlightRequirementsSearch.getCapacidadCarga());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            DataFly.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVuelo() + "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getSalidaLlegada() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" + 
                                            "Modelo de avión: " + FlightRequirementsSearch.getModeloAvion() + "\n" + 
                                            "Capacidad de almacenaje del avión: " + FlightRequirementsSearch.getCapacidadCarga() + " toneladas" + "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getHora()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }
            
                    }
                    //----------
                    
                    else{
                    
                    if (Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) < currentDate.getMonthValue()) {
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) < currentDate.getYear()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) < currentDate.getDayOfMonth()){
                        JOptionPane.showMessageDialog(this, "¡Debe ingresar una fecha valida para el vuelo!");
                    }
                    else if (Integer.parseInt(anioVuelo) >= currentDate.getYear() ){
                         
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                    
                        clsFlightRequirements solicitarVuelo = new clsFlightRequirements
                        (0, codigoVuelo, modelAvion, "Vuelo de carga", "Vuelo de salida", capacidadDeAvion, tripulacionDeAvion, fecha, tiempo, destinoVuelo);

                        controlFlightRequirement.createFlightRequirement(solicitarVuelo);

                        DataFly.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Modelo de avión: " + modelAvion + "\n" + 
                                        "Capacidad de almacenaje del avión: " + capacidadDeAvion + " toneladas" + "\n" + 
                                        "Tripulación del avión: " + tripulacionDeAvion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una solicitud de vuelo!!!", "Solicitud realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanRegisterQuestionnaire();
                    }
                    }
                }
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btRequestActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloCargaActionPerformed
        if(chboxVueloCarga.isSelected() == true){
            
            chboxVueloPasajeros.setSelected(false);
            
            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] 
                { "Modelo de avión", "QWE-309", "WED-321", "FGF-654", "ZXC-987", "VCB-960", "DEF-710", "TYG-001", "QWS-450", "XZC-606", "CDV-005", "SWD-300", "SSD-898", "BGM-568", "TYJ-124"}));
                comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión", "350", "500", "600", "700", "800", "950", "1060" }));
            }
        else if (chboxVueloPasajeros.isSelected() == false){
            comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión", }));
            comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión" }));
        }
    }//GEN-LAST:event_chboxVueloCargaActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloLlegadaActionPerformed
        if(chboxVueloLlegada.isSelected() == true){
             chboxVueloSalida.setSelected(false);
         }
    }//GEN-LAST:event_chboxVueloLlegadaActionPerformed

    //--------------------------------------------------------------------------
    
    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        
        tfCodigoVuelo.setText("");
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxTripulacionVuelo.setSelectedIndex(0);
        comboboxModeloAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Modelo de avión"}));
        comboBoxCapacidadAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capacidad de avión"}));
        comboBoxYear.setSelectedIndex(0);
        comboBoxMonth.setSelectedIndex(0);
        comboBoxDay.setSelectedIndex(0);
        comboBoxHour.setSelectedIndex(0);
        comboBoxMinutes.setSelectedIndex(0);
        tfDestino.setText("");
        DataFly.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        
       String codigoVueloCancelar = tfCodigoVuelo.getText();
       
       if (codigoVueloCancelar.equals("") || DataFly.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Para cancelar un vuelo, primero debe consultarlo!");
       }
       else{
                       
           clsFlightRequirements  FlightCancel = new clsFlightRequirements(0, codigoVueloCancelar, "modelo avion", "Tipo vuelo", "clase vuelo", "capacidad carga", "tripulacion", "fecha", "hora", "Destino");
       
           int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar el vuelo?");
            
           if (respuesta == JOptionPane.OK_OPTION) {
                
                if (controlFlightRequirement.deleteFlight(FlightCancel)) {
                    showFlightList();
                    cleanRegisterQuestionnaire();
                    DataFly.setText("");
                     JOptionPane.showMessageDialog(this, "Vuelo cancelado con éxito.");
                }
            } 
            else {

                JOptionPane.showMessageDialog(this, "Ocurrió un error al cancelar, por favor verifique los datos");
            }
       }
    }//GEN-LAST:event_btCancelActionPerformed

    //--------------------------------------------------------------------------
    
    private void tfCodigoVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoVueloMouseClicked
        DataFly.setText("");
    }//GEN-LAST:event_tfCodigoVueloMouseClicked

    //--------------------------------------------------------------------------
    
    private void showFlightList(){
        FlightRequirementObjectList = controlFlightRequirement.listFlight();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightRequirements vuelos : FlightRequirementObjectList) {
            String data = "CODIGO VUELO: " + vuelos.getCodigoVuelo()+ " - " + " TIPO VUELO: " + vuelos.getTipoVuelo()+ " - " +
                          " CLASE VUELO: " +vuelos.getSalidaLlegada()+ " - " + " FECHA VUELO: " + vuelos.getFecha()+ " - " + 
                          " HORA VUELO: " + vuelos.getHora() + " - " + " DESTINO: " + vuelos.getDestino();
            model.add(index, data);
            index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmScheduleFlight_Airline().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DataFly;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btConsult;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btReprogramar;
    private javax.swing.JButton btRequest;
    private javax.swing.JCheckBox chboxVueloCarga;
    private javax.swing.JCheckBox chboxVueloLlegada;
    private javax.swing.JCheckBox chboxVueloPasajeros;
    private javax.swing.JCheckBox chboxVueloSalida;
    private javax.swing.JComboBox<String> comboBoxCapacidadAvion;
    private javax.swing.JComboBox<String> comboBoxDay;
    private javax.swing.JComboBox<String> comboBoxHour;
    private javax.swing.JComboBox<String> comboBoxMinutes;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxTripulacionVuelo;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JComboBox<String> comboboxModeloAvion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEmailUserLogin;
    private javax.swing.JLabel lbEmailUserLogin1;
    private javax.swing.JLabel lbEmailUserLogin2;
    private javax.swing.JLabel lbEmailUserLogin3;
    private javax.swing.JLabel lbEmailUserLogin4;
    private javax.swing.JLabel lbEmailUserLogin5;
    private javax.swing.JLabel lbEmailUserLogin6;
    private javax.swing.JLabel lbEmailUserLogin7;
    private javax.swing.JLabel lbEmailUserLogin8;
    private javax.swing.JLabel lbEmailUserLogin9;
    private javax.swing.JLabel lbrequerimientos;
    private javax.swing.JScrollPane scpData;
    private javax.swing.JTextField tfCodigoVuelo;
    private javax.swing.JTextField tfDestino;
    // End of variables declaration//GEN-END:variables
}
