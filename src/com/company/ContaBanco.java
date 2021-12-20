package com.company;

public class ContaBanco {
// Atributos
      public int numConta;
      protected String tipo;
      private String dono;
      private float saldo;
      private boolean status;
// Métodos Personalizados
      public void estadoAtual() {
            System.out.println("__________________________");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Conta: " + this.getTipo());
            System.out.println("Conta: " + this.getDono());
            System.out.println("Conta: " + this.getSaldo());
            System.out.println("Conta: " + this.getStatus());
      }

      public void abrirConta(String t) {
      this.setTipo(t);
      this.setStatus(true);
      if (t == "cc") {
      this.setSaldo(50);
            } else if (t == "cp") {
            this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!");
      }
      public void fecharConta() {
            if (this.getSaldo() > 0) {
                  System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
            } else if (this.getSaldo() > 0) {
                  System.out.println("Conta não pode ser fechada pois tem débito");
            } else {
                  this.setStatus(false);
                  System.out.println("Conta fechada com sucesso!");
            }

      }
      public void depositar(float v) {
      if (this.getStatus()) {
      //this.saldo = this.saldo + v; Este comando trabalha diretamente com os atributos, o de baixo com os met. especiais;
      this.setSaldo(this.getSaldo() + v); // Sempre trabalhar com os métodos especiais;
                  System.out.println("Depósito realizado na conta de " + this.getDono());
      } else {
            System.out.println("Impossível depositar em uma conta fechada!");
      }
      }
      public void sacar(float v) {
            if (this.getStatus()) {
            if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
                  System.out.println(" Saque realizado na conta de " + this.getDono());
            } else {
                  System.out.println("Saldo insuficiente para saque");
            }
                  } else {
                  System.out.println("Impossível sacar de uma conta fechada");
            }
      }

      public void pagarMensal() {
            int v = 0;
            if (this.getTipo() == "cc") {
                  v = 12;
            } else if (this.getTipo() == "cp") {
                  v = 20;
            }
            if (this.getStatus()) {
                  this.setSaldo(this.getSaldo() - v);
                  System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                  } else {
                  System.out.println("Impossível pagar uma conta fechada!");

            }
      }

      // Métodos Especiais
      // O método "construtor" possui o mesmo nome da classe
      public ContaBanco() {
            this.saldo = 0;
            this.status=false;
      }

      public int getNumConta() {
            return numConta;
      }

      public void setNumConta(int numConta) {
            this.numConta = numConta;
      }

      public String getTipo() {
            return tipo;
      }

      public void setTipo(String tipo) {
            this.tipo = tipo;
      }

      public String getDono() {
            return dono;
      }

      public void setDono(String dono) {
            this.dono = dono;
      }

      public float getSaldo() {
            return saldo;
      }

      public void setSaldo(float saldo) {
            this.saldo = saldo;
      }

      public boolean getStatus() {
            return status;
      }

      public void setStatus(boolean status) {
            this.status = status;
      }
}
