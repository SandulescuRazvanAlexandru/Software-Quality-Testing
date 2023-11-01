package cts.sandulescu.razvan.g1086.pattern.singleton.clase;

public class Robot implements  IRobotSoftware {
    private String nume;
    private int cereri; //nu am inspiratie :(
    private int idRobot;

    // Lazy initialization
    private static Robot instance = null;
    public static synchronized Robot getInstance(String nume, int cereri, int idRobot) {
        if (instance == null) {
            instance = new Robot(nume, cereri, idRobot);
        }
        return instance;
    }

    private Robot(String nume, int cereri, int idRobot) {
        this.nume = nume;
        this.cereri = cereri;
        this.idRobot = idRobot;
    }

    @Override
    public void trimiteCerere(String denumire) {
        System.out.println("Robotul " + this.nume + " cu id-ul " + this.idRobot + " trimite o cerere");
    }

    @Override
    public String getInformatii(String categorie) {
        return "Robotul " + this.nume + " cu id-ul " + this.idRobot + " va da informatii despre o cerere";
    }

    @Override
    public void prelucrareCerere(String tip) {
        System.out.println("Robotul " + this.nume + " cu id-ul " + this.idRobot + " prelucreaza o cerere");
    }

    @Override
    public int getIdRobot() {
        return idRobot;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCereri() {
        return cereri;
    }

    public void setCereri(int cereri) {
        this.cereri = cereri;
    }

    public void setIdRobot(int idRobot) {
        this.idRobot = idRobot;
    }

    public static Robot getInstance() {
        return instance;
    }

    public static void setInstance(Robot instance) {
        Robot.instance = instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robot{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cereri=").append(cereri);
        sb.append(", idRobot=").append(idRobot);
        sb.append('}');
        return sb.toString();
    }
}
