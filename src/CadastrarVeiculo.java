import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarVeiculo {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Industria> listaVeiculos = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n-- MENU --");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Motocicleta");
            System.out.println("3 - Listar Veículos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastro de Carro:");
                    System.out.print("Modelo: ");
                    String modeloCarro = leitura.nextLine();

                    System.out.print("Ano: ");
                    int anoCarro = leitura.nextInt();
                    leitura.nextLine();

                    System.out.print("Marca: ");
                    String marcaCarro = leitura.nextLine();

                    System.out.print("Cor: ");
                    String corCarro = leitura.nextLine();

                    Carro carro = new Carro(modeloCarro, anoCarro, marcaCarro);
                    carro.setCor(corCarro);

                    listaVeiculos.add(carro);
                    System.out.println(" Carro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nCadastro de Motocicleta:");
                    System.out.print("Modelo: ");
                    String modeloMoto = leitura.nextLine();

                    System.out.print("Ano: ");
                    int anoMoto = leitura.nextInt();
                    leitura.nextLine();

                    System.out.print("Marca: ");
                    String marcaMoto = leitura.nextLine();

                    System.out.print("Cor: ");
                    String corMoto = leitura.nextLine();

                    Moto moto = new Moto(modeloMoto, anoMoto, marcaMoto);
                    moto.setCor(corMoto);

                    listaVeiculos.add(moto);
                    System.out.println(" Moto cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("\n Veículos cadastrados:");
                    if (listaVeiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado ainda.");
                    } else {
                        for (Industria veiculo : listaVeiculos) {
                            System.out.println(veiculo);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println(" Opção inválida! Tente novamente.");
            }
        }
    }
}
