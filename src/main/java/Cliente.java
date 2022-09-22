import lombok.Data;
import lombok.Getter;

@Data
public class Cliente {

  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
