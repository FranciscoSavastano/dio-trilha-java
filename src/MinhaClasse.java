public class MinhaClasse {
    public static void main (String [] args) {
        String nome = "Francisco";
        String sobrenome = "Pereira";

        String nomeCompleto = juntaNome(nome, sobrenome);
        System.out.print(nomeCompleto);
    }
    public static String juntaNome (String primeiroNome, String segundoNome){
            return primeiroNome + " " + segundoNome;
    }
}
