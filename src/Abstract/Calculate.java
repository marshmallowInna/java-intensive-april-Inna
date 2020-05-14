package Abstract;

import java.util.Objects;

public abstract class  Calculate {
    private String name;

    public Calculate() {
    }

    public Calculate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calculate)) return false;
        Calculate calculate = (Calculate) o;
        return getName().equals(calculate.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double Area();

    public abstract double Perimetr();

    public abstract void setName();

}






