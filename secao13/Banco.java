public class Banco {
  private double saldo;

  public Banco(double saldo) {
    this.saldo = saldo;
  }

  public void sacar(double valor) throws SaldoInsuficiente {
    if (valor > saldo) {
      throw new SaldoInsuficiente("Você não tem saldo suficiente para sacar: " + valor + ". Saldo atual: " + saldo);
    }
    saldo -= valor;
    System.out.println("Saque de " + valor + " realizado com sucesso! Saldo atual: " + saldo);
  }

  // Add a method to deposit money
  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito de " + valor + " realizado com sucesso! Saldo atual: " + saldo);
    } else {
      System.out.println("Valor de depósito inválido: " + valor);
    }
  }
}

// Add the missing exception class
class SaldoInsuficiente extends Exception {
  public SaldoInsuficiente(String message) {
    super(message);
  }
}
