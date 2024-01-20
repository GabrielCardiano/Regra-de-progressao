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
    float totalGrade = 0;

    // ------- Cadastro de atividade -----------
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int activityQnt = Integer.parseInt(scanner.nextLine());

    while (countActivities <= activityQnt) {
      System.out.print("Digite o nome da atividade " + countActivities + ": ");
      String nome = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + countActivities + ": ");
      int activityWeight = Integer.parseInt(scanner.nextLine());
      totalWeight += activityWeight;

      System.out.print("Digite a nota obtida para " + nome + ": ");
      float grade = Float.parseFloat(scanner.nextLine());
      totalGrade += grade * activityWeight;

      countActivities++;
    }

    if (totalWeight != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      return;
    }

    float finalGrade = calculateStudentRating(totalGrade, totalWeight);
    if (finalGrade >= 85) {
      System.out.println(
          "Parabéns! Você alcançou " + String.format("%.2d", finalGrade)
              + "%! E temos o prazer de informar que você obteve aprovação!"
      );
    }

    scanner.close();
  }

  public static float calculateStudentRating(float totalGrade, int totalWeight) {
    return totalGrade / totalWeight;
  }
}