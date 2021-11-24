/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /* -------------------- //NOTE media altura 1000 personas ------------------- */

    // double altura[] = new double[1000];

    // double media = 0;

    // for (int i = 0; i < altura.length; i++) {
    //   altura[i] = Math.random() * 0.5 + 1.6;
    //   System.out.println(String.format("%.2f", altura[i]) + " ");
    //   media += altura[i];
    // }
    // media /= altura.length;
    // System.out.println("Esta es la media " + String.format("%.2f", media));
    /* -------------------------------------------------------------------------- */

    /* ----------------------------- //NOTE Matrices ---------------------------- */

    // int matriz[][] = new int[2][4]; ==> Sintaxix de una array multidimensional
    // int miarray2[][] = new int[100][20];

    // for (int i = 0; i < 4; i++) {
    //   miarray2[0][i] = (int) (Math.random() * 10 + 1);
    // }
    // for (int i = 0; i < 4; i++) {
    //   miarray2[1][i] = (int) (Math.random() * 10 + 1);
    // }
    // for (int i = 0; i < 4; i++) {
    //   miarray2[2][i] = (int) (Math.random() * 10 + 1);
    // }

    // for (int i = 0; i < 4; i++) {
    //   System.out.print(miarray2[0][i] + " ");
    // }
    // System.out.println("");
    // for (int i = 0; i < 4; i++) {
    //   System.out.print(miarray2[1][i] + " ");
    // }
    // System.out.println("");
    // for (int i = 0; i < 4; i++) {
    //   System.out.print(miarray2[2][i] + " ");
    // }
    // System.out.println("");
    /* -------------------------------------------------------------------------- */

    /* ------------------------- //NOTE bucles anidados ------------------------- */

    // for (int i = 0; i < 100; i++) {
    //   for (int j = 0; j < 20; j++) {
    //     miarray2[i][j] = (int)(Math.random() * 10 + 1);
    //   }
    // }

    // for (int i = 0; i < 100; i++) {
    //   for (int j = 0; j < 20; j++) {
    //     System.out.print(miarray2[i][j] + " ");
    //   }
    //   System.out.println(" ");
    // }

    /* -------------------------------------------------------------------------- */

    /* ------------------------- //NOTE array ley de Ohm ------------------------ */

    double arrayOhm[][] = new double[1000][2];

    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < 2; j++) {
        arrayOhm[i][j] = (double) (Math.random() * 75 + 20);
      }
    }

    for (int i = 0; i < 1000; i++) {
      System.out.println(
        String.format("%.02f", arrayOhm[i][0]) +
        " || " +
        String.format("%.02f", arrayOhm[i][1]) +
        " || " +
        String.format("%.02f", (arrayOhm[i][0] * arrayOhm[i][1]))
      );
    }
    /* -------------------------------------------------------------------------- */

  }
}
