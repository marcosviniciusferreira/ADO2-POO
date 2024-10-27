package br.com.mhbank.calculosalario.controller;

public class Creditos {

    public static double salario, bonus, horaExtra, total;

    public static double HoraExtra(double salario, double jornadaTrabalho, double horasExtras) {

        double salarioHora = salario / jornadaTrabalho;

        horaExtra = ((salarioHora * 0.5) + salarioHora) * horasExtras;

        return horaExtra;
    }

    public static double GanhosTotais(double salario, double bonusFuncionario, double horasExtras,
            int jornadaTrabalho) {

        horaExtra = Creditos.HoraExtra(salario, jornadaTrabalho, horasExtras);

        bonus = bonusFuncionario;

        total = salario + horaExtra + bonus;

        return total;
    }
}
