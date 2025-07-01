import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Moto moto = new Moto("Hornett",2025,"Honda");


        Industria industria = new Industria("Hrv",2025,"Honda");
        industria.notasClientes(10);
        industria.notasClientes(8);
        industria.notasClientes(7);
        industria.notasClientes(10);

        industria.mediaAvaliacoes();

        System.out.println("Total de notas: " + industria.getTotalNotas());
        System.out.println("Média das avaliações: " + industria.getMediaN());

        ArrayList<String> tiposVeiculos = new ArrayList<>();
        tiposVeiculos.add("Carro");
        tiposVeiculos.add("Moto");
        System.out.println(tiposVeiculos);

        ArrayList<Quilometragem> listaveiculos = new ArrayList<>();

        Carro carro1 = new Carro("CRV",2026,"Honda");
        carro1.setKmRodado(0);

        Moto moto1 = new Moto("Jx6",2023,"Honda");
        moto1.setKmRodado(50000);

        listaveiculos.add(carro1);
        listaveiculos.add(moto1);

        for(Quilometragem veiculo : listaveiculos){
            System.out.println(veiculo.toString());
            System.out.println(veiculo.getStatusKm());
            System.out.println("---------------------------");
        }
    }

}


