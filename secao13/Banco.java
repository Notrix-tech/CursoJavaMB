public class Banco{
  private double saldo;

public Banco(double saldo){
  this.saldo = saldo;
}
  public void sacar(double valor) throws SaldoInsuficiente{
   throw new SaldoInsificiente(" Vc não tem saldo para sacar" + valor);
  }
  saldo = saldo - valor;
sout(" Saque de" + valor + " realizado com sucesso ! ")

  }
