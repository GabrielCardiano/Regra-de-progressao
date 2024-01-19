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
    HashMap<String, Integer> finalGrade = new HashMap<String, Integer>();

    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int activityQnt = scanner.nextInt();
    scanner.nextLine();

    while (countActivities <= activityQnt) {
      System.out.print("Digite o nome da atividade " + countActivities + ": ");
      String nome = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + countActivities + ": ");
      int peso = scanner.nextInt();
      scanner.nextLine();

      finalGrade.put(nome, peso);
      countActivities++;
    }

    System.out.println(finalGrade);
    scanner.close();
  }
}