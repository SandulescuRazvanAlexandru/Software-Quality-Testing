public class Main {
    public static void main(String[] args) {
        Masa masa2 = new Masa(1);
        masa2.elibereazaMasa();
        masa2.ocupaMasa();
        //masa2.setStare(new StareLibera());
        masa2.rezervaMasa();
        masa2.elibereazaMasa();
        masa2.rezervaMasa();
    }
}