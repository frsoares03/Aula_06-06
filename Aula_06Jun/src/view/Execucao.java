package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

	public static void main(String[] args) {

		Professor prof = new Professor();
		
		prof.setName(JOptionPane.showInputDialog(null,"Nome:"));
		prof.setEndereco(JOptionPane.showInputDialog(null,"Endereço:"));
		prof.setBairro(JOptionPane.showInputDialog(null,"Bairro:"));
		prof.setCEP(Long.parseLong(JOptionPane.showInputDialog(null,"CEP:")));
		prof.setCidade(JOptionPane.showInputDialog(null,"Cidade:"));
		prof.setEstado(JOptionPane.showInputDialog(null,"Estado:"));
		prof.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"RG:")));
		prof.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"CPF:")));
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			
			String disciplinas[] = new String[100];
			
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);
			}
			
			prof.setDisciplina(disciplinas);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui?"));
			String cursos[] = new String[100];
			
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso " + i);
			}
			
			prof.setCursos(cursos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Nome: " + prof.getName());
		System.out.println("Bairro: " + prof.getBairro());
		System.out.println("CEP: " + prof.getCEP());
		System.out.println("Cidade: " + prof.getCidade());
		System.out.println("Estado: " + prof.getEstado());
		System.out.println("Endereço: " + prof.getEndereco());
		System.out.println("RG: " + prof.getRg());
		System.out.println("CPF: " + prof.getCpf());
		System.out.println("Cursos: " + prof.getCursos());
		
		System.out.println("Classe: " + prof.getClass());
		
		
		
	}

	
}
