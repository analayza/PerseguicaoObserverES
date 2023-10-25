package br.edu.fafic.es.padrao.observer.ModelCarros;

import br.edu.fafic.es.padrao.observer.Interfaces.CarroObserver;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class CarroRoubado {
        private String direcao;
        private List<CarroObserver> viaturas;

        public CarroRoubado() {
            this.viaturas = new ArrayList<>();
        }

        public void addViatura(CarroObserver viatura){
            viaturas.add(viatura);
        }

        public void removerObservador(CarroObserver viatura) {
            viaturas.remove(viatura);
        }

        public void virarEsquerda() {
            direcao = (" virou a esquerda....");
            System.out.println("Carro roubado virou a esquerda...");
            notificarObservadores();
        }

        public void virarDireita() {
            direcao = (" virou a direita....");
            System.out.println("Carro roubado virou a direita...");
            notificarObservadores();
        }

        public void parar() {
            direcao = (" parou....");
            System.out.println("Carro roubado parou...");
            notificarObservadores();
        }

        private void notificarObservadores() {
            this.viaturas.forEach(viatura -> {
                viatura.perseguir();
            });
        }
}
