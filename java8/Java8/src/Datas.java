import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasFranca = LocalDate.of(2024, Month.JUNE,26);
		
		int anos = olimpiadasFranca.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasFranca);


        LocalDate proximaOLimpiadas = olimpiadasFranca.plusYears(4);
        
        System.out.println(proximaOLimpiadas);
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String valorFormatado = proximaOLimpiadas.format(formatador);
        System.out.println(valorFormatado);
        
        DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHora));
        
        LocalTime intervalo = LocalTime.of(15,  30);
        System.out.println(intervalo);
		
	}

}
