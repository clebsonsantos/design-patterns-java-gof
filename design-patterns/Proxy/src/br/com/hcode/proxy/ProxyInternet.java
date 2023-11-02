package br.com.hcode.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet realInternet;
    private static List<String> restrictedSites;

    static {
        restrictedSites = new ArrayList<>();
        restrictedSites.add("site1.com");
        restrictedSites.add("site2.com");
        restrictedSites.add("site3.com");
    }

    public ProxyInternet() {
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) {
        if (restrictedSites.contains(serverHost)) {
            System.out.println("Acesso a " + serverHost + " bloqueado.");
        } else {
            realInternet.connectTo(serverHost);
        }
    }
}
