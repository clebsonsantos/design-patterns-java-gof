package br.com.hcode.proxy;

public class Main {
  public static void main(String[] args) {
    Internet internet = new ProxyInternet();

    internet.connectTo("site1.com"); // Acesso bloqueado
    internet.connectTo("site2.com"); // Acesso bloqueado
    internet.connectTo("example.com"); // Conectando a example.com
  }
}
