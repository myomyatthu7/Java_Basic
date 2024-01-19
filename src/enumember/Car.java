package enumember;

enum Car {
    swift(200,2016),
    toyota(350,2017),
    Mercedes(1200,2018),
    Ford(1100,2017),
    Chevrolet(1000,2016);

    private final int price;
    private final int year;
    Car (int cost, int made) { // private is redundant in enum constructor
        // cannot public,protected in enum constructor
        this.price = cost;
        this.year = made;

    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
