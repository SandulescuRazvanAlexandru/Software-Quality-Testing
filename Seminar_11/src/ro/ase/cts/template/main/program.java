package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.SpectatorNormal;
import ro.ase.cts.template.clase.SpectatorVIP;

public class program {
    public static void main(String[] args) {
        SpectatorNormal spectatorNormal = new SpectatorNormal("Gigel");
        SpectatorVIP spectatorVIP = new SpectatorVIP("Becali",1);

        spectatorNormal.intraPeStadion();
        System.out.println("--------------------------------------");
        spectatorVIP.intraPeStadion();
    }
}
