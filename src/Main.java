public class Main {
    public static void main(String[] args) {
        String var = System.getenv("ENVIRONMENT_VAR");
        for (String part : var.split(" ")){
            System.out.println(part);
        }
    }
}
