package Exerc�cio;

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    paciente p = new paciente();

    p.nome = JOptionPane.showInputDialog("Digite...");
    p.rg = JOptionPane.showInputDialog("...");
    p.endere�o = JOptionPane.showInputDialog("...");
    p.telefone = JOptionPane.showInputDialog("...");
    p.dataNascimento = JOptionPane.showInputDialog("...");
    p.profissao = JOptionPane.showInputDialog("...");
    
    
}
}
    