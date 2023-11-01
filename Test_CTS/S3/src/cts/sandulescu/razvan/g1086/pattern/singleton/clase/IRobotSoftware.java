package cts.sandulescu.razvan.g1086.pattern.singleton.clase;

public interface IRobotSoftware {
    public void trimiteCerere(String denumire);

    public String getInformatii(String categorie);

    public void prelucrareCerere(String tip);

    public int getIdRobot();
}