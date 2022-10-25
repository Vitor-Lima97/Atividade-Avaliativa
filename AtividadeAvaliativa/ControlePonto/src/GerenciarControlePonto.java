import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {

        Gerente gerente1 = new Gerente();
        gerente1.setLogin("Joao");
        gerente1.setSenha("1234");
        gerente1.setIdFunc(1);
        gerente1.setNome("Gerente Joao");
        gerente1.setEmail("V@v.com");
        gerente1.setDocumento("123.432.123-09");

        Secretaria secretaria1 = new Secretaria();
        secretaria1.setIdFunc(2);
        secretaria1.setNome("Secretaria Maria");
        secretaria1.setEmail("maria@h.com");
        secretaria1.setDocumento("123.543.234-09");
        secretaria1.setTelefone("(19)3887-0980");
        secretaria1.setRamal("2");

        Operador operador1 = new Operador();
        operador1.setNome("Operador ze");
        operador1.setIdFunc(2);
        operador1.setEmail("ze@ze.com");
        operador1.setDocumento("123.654.123-08");
        operador1.setValorHora(4.5);

        RegistroPonto registro1 = new RegistroPonto();
        RegistroPonto registro2 = new RegistroPonto();
        RegistroPonto registro3 = new RegistroPonto();
        RegistroPonto registro4 = new RegistroPonto();
        RegistroPonto registro5 = new RegistroPonto();
        RegistroPonto registro6 = new RegistroPonto();

        registro1.setFunc(gerente1);
        registro1.setIdRegPonto(1);
        registro1.setDataRegistro(LocalDate.now());
        registro1.setHoraEntrada(LocalDateTime.now());
        registro1.apresentarRegistroPonto();
        Thread.sleep(5000);
        registro2.setFunc(operador1);
        registro2.setIdRegPonto(2);
        registro2.setDataRegistro(LocalDate.now());
        registro2.setHoraEntrada(LocalDateTime.now());
        registro2.apresentarRegistroPonto();
        Thread.sleep(5000);
        registro3.setFunc(secretaria1);
        registro3.setIdRegPonto(3);
        registro3.setDataRegistro(LocalDate.now());
        registro3.setHoraEntrada(LocalDateTime.now());
        registro3.apresentarRegistroPonto();
        Thread.sleep(5000);
        registro1.setHoraSaida(LocalDateTime.now());
        registro1.apresentarRegistroPonto();
        Thread.sleep(5000);
        registro2.setHoraSaida(LocalDateTime.now());
        registro2.apresentarRegistroPonto();
        Thread.sleep(5000);
        registro3.setHoraSaida(LocalDateTime.now());
        registro3.apresentarRegistroPonto();


        System.out.println(ConsoleColors.GREEN + "CONCLUIDO COM SUCESSO. 20% DA NOTA ");
    }
    class ConsoleColors {
        public static final String GREEN = "\033[0;32m";   // GREEN
    }
}