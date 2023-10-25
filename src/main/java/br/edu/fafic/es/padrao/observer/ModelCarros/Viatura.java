package br.edu.fafic.es.padrao.observer.ModelCarros;

import br.edu.fafic.es.padrao.observer.Interfaces.CarroObserver;

public class Viatura implements CarroObserver {
    private CarroRoubado carroRoubado;
    private String modelo;
    public Viatura(String modelo,CarroRoubado carroRoubado ) {
        this.carroRoubado = carroRoubado;
        this.modelo = modelo;
    }
    @Override
    public void perseguir(){
        System.out.println(modelo + carroRoubado.getDirecao());
    }
}
