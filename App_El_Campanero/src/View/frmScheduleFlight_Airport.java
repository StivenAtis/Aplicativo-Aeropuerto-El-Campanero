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
public class frmScheduleFlight_Airport extends javax.swing.JFrame {

    ctlFlightRequirement controlFlightRequirement = new ctlFlightRequirement();
    ctlFlightAgenda controlFlightAgenda = new ctlFlightAgenda();

    LinkedList<clsFlightRequirements> FlightRequirementObjectList = new LinkedList<>();
    LinkedList<clsFlightAgenda> FlightAgendaObjectList = new LinkedList<>();
    
    LocalDate currentDate = LocalDate.now();
    
    //--------------------------------------------------------------------------
    
    public frmScheduleFlight_Airport() {
        initComponents();
        mostrarLisatadoSolicitudes();
        showFlightList();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEmailUserLogin14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LtVuelosSolicitados = new javax.swing.JList<>();
        Jsp = new javax.swing.JScrollPane();
        tfVueloConsultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlAgenda = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        dataAgenda = new javax.swing.JTextArea();
        tfCodigoVuelo = new javax.swing.JTextField();
        chboxVueloPasajeros = new javax.swing.JCheckBox();
        chboxVueloCarga = new javax.swing.JCheckBox();
        chboxVueloSalida = new javax.swing.JCheckBox();
        chboxVueloLlegada = new javax.swing.JCheckBox();
        comboBoxPistaAterrizaje = new javax.swing.JComboBox<>();
        comboBoxPistaDespegue = new javax.swing.JComboBox<>();
        comboBoxYear = new javax.swing.JComboBox<>();
        comboBoxMonth = new javax.swing.JComboBox<>();
        comboBoxDay = new javax.swing.JComboBox<>();
        comboBoxHour = new javax.swing.JComboBox<>();
        tfDestino = new javax.swing.JTextField();
        comboBoxMinutes = new javax.swing.JComboBox<>();
        lbEmailUserLogin9 = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btAgendar = new javax.swing.JButton();
        btReprogramarSolicitud = new javax.swing.JButton();
        btCancelarS = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btNoAgendar = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbAgendar = new javax.swing.JLabel();
        lbVueloS = new javax.swing.JLabel();
        lbVueloC = new javax.swing.JLabel();
        lbAgendaD = new javax.swing.JLabel();
        VuelloA = new javax.swing.JLabel();
        lbCdigoVuelo = new javax.swing.JLabel();
        lbTipoV = new javax.swing.JLabel();
        lbClaseV = new javax.swing.JLabel();
        lbPistaA = new javax.swing.JLabel();
        lbPistaD = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jlBanner = new javax.swing.JLabel();

        lbEmailUserLogin14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin14.setText("Seleccione tipo de vuelo");
        lbEmailUserLogin14.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 180));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LtVuelosSolicitados.setFocusable(false);
        jScrollPane1.setViewportView(LtVuelosSolicitados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 310));

        tfVueloConsultado.setColumns(20);
        tfVueloConsultado.setRows(5);
        tfVueloConsultado.setFocusable(false);
        Jsp.setViewportView(tfVueloConsultado);

        jPanel1.add(Jsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 300, 310));

        jlAgenda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2021-9-12 - 2022-01-06", "2022-03-20 - 2022-04-1", "2022-05-1 - 2022-06-12", "2022-08-12 - 2022-08-25", "2022-09-25 - 2022-12-1", "2023-01-12 - 2023-04-12" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlAgenda.setFocusable(false);
        jScrollPane2.setViewportView(jlAgenda);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 230, 310));

        dataAgenda.setColumns(20);
        dataAgenda.setRows(5);
        jScrollPane4.setViewportView(dataAgenda);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 300, 310));

        tfCodigoVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(tfCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 390, 40));

        chboxVueloPasajeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloPasajeros.setText("Vuelo de pasajeros");
        chboxVueloPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloPasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 160, 40));

        chboxVueloCarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloCarga.setText("Vuelo de carga");
        chboxVueloCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloCargaActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 160, 40));

        chboxVueloSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloSalida.setText("Vuelo de salida");
        chboxVueloSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 160, 40));

        chboxVueloLlegada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chboxVueloLlegada.setText("Vuelo de llegada");
        chboxVueloLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxVueloLlegadaActionPerformed(evt);
            }
        });
        jPanel1.add(chboxVueloLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 160, 40));

        comboBoxPistaAterrizaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        jPanel1.add(comboBoxPistaAterrizaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, 360, 40));

        comboBoxPistaDespegue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        jPanel1.add(comboBoxPistaDespegue, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 360, 40));

        comboBoxYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060" }));
        jPanel1.add(comboBoxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 110, 40));

        comboBoxMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "may", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(comboBoxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 120, 40));

        comboBoxDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(comboBoxDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 110, 40));

        comboBoxHour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel1.add(comboBoxHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 120, 40));

        tfDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(tfDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 350, 40));

        comboBoxMinutes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutes", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(comboBoxMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 510, 120, 40));

        lbEmailUserLogin9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbEmailUserLogin9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin9.setText("Especifique destino del vuelo");
        lbEmailUserLogin9.setToolTipText("");
        jPanel1.add(lbEmailUserLogin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 280, 50));

        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/consutarSolicitud_min.jpg"))); // NOI18N
        btConsultar.setContentAreaFilled(false);
        btConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/consutarSolicitud_min.jpg"))); // NOI18N
        btConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/consultarSolicitud_max.jpg"))); // NOI18N
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 310, 120));

        btAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agendar_min.jpg"))); // NOI18N
        btAgendar.setContentAreaFilled(false);
        btAgendar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agendar_min.jpg"))); // NOI18N
        btAgendar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agendar_max.jpg"))); // NOI18N
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });
        jPanel1.add(btAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 310, 120));

        btReprogramarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramarSolicitudAirline_min.jpg"))); // NOI18N
        btReprogramarSolicitud.setContentAreaFilled(false);
        btReprogramarSolicitud.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramarSolicitudAirline_min.jpg"))); // NOI18N
        btReprogramarSolicitud.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/reprogramarSolicitudAirline_max.jpg"))); // NOI18N
        jPanel1.add(btReprogramarSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 570, 310, 120));

        btCancelarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelarVuelo_min.jpg"))); // NOI18N
        btCancelarS.setContentAreaFilled(false);
        btCancelarS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelarVuelo_min.jpg"))); // NOI18N
        btCancelarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancelarAgenda_max.jpg"))); // NOI18N
        jPanel1.add(btCancelarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 310, 120));

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/limpiar_min.jpg"))); // NOI18N
        btLimpiar.setContentAreaFilled(false);
        btLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/limpiar_min.jpg"))); // NOI18N
        btLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/limpiarC_max.jpg"))); // NOI18N
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, 310, 120));

        btNoAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/NoAgendar_min.jpg"))); // NOI18N
        btNoAgendar.setContentAreaFilled(false);
        btNoAgendar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/NoAgendar_min.jpg"))); // NOI18N
        btNoAgendar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/NoAgendar_max.jpg"))); // NOI18N
        btNoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoAgendarActionPerformed(evt);
            }
        });
        jPanel1.add(btNoAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 310, 120));

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Aexit_min.png"))); // NOI18N
        btExit.setContentAreaFilled(false);
        btExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Aexit_min.png"))); // NOI18N
        btExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Aexit_max.png"))); // NOI18N
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel1.add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 120, 100));

        lbAgendar.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lbAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgendar.setText("Agendar vuelo");
        lbAgendar.setToolTipText("");
        jPanel1.add(lbAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 70));

        lbVueloS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloS.setText("Vuelos solicitados");
        lbVueloS.setToolTipText("");
        jPanel1.add(lbVueloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 40));

        lbVueloC.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbVueloC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVueloC.setText("Vuelo consultado");
        lbVueloC.setToolTipText("");
        jPanel1.add(lbVueloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 300, 40));

        lbAgendaD.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbAgendaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAgendaD.setText("Disponibilidad de agenda");
        lbAgendaD.setToolTipText("");
        jPanel1.add(lbAgendaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 230, 50));

        VuelloA.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        VuelloA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VuelloA.setText("Vuelos agendados");
        VuelloA.setToolTipText("");
        jPanel1.add(VuelloA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 300, 50));

        lbCdigoVuelo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbCdigoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCdigoVuelo.setText("Codigo vuelo solicitado");
        lbCdigoVuelo.setToolTipText("");
        jPanel1.add(lbCdigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 290, 50));

        lbTipoV.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTipoV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoV.setText("Tipo de vuelo");
        lbTipoV.setToolTipText("");
        jPanel1.add(lbTipoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 360, 50));

        lbClaseV.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbClaseV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClaseV.setText("Seleccione");
        lbClaseV.setToolTipText("");
        jPanel1.add(lbClaseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 340, 50));

        lbPistaA.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaA.setText("Pista de aterrizaje");
        lbPistaA.setToolTipText("");
        jPanel1.add(lbPistaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 360, 50));

        lbPistaD.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPistaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPistaD.setText("Pista de despegue");
        lbPistaD.setToolTipText("");
        jPanel1.add(lbPistaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 360, 50));

        lbFecha.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFecha.setText("Fecha de agenda");
        lbFecha.setToolTipText("");
        jPanel1.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 360, 50));

        lbHora.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHora.setText("Hora de agenda");
        lbHora.setToolTipText("");
        jPanel1.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 260, 50));

        jlBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/blurry-background.jpg"))); // NOI18N
        jlBanner.setText("jLabel1");
        jPanel1.add(jlBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void cleanscheduleQuestionnaire(){
        tfCodigoVuelo.setText("");
        tfDestino.setText("");
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxPistaAterrizaje.setSelectedIndex(0);
        comboBoxPistaDespegue.setSelectedIndex(0);
        comboBoxYear.setSelectedIndex(0);
        comboBoxMonth.setSelectedIndex(0);
        comboBoxDay.setSelectedIndex(0);
        comboBoxHour.setSelectedIndex(0);
        comboBoxMinutes.setSelectedIndex(0);
    }
    
    //--------------------------------------------------------------------------
    
    private void chboxVueloSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloSalidaActionPerformed
        if(chboxVueloSalida.isSelected() == true){
            
            chboxVueloLlegada.setSelected(false);
            
            comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista"}));
                comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista", "pista - 01B","pista - 03B","pista - 06B","pista - 09B","pista - 012B"}));
            }
        else if (chboxVueloSalida.isSelected() == false){
            comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista" }));
        }
    }//GEN-LAST:event_chboxVueloSalidaActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloPasajerosActionPerformed
        
        if(chboxVueloPasajeros.isSelected() == true){
            
            chboxVueloCarga.setSelected(false);
            }
    }//GEN-LAST:event_chboxVueloPasajerosActionPerformed

    //--------------------------------------------------------------------------
    
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        frmLogin login = new  frmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btExitActionPerformed

    //--------
    private String tripulacion(){
        String codigoVueloEncontrado = tfCodigoVuelo.getText();
        clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVueloEncontrado);
        String tripulacion = FlightRequirementsSearch.getTripulación();
        
        return tripulacion;
    }
    //--------
    
//--------------------------------------------------------------------------
    
    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        
        String codigoVueloEncontrado = tfCodigoVuelo.getText();
        
        if(codigoVueloEncontrado.equals("")){
            JOptionPane.showMessageDialog(this, "Debe diligenciar el codigo para poder realizar la consulta.");
        }
        else{
            clsFlightRequirements FlightRequirementsSearch = controlFlightRequirement.readFlightRequirements(codigoVueloEncontrado);
            
            if (FlightRequirementsSearch == null) {
                JOptionPane.showMessageDialog(this, "¡No existe solicitud de vuelo con codigo: " + codigoVueloEncontrado + "!");
                cleanscheduleQuestionnaire();
            } else {
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                    
                    
                    tfVueloConsultado.setText("Datos de vuelo:" + "\n" +
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
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino() + "");
                    chboxVueloSalida.setSelected(true);
                    chboxVueloLlegada.setSelected(false);
                    comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista"}));
                    comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista", "pista - 01B","pista - 03B","pista - 06B","pista - 09B","pista - 012B"}));
            
                    chboxVueloPasajeros.setSelected(true);
                }
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
                    
                    tfVueloConsultado.setText("Datos de vuelo:" + "\n" +
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

                    tfDestino.setText(FlightRequirementsSearch.getDestino() + "");
                    chboxVueloLlegada.setSelected(true);
                    chboxVueloCarga.setSelected(true);
                    chboxVueloSalida.setSelected(false);
                    comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista","pista - 01A","pista - 03A","pista - 06A","pista - 09A","pista - 012A"}));
                    comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista"}));
                }
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                                
                    tfVueloConsultado.setText("Datos de vuelo:" + "\n" +
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
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino() + "");
                    chboxVueloLlegada.setSelected(true);
                    chboxVueloPasajeros.setSelected(true);
                    chboxVueloSalida.setSelected(false);
                    comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista","pista - 01A","pista - 03A","pista - 06A","pista - 09A","pista - 012A"}));
                    comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista"}));
                }
                
                if (FlightRequirementsSearch.getSalidaLlegada().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {
                    
                    tfVueloConsultado.setText("Datos de vuelo:" + "\n" +
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
                    
                    tfDestino.setText(FlightRequirementsSearch.getDestino() + "");
                    chboxVueloSalida.setSelected(true);
                    chboxVueloLlegada.setSelected(false);
                    comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista"}));
                    comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista", "pista - 01B","pista - 03B","pista - 06B","pista - 09B","pista - 012B"}));
            
                    chboxVueloCarga.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloCargaActionPerformed
        
        if(chboxVueloCarga.isSelected() == true){
            
            chboxVueloPasajeros.setSelected(false);
            }
    }//GEN-LAST:event_chboxVueloCargaActionPerformed

    //--------------------------------------------------------------------------
    
    private void chboxVueloLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxVueloLlegadaActionPerformed
        
        if(chboxVueloLlegada.isSelected() == true){
            
            chboxVueloSalida.setSelected(false);
            
            comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista","pista - 01A","pista - 03A","pista - 06A","pista - 09A","pista - 012A"}));
            comboBoxPistaDespegue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pista"}));
            }
        else if (chboxVueloLlegada.isSelected() == false){
            comboBoxPistaAterrizaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{ "Seleccione pista", }));
        }
    }//GEN-LAST:event_chboxVueloLlegadaActionPerformed

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        
        try {
            String codigo = tfCodigoVuelo.getText();
            String destino = tfDestino.getText();
            boolean tipovueloP = chboxVueloPasajeros.isSelected();
            boolean tipovueloC = chboxVueloCarga.isSelected();
            boolean vueloS = chboxVueloSalida.isSelected();
            boolean vueloLl = chboxVueloLlegada.isSelected();
            String pistaDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
            String pistaAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
            String anio = comboBoxYear.getSelectedItem().toString();
            String mes = comboBoxMonth.getSelectedItem().toString();
            String dia = comboBoxDay.getSelectedItem().toString();
            String hora = comboBoxHour.getSelectedItem().toString();
            String minuto = comboBoxMinutes.getSelectedItem().toString();
            
            String codigoVueloEncontrado = tfCodigoVuelo.getText();
            String VueloConsultado = tfVueloConsultado.getText();

            if (VueloConsultado.equals("")){
                JOptionPane.showMessageDialog(this, "Para agendar un vuelo primero debe consultarlo");
            }
            if (codigoVueloEncontrado.equals("")){
                JOptionPane.showMessageDialog(this, "Debe diligenciar el codigo del vuelo");
            }
            
            //---
            
            if (tipovueloC == false && tipovueloP == false) {
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar un tipo de vuelo!");
            }
            if (vueloS == false && vueloLl == false) {
                JOptionPane.showMessageDialog(this, "¡Debe seleccionar la clase de vuelo!");
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
                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
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
                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo agendado con este codigo!");
                        
                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
                            
                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
                            
                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);
                            
                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
                            
                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getTipoVuelo() +  "\n" + 
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
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
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda agendarVuelo = new clsFlightAgenda(0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(agendarVuelo);                   
                        
                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        "Tripulación del avión: " + "tripulacion" + "\n" + 
                                        //"Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);

                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de salida" + "\n" + 
                                        //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                        "Tripulación del avión: " + tripulacion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    }
                    //----------
                    
                }
                
                //--------------------------------------------------------------
                
                if (tipovueloC==true && vueloLl==true && !"".equals(codigo)) {
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
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
                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
                        
                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());
                            
                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                           comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());
                            
                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
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
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de carga", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);
                        
                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de carga" + "\n" + 
                                        "Clase de vuelo: Vuelo de llegada" + "\n" + 
                                        //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                        "Tripulación del avión: " + tripulacion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de carga", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);

                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de carga" + "\n" + 
                                        "Clase de vuelo: Vuelo de llegada" + "\n" + 
                                        //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                        "Tripulación del avión: " + tripulacion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    }
                }
                
                //--------------------------------------------------------------
                
                if(tipovueloP==true && vueloLl==true && !"".equals(codigo)){
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
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
                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo registrado con este codigo!");
                        
                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
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
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);
                        

                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de llegada" + "\n" + 
                                        //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                        "Tripulación del avión: " + tripulacion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de pasajeros", "Vuelo de llegada", tripulacion, destinoVuelo, pistaDeAterrizaje, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);
                        
                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                        "\n" +
                                        "Codigo del vuelo: " + codigoVuelo + "\n" +
                                        "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                        "Clase de vuelo: Vuelo de llegada" + "\n" + 
                                        //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                        "Tripulación del avión: " + tripulacion + "\n" + 
                                        "Feca de vuelo: " + fecha + "\n" + 
                                        "Hora de vuelo: " + tiempo + "\n" + 
                                        "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    }
                }
                
                //--------------------------------------------------------------
                
                if (tipovueloC==true && vueloS==true && !"".equals(codigo)) {
                    
                    String codigoVuelo = tfCodigoVuelo.getText();
                    String destinoVuelo = tfDestino.getText();
                    String pistaDeDespegue = comboBoxPistaDespegue.getSelectedItem().toString();
                    String pistaDeAterrizaje = comboBoxPistaAterrizaje.getSelectedItem().toString();
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
                    clsFlightAgenda FlightRequirementsSearch = controlFlightAgenda.readFlightAgenda(codigoVuelo);
                    
                    if (FlightRequirementsSearch != null) {
                        JOptionPane.showMessageDialog(this, "¡Ya existe un vuelo agendado con este codigo!");
                        
                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {
                    
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloLlegada.setSelected(false);
                            chboxVueloCarga.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloLlegada.setSelected(true);
                            chboxVueloSalida.setSelected(false);
                            chboxVueloPasajeros.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de llegada") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de pasajeros")) {

                            chboxVueloLlegada.setSelected(true);
                            chboxVueloPasajeros.setSelected(true);
                            chboxVueloCarga.setSelected(false);
                            chboxVueloSalida.setSelected(false);

                            comboBoxPistaAterrizaje.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
                                            "Destino del vuelo: " + FlightRequirementsSearch.getDestino());
                        }

                        if (FlightRequirementsSearch.getClaseVuelo().equals("Vuelo de salida") && FlightRequirementsSearch.getTipoVuelo().equals("Vuelo de carga")) {

                            chboxVueloCarga.setSelected(true);
                            chboxVueloSalida.setSelected(true);
                            chboxVueloPasajeros.setSelected(false);
                            chboxVueloLlegada.setSelected(false);

                            comboBoxPistaDespegue.setSelectedItem(FlightRequirementsSearch.getPista());

                            tfDestino.setText(FlightRequirementsSearch.getDestino());
                            
                            dataAgenda.setText("Datos de agenda de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + FlightRequirementsSearch.getCodigoVueloAgenda()+ "\n" +
                                            "Tipo de vuelo: " + FlightRequirementsSearch.getTipoVuelo() + "\n" + 
                                            "Clase de vuelo: " + FlightRequirementsSearch.getClaseVuelo()+ "\n" +
                                            "Tripulación del avión: " + FlightRequirementsSearch.getTripulación() + "\n" + 
                                            "Pista de vuelo" + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Feca de vuelo: " + FlightRequirementsSearch.getFecha() + "\n" + 
                                            "Hora de vuelo: " + FlightRequirementsSearch.getTiempo()+ "\n" + 
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
                        
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de carga", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);
                        
                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + codigoVuelo + "\n" +
                                            "Tipo de vuelo: Vuelo de pasajeros" + "\n" + 
                                            "Clase de vuelo: Vuelo de llegada" + "\n" + 
                                            //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Tripulación del avión: " + tripulacion + "\n" + 
                                            "Feca de vuelo: " + fecha + "\n" + 
                                            "Hora de vuelo: " + tiempo + "\n" + 
                                            "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    else if(Integer.parseInt(anioVuelo) == currentDate.getYear() && Integer.parseInt(mesNumber) == currentDate.getMonthValue() && Integer.parseInt(diaVuelo) > currentDate.getDayOfMonth()){
                    
                        String tripulacion = tripulacion();
                        
                        clsFlightAgenda AgendarVuelo = new clsFlightAgenda
                        (0, codigoVuelo, "Vuelo de carga", "Vuelo de salida", tripulacion, destinoVuelo, pistaDeDespegue, fecha, tiempo, "1");

                        controlFlightAgenda.createFlightAgenda(AgendarVuelo);

                        dataAgenda.setText("Datos de vuelo:" + "\n" +
                                            "\n" +
                                            "Codigo del vuelo: " + codigoVuelo + "\n" +
                                            "Tipo de vuelo: Vuelo de carga" + "\n" + 
                                            "Clase de vuelo: Vuelo de salida" + "\n" + 
                                            //"Pista de vuelo: " + FlightRequirementsSearch.getPista() + "\n" + 
                                            "Tripulación del avión: " + tripulacion + "\n" + 
                                            "Feca de vuelo: " + fecha + "\n" + 
                                            "Hora de vuelo: " + tiempo + "\n" + 
                                            "Destino del vuelo: " + destinoVuelo);

                        Icon m = new ImageIcon(getClass().getResource("/Media/vueloRealizado.gif"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha registrado \n una agenda de vuelo!!!", "Agenda realizada satisfactoriamente", WIDTH, m);
                        showFlightList();
                        cleanscheduleQuestionnaire();
                    }
                    }
                }
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btAgendarActionPerformed

    //--------------------------------------------------------------------------
    
    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        
        tfCodigoVuelo.setText("");
        tfDestino.setText("");
        tfVueloConsultado.setText("");
        chboxVueloPasajeros.setSelected(false);
        chboxVueloCarga.setSelected(false);
        chboxVueloSalida.setSelected(false);
        chboxVueloLlegada.setSelected(false);
        comboBoxPistaAterrizaje.setSelectedIndex(0);
        comboBoxPistaDespegue.setSelectedIndex(0);
        comboBoxYear.setSelectedIndex(0);
        comboBoxMonth.setSelectedIndex(0);
        comboBoxDay.setSelectedIndex(0);
        comboBoxHour.setSelectedIndex(0);
        comboBoxMinutes.setSelectedIndex(0);
        dataAgenda.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btNoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoAgendarActionPerformed
        
    }//GEN-LAST:event_btNoAgendarActionPerformed

    //--------------------------------------------------------------------------
    
     private void showFlightList(){
        FlightAgendaObjectList = controlFlightAgenda.listFlightAgenda();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightAgenda vuelos : FlightAgendaObjectList) {
            String data = "CODIGO VUELO: " + vuelos.getCodigoVueloAgenda() + " - " + " TIPO VUELO: " + vuelos.getTipoVuelo()+ " - " +
                          " CLASE VUELO: " +vuelos.getClaseVuelo() + " - " + " - " + "PISTA: " + vuelos.getPista()  + " FECHA VUELO: " + vuelos.getFecha()+ " - " + 
                          " HORA VUELO: " + vuelos.getTiempo() + " - " + " DESTINO: " + vuelos.getDestino();
            model.add(index, data);
            index++;
        }
    }
    
    //--------------------------------------------------------------------------
    
    private void mostrarLisatadoSolicitudes(){
        
        FlightRequirementObjectList = controlFlightRequirement.listFlight();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsFlightRequirements vuelos : FlightRequirementObjectList) {
            String data = "CODIGO VUELO: " + vuelos.getCodigoVuelo();
            model.add(index, data);
            index++;
        }
        LtVuelosSolicitados.setModel(model);
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
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmScheduleFlight_Airport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmScheduleFlight_Airport().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Jsp;
    private javax.swing.JList<String> LtVuelosSolicitados;
    private javax.swing.JLabel VuelloA;
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btCancelarS;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btNoAgendar;
    private javax.swing.JButton btReprogramarSolicitud;
    private javax.swing.JCheckBox chboxVueloCarga;
    private javax.swing.JCheckBox chboxVueloLlegada;
    private javax.swing.JCheckBox chboxVueloPasajeros;
    private javax.swing.JCheckBox chboxVueloSalida;
    private javax.swing.JComboBox<String> comboBoxDay;
    private javax.swing.JComboBox<String> comboBoxHour;
    private javax.swing.JComboBox<String> comboBoxMinutes;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxPistaAterrizaje;
    private javax.swing.JComboBox<String> comboBoxPistaDespegue;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JTextArea dataAgenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jlAgenda;
    private javax.swing.JLabel jlBanner;
    private javax.swing.JLabel lbAgendaD;
    private javax.swing.JLabel lbAgendar;
    private javax.swing.JLabel lbCdigoVuelo;
    private javax.swing.JLabel lbClaseV;
    private javax.swing.JLabel lbEmailUserLogin14;
    private javax.swing.JLabel lbEmailUserLogin9;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbPistaA;
    private javax.swing.JLabel lbPistaD;
    private javax.swing.JLabel lbTipoV;
    private javax.swing.JLabel lbVueloC;
    private javax.swing.JLabel lbVueloS;
    private javax.swing.JTextField tfCodigoVuelo;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextArea tfVueloConsultado;
    // End of variables declaration//GEN-END:variables

}
