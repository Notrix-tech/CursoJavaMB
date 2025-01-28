package secao12poo.pessoa;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // construtor vazio
    public ContaBancaria() {
    }
    // contrutor com parametros
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    // getters e setters
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        }else{
            System.out.println("Nome do titular inválido");
        }
       
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo inválido. Saldo tem que ser positivo");
        }
    }

    public void imprimir(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}
