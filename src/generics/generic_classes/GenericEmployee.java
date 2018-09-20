package generics.generic_classes;

/**
 * Пример обобщенного класса работника
 * В именах переменных типа принято употреблять прописные буквы и стремиться к их
 * краткости. Так, в стандартной библиотеке Java буквой E обозначается тип элемента коллекции,
 * буквами K и V — типы ключей и значений в таблице, а буквой T (и соседними буквами S и U при
 * необходимости) — "любой тип вообще", как поясняется в документации.
 */
public class GenericEmployee<T, U> {

    private T id;

    private T salary;

    private U age;

    public GenericEmployee() {
    }

    public GenericEmployee(T id, T salary, U age) {
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

