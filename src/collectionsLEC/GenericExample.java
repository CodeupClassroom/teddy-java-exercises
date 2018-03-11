package collectionsLEC;

public class GenericExample<T> {

    public T someValue;

    public GenericExample(T someValue) {
        this.someValue = someValue;
    }

    public T getSomeValue() {
        return this.someValue;
    }

    public void setSomeValue(T someValue) {
        this.someValue = someValue;
    }

}
