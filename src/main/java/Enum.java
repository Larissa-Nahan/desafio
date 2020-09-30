public enum Enum {

    COD1("Teste 1"),
    COD2("Teste 2");

    private String value;

    Enum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
