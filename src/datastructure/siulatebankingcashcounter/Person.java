package datastructure.siulatebankingcashcounter;

class Person {
    private String name;
    private int amount;
    private boolean isDeposit;

    public Person(String name, int amount, boolean isDeposit) {
        this.name = name;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isDeposit() {
        return isDeposit;
    }
}