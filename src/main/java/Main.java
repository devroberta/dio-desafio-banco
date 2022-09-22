import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("ABERTURA DE CONTA CORRENTE");
    System.out.print("Nome do Cliente: ");
    Cliente cliente = new Cliente();
    cliente.setNome(leitor.next());

    Conta cc = new ContaCorrente(cliente);
    System.out.print("Valor que deseja depositar: ");
    cc.depositar(leitor.nextDouble());
    cc.imprimirExtrato();

    Conta poupanca = new ContaPoupanca(cliente);
    System.out.print("\nDigite o valor da transferência para sua conta poupança: ");
    double valor = leitor.nextDouble();
    cc.transferir(valor, poupanca);
    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }

}
