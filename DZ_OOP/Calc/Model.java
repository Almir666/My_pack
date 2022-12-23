package DZ_OOP.Calc;

public abstract interface Model<T extends Number> {
    T result();

    void setX(T value);
    void setY(T value);
}
