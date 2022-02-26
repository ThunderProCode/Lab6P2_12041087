
package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import mainPackage.Aliens.Abduzcan;
import mainPackage.Aliens.Cazador;
import mainPackage.Aliens.Conquistador;
import mainPackage.Aliens.Explorador;


public class MainScreen extends javax.swing.JFrame {

    
    public DefaultListModel availablePlanetsListModel = new DefaultListModel();
    public DefaultListModel explorerFoundPlanetsInputListModel = new DefaultListModel();
    
    public DefaultListModel pathfinderAvailablePlanetsListModel = new DefaultListModel();
    public DefaultListModel pathfinderConqueredPlanetsInputListModel = new DefaultListModel();
    private DefaultMutableTreeNode selectedNode;
    
    
    public MainScreen() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        planetNameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        planetTempInput = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        planetSizeInput = new javax.swing.JSpinner();
        createPlanetBtn = new javax.swing.JButton();
        planetWaterInput = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        raceNameInput = new javax.swing.JTextField();
        razePlanetInput = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        createRaceBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        explorerNameInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        explorerAgeInput = new javax.swing.JSpinner();
        explorerMenaceInput = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        explorerFavPlanetInput = new javax.swing.JComboBox<>();
        explorerRaceInput = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        explorerFoundPlanetsInput = new javax.swing.JList<>();
        createExplorerBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        explorerAddPlanetBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        explorerAvailablePlanets = new javax.swing.JList<>();
        explorerRemovePlanetBtn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        explorerPlanetInput = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        hunterNameInput = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        hunterAgeInput = new javax.swing.JSpinner();
        hunterMenaceInput = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        hunterHuntedHumansInput = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        hunterRaceInput = new javax.swing.JComboBox<>();
        createHunterBtn = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        hunterPlanetInput = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        abducerNameInput = new javax.swing.JTextField();
        abducerAgeInput = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        abducerMenaceInput = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        abducedAnimalsInput = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        abducerRaceInput = new javax.swing.JComboBox<>();
        createAbducerBtn = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        abducerPlanetInput = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        pathfinderNameInput = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pathFinderAgeInput = new javax.swing.JSpinner();
        pathfinderMenaceInput = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        pathfinderRaceInput = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pathfinderConqueredPlanetsInput = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pathfinderAvailablePlanets = new javax.swing.JList<>();
        pathfinderAddPlanetBtn = new javax.swing.JButton();
        pathfinerRemovePlanetBtn = new javax.swing.JButton();
        createPathfinderBtn = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        pathfinderPlanetInput = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jScrollPane6 = new javax.swing.JScrollPane();
        aliensList = new javax.swing.JList<>();
        treePlanets = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();

