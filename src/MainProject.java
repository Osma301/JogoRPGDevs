

import java.util.ArrayList;
import java.util.Scanner;


public class MainProject {
	public static ArrayList<Inimigo> carregaArray() {
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
		return inimigos;
		
	}
	public static void main(String[] args) {
	
		boolean flag = true;
		int escolha;
		int ataque;
		Jogo jogo = new Jogo();
		Scanner scan = new Scanner(System.in);
		
		//Chefões
		
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
		
		// Personagems 
		
		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();
		
		Personagem p1 = new Personagem();
<<<<<<< HEAD
		System.out.println("Escolha um personagem: 1- Mago 2- Guerreiro 3 - Caçador 4- Ver estatísticas");
			scolhia = scan.nextInt();
			if(scolhia == 1) {
=======
		System.out.println("Escolha um personagem: 1- Mago 2- Guerreiro 3 - Caçador 4- Ver estatisticas");
			escolha = scan.nextInt();
			if(escolha == 1) {
>>>>>>> f9751aa72c2566aad0225c72955d6072bcfe1691
				System.out.println("Você escolheu o Mago");
				mago.mostrarAtributos();;
				mago.ataquesNormais();
				mago.ataquesEspeciais();
				p1 = mago;
				
				}
			if(escolha== 2) {
				System.out.println("Você escolheu o Guerreiro");
				guerreiro.mostrarAtributos();
				guerreiro.ataquesNormais();
				guerreiro.ataquesEspeciais();
				p1 = guerreiro;
			}
			if(escolha ==3) {
				System.out.println("Você escolheu o Caçador");
				cacador.mostrarAtributos();;
				cacador.ataquesNormais();
				cacador.ataquesEspeciais();
				p1 = cacador;
			}
			jogo.setPersonagem(p1);
			jogo.setnTurno(1);
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.browser();
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.browser();
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.turno();
			jogo.setInimigos(carregaArray());
			jogo.browser();
			System.out.println("Fim de jogo");
		}
	}


