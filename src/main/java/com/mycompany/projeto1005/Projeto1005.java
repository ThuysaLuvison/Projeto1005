/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1005;

import java.util.Scanner;

public class Projeto1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, NOTA1, NOTA2, MEDIA;
        A = sc.nextDouble();
        B = sc.nextDouble();
        NOTA1 = A * 3.5;
        NOTA2 = B * 7.5;
        MEDIA = (NOTA1 + NOTA2) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }

