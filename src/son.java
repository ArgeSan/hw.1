public final class son extends father{
    private String school;
    private String typeOfComputer;

    public String getSchool() {
        return school;
    }

    public String getTypeOfComputer() {
        return typeOfComputer;
    }

    public son(int age, work work, vacation vacation, String office, String school, String typeOfComputer) {
        super(age, work, vacation, office);
        this.school = school;
        this.typeOfComputer = typeOfComputer;
    }

    @Override
    public void makevord() {
        super.makevord();
    }

    @Override
    public String getinfo() {
        return super.getinfo() + "school" + school +"typeOfComputer" + typeOfComputer;
    }
}
