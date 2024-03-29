package br.univali.egjide.visao;

import br.univali.egjide.exception.BusinessException;
import br.univali.egjide.exception.InfoException;
import br.univali.egjide.modelo.Gerador;
import br.univali.egjide.gals.LexicalError;
import br.univali.egjide.gals.Lexico;
import br.univali.egjide.gals.SemanticError;
import br.univali.egjide.gals.Semantico;
import br.univali.egjide.gals.Sintatico;
import br.univali.egjide.gals.SyntaticError;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Document;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class EgjIDE extends javax.swing.JFrame {
   
    public static Gerador gerador;
    public String codigo;
    
    public EgjIDE() {
        initComponents();  
        gerador = new Gerador();
        textArea_codigo.setLineWrap(true);
        principal.setLayout(new BorderLayout());
        principal.add(toolBar, BorderLayout.NORTH);
        principal.add(scrollPanel_codigo, BorderLayout.CENTER);
        principal.add(scrollPane_saida, BorderLayout.SOUTH);
        configuraTextArea();
        undoReundo();
    }

    public void configuraTextArea() {                
        textArea_codigo.setText("main(){\n\t\n}");
        textArea_codigo.setCaretPosition(9);
    }
    
    public void selecionarArquivo() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Código fonte EgjIDE", "egjIDE");
        fileChooser.setFileFilter(filter);

        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = new File(String.valueOf(fileChooser.getSelectedFile()));
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String data = null;
                StringBuilder stringBuilder = new StringBuilder();
                while ((data = reader.readLine()) != null) {
                    stringBuilder.append(data);
                    stringBuilder.append("\n");
                }
                textArea_codigo.setText(stringBuilder.toString());
                fileReader.close();
                reader.close();
                textPane_saida.setText("");
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Arquivo não encontrado.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo.");
            }
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane_saida = new javax.swing.JScrollPane();
        textPane_saida = new javax.swing.JTextPane();
        toolBar = new javax.swing.JToolBar();
        button_novo = new javax.swing.JButton();
        button_abrir = new javax.swing.JButton();
        button_salvar = new javax.swing.JButton();
        button_compilar = new javax.swing.JButton();
        button_tabela = new javax.swing.JButton();
        button_asm = new javax.swing.JButton();
        scrollPanel_codigo = new javax.swing.JScrollPane();
        textArea_codigo = new javax.swing.JTextArea();
        principal = new javax.swing.JPanel();

        textPane_saida.setEditable(false);
        textPane_saida.setBackground(new java.awt.Color(220, 219, 219));
        textPane_saida.setMinimumSize(new java.awt.Dimension(50, 120));
        textPane_saida.setPreferredSize(new java.awt.Dimension(50, 130));
        scrollPane_saida.setViewportView(textPane_saida);

        toolBar.setRollover(true);

        button_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/egjide/imagens/novo.png"))); // NOI18N
        button_novo.setFocusable(false);
        button_novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_novoActionPerformed(evt);
            }
        });
        toolBar.add(button_novo);

        button_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/egjide/imagens/abrir.png"))); // NOI18N
        button_abrir.setFocusable(false);
        button_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_abrirActionPerformed(evt);
            }
        });
        toolBar.add(button_abrir);

        button_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/egjide/imagens/salvar.png"))); // NOI18N
        button_salvar.setFocusable(false);
        button_salvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_salvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_salvarActionPerformed(evt);
            }
        });
        toolBar.add(button_salvar);

        button_compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/egjide/imagens/compilar.png"))); // NOI18N
        button_compilar.setFocusable(false);
        button_compilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_compilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_compilarActionPerformed(evt);
            }
        });
        toolBar.add(button_compilar);

        button_tabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/egjide/imagens/tabela.png"))); // NOI18N
        button_tabela.setFocusable(false);
        button_tabela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_tabela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tabelaActionPerformed(evt);
            }
        });
        toolBar.add(button_tabela);

        button_asm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/egjide/imagens/asm.png"))); // NOI18N
        button_asm.setFocusable(false);
        button_asm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_asm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_asm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_asmActionPerformed(evt);
            }
        });
        toolBar.add(button_asm);

        textArea_codigo.setColumns(20);
        textArea_codigo.setRows(5);
        textArea_codigo.setTabSize(4);
        scrollPanel_codigo.setViewportView(textArea_codigo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EgjIDE");
        setSize(new java.awt.Dimension(998, 673));

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_compilarActionPerformed
        if (!textArea_codigo.getText().equals("")) {
            textPane_saida.setText("");
            Lexico lexico = new Lexico();
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();
            
            lexico.setInput(textArea_codigo.getText());
            
            try {
                sintatico.parse(lexico, semantico);
                textPane_saida.setText("CONSTRUÍDO COM SUCESSO. \n"+Semantico.msgTela);
                textPane_saida.setForeground(new Color(34, 139, 34));
            } catch (LexicalError e) {
                textPane_saida.setText(e.getMessage()+"\nErro léxico na posição: "+e.getPosition());
                textPane_saida.setForeground(Color.RED);                
            } catch (SyntaticError e) {
                textPane_saida.setText(e.getMessage()+"\nErro Sintatico na posição: "+e.getPosition());
                textPane_saida.setForeground(Color.RED);
            } catch (SemanticError e) {
                textPane_saida.setText(e.getMessage()+"\nErro Semantico na posição: "+e.getPosition());
                textPane_saida.setForeground(Color.RED);            
            } catch (BusinessException ex) {
                textPane_saida.setText(ex.getMessage());
                textPane_saida.setForeground(Color.RED);
            } catch (InfoException ex) {
                textPane_saida.setText("CONSTRUÍDO COM SUCESSO.\n" + ex.getMessage());
                textPane_saida.setForeground(Color.DARK_GRAY);
            }
            
        } else {
            textPane_saida.setText("É necessário escrever um codigo para compilar.");
            textPane_saida.setForeground(new Color(205, 92, 92));
        }
        codigo = gerador.montarCodigo();
        System.out.println("\n\n\n" + codigo);
        this.gerador.getData().clear();
        this.gerador.getText().clear();
        //System.out.println("\n\n\n" + codigo);
        
    }//GEN-LAST:event_button_compilarActionPerformed

    private void button_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salvarActionPerformed
        String codigoGravacao = textArea_codigo.getText();
        if (!codigoGravacao.equals("")) {
            try {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Código fonte EgjIDE", "egjIDE");
                fileChooser.setFileFilter(filter);

                int option = fileChooser.showSaveDialog(this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    FileWriter fw = new FileWriter(fileChooser.getSelectedFile() + ".egjIDE");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(codigoGravacao);

                    bw.close();
                    fw.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo");
            }
        } else {
            JOptionPane.showMessageDialog(this, "É necessário escrever um codigo para salvar.");
        }
    }//GEN-LAST:event_button_salvarActionPerformed

    private void button_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_novoActionPerformed
        if (!textArea_codigo.getText().equals("")) {
            int resp = JOptionPane.showConfirmDialog(this, "Se não foi salvo o codigo será perdido. Deseja realmente criar um novo?");
            if (resp == 0) {
                configuraTextArea();
            }
        }
    }//GEN-LAST:event_button_novoActionPerformed

    private void button_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_abrirActionPerformed
        if (!textArea_codigo.getText().equals("")) {
            int resp = JOptionPane.showConfirmDialog(this, "Se não foi salvo o codigo será perdido. Deseja realmente abrir um arquivo?");
            if (resp == 0) {
                selecionarArquivo();
            }
        } else {
            selecionarArquivo();
        }
    }//GEN-LAST:event_button_abrirActionPerformed

    private void button_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tabelaActionPerformed
        if (Semantico.tabela == null) {
            JOptionPane.showMessageDialog(this, "É necessário compilar um código para visualizar a tabela");
        } else {
            new TelaTabela(this);
        }
    }//GEN-LAST:event_button_tabelaActionPerformed

    private void button_asmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_asmActionPerformed
        if (Semantico.tabela == null) {
            JOptionPane.showMessageDialog(this, "É necessário compilar um código Egj para visualizar o codigo ASM");
        } else {
            new TelaCodigoAsm(this, codigo);
        }
    }//GEN-LAST:event_button_asmActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EgjIDE.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(EgjIDE.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(EgjIDE.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(EgjIDE.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EgjIDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_abrir;
    private javax.swing.JButton button_asm;
    private javax.swing.JButton button_compilar;
    private javax.swing.JButton button_novo;
    private javax.swing.JButton button_salvar;
    private javax.swing.JButton button_tabela;
    private javax.swing.JPanel principal;
    private javax.swing.JScrollPane scrollPane_saida;
    private javax.swing.JScrollPane scrollPanel_codigo;
    private javax.swing.JTextArea textArea_codigo;
    public javax.swing.JTextPane textPane_saida;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    private void undoReundo() {
        final UndoManager undo = new UndoManager();
        Document doc = textArea_codigo.getDocument();

        // Ouve eventos de desfazer e refazer
        doc.addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent evt) {
                undo.addEdit(evt.getEdit());
            }
        });

        textArea_codigo.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Z) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0) && ((e.getModifiers() & KeyEvent.SHIFT_MASK) != 0)) {
                    //System.out.println("Ctrl+Shift+Z");
                    try {
                        if (undo.canRedo()) {
                            undo.redo();
                        }
                    } catch (CannotUndoException cue) {
                        // possiveis erros são tratados aqui 
                    }
                }else if ((e.getKeyCode() == KeyEvent.VK_Z) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                    //System.out.println("Ctrl+Z");
                    try {
                        if (undo.canUndo()) {
                            undo.undo();
                        }
                    } catch (CannotUndoException cue) {
                        // possiveis erros são tratados aqui 
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
