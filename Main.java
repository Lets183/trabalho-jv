import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Evento[] eventos = new Evento[3];

        for (int i = 0; i < 3; i++) {

            String codigo = JOptionPane.showInputDialog(
                    "Digite o código do evento:");

            String nome = JOptionPane.showInputDialog(
                    "Digite o nome do evento:");

            String local = JOptionPane.showInputDialog(
                    "Digite o local do evento:");

            double valor = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite o valor da inscrição:"));

            int vagas = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Digite a quantidade de vagas disponíveis:"));

            int cargaHoraria = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Digite a carga horária (horas):"));

            eventos[i] = new Evento(
                    codigo,
                    nome,
                    local,
                    valor,
                    vagas,
                    cargaHoraria);

            eventos[i].verificarAlerta();
        }

        System.out.println("===== EVENTOS CADASTRADOS =====");

        for (Evento evento : eventos) {
            evento.exibirInformacoes();

            if (evento.possuiVagas()) {
                System.out.println("Inscrições abertas.");
            } else {
                System.out.println("Evento lotado.");
            }

            System.out.println();
        }
    }
}
