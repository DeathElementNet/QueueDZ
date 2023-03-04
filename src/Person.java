public class Person {
    private String name;  //имя
    private String surname;  //фамилия
    private int tickets; //билеты

    public Person(String name, String surname, int tickets) { //создание человека с билетами
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }
    public int getTicketsAmount() {
        return tickets;
    }

    public String getName() {
        return name ;
    }

    public void setTicketsAmount(int tickets) {
        this.tickets = tickets;
    }

}