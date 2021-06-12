package fundamentos;

import java.util.Scanner;

public class Medidas {

    static Scanner scan;

    public static void main(String[] args){
        String opcao;
        int area = 0;
        scan = new Scanner(System.in);
        System.out.println("Escolha o Cálculo Desejado:");
        System.out.println("1. Area do Quadrado");
        System.out.println("2. Area do Retângulo");
        System.out.println("3. Area do Triângulo");
        System.out.println("4. Area do Círculo");

        opcao = scan.nextLine();
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;
            default:
                System.out.println("Opção inválida!");

        }
        if(area > 0) {
            System.out.println("A área é: " + area + "m²");
        }

    }

    public static int calcularAreaDoQuadrado(){
        int lado;
        System.out.println("Digite o tamanho do lado");
        lado = scan.nextInt();
        return lado * lado;
    }

    public static int calcularAreaDoRetangulo(){
        //A = b.h
        int base;
        int altura;
        System.out.println("Digite o tamanho da base");
        base = scan.nextInt();
        System.out.println("Digite o tamanho da altura");
        altura = scan.nextInt();
        return base * altura;
    }

    public static int calcularAreaDoTriangulo(){
        //A = (b.h)/2
        int base;
        int altura;
        System.out.println("Digite a base do triângulo");
        base = scan.nextInt();
        System.out.println("Digite a altura do triângulo");
        altura = scan.nextInt();
        return (base * altura)/2;
    }

    public static int calcularAreaDoCirculo(){
        //A = π . r2
        int raio;
        System.out.println("Digite o raio do círculo");
        raio = scan.nextInt();
        return (int) (Math.PI * Math.pow(raio, 2));
    }

}