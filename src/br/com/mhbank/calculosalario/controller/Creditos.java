package br.com.mhbank.calculosalario.controller;

import br.com.mhbank.calculosalario.model.Funcionario;

public class Creditos extends Funcionario{
    
    public static double bonus, salario, horasExtras;
    public static int jornadaTrabalho;

    public static double getSalario() {
        return salario;
    }

    public static void setSalario(double salario) {
        Creditos.salario = salario;
    }

    public static double getHorasExtras() {
        return horasExtras;
    }

    public static void setHorasExtras(double horasExtras) {
        Creditos.horasExtras = horasExtras;
    }

    public static int getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public static void setJornadaTrabalho(int jornadaTrabalho) {
        Creditos.jornadaTrabalho = jornadaTrabalho;
    }


    public static double getBonus() {
        return bonus;
    }

    public static void setBonus(double bonus) {
        Creditos.bonus = bonus;
    }

    public static double HoraExtra(double salario, double jornadaTrabalho, double horasExtras) {

        double salarioHora = salario / jornadaTrabalho;

        horasExtras = ((salarioHora * 0.5) + salarioHora) * horasExtras;

        return horasExtras;
    }

    public static double GanhosTotais(double salario, double bonusFuncionario, double horasExtras, int jornadaTrabalho) {

        horasExtras = Creditos.HoraExtra(salario, jornadaTrabalho, horasExtras);

        bonusFuncionario = bonusFuncionario;

        salario = salario + horasExtras + bonusFuncionario;

        return salario;
    }
}
