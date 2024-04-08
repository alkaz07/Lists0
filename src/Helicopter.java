public class Helicopter implements Comparable<Helicopter> {
    String name;
    int capacity;

    @Override
    public String toString() {
        return "Helicopter{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public Helicopter(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int compareTo(Helicopter o) {
        return this.name.compareTo(o.name);
    }


}
