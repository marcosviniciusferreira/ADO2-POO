package br.com.mhbank.calculosalario.model;

import java.util.Scanner;

public class Funcionario {

    static public String nome;
    static public double salario, salarioTributavel, totalVT, totalVR, convenioMedico, totalVA, irpf, inss, horasExtras, bonus;
    

    static public int quantDependente, jornadaTrabalho;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Funcionario.nome = nome;
    }

    public static double getSalario() {
        return salario;
    }

    public static void setSalario(double salario) {
        Funcionario.salario = salario;
    }

    public static double getTotalVT() {
        return totalVT;
    }

    public static void setTotalVT(double totalVT) {
        Funcionario.totalVT = totalVT;
    }

    public static double getHorasExtras() {
        return horasExtras;
    }

    public static void setHorasExtras(double horasExtras) {
        Funcionario.horasExtras = horasExtras;
    }

    public static double getBonus() {
        return bonus;
    }

    public static void setBonus(double bonus) {
        Funcionario.bonus = bonus;
    }

    public static int getQuantDependente() {
        return quantDependente;
    }

    public static void setQuantDependente(int quantDependente) {
        Funcionario.quantDependente = quantDependente;
    }

    public static int getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public static void setJornadaTrabalho(int jornadaTrabalho) {
        Funcionario.jornadaTrabalho = jornadaTrabalho;
    }

}
