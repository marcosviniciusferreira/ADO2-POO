package br.com.mhbank.calculosalario.model;
import br.com.mhbank.calculosalario.controller.Creditos;
import br.com.mhbank.calculosalario.controller.Debitos;
import java.util.Scanner;

public class Funcionario {

    static public String nome;

    public void Funcionario(){
    this.setCreditos(new Creditos());
    this.setDebitos(new Debitos());
}

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Funcionario.nome = nome;
    }

    public Debitos getDebitos() {
        return debitos;
    }

    public void setDebitos(Debitos debitos) {
        this.debitos = debitos;
    }

    public Creditos getCreditos() {
        return creditos;
    }

    public void setCreditos(Creditos creditos) {
        this.creditos = creditos;
    }
    private Debitos debitos;
    private Creditos creditos;
    
    
    
    public static double SalarioLiquido(){
        double salario = Creditos.GanhosTotais(Creditos.getHorasExtras(), Creditos.getSalario(), Creditos.getBonus(), Creditos.getJornadaTrabalho())-Debitos.TotalDescontos(Debitos.getIRPF(), Debitos.getINSS(), Debitos.getVT(), Debitos.getVR(), Debitos.getConvenioMedico(), Debitos.getVA());
        return salario;
    }
}
