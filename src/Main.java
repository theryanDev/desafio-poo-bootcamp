import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Curso curso1 = new Curso();
        System.out.print("Digite o título do primeiro curso: ");
        curso1.setTitulo(scanner.nextLine());
        System.out.print("Digite a descrição do primeiro curso: ");
        curso1.setDescricao(scanner.nextLine());
        System.out.print("Digite a carga horária do primeiro curso: ");
        curso1.setCargaHoraria(scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer

        Curso curso2 = new Curso();
        System.out.print("Digite o título do segundo curso: ");
        curso2.setTitulo(scanner.nextLine());
        System.out.print("Digite a descrição do segundo curso: ");
        curso2.setDescricao(scanner.nextLine());
        System.out.print("Digite a carga horária do segundo curso: ");
        curso2.setCargaHoraria(scanner.nextInt());
        scanner.nextLine();

        Mentoria mentoria = new Mentoria();
        System.out.print("Digite o título da mentoria: ");
        mentoria.setTitulo(scanner.nextLine());
        System.out.print("Digite a descrição da mentoria: ");
        mentoria.setDescricao(scanner.nextLine());
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        System.out.print("Digite o nome do bootcamp: ");
        bootcamp.setNome(scanner.nextLine());
        System.out.print("Digite a descrição do bootcamp: ");
        bootcamp.setDescricao(scanner.nextLine());
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        System.out.print("Digite o nome do primeiro desenvolvedor: ");
        devCamila.setNome(scanner.nextLine());
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        System.out.print("Digite o nome do segundo desenvolvedor: ");
        devJoao.setNome(scanner.nextLine());
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        scanner.close();
    }
}
