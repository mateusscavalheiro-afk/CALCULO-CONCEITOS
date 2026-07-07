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
        /* 1. Lei de Ohm */
        "Determina que a corrente elétrica em um circuito é diretamente proporcional à tensão e inversamente proporcional à resistência.",
        
        /* 2. If/Else */
        "Estruturas de controle de fluxo na programação que permitem que o sistema tome decisões com base em condições lógicas predefinidas.",
        
        /* 3. VPN */
        "Virtual Private Network (Rede Privada Virtual). Cria uma conexão segura e criptografada sobre a internet para proteger a comunicação de dados industriais.",
        
        /* 4. Hidráulica e Pneumática */
        "Sistemas que utilizam fluidos (líquidos na hidráulica, gases na pneumática) sob pressão para gerar, controlar e transmitir força mecânica.",
        
        /* 5. IoT (Internet das Coisas) */
        "Conexão de objetos físicos (máquinas, sensores, motores) à internet, permitindo a coleta e troca de dados ininterrupta em tempo real no chão de fábrica.",
        
        /* 6. Computação em Nuvem */
        "Fornecimento de serviços de computação (servidores, armazenamento, bancos de dados e softwares) pela internet, permitindo acesso flexível e remoto aos dados da fábrica.",
        
        /* 7. Big Data e Analytics */
        "Coleta e análise de volumes massivos de dados gerados pelas máquinas para encontrar padrões de funcionamento, prever falhas e tomar decisões estratégicas.",
        
        /* 8. Integração TI e TA */
        "A união entre a Tecnologia da Informação (redes corporativas, ERPs) e a Tecnologia de Automação (chão de fábrica, CLPs, sensores), unificando a gestão da empresa.",
        
        /* 9. Robótica Autônoma */
        "Robôs dotados de inteligência para operar de forma independente, adaptar-se ao ambiente e trabalhar de forma colaborativa e segura ao lado de humanos (Cobots).",
        
        /* 10. Gêmeos Digitais (Digital Twins) */
        "Uma réplica virtual exata de um produto, máquina ou processo físico, usada para simular testes, prever desgaste e otimizar o desempenho antes de aplicar no mundo real.",
        
        /* 11. Manufatura Aditiva (Impressão 3D) */
        "Produção de peças complexas e personalizadas a partir de modelos digitais 3D, adicionando material camada por camada, reduzindo o desperdício industrial.",
        
        /* 12. Realidade Aumentada (RA) */
        "Tecnologia que sobrepõe informações digitais (como manuais, hologramas ou dados de sensores) no ambiente físico, auxiliando técnicos na montagem e manutenção.",
        
        /* 13. Segurança Cibernética */
        "Práticas, ferramentas e protocolos essenciais para proteger redes, sistemas de controle industrial e dados confidenciais contra ataques cibernéticos e invasões.",
        
        /* 14. Inteligência Artificial (IA) */
        "Algoritmos e sistemas computacionais capazes de simular o raciocínio humano, permitindo que as máquinas aprendam com dados operacionais e tomem decisões autônomas.",
        
        /* 15. Sistemas Cyber-Físicos */
        "A essência da Indústria 4.0: a integração total entre o mundo virtual (computação e redes) e o mundo físico, onde softwares monitoram e controlam os processos da máquina de forma autônoma."
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
            int index = opcao - 1;
            System.out.println("\n>> " + titulos[index].toUpperCase() + ":");
            System.out.println(descricoes[index]);
        } else {
            System.out.println("\nOpção inválida! Conceito não encontrado.");
        }
    }
}