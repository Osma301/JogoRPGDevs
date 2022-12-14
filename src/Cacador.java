package JogoRPGDevs.src;


import java.util.Scanner;

public class Cacador extends Personagem {
	public Cacador() {

		this.setVidaP(153);
		this.setMaxVida(153);
		this.setDanoP(44);
		this.setLevelP(1);
		this.setXp(0);
		this.setMp(70);
		this.setMaxMp(70);
		this.setScolhia(1);
		this.setQtdPocao(0);

	}

	Scanner scan = new Scanner(System.in);

	public void ataquesEspeciais() {
		String especiais[] = { "3 - Flecha de fogo, 4 - Invocação de lobos" };
		for (int i = 0; i < especiais.length; i++) {
			System.out.println("Ataques especiais: " + especiais[i]);
		}
	}

	public void ataquesNormais() {
		String normais[] = { "1 - Estocada Mortal 2 - Rede de caça" };
		for (int i = 0; i < normais.length; i++) {
			System.out.println("Ataques normais: " + normais[i]);
		}
	}

	@Override
	public int atacar(int ataque) {
		switch (ataque) {
		case 1: // Estocada Mortal
			System.out.println("Estocada Mortal, seu adversário sofreu 17 pontos de dano\n");
			setDanoP(17);
			return getDanoP();
		case 2: // Rede de caça
			System.out.println("Rede de caça, seu adversário sofreu 15 pontos de dano\n");
			setDanoP(15);
			return getDanoP();
		case 3: // Flecha de fogo
			if (this.getMp() >= 10) {
				System.out.println(
						"Flecha de fogo, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano\n");
				this.reduzirMP(10);
				setDanoP(30);
				return getDanoP();
			} else {
				System.out.println("Você não tem MP o suficiente (MP: " + this.getMp() + ")\n");
			}
		case 4: // Invocação de lobos
			if (this.getMp() >= 15) {
				System.out.println(
						"Invocação de lobos, você gastou 15mp com este ataque \n seu adversário sofreu 35 pontos de danon\n");
				this.reduzirMP(15);
				setDanoP(35);
				return getDanoP();
			} else {
				System.out.println("Você não tem MP o suficiente (MP: " + this.getMp() + ")\n");
			}
		default:
			return 0;

		}

	}
	
	@Override
	public void mostrarOpcoes() {
		System.out.println("\nSua vez de atacar, escolha uma das opções:");
		ataquesNormais();
		ataquesEspeciais();

	}
	
	@Override
	public int curaMax() {
		setVidaP(getVidaP()+35);
		
		if(getVidaP() > 100) {
			setVidaP(100);
		}
		System.out.println("Você recupero vida tras derrotar o inimigo");
		return getVidaP();
		
	}
	
}
