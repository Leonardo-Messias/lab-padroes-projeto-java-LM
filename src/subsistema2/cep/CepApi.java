package subsistema2.cep;

import one.digital.innovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Rio de Janeiro";
    }
    public String recuperarEstado(String cep) {
        return "São Paulo";
    }
}
