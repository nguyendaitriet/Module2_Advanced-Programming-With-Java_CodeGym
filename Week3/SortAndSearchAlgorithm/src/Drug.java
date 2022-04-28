import java.util.Objects;

public class Drug implements Comparable<Drug>{
    private long id;
    private String drugName;
    private double price;

    public Drug(String drugName) {
        this.drugName = drugName;
    }

    public Drug(long id, String drugName, double price) {
        this.id = id;
        this.drugName = drugName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Drug o) {
        return this.drugName.compareTo(o.drugName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug drug = (Drug) o;
        return Objects.equals(drugName, drug.drugName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, drugName, price);
    }

    @Override
    public String toString() {
        return "'" + drugName+ "'";
    }
}
