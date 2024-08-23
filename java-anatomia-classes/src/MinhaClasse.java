public class MinhaClasse {
    public static void main(String[] args) throws Exception {
       String primeiroNome = "Vagner";
       String segundoNome = "Sampaio";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);   
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
