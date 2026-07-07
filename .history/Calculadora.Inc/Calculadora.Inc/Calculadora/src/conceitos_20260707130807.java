@SuppressWarnings("all")
public class conceitos {
    
    // Lista com os nomes dos 15 conceitos
    String[] titulos = {
        "Lei de Ohm", 
        "If/Else", 
        "VPN", 
        "Hidráulica e Pneumática",
        "IoT (Internet das Coisas)", 
        "Computação em Nuvem", 
        "Big Data e Analytics",
        "Integração TI e TA", 
        "Robótica Autônoma", 
        "Gêmeos Digitais (Digital Twins)",
        "Manufatura Aditiva (Impressão 3D)", 
        "Realidade Aumentada (RA)", 
        "Segurança Cibernética",
        "Inteligência Artificial (IA)", 
        "Sistemas Cyber-Físicos"
    };

    // Lista com as explicações (na mesma ordem dos títulos)
    String[] descricoes = {
        "Determina que a corrente elétrica em um circuito é diretamente proporcional à tensão e inversamente proporcional à resistência.",
        "Estruturas de controle de fluxo que permitem que o programa tome decisões com base em condições lógicas.",
        "Virtual Private Network (Rede Privada Virtual), cria uma conexão segura e criptografada sobre a internet.",
        "Sistemas que utilizam fluidos sob pressão para gerar, controlar e transmitir potência.",
        "Conexão de objetos físicos (máquinas, sensores) à internet, permitindo coleta e troca de dados em tempo real.",
        "Fornecimento de serviços de computação (servidores, armazenamento, bancos de dados) pela internet.",
        "Análise de volumes massivos de dados para encontrar padrões ocultos e tomar decisões mais eficientes.",
        "A união entre a Tecnologia da Informação (redes e softwares corporativos) e a Tecnologia de Automação (chão de fábrica).",
        "Insira a explicação aqui...",
        "Insira a explicação aqui...",
        "Insira a explicação aqui...",
        "Insira a explicação aqui...",
        "Insira a explicação aqui...",
        "Insira a explicação aqui...",
        "Insira a explicação aqui..."
    };

    // Método que imprime o menu automaticamente baseado no tamanho da lista
    public void exibirMenu() {
        for (int i = 0; i < titulos.length; i++) {
            System.out.println((i + 1) + ". " + titulos[i]);
        }
    }

    // Método único que busca o conceito escolhido
    public void mostrarConceito(int opcao) {
        // Verifica se a opção digitada é válida (entre 1 e 15)
        if (opcao >= 1 && opcao <= titulos.length) {
            int index = opcao - 1; // No Java, os Arrays começam a contar do 0
            System.out.println("\n>> " + titulos[index].toUpperCase() + ":");
            System.out.println(descricoes[index]);
        } else {
            System.out.println("\nOpção inválida! Conceito não encontrado.");
        }
    }
}