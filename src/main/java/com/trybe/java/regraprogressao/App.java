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
    registerEvaluativeActivity();
  }

  /**
   * Register evaluative activity.
   */
  public static void registerEvaluativeActivity() {
    Scanner scanner = new Scanner(System.in);

    int countActivities = 1;
    int totalWeight = 0;

    // ------- Cadastro de atividade -----------
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int activityQnt = Integer.parseInt(scanner.nextLine());

    while (countActivities <= activityQnt) {
      System.out.print("Digite o nome da atividade " + countActivities + ": ");
      String nome = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + countActivities + ": ");
      int weight = Integer.parseInt(scanner.nextLine());
      totalWeight += weight;

      System.out.print("Digite a nota obtida para " + nome + ": ");
      int grade = Integer.parseInt(scanner.nextLine());

      countActivities++;
    }

    if (totalWeight != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    scanner.close();
  }
}