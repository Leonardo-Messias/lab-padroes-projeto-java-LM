package subsistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void  gravarCliente(String nome, String cep, String estado, String ciadade){
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(ciadade);
        System.out.println(estado);
    }
}