        jCheckBox1.setText("Tiene Agua");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Crear un nuevo planeta");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Temp: ");

        jLabel4.setText("Tamaño:");

        createPlanetBtn.setText("Crear Planeta");
        createPlanetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlanetBtnActionPerformed(evt);
            }
        });

        planetWaterInput.setText("Agua");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planetNameInput)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(planetTempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(planetSizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(planetWaterInput)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(createPlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planetNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(planetTempInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetSizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetWaterInput))
                .addGap(18, 18, 18)
                .addComponent(createPlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Planeta", jPanel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Crear Nueva Raza");

        jLabel6.setText("Nombre: ");

        jLabel7.setText("Planeta Primordial:");

        createRaceBtn.setText("Crear Raza");
        createRaceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRaceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raceNameInput)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(razePlanetInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(createRaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel5)))
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raceNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(razePlanetInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createRaceBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Raza", jPanel4);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Crear Explorador");

        jLabel9.setText("Nombre: ");

        jLabel10.setText("Edad:");

        explorerMenaceInput.setText("Amenaza");

        jLabel11.setText("Planeta Favorito:");

        jLabel15.setText("Raza:");

        jScrollPane2.setViewportView(explorerFoundPlanetsInput);

        createExplorerBtn.setText("Crear Explorador");
        createExplorerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createExplorerBtnActionPerformed(evt);
            }
        });

        jLabel13.setText("Planetas Explorados:");

        explorerAddPlanetBtn.setText("+");
        explorerAddPlanetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explorerAddPlanetBtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Planetas existentes:");

        jScrollPane1.setViewportView(explorerAvailablePlanets);

        explorerRemovePlanetBtn.setText("-");
        explorerRemovePlanetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explorerRemovePlanetBtnActionPerformed(evt);
            }
        });

        jLabel21.setText("Planeta al que pertenece:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(explorerPlanetInput, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(explorerNameInput)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(explorerAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(explorerMenaceInput)
                        .addGap(45, 45, 45))
                    .addComponent(explorerFavPlanetInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(explorerRaceInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(82, 82, 82))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(explorerAddPlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(explorerRemovePlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel8))
                    .addComponent(jLabel21)
                    .addComponent(jLabel12)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(createExplorerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explorerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(explorerAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explorerMenaceInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explorerFavPlanetInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explorerRaceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(explorerPlanetInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(explorerRemovePlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explorerAddPlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(createExplorerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Explorador", jPanel5);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Crear Cazador");

        jLabel16.setText("Nombre: ");

        jLabel17.setText("Edad:");

        hunterMenaceInput.setText("Amenaza");

        jLabel18.setText("Humanos atrapados: ");

        jLabel19.setText("Raza:");

        hunterRaceInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        createHunterBtn.setText("Crear Cazador");
        createHunterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHunterBtnActionPerformed(evt);
            }
        });

        jLabel32.setText("Planeta al que pertenece:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(createHunterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hunterNameInput)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hunterHuntedHumansInput))
                            .addComponent(hunterRaceInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(hunterAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addComponent(hunterMenaceInput)
                                .addGap(37, 37, 37))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hunterPlanetInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hunterNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(hunterAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hunterMenaceInput))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(hunterHuntedHumansInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hunterRaceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hunterPlanetInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createHunterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cazador", jPanel6);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Crear Abduzcan");

        jLabel28.setText("Nombre: ");

        jLabel29.setText("Edad:");

        abducerMenaceInput.setText("Amenaza");

        jLabel30.setText("Animales Abducidos:");

        jLabel31.setText("Raza:");

        abducerRaceInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        createAbducerBtn.setText("Crear Abduzcan");
        createAbducerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAbducerBtnActionPerformed(evt);
            }
        });

        jLabel33.setText("Planeta al que pertenece:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abducerNameInput)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abducedAnimalsInput))
                            .addComponent(abducerRaceInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(abducerPlanetInput, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel33))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(abducerAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(abducerMenaceInput)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(createAbducerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abducerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(abducerAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abducerMenaceInput))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(abducedAnimalsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abducerRaceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abducerPlanetInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAbducerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Abduzcan", jPanel7);

        jLabel22.setText("Nombre: ");

        jLabel23.setText("Edad:");

        pathfinderMenaceInput.setText("Amenaza");

        jLabel25.setText("Raza:");

        pathfinderRaceInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Crear Conquistador");

        jLabel24.setText("Planetas existentes:");

        jLabel27.setText("Planetas Conquistados:");

        jScrollPane4.setViewportView(pathfinderConqueredPlanetsInput);

        jScrollPane3.setViewportView(pathfinderAvailablePlanets);

        pathfinderAddPlanetBtn.setText("+");
        pathfinderAddPlanetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathfinderAddPlanetBtnActionPerformed(evt);
            }
        });

        pathfinerRemovePlanetBtn.setText("-");

        createPathfinderBtn.setText("Crear Conquistador");
        createPathfinderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPathfinderBtnActionPerformed(evt);
            }
        });

        jLabel34.setText("Planeta al que pertenece:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathfinderNameInput)
            .addComponent(pathfinderRaceInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(pathfinderAddPlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pathfinerRemovePlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(pathFinderAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pathfinderMenaceInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pathfinderPlanetInput, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jLabel34))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(createPathfinderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathfinderNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(pathFinderAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathfinderMenaceInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathfinderRaceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathfinderPlanetInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathfinderAddPlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathfinerRemovePlanetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(createPathfinderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Conquistador", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear", jPanel2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tree);

        jScrollPane6.setViewportView(aliensList);

        treePlanets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        treePlanets.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                treePlanetsItemStateChanged(evt);
            }
        });

        jButton11.setText(">");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(treePlanets, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(treePlanets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jButton11)))))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arbol", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPlanetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlanetBtnActionPerformed
        String name = planetNameInput.getText();
        if(!Main.planetExists(name)){
            int temp = (Integer) planetTempInput.getValue();
            int size = (Integer) planetSizeInput.getValue();
            boolean hasWater = planetWaterInput.isSelected();
            Planeta newPlanet = new Planeta(name,hasWater, temp,size);
            Main.addPlanet(newPlanet);
            updatePlanetComboBoxes();
            JOptionPane.showMessageDialog(this, "Planeta Creado");
        }else{
            JOptionPane.showMessageDialog(this, "Ya existe un planeta con ese nombre");
        }
        
    }//GEN-LAST:event_createPlanetBtnActionPerformed

    private void createRaceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRaceBtnActionPerformed
        String name = raceNameInput.getText();
        
        if (!Main.raceExists(name)) {
            Planeta planet = Main.getPlanetByName( razePlanetInput.getSelectedItem().toString() );
            Raza newRaza = new Raza(planet,name);
            Main.addRace(newRaza);
            updateRaceComboBoxes();
            JOptionPane.showMessageDialog(this, "Raza Creada");

        }else{
            JOptionPane.showMessageDialog(this, "Ya existe una raza con ese nombre");
        }
        
    }//GEN-LAST:event_createRaceBtnActionPerformed

    private void createExplorerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createExplorerBtnActionPerformed
        String name = explorerNameInput.getText();
        
        if (!Main.alienExists(name)) {
           int edad = (Integer) explorerAgeInput.getValue();
            boolean menace = explorerMenaceInput.isSelected();
            Planeta favPlanet = Main.getPlanetByName( explorerFavPlanetInput.getSelectedItem().toString() );
            Raza race = Main.getRaceByName(explorerRaceInput.getSelectedItem().toString());
            ArrayList<Planeta> exploredPlanets = getExplorerPlanets();

            Explorador newExplorer = new Explorador(favPlanet,name,race,edad,menace,exploredPlanets);

            Main.addAlien(newExplorer);

            Planeta planet = Main.getPlanetByName( explorerPlanetInput.getSelectedItem().toString() );
            planet.addAlien(newExplorer);
            
            JOptionPane.showMessageDialog(this, "Explorador Creado");  
        }else{
            JOptionPane.showMessageDialog(this, "Ya existe un alien con ese nombre");
        }
        
    }//GEN-LAST:event_createExplorerBtnActionPerformed

    private void explorerAddPlanetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorerAddPlanetBtnActionPerformed
        
        if (availablePlanetsListModel.size() > 0) {
            
            Object otro = availablePlanetsListModel.getElementAt( explorerAvailablePlanets.getSelectedIndex() );
            if (explorerPlanetExists(otro)) {
                JOptionPane.showMessageDialog(this, "Ya agrego ese planeta");
            }else{
                explorerFoundPlanetsInputListModel.addElement( availablePlanetsListModel.getElementAt( explorerAvailablePlanets.getSelectedIndex() ) );
                explorerFoundPlanetsInput.setModel(explorerFoundPlanetsInputListModel);
            }
        }else{
            explorerFoundPlanetsInputListModel.addElement( availablePlanetsListModel.getElementAt( explorerAvailablePlanets.getSelectedIndex() ) );
            explorerFoundPlanetsInput.setModel(explorerFoundPlanetsInputListModel);
        }
    }//GEN-LAST:event_explorerAddPlanetBtnActionPerformed

    private void explorerRemovePlanetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorerRemovePlanetBtnActionPerformed
        int selectedIndex = explorerFoundPlanetsInput.getSelectedIndex();
        
        if(selectedIndex != -1){
            explorerFoundPlanetsInputListModel.remove(selectedIndex);
        }
    }//GEN-LAST:event_explorerRemovePlanetBtnActionPerformed

    private void treePlanetsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_treePlanetsItemStateChanged
        
        try{
            Planeta selectedPlanet = Main.getPlanetByName( treePlanets.getSelectedItem().toString() );
            System.out.println(selectedPlanet);
            if(selectedPlanet != null){
                fillAliensList(selectedPlanet);
            }
        }catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_treePlanetsItemStateChanged

    private void createHunterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHunterBtnActionPerformed
        String name = hunterNameInput.getText();
        
        if(!Main.alienExists(name)){
            int age = (Integer) hunterAgeInput.getValue();
            boolean menace = hunterMenaceInput.isSelected();
            int huntedHumans = (Integer) hunterHuntedHumansInput.getValue();
            Raza race = Main.getRaceByName(hunterRaceInput.getSelectedItem().toString());
            Cazador newHunter = new Cazador(huntedHumans,name,race,age,menace);

            Main.addAlien(newHunter);

            Planeta planet = Main.getPlanetByName( hunterPlanetInput.getSelectedItem().toString() );
            planet.addAlien(newHunter);
            JOptionPane.showMessageDialog(this, "Cazador Creado"); 
        }else{
            JOptionPane.showMessageDialog(this, "Ya existe un alien con ese nombre");
        }

    }//GEN-LAST:event_createHunterBtnActionPerformed

    private void createAbducerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAbducerBtnActionPerformed
        String name = abducerNameInput.getText();
        
        if(Main.alienExists(name)){
           int age = (Integer) abducerAgeInput.getValue();
            boolean menace = abducerMenaceInput.isSelected();
            int abducedAnimals = (Integer) abducedAnimalsInput.getValue();
            Raza race = Main.getRaceByName(abducerRaceInput.getSelectedItem().toString());

            Abduzcan newAbducer = new Abduzcan(abducedAnimals,name,race,age,menace);
            Main.addAlien(newAbducer);

            Planeta planet = Main.getPlanetByName(abducerPlanetInput.getSelectedItem().toString() );
            planet.addAlien(newAbducer);
            JOptionPane.showMessageDialog(this, "Abduzcan Creado"); 
        }else{
            JOptionPane.showMessageDialog(this, "Ya existe un alien con ese nombre");
        }
    }//GEN-LAST:event_createAbducerBtnActionPerformed

    private void createPathfinderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPathfinderBtnActionPerformed
        String name = pathfinderNameInput.getText();
       
        if (Main.alienExists(name)) {
           int age = (Integer) pathFinderAgeInput.getValue();
            boolean menace = pathfinderMenaceInput.isSelected();
            Raza race = Main.getRaceByName(pathfinderRaceInput.getSelectedItem().toString());
            ArrayList<Planeta> conqueredPlanets = getPathFinderPlanets();

            Conquistador newPathFinder = new Conquistador(name,race,age,menace,conqueredPlanets);
            Main.addAlien(newPathFinder);

            Planeta planet = Main.getPlanetByName(pathfinderPlanetInput.getSelectedItem().toString() );
            planet.addAlien(newPathFinder);
            JOptionPane.showMessageDialog(this, "Conquistador Creado"); 
        }else{
            JOptionPane.showMessageDialog(this, "Ya existe un alien con ese nombre");
        }
    }//GEN-LAST:event_createPathfinderBtnActionPerformed

    private void pathfinderAddPlanetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathfinderAddPlanetBtnActionPerformed
           
            if(pathfinderAvailablePlanetsListModel.getSize() > 0){
                Object otro = pathfinderAvailablePlanetsListModel.getElementAt( pathfinderAvailablePlanets.getSelectedIndex() );
                if(pathFinderPlanetExists(otro)){
                    JOptionPane.showMessageDialog(this, "Ya agrego ese planeta");
                }else{
                    pathfinderConqueredPlanetsInputListModel.addElement( pathfinderAvailablePlanetsListModel.getElementAt( pathfinderAvailablePlanets.getSelectedIndex()));
                    pathfinderConqueredPlanetsInput.setModel(pathfinderConqueredPlanetsInputListModel);
                }
            }else{
                pathfinderConqueredPlanetsInputListModel.addElement( pathfinderAvailablePlanetsListModel.getElementAt( pathfinderAvailablePlanets.getSelectedIndex()));
                pathfinderConqueredPlanetsInput.setModel(pathfinderConqueredPlanetsInputListModel);
            }
           
    }//GEN-LAST:event_pathfinderAddPlanetBtnActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        
        Planeta selectedPlanet = Main.getPlanetByName( treePlanets.getSelectedItem().toString() );
     
        
        
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode planet = new DefaultMutableTreeNode(selectedPlanet.getName());
        
        if(nodeExists(selectedPlanet.getName())){
            JOptionPane.showMessageDialog(this, "Ya agrego este planeta");
        }else{
            for (Alien alien : selectedPlanet.getAliens()) {
                planet.add( new DefaultMutableTreeNode( alien.getName() ) );
            }
            model.insertNodeInto(planet, root, root.getChildCount());
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    public JPopupMenu getPopUpMenu() {
        JPopupMenu menu = new JPopupMenu();
        JMenuItem item = new JMenuItem("Editar");
        item.addActionListener(getEditActionListener());
        menu.add(item);

        JMenuItem item2 = new JMenuItem("Eliminar");
        item2.addActionListener(getAddActionListener());
        menu.add(item2);

        JMenuItem item3 = new JMenuItem("Listar");
        item3.addActionListener(getListActionListener());
        menu.add(item3);
        
    return menu;
}
    
    public ActionListener getListActionListener() {
    return (ActionEvent arg0) -> {
        if(selectedNode != null){
            Alien alien = Main.getAlienByName(selectedNode.toString());
            JOptionPane.showMessageDialog(this, alien);
        }
    };
}
    
    public ActionListener getAddActionListener() {
    return (ActionEvent arg0) -> {
        if(selectedNode != null){
            DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
            model.removeNodeFromParent(selectedNode);
        }
    };
}
    
    public ActionListener getEditActionListener() {
    return new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if(selectedNode != null){
                Main.setSelectedAlien(Main.getAlienByName(selectedNode.toString()));
                Main.initEditScreen(Main.getAlienByName(selectedNode.toString()));
                Main.EditScreen.setVisible(true);
            }
        }
    };
}
    
    private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked

    }//GEN-LAST:event_treeMouseClicked

    
    public MouseListener getMouseListener() {
    return new MouseAdapter() {

        @Override
        public void mousePressed(MouseEvent arg0) {
            if(arg0.getButton() == MouseEvent.BUTTON3){
                TreePath pathForLocation = tree.getPathForLocation(arg0.getPoint().x, arg0.getPoint().y);
                if(pathForLocation != null){
                    selectedNode = (DefaultMutableTreeNode) pathForLocation.getLastPathComponent();
                } else{
                    selectedNode = null;
                }

            }
            super.mousePressed(arg0);
        }
    };
}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    
    //--------------------------------------------------------------------------
    
    private boolean nodeExists(String nodeName){
        
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();

        int children = model.getChildCount(root);
        
        for (int i = 0; i < children ; i++) {
            if(model.getChild(root, i).toString().equals(nodeName)){
               return true;
            }
        }
        
        return false;
    }
    
    private void fillAliensList(Planeta planet){
        
        DefaultListModel aliensListModel = new DefaultListModel();

        for (Alien alien : planet.getAliens()) {
            aliensListModel.addElement(alien.getName());
        }
        
        aliensList.setModel(aliensListModel);
        
    }
    
    public void updateRaceComboBoxes(){
        explorerRaceInput.removeAllItems();
        hunterRaceInput.removeAllItems();
        abducerRaceInput.removeAllItems();
        pathfinderRaceInput.removeAllItems();
        Main.EditScreen.jComboBox1.removeAllItems();
        
        for (Raza raza : Main.getRazas()) {
            explorerRaceInput.addItem(raza.getName());
            hunterRaceInput.addItem(raza.getName());
            abducerRaceInput.addItem(raza.getName());
            pathfinderRaceInput.addItem(raza.getName());
             Main.EditScreen.jComboBox1.addItem(raza.getName());
        }
        
    }
    
    public void updatePlanetComboBoxes(){
        
        razePlanetInput.removeAllItems();
        explorerFavPlanetInput.removeAllItems();
        explorerPlanetInput.removeAllItems();
        hunterPlanetInput.removeAllItems();
        abducerPlanetInput.removeAllItems();
        pathfinderPlanetInput.removeAllItems();
        treePlanets.removeAllItems();
        
        for (Planeta planet : Main.getPlanets()) {
            razePlanetInput.addItem(planet.getName());
            explorerFavPlanetInput.addItem(planet.getName());
            explorerPlanetInput.addItem(planet.getName());
            hunterPlanetInput.addItem(planet.getName());
            abducerPlanetInput.addItem(planet.getName());
            pathfinderPlanetInput.addItem(planet.getName());
            treePlanets.addItem(planet.getName());
        }
    }
    
    private Boolean explorerPlanetExists(Object otro){
        for (int i = 0; i < explorerFoundPlanetsInputListModel.getSize(); i++) {
            Object actual = explorerFoundPlanetsInputListModel.getElementAt(i);
            if (actual.equals(otro)) {
                return true;
            }
        }
        return false;
    }
    
       private Boolean pathFinderPlanetExists(Object otro){
        for (int i = 0; i < pathfinderConqueredPlanetsInputListModel.getSize(); i++) {
            Object actual = pathfinderConqueredPlanetsInputListModel.getElementAt(i);
            if (actual.equals(otro)) {
                return true;
            }
        }
        return false;
    }
    
    private ArrayList getExplorerPlanets(){
        ArrayList<Planeta> planets = new ArrayList();
        for (int i = 0; i < explorerFoundPlanetsInputListModel.getSize() ; i++) {
            Planeta planet = Main.getPlanetByName( explorerFoundPlanetsInputListModel.getElementAt(i).toString() );
            planets.add(planet);
        }
        return planets;
    }
    
    private ArrayList getPathFinderPlanets(){
        ArrayList<Planeta> planets = new ArrayList();
        for (int i = 0; i < pathfinderConqueredPlanetsInputListModel.getSize() ; i++) {
            Planeta planet = Main.getPlanetByName( pathfinderConqueredPlanetsInputListModel.getElementAt(i).toString() );
            planets.add(planet);
        }
        return planets;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner abducedAnimalsInput;
    private javax.swing.JSpinner abducerAgeInput;
    private javax.swing.JCheckBox abducerMenaceInput;
    private javax.swing.JTextField abducerNameInput;
    private javax.swing.JComboBox<String> abducerPlanetInput;
    private javax.swing.JComboBox<String> abducerRaceInput;
    private javax.swing.JList<String> aliensList;
    private javax.swing.JButton createAbducerBtn;
    private javax.swing.JButton createExplorerBtn;
    private javax.swing.JButton createHunterBtn;
    private javax.swing.JButton createPathfinderBtn;
    private javax.swing.JButton createPlanetBtn;
    private javax.swing.JButton createRaceBtn;
    private javax.swing.JButton explorerAddPlanetBtn;
    private javax.swing.JSpinner explorerAgeInput;
    public javax.swing.JList<String> explorerAvailablePlanets;
    private javax.swing.JComboBox<String> explorerFavPlanetInput;
    public javax.swing.JList<String> explorerFoundPlanetsInput;
    private javax.swing.JCheckBox explorerMenaceInput;
    private javax.swing.JTextField explorerNameInput;
    private javax.swing.JComboBox<String> explorerPlanetInput;
    private javax.swing.JComboBox<String> explorerRaceInput;
    private javax.swing.JButton explorerRemovePlanetBtn;
    private javax.swing.JSpinner hunterAgeInput;
    private javax.swing.JSpinner hunterHuntedHumansInput;
    private javax.swing.JCheckBox hunterMenaceInput;
    private javax.swing.JTextField hunterNameInput;
    private javax.swing.JComboBox<String> hunterPlanetInput;
    private javax.swing.JComboBox<String> hunterRaceInput;
    private javax.swing.JButton jButton11;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JSpinner pathFinderAgeInput;
    private javax.swing.JButton pathfinderAddPlanetBtn;
    public javax.swing.JList<String> pathfinderAvailablePlanets;
    private javax.swing.JList<String> pathfinderConqueredPlanetsInput;
    private javax.swing.JCheckBox pathfinderMenaceInput;
    private javax.swing.JTextField pathfinderNameInput;
    private javax.swing.JComboBox<String> pathfinderPlanetInput;
    private javax.swing.JComboBox<String> pathfinderRaceInput;
    private javax.swing.JButton pathfinerRemovePlanetBtn;
    private javax.swing.JTextField planetNameInput;
    private javax.swing.JSpinner planetSizeInput;
    private javax.swing.JSpinner planetTempInput;
    private javax.swing.JCheckBox planetWaterInput;
    private javax.swing.JTextField raceNameInput;
    private javax.swing.JComboBox<String> razePlanetInput;
    public javax.swing.JTree tree;
    private javax.swing.JComboBox<String> treePlanets;
    // End of variables declaration//GEN-END:variables
}
