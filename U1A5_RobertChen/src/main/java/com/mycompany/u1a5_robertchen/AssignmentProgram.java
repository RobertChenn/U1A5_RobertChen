/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a5_robertchen;

/**
 *
 * @author 335091559
 */
import javax.swing.ImageIcon;
import java.util.*;
public class AssignmentProgram extends javax.swing.JFrame {

    /**
     * Creates new form Program
     */
    Random ran = new Random();
    ImageIcon playerPNG = new ImageIcon("player.png");
    ImageIcon bossPNG = new ImageIcon("boss.png");
    String userName, phaseNumber;
    int playerHealth = 100, bossHealth = 100, playerMove, bossMove, bossAction, bossDamage, bossHealthIncrease = 0, 
            playerHealthIncrease = 0, levelIncrease = 0, phase, playerMoveMax = 0, currency = 500, totalCost, attackUpgradeCost = 0, 
            healthUpgradeCost = 0, decreaseBossCost = 0, attackUpgradeAmount, healthUpgradeAmount, bossDecreaseAmount, bossDecreaseHealth = 0, 
            playerIncreaseHealth = 0, playerCounter, bossCounter;
    boolean findWinner, lose = false;
    double bossHP, playerHP, bossIncrease = bossHealthIncrease, playerIncrease = playerHealthIncrease, 
            valueOfBossBar, valueOfPlayerBar, valueOfBarPlayer, valueOfBarBoss;
    
    // Gets the boss' action and the damage that both characters may deal/block
    public void getMove() {
        bossAction = ran.nextInt(0, 5);
        playerMove = ran.nextInt(1, (16 + playerMoveMax));
        bossMove = ran.nextInt(1, 16);
    }
    
    // Checks if the user has won or lost
    public void checkWin() {
        if (playerHealth == 0) {
            playerHealth = 0;
            battleOutput.setText(userName + " has lost!");
            findWinner = true;
            lose = true;
            playerHealthBar.setValue(0);
        } else if (bossHealth == 0) {
            battleOutput.setText(userName + " has beaten the phase! Click the button to move on to the next level.");
            levelIncrease++;
            findWinner = true;
            bossHealthBar.setValue(0);
            phaseIncrease();
        }
        if (levelIncrease == 5) {
            battleOutput.setText(userName + " has beaten the boss!");
            findWinner = true;
        }
    }
    
    // Changes the phase text to match the phase number
    public void setPhase() {
        phase = levelIncrease + 1;
        phaseNumber = Integer.toString(phase);
        level.setText("Phase " + phaseNumber);
    }
    
    // Increases the phase when the user wins
    public void phaseIncrease() {
        if (lose == false) {
            for (int i = 0; i < levelIncrease; i++) {
                currency += 50;
            }
        }
        bossHealth = 100 + bossHealthIncrease;
        playerHealth = 100 + playerHealthIncrease;
        bossHealthBar.setMaximum(bossHealth);
        balance.setText(Integer.toString(currency));
    }
    
    // Sets the boss' health bar
    public void setBossBar() {
        bossHP = bossHealth;
        bossIncrease = bossHealthIncrease;
        valueOfBossBar = ((bossHP / (100 + bossIncrease)) * 100);
        bossHealthBar.setValue((int) (valueOfBossBar));
        bossHealthBar.setString(Integer.toString(bossHealth) +  "/" + Integer.toString(100 + bossHealthIncrease));
    }
    
    // Lowers the boss' health bar when the buff is bought
    public void lowerBossBar() {
        bossHP = bossHealth - bossDecreaseHealth;
        bossIncrease = bossDecreaseHealth;
        valueOfBarBoss = ((bossHP / (100 - bossIncrease)) * 100);
        bossHealthBar.setValue((int) (valueOfBarBoss));
        bossHealthBar.setString(Integer.toString(bossHealth + bossHealthIncrease) +  "/" + Integer.toString(100 - bossCounter + bossHealthIncrease));
    }
    
    // Increases the player's health bar when the buff is bought
    public void increasePlayerBar() {
        playerHP = playerHealth + playerHealthIncrease;
        playerIncrease = playerHealthIncrease;
        valueOfBarPlayer = ((playerHP / (100 + playerIncrease)) * 100);
        playerHealthBar.setValue((int) (valueOfBarPlayer));
        playerHealthBar.setString(Integer.toString(playerHealth + playerHealthIncrease) +  "/" + Integer.toString(100 + playerHealthIncrease));
    }
    
    // Sets the players health bar
    public void setPlayerBar() {
        playerHP = playerHealth;
        playerIncrease = playerHealthIncrease;
        valueOfPlayerBar = ((playerHP / (100 + playerIncrease)) * 100);
        playerHealthBar.setValue((int)(valueOfPlayerBar));
        playerHealthBar.setString(Integer.toString(playerHealth) +  "/" + Integer.toString(100 + playerHealthIncrease));
    }
    
    // Adds the images of the player and the boss
    public AssignmentProgram() {
        initComponents();
        
        playerImage.setIcon(playerPNG);
        bossImage.setIcon(bossPNG);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        playerHealthBar = new javax.swing.JProgressBar();
        gameName = new javax.swing.JLabel();
        separator = new javax.swing.JTextField();
        shopTitle = new javax.swing.JLabel();
        weaponCost = new javax.swing.JLabel();
        healthCost = new javax.swing.JLabel();
        bossCost = new javax.swing.JLabel();
        attack = new javax.swing.JButton();
        dodge = new javax.swing.JButton();
        defend = new javax.swing.JButton();
        userNamePrompt = new javax.swing.JLabel();
        userNameInput = new javax.swing.JTextField();
        battleOutput = new javax.swing.JTextField();
        shopOutput = new javax.swing.JTextField();
        upgradeAttackAmount = new javax.swing.JSpinner();
        upgradeHealthAmount = new javax.swing.JSpinner();
        decreaseBossAmount = new javax.swing.JSpinner();
        level = new javax.swing.JLabel();
        bossHealthBar = new javax.swing.JProgressBar();
        upgradeDmg = new javax.swing.JTextField();
        upgradeHp = new javax.swing.JTextField();
        decreaseBoss = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        playerImage = new javax.swing.JLabel();
        bossImage = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        purchase = new javax.swing.JButton();
        nextLevel = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rules = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playerHealthBar.setBackground(new java.awt.Color(0, 255, 51));
        playerHealthBar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playerHealthBar.setForeground(new java.awt.Color(255, 255, 51));
        playerHealthBar.setValue(100);
        playerHealthBar.setString("100/100");
        playerHealthBar.setStringPainted(true);

        gameName.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        gameName.setForeground(new java.awt.Color(255, 153, 0));
        gameName.setText("Beat the Boss!");

        separator.setEditable(false);
        separator.setBackground(new java.awt.Color(255, 153, 0));

        shopTitle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        shopTitle.setForeground(new java.awt.Color(255, 153, 0));
        shopTitle.setText("Shop");

        weaponCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        weaponCost.setText("$50:");

        healthCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        healthCost.setText("$75:");

        bossCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bossCost.setText("$100:");

        attack.setText("Attack");
        attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackActionPerformed(evt);
            }
        });

        dodge.setText("Dodge");
        dodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodgeActionPerformed(evt);
            }
        });

        defend.setText("Defend");
        defend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defendActionPerformed(evt);
            }
        });

        userNamePrompt.setText("Enter your character's name: ");

        userNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameInputActionPerformed(evt);
            }
        });

        battleOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battleOutputActionPerformed(evt);
            }
        });

        upgradeAttackAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        upgradeHealthAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        decreaseBossAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        level.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        level.setForeground(new java.awt.Color(255, 102, 102));
        level.setText("Phase 1");

        bossHealthBar.setBackground(new java.awt.Color(51, 255, 51));
        bossHealthBar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bossHealthBar.setForeground(new java.awt.Color(255, 255, 51));
        bossHealthBar.setValue(100);
        bossHealthBar.setString("100/100");
        bossHealthBar.setStringPainted(true);

        upgradeDmg.setText("New Weapon (+ 2)");

        upgradeHp.setText("Upgrade Health (+5)");

        decreaseBoss.setText("Decrease Boss Health (-5)");

        playerImage.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        playerImage.setText(".");

        bossImage.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        bossImage.setText(".");

        cash.setText("Cash:");

        balance.setText("0");

        purchase.setText("Purchase");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        nextLevel.setText("Next Level");
        nextLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLevelActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        rules.setEditable(false);
        rules.setColumns(20);
        rules.setRows(5);
        rules.setText("Controls:\nReset - resets the entire game\nShop - any purchase made during a fight will restart the level\n          - Use the spinners to choose how many of each upgrade you want to buy\nTo win - beat all 5 phases of the boss fight");
        jScrollPane1.setViewportView(rules);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bossHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(attack)
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(level)
                                        .addGap(47, 47, 47)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(dodge))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(nextLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reset)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(defend)
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bossImage, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(gameName)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(userNamePrompt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(playerImage))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(battleOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(shopTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(cash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weaponCost)
                        .addGap(18, 18, 18)
                        .addComponent(upgradeDmg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upgradeAttackAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(purchase))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(healthCost)
                                .addGap(18, 18, 18)
                                .addComponent(upgradeHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(upgradeHealthAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(shopOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(bossCost)
                                .addGap(18, 18, 18)
                                .addComponent(decreaseBoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(decreaseBossAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(gameName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNamePrompt)
                            .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(attack)
                                    .addComponent(dodge)
                                    .addComponent(defend))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(level))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nextLevel))))
                            .addComponent(reset))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bossHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(playerImage)
                                    .addComponent(bossImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(battleOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(separator, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shopTitle)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cash)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weaponCost)
                            .addComponent(upgradeAttackAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradeDmg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(healthCost)
                            .addComponent(upgradeHealthAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradeHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bossCost)
                            .addComponent(decreaseBossAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decreaseBoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(purchase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shopOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Makes the user attack
    private void attackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackActionPerformed
        getMove();
        userName = userNameInput.getText();
        
        if (findWinner == false) {
            if (userName.isEmpty()) {
                battleOutput.setText("Please enter a username.");
            } else {
                if (bossAction == 0 || bossAction == 1 || bossAction == 2) {
                    if (playerMove > bossMove) {
                        if (bossHealth >= playerMove) {
                            bossHealth -= playerMove;
                            setBossBar();
                            battleOutput.setText(userName + " overpowered the boss and dealt " + playerMove + " damage!");
                        } else {
                            battleOutput.setText(userName + " has overpowered the boss and dealt " + bossHealth + " damage!");
                            bossHealth = 0;
                            bossHealthBar.setString("0/100");
                        }
                    } else if (bossMove > playerMove) {
                        if (playerHealth >= bossMove) {
                            playerHealth -= bossMove;
                            setPlayerBar();
                            battleOutput.setText("The boss overpowered " + userName + " and dealt " + bossDamage + " damage");
                        } else {
                            battleOutput.setText("The boss overpowered has overpowered " + userName + " and dealt " + playerHealth + " damage!");
                            playerHealth = 0;
                            playerHealthBar.setString("0/100");
                        }
                    } else {
                        battleOutput.setText("No damage was dealt!");
                    }
                } else if (bossAction == 3) {
                    battleOutput.setText("The boss dodged " + userName + "'s attack!");
                } else if (bossAction == 4) {
                    if (bossHealth >= playerMove) {
                        if (bossMove > playerMove) {
                            battleOutput.setText("The boss has blocked " + playerMove + " damage from " + userName + "!");
                        } else if (playerMove > bossMove) {
                            bossHealth -= playerMove - bossMove;
                            setBossBar();
                            battleOutput.setText("The boss has blocked " + (playerMove - (playerMove - bossMove)) + " damage but has still taken " + (playerMove - bossMove) + " damage");
                        }
                    }
                }
                checkWin();
            }
        }
    }//GEN-LAST:event_attackActionPerformed
    
    // Makes the user dodge
    private void dodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodgeActionPerformed
        getMove();
        checkWin();
        userName = userNameInput.getText();
        
        if (findWinner == false) {
            if (userName.isEmpty()) {
                battleOutput.setText("Please enter a username.");
            } else {
                if (bossAction == 0 || bossAction == 1 || bossAction == 2) {
                    battleOutput.setText("The boss dealt " + bossMove + " damage, but " + userName + " dodged the attack!");
                } else if (bossAction == 3) {
                    battleOutput.setText("Both parties have dodged!");
                } else if (bossAction == 4) {
                    battleOutput.setText(userName + " has dodged and the boss has defended!");
                }
            }
        }
    }//GEN-LAST:event_dodgeActionPerformed
    
    // Has no function
    private void userNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameInputActionPerformed
    
    // Makes the user defend
    private void defendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defendActionPerformed
        getMove();
        checkWin();
        userName = userNameInput.getText();
        
        if (findWinner == false) {
            if (userName.isEmpty()) {
                battleOutput.setText("Please enter a username.");
            } else {
                if (bossAction == 0 || bossAction == 1 || bossAction == 2) {
                    if (playerMove > bossMove) {
                        battleOutput.setText("The player has blocked " + bossMove + " damage from the boss!");
                    } else if (bossMove > playerMove) {
                        playerHealth -= bossMove - playerMove;
                        setPlayerBar();
                        battleOutput.setText("The player has blocked " + (bossMove - (bossMove - playerMove)) + " damage but has still taken " + (bossMove - playerMove) + " damage");
                    }
                } else if (bossAction == 3) {
                    battleOutput.setText("The boss dodged and " + userName + " has defended!");
                } else if (bossAction == 4) {
                    battleOutput.setText("Both users have defended!");
                }
            }
        }
    }//GEN-LAST:event_defendActionPerformed

    // Has no function
    private void battleOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battleOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_battleOutputActionPerformed
    
    // Purchases any item that the player may have bought in the shop
    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        attackUpgradeAmount = (int)upgradeAttackAmount.getValue();
        healthUpgradeAmount = (int)upgradeHealthAmount.getValue();
        bossDecreaseAmount = (int)decreaseBossAmount.getValue();
        decreaseBossCost = 0;
        attackUpgradeCost = 0;
        healthUpgradeCost = 0;
        playerMoveMax = 0;
        playerHealthIncrease = 0;
        bossDecreaseHealth = 0;
        bossCounter += 5 * decreaseBossCost;
        
        for (int i = 0; i < attackUpgradeAmount; i++) {
            attackUpgradeCost += 50;
        }
        for (int n = 0; n < healthUpgradeAmount; n++) {
            healthUpgradeCost += 75;
        }
        for (int x = 0; x < bossDecreaseAmount; x++) {
            decreaseBossCost += 100;
        }
        
        totalCost = decreaseBossCost + attackUpgradeCost + healthUpgradeCost;
        if (totalCost <= currency) {
            for (int j = 0; j < attackUpgradeAmount; j++) {
                playerMoveMax += 2;
                currency -= 50;
            }
            for (int q = 0; q < healthUpgradeAmount; q++) {
                playerHealthIncrease += 5;
                currency -= 75;
                
            }
            for (int t = 0; t < bossDecreaseAmount; t++) {
                bossDecreaseHealth += 5;
                currency -= 100;
            }
            if (attackUpgradeAmount >= 1) {
                playerMove = playerMove + playerMoveMax;
            }
            playerHealth += playerHealthIncrease;
            playerHealthBar.setMaximum(100 + playerHealthIncrease);
            increasePlayerBar();
            playerHealthBar.setValue(100 + playerHealthIncrease);
            if (bossDecreaseAmount >= 1) {
                bossHealthBar.setMaximum(bossHealth);
                lowerBossBar();
                bossHealth = bossHealth - bossDecreaseHealth;
            
            balance.setText(Integer.toString(currency));
            shopOutput.setText("You upgraded your damage " + attackUpgradeAmount + " times, health " + healthUpgradeAmount + 
                    " times and decreased the boss' health " + bossDecreaseAmount + " times");
        } else {
            shopOutput.setText("You do not have enough money to buy these items");
        }
        }
    }//GEN-LAST:event_purchaseActionPerformed
    
    // Allows user to move to the next level
    private void nextLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLevelActionPerformed
        checkWin();
        
        if (findWinner == true) {
            findWinner = false;
            setPhase();
            bossHealthIncrease += 10;
            bossHealthBar.setString(Integer.toString(bossHealth + bossHealthIncrease) + "/" + Integer.toString(bossHealth + bossHealthIncrease));
            playerHealthBar.setString(Integer.toString(playerHealth + playerHealthIncrease) + "/" + Integer.toString(100 + playerHealthIncrease));
            playerHealthBar.setValue(playerHealth + playerHealthIncrease);
            bossHealthBar.setValue(100 + (bossHealthIncrease * 2));
        } else {
            battleOutput.setText("You have not beat this phase yet");
        }
    }//GEN-LAST:event_nextLevelActionPerformed
    
    // Resets the game
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        findWinner = false;
        lose = false;
        playerHealth = 100;
        bossHealth = 100;
        playerMoveMax = 0;
        currency -= currency;
        levelIncrease = 0;
        playerHealthIncrease = 0;
        bossHealthIncrease = 0;
        setPhase();
        balance.setText(Integer.toString(currency));
        bossHealthBar.setMaximum(100);
        playerHealthBar.setMaximum(100);
        setPlayerBar();
        setBossBar();
        shopOutput.setText("");
        battleOutput.setText("");
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AssignmentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attack;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField battleOutput;
    private javax.swing.JLabel bossCost;
    private javax.swing.JProgressBar bossHealthBar;
    private javax.swing.JLabel bossImage;
    private javax.swing.JLabel cash;
    private javax.swing.JTextField decreaseBoss;
    private javax.swing.JSpinner decreaseBossAmount;
    private javax.swing.JButton defend;
    private javax.swing.JButton dodge;
    private javax.swing.JLabel gameName;
    private javax.swing.JLabel healthCost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel level;
    private javax.swing.JButton nextLevel;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JLabel playerImage;
    private javax.swing.JButton purchase;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea rules;
    private javax.swing.JTextField separator;
    private javax.swing.JTextField shopOutput;
    private javax.swing.JLabel shopTitle;
    private javax.swing.JSpinner upgradeAttackAmount;
    private javax.swing.JTextField upgradeDmg;
    private javax.swing.JSpinner upgradeHealthAmount;
    private javax.swing.JTextField upgradeHp;
    private javax.swing.JTextField userNameInput;
    private javax.swing.JLabel userNamePrompt;
    private javax.swing.JLabel weaponCost;
    // End of variables declaration//GEN-END:variables
}
