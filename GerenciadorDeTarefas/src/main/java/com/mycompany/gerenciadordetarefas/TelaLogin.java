
package com.mycompany.gerenciadordetarefas;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
    }

    public static String usuarioLogado;
    private static final String ARQUIVO_USUARIOS = "usuarios.json";

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        blusuario = new javax.swing.JLabel();
        lblsenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(80, 90, 80, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(170, 90, 80, 23);

        blusuario.setText("Usuário");
        getContentPane().add(blusuario);
        blusuario.setBounds(20, 30, 70, 16);

        lblsenha.setText("Senha");
        getContentPane().add(lblsenha);
        lblsenha.setBounds(20, 60, 60, 16);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(80, 30, 170, 22);

        jButton3.setText("Cadastrar Usuário");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 120, 170, 23);

        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(80, 60, 170, 22);

        setSize(new java.awt.Dimension(290, 194));
        setLocationRelativeTo(null);
    }


    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {

    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

    }


    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {

    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel blusuario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel lblsenha;

}
