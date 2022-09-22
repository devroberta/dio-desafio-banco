import lombok.Getter;

@Getter
public abstract class Conta implements IConta{

  private static final int AGENCIA_PADRAO = 1;

  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;

  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public Cliente getCliente() {
    return cliente;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo +=valor;
  }

  @Override
  public void transferir(double valor, IConta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.getCliente().getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  public void imprimirConta() {
    System.out.println(String.format("Cliente: %s, Ag %s, Conta número: %s",
            this.getCliente().getNome(), this.agencia, this.numero));
  }
}
