package com.trybe.java.regraprogressao;

import java.util.HashMap;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    cadastroDeAtividadesAvaliativas();
  }

  /**
   * Register evaluative activity.
   */
  public static void cadastroDeAtividadesAvaliativas() {
    Scanner scanner = new Scanner(System.in);

    int countActivities = 1;

    // ------- Cadastro de atividade -----------
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int activityQnt = scanner.nextInt();
    scanner.nextLine();

    while (countActivities <= activityQnt) {
      System.out.print("Digite o nome da atividade " + countActivities + ": ");
      String nome = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + countActivities + ": ");
      int peso = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Digite a nota obtida para " + nome + ": ");
      int nota = scanner.nextInt();
      scanner.nextLine();

      countActivities++;
    }

    scanner.close();
  }
}