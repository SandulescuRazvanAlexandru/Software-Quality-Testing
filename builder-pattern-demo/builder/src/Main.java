public class Main {
    public static void main(String[] args) {

//        Rezervare rezervare = new Rezervare(12, false, true, true, false, "Aaaa");
//        System.out.println(rezervare.toString());

        BuilderRezervare builderRezervare = new BuilderRezervare()
                .setCodRezervare(20) // pot fi puse in orice ordine
                .setAreBauturaRacoritoare(true)
                .setGenMuzical("changed");
        Rezervare rezervare1 = builderRezervare.build();
        System.out.println(rezervare1.toString());

        // este recomandat INLINE !!!
        Rezervare rezervare2 = new BuilderRezervare()
                .setCodRezervare(30)
                .setAreBauturaRacoritoare(true)
                .build();
        System.out.println(rezervare2.toString());

        Rezervare rezervare100 = new BuilderRezervare(100)
                .setAreBauturaRacoritoare(true)
                .build();
        System.out.println(rezervare100.toString());

        //shallow copy - dezavantaj
        Rezervare rezervare3 = builderRezervare.setCodRezervare(40).build();
        System.out.println(rezervare3.toString());
        System.out.println(rezervare1.toString());


        //===a doua varianta===//
        BuilderRezervare_v2 builderRezervare_v2 = new BuilderRezervare_v2()
                .setAreMancareInclusa(true)
                .setAreScaunErgonomic(true)
                .setAreBauturaRacoritoare(true);

        Rezervare rezervare4 = builderRezervare_v2.setCodRezervare(1200).build();
        Rezervare rezervare5 = builderRezervare_v2.setCodRezervare(1300).build();
        System.out.println(rezervare4);
        System.out.println(rezervare5);

    }
}