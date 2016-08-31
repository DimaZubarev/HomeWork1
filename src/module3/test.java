package module3;

public class test {
    private String[] phones;

    public test(String[] phones) {
        this.phones = phones;
    }

    public String[] getPhones() {
        if (phones.length !=0)
        return phones;
        else return null;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }
}
