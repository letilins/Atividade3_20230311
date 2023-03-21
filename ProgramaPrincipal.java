public class ProgramaPrincipal {
   
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(300);
        conta2.sacar(700);

        System.out.println("Saldo da conta 1: " + conta1.obterSaldo());
        System.out.println("Saldo da conta 2: " + conta2.obterSaldo());
    }
}

class ContaBancaria {
 
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

     
public int getNumeroConta(){
        return this.numeroConta;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valorSaque;
        }
    }

    public double obterSaldo() {
        return saldo;
    }
}