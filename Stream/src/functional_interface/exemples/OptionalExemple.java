package functional_interface.exemples;

import java.util.Optional;

public class OptionalExemple {
    public static void main(String[] args) {
        of_value();
        ofNullable();
        empty();
        get();
        orElse();
        orElseGet();
        orElseThrow();
        ifPresent();
    }

    //Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.
    public static void of_value() {
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());
    }

    //Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.
    public static void ofNullable() {
        String nullableValue = null;
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue.isPresent());
    }

    //Retorna um Optional vazio (sem valor).
    public static void empty() {
        Optional<String> optionalValue = Optional.empty();
        System.out.println(optionalValue.isPresent());
    }

    //Verifica se o Optional contém um valor não nulo.
    public static void get() {
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());
    }

    //Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio
    public static void orElse() {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);
    }

    //Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.
    public static void orElseGet() {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);
    }

    //Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.
    public static void orElseThrow() {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
    }

    //Executa uma ação fornecida por um Consumer se o Optional contiver um valor.
    public static void ifPresent() {
        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}
