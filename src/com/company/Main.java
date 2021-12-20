package com.company;

public class Main {

    public static void main(String[] args) {
	ContaBanco p1 = new ContaBanco();
    p1.setNumConta(1111);
    p1.setDono("Otaviano");
    p1.abrirConta("cc");

    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(2222);
    p2.setDono("Marta");
    p2.abrirConta("cp");

    p1.depositar(100);
    p2.depositar(500);
    p2.sacar(100);

    p1.estadoAtual();
    p2.estadoAtual();
    }
}
