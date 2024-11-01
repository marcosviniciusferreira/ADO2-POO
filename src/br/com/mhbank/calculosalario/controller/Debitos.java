package br.com.mhbank.calculosalario.controller;

public class Debitos {

    public static double IRPF, INSS, VT, VR, convenioMedico, VA;

    public static double DescontoINSS(double salario) {
        if (salario <= 1412) {
            INSS = (salario * 0.075);
        } else if (salario > 1412 && salario <= 2666.68) {
            INSS = salario * 0.09;

        } else if (salario > 2666.68 && salario <= 4000.03) {
            INSS = salario * 0.12;

        } else if (salario > 4000.03) {
            INSS = salario * 0.14;

        } else {
            INSS = 0;
        }
        return INSS;
    }

    public static double DescontoIRPF(double salarioBruto, int dependentes) {

        DescontoINSS(salarioBruto);

        double descontoDependentes = dependentes * 189.59;
        double descontosTotais = INSS + descontoDependentes;
        double salarioFinalIRPF = salarioBruto - descontosTotais;

        if (salarioFinalIRPF < 2112) {
            IRPF = 0;

        } else if (salarioFinalIRPF > 2112 && salarioFinalIRPF <= 2826.65) {
            IRPF = (salarioFinalIRPF * 0.075) - 158.40;

        } else if (salarioFinalIRPF > 2826.65 && salarioFinalIRPF <= 3751.05) {
            IRPF = (salarioFinalIRPF * 0.15) - 370.4;

        } else if (salarioFinalIRPF >= 3751.06 && salarioFinalIRPF <= 4664.68) {
            IRPF = (salarioFinalIRPF * 0.225) - 651.73;

        } else {
            IRPF = (salarioFinalIRPF * 0.275) - 884.96;
        }
        return IRPF;
    }

    public static double DescontoValeTransporte(double salario, double totalVT) {

        if ((salario * 0.06) <= totalVT) { // Evitando que seja descontado maisdo que o funcionario precisa
            VT = (salario * 0.06);
        } else {
            VT = totalVT;
        }
        return VT;
    }

    public static double DescontoValeRefeicao(double salario) {
        if (salario <= 1412) {
            VR = 0;
        } else {
            VR = salario * 0.03;
        }
        return VR;
    }

    public static double DescontoConvenioMedico(double salario) {
        if (salario <= 1412) {
            convenioMedico = 0;
        } else {
            convenioMedico = (salario * 0.04);
        }
        return convenioMedico;
    }

    public static double getIRPF() {
        return IRPF;
    }

    public static void setIRPF(double IRPF) {
        Debitos.IRPF = IRPF;
    }

    public static double getINSS() {
        return INSS;
    }

    public static void setINSS(double INSS) {
        Debitos.INSS = INSS;
    }

    public static double getVT() {
        return VT;
    }

    public static void setVT(double VT) {
        Debitos.VT = VT;
    }

    public static double getVR() {
        return VR;
    }

    public static void setVR(double VR) {
        Debitos.VR = VR;
    }

    public static double getConvenioMedico() {
        return convenioMedico;
    }

    public static void setConvenioMedico(double convenioMedico) {
        Debitos.convenioMedico = convenioMedico;
    }

    public static double getVA() {
        return VA;
    }

    public static void setVA(double VA) {
        Debitos.VA = VA;
    }

    public static double DescontoValeAlimentacao(double salario) {
        if (salario <= 4.236) { // 3 salarios minimos
            VA = 0;
        } else {
            VA = salario * 0.02;
        }
        return VA;
    }
    
    public static double TotalDescontos(double IRPF, double INSS, double VT, double VR, double convenioMedico, double VA){
        double totalDescontos = IRPF + INSS + VT + VR + convenioMedico+ VA;
        return totalDescontos;
    }
}
