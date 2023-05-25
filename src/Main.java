public class Main {
    public static void main(String[] args) {
        vacation vacation =new vacation(21);
        father father= new father(42, work.OFFICE, vacation,"fgbhn" );
        System.out.println(father.getinfo());
        father.makevord();
        father.makevord("fgtrhrh");

        son son = new son(18,work.SCHOOL,vacation,"8class", "claas", "and claas");
        System.out.println(son.getinfo());
        son.makevord();
        son.makevord("good");

        son son1 = new son(15,work.SCHOOL,vacation,"argen","poor","back");
        System.out.println(son1.getinfo());
        son.makevord();
        son.makevord("fghfgd");
    }
}
