public class Principal {
    public static void main(String[] args) {
        Ingresso valor = new Ingresso(45.50f);
        IngressoVip valorAdicional = new IngressoVip(valor.getValor(),50f);

        System.out.println(valor.toString());
        System.out.println(valorAdicional.toString());
    }
}