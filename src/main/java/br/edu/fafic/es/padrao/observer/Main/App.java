package br.edu.fafic.es.padrao.observer.Main;

import br.edu.fafic.es.padrao.observer.ModelCarros.CarroRoubado;
import br.edu.fafic.es.padrao.observer.ModelCarros.Viatura;

public class App {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();
        Viatura viatura = new Viatura("Viatura", carroRoubado);

        carroRoubado.addViatura(viatura);
        carroRoubado.virarEsquerda();
        carroRoubado.virarDireita();
        carroRoubado.parar();

    }
}
