public class father extends grandfather{
    private vacation vacation;
    private String office;

    public vacation getVacation() {
        return vacation;
    }

    public String getOffice() {
        return office;
    }

    public father(int age, work work, vacation vacation, String office) {
        super(age, work);
        this.vacation = vacation;
        this.office = office;
    }

    public void makevord() {
        System.out.println("Работать в офисе");
    }
    final public void makevord(String vordd){
        System.out.println(vordd);
    }

    public String getinfo(){
        return "Age " + getAge() +
                "\nWork " + getWork() +
                "\nVacation days " + vacation.getKolichistva() +
                "Office " + getOffice();
    }
}
