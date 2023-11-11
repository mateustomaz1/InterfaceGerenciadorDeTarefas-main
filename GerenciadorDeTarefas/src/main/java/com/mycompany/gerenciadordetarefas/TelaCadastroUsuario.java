
package com.mycompany.gerenciadordetarefas;

import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    public static final String ARQUIVO_USUARIOS = "usuarios.json";
    public TelaCadastroUsuario() {
        initComponents();
    }

    private void initComponents() {

        jButtonVoltar = new javax.swing.JButton();
        blusuario = new javax.swing.JLabel();
        lblsenha = new javax.swing.JLabel();
        jTextFieldCriarUsuario = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jPasswordFieldCriarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(180, 120, 80, 23);

        blusuario.setText("Crie um usuário");
        getContentPane().add(blusuario);
        blusuario.setBounds(20, 10, 110, 16);

        lblsenha.setText("Crie uma senha");
        getContentPane().add(lblsenha);
        lblsenha.setBounds(20, 60, 100, 16);

        jTextFieldCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCriarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCriarUsuario);
        jTextFieldCriarUsuario.setBounds(20, 30, 240, 22);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(20, 120, 90, 23);

        jPasswordFieldCriarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldCriarSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldCriarSenha);
        jPasswordFieldCriarSenha.setBounds(20, 80, 240, 22);

        setSize(new java.awt.Dimension(290, 194));
        setLocationRelativeTo(null);
    }


    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        String usuario = jTextFieldCriarUsuario.getText();
        String senha = new String(jPasswordFieldCriarSenha.getPassword());

        // Lógica para criar ou atualizar um arquivo JSON com o nome do usuário e a senha
        try {
            JSONArray usuariosArray;

            // Verifica se o arquivo já existe
            if (Files.exists(Paths.get(ARQUIVO_USUARIOS))) {
                String usuariosJson = new String(Files.readAllBytes(Paths.get(ARQUIVO_USUARIOS)));
                usuariosArray = new JSONArray(usuariosJson);
            } else {
                usuariosArray = new JSONArray();
            }

            // Cria um objeto JSON para o novo usuário
            JSONObject novoUsuario = new JSONObject();
            novoUsuario.put("Usuario", usuario);
            novoUsuario.put("Senha", senha);

            // Adiciona o novo usuário ao array
            usuariosArray.put(novoUsuario);

            // Escreve o array atualizado de usuários no arquivo JSON
            Files.write(Paths.get(ARQUIVO_USUARIOS), usuariosArray.toString().getBytes());

            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

            // Limpa os campos após o cadastro
            jTextFieldCriarUsuario.setText("");
            jPasswordFieldCriarSenha.setText("");

        } catch (IOException e) {
            // Exibe uma mensagem de erro em caso de falha
            JOptionPane.showMessageDialog(this, "Erro ao criar/atualizar o arquivo JSON: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jTextFieldCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        // Lógica para o campo de usuário, se necessário
    }


    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        // Fechar a janela ao clicar em Voltar
        this.dispose();
    }


    private void jPasswordFieldCriarSenhaKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Se a tecla Enter for pressionada no campo de senha, realizar o cadastro
            jButtonCadastrarActionPerformed(null);
        }
    }

    public static void main(String args[]) {
        // Aqui você pode iniciar a janela

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
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel blusuario;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JPasswordField jPasswordFieldCriarSenha;
    private javax.swing.JTextField jTextFieldCriarUsuario;
}
