import javax.swing.JOptionPane;

public class Evento {

    private String codigo;
    private String nome;
    private String local;
    private double valorInscricao;
    private int vagasDisponiveis;
    private int cargaHoraria;

    public Evento(String codigo, String nome, String local,
                  double valorInscricao, int vagasDisponiveis,
                  int cargaHoraria) {

        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.valorInscricao = valorInscricao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Valor da Inscrição: R$ " + valorInscricao);
        System.out.println("Vagas Disponíveis: " + vagasDisponiveis);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Situação das Vagas: " + situacaoVagas());

        if (temDesconto()) {
            System.out.println("Desconto Promocional: 10%");
            System.out.println("Valor com desconto: R$ " +
                    (valorInscricao * 0.90));
        } else {
            System.out.println("Sem desconto promocional.");
        }

        System.out.println("--------------------------------");
    }

    public boolean possuiVagas() {
        return vagasDisponiveis > 0;
    }

    public String situacaoVagas() {
        if (vagasDisponiveis < 10) {
            return "Últimas vagas";
        } else if (vagasDisponiveis <= 30) {
            return "Vagas moderadas";
        } else {
            return "Muitas vagas disponíveis";
        }
    }

    public boolean temDesconto() {
        return valorInscricao > 300;
    }

    public void verificarAlerta() {
        if (vagasDisponiveis < 10) {
            JOptionPane.showMessageDialog(
                    null,
                    "ATENÇÃO! O evento " + nome +
                    " está com as últimas vagas!",
                    "Alerta",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
