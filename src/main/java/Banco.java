import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banco {

  private String nome;
  private List<Conta> contas;

  public void imprimiListaContas() {
    System.out.println("\nBanco: " + this.nome);
    for (Conta conta : contas) {
      conta.imprimirConta();
    }
  }
}
