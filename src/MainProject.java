package JogoRPGDevs.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainProject {
<<<<<<< HEAD
<<<<<<< HEAD
	public static ArrayList<Inimigo> carregaArray() {
		ArrayList<Inimigo> inimigos = new ArrayList();
		Golen golen = new Golen();
		inimigos.add(golen);
		Gorgona gorgona = new Gorgona();
		Troll fandom = new Troll();
		
		ArrayList<Inimigo> inimigosList = new ArrayList<>(); 
		
		inimigosList.add(golen);
		inimigosList.add(gorgona);
		inimigosList.add(fandom);
		
	
		
		
		for (int i = 0; i < inimigosList.size(); i++) {
			
			System.out.println(inimigosList.get(i).getVidaP()-10);
			
			
			
		}
		
		
		// Personagems 
		
		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();
		
		Personagem p1 = new Personagem();
		
		
		
		
		
		
		
		
		inimigos.add(gorgona);
		Troll troll = new Troll();
		inimigos.add(troll);
		MaquinaSanguinaria maquinaSanguinaria = new MaquinaSanguinaria();
		inimigos.add(maquinaSanguinaria);
		AlmaMaldita almaMaldita = new AlmaMaldita();
		inimigos.add(almaMaldita);
		return inimigos;

	}

=======
	
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
=======
	
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
	public static void main(String[] args) {

		boolean flag = true;
		int escolha;
		int ataque;
		Jogo jogo = new Jogo();
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
<<<<<<< HEAD
		
		//Cores
		String b = "\u001B[0m"; //borrar      
		String preto = "\033[30m";
		String vermelho = "\033[31m";
		String verde = "\033[32m";
		String amarelo = "\033[33m";
		String azul = "\033[34m";
		String magenta = "\033[35m";
		String celeste = "\033[36m";
		String branco = "\033[37m";
		        
		String fvermelho = "\033[41m";
		String fVerde = "\033[42m";
		String fAmarelo = "\033[43m";
		String fAzul = "\033[44m";
		String fMagenta = "\033[45m";
		String fCeleste = "\033[46m";
		String fGris = "\033[47m";
		
		// Chefões

		ArrayList<Boss> boss = new ArrayList();
		Medusa medusa = new Medusa();
		boss.add(medusa);
		DestructorSanguinario destructor = new DestructorSanguinario();
		boss.add(destructor);
		Mortis mortis = new Mortis();
		boss.add(mortis);
		jogo.setChefoes(boss);

		// Inimigos

		ArrayList<Inimigo> inimigos = new ArrayList();
		Golen golen = new Golen();
		inimigos.add(golen);
		Gorgona gorgona = new Gorgona();
		inimigos.add(gorgona);
		Troll troll = new Troll();
		inimigos.add(troll);
		MaquinaSanguinaria maquinaSanguinaria = new MaquinaSanguinaria();
		inimigos.add(maquinaSanguinaria);
		AlmaMaldita almaMaldita = new AlmaMaldita();
		inimigos.add(almaMaldita);
		jogo.setInimigos(inimigos);

		// Classe Jogo
=======
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
=======
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586

		// Personagems

		
		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();

		Personagem p1 = new Personagem();
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println(branco+fAmarelo+"Escolha um personagem: (1-) Mago (2-) Guerreiro (3) - Caçador"+b);
		escolha = scan.nextInt();
		
		if (escolha == 1) {
			System.out.println(azul+"Você escolheu o Mago"+b);
			mago.mostrarAtributos();
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			mago.ataquesNormais();
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			mago.ataquesEspeciais();
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			p1 = mago;

		}
		if (escolha == 2) {
			System.out.println(vermelho+fAmarelo+"Você escolheu o Guerreiro");
			guerreiro.mostrarAtributos();
			guerreiro.ataquesNormais();
			guerreiro.ataquesEspeciais();
			p1 = guerreiro;
		}
		if (escolha == 3) {
			System.out.println(verde+fMagenta+"Você escolheu o Caçador"+b);
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			cacador.mostrarAtributos();
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			cacador.ataquesNormais();
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			cacador.ataquesEspeciais();
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			p1 = cacador;
		}
		
=======

		System.out.println("Escolha um personagem: 1- Mago 2- Guerreiro 3 - Cacador");
		escolha = scan.nextInt();
		switch(escolha) {
			case 1:
				System.out.println("Você escolheu o Mago");
				mago.mostrarAtributos();
				mago.ataquesNormais();
				mago.ataquesEspeciais();
				p1 = mago;
				break;
			case 2:
				System.out.println("Você escolheu o Guerreiro");
				guerreiro.mostrarAtributos();
				guerreiro.ataquesNormais();
				guerreiro.ataquesEspeciais();
				p1 = guerreiro;
				break;
			case 3:
				System.out.println("Você escolheu o Cacador");
				cacador.mostrarAtributos();
				cacador.ataquesNormais();
				cacador.ataquesEspeciais();
				p1 = cacador;
				break;
			default:
				System.out.println("Você vai ficar com o Mago");
				break;
		}
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
=======

		System.out.println("Escolha um personagem: 1- Mago 2- Guerreiro 3 - Cacador");
		escolha = scan.nextInt();
		switch(escolha) {
			case 1:
				System.out.println("Você escolheu o Mago");
				mago.mostrarAtributos();
				mago.ataquesNormais();
				mago.ataquesEspeciais();
				p1 = mago;
				break;
			case 2:
				System.out.println("Você escolheu o Guerreiro");
				guerreiro.mostrarAtributos();
				guerreiro.ataquesNormais();
				guerreiro.ataquesEspeciais();
				p1 = guerreiro;
				break;
			case 3:
				System.out.println("Você escolheu o Cacador");
				cacador.mostrarAtributos();
				cacador.ataquesNormais();
				cacador.ataquesEspeciais();
				p1 = cacador;
				break;
			default:
				System.out.println("Você vai ficar com o Mago");
				break;
		}
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
		jogo.setPersonagem(p1);
		jogo.setnTurno(1);
		jogo.setChefoes(carregaArrayBoss());
		int count = 0;
		do {
			jogo.setInimigos(carregaArrayInimigos());
			jogo.turno();
			count++;
			if (count % 3 == 0 && p1.getVidaP() > 0) {
				jogo.browser();
			}
		} while (p1.getVidaP() > 0 && count < 9);

		if (p1.getVidaP() > 0) {
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
			System.out.println("\tVoce zerou o jogo! Parabéns!!\t");
			System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
		}
		System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
		System.out.println(preto+fGris+"Fim de jogo");
		System.out.println(azul+fGris+"\t--------------------------------------------------------------------------------\t"+b);
	}
	
	public static ArrayList<Inimigo> carregaArrayInimigos() {

		ArrayList<Inimigo> inimigos = new ArrayList();

		Golen golen = new Golen();
		Gorgona gorgona = new Gorgona();
		Troll troll = new Troll();
		MaquinaSanguinaria maquinaSanguinaria = new MaquinaSanguinaria();
		AlmaMaldita almaMaldita = new AlmaMaldita();

		inimigos.add(golen);
		inimigos.add(gorgona);
		inimigos.add(troll);
		inimigos.add(maquinaSanguinaria);
		inimigos.add(almaMaldita);

		return inimigos;

	}

	public static ArrayList<Boss> carregaArrayBoss() {

		ArrayList<Boss> boss = new ArrayList();

		Medusa medusa = new Medusa();
		DestructorSanguinario destructor = new DestructorSanguinario();
		Mortis mortis = new Mortis();

		boss.add(medusa);
		boss.add(destructor);
		boss.add(mortis);

		return boss;

	}
	
	public static ArrayList<Inimigo> carregaArrayInimigos() {

		ArrayList<Inimigo> inimigos = new ArrayList();

		Golen golen = new Golen();
		Gorgona gorgona = new Gorgona();
		Troll troll = new Troll();
		MaquinaSanguinaria maquinaSanguinaria = new MaquinaSanguinaria();
		AlmaMaldita almaMaldita = new AlmaMaldita();

		inimigos.add(golen);
		inimigos.add(gorgona);
		inimigos.add(troll);
		inimigos.add(maquinaSanguinaria);
		inimigos.add(almaMaldita);

		return inimigos;

	}

	public static ArrayList<Boss> carregaArrayBoss() {

		ArrayList<Boss> boss = new ArrayList();

		Medusa medusa = new Medusa();
		DestructorSanguinario destructor = new DestructorSanguinario();
		Mortis mortis = new Mortis();

		boss.add(medusa);
		boss.add(destructor);
		boss.add(mortis);

		return boss;

	}
}
