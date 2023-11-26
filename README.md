# Manual de Utilização - Sistema de Pedidos e Pratos

Este manual fornece instruções sobre como configurar, compilar e executar o Sistema de Pedidos e Pratos. Certifique-se de ter o ambiente de desenvolvimento configurado corretamente, incluindo o Apache Tomcat e um banco de dados PostgreSQL.

Configuração do Ambiente
Java Development Kit (JDK):
Certifique-se de ter o JDK instalado em seu sistema. Você pode baixar a versão mais recente em Java SE Downloads.

Apache Tomcat:
Faça o download e instale o Apache Tomcat em Apache Tomcat Download.

PostgreSQL:
Instale o PostgreSQL em PostgreSQL Downloads. Crie um banco de dados chamado "Projeto" e configure um usuário "postgres" com senha "1234".

Configuração do Projeto
Clonar o Repositório:
Clone o repositório do projeto para o seu ambiente local.

bash
Copy code
git clone https://github.com/seu-usuario/projeto-pedidos-pratos.git
Configurar o Banco de Dados:
No arquivo util/ConnectionFactory.java, ajuste a URL, usuário e senha de acordo com as configurações do seu banco de dados PostgreSQL.

java
Copy code
private static final String URL = "jdbc:postgresql://localhost:5432/Projeto";
private static final String USUARIO = "postgres";
private static final String SENHA = "1234";
Compilar o Projeto:
Utilize uma IDE Java, como Eclipse ou IntelliJ, para importar o projeto e compilá-lo.

Implantar no Apache Tomcat:
Após a compilação, implante o projeto no Apache Tomcat. Copie o arquivo WAR gerado para a pasta webapps do Tomcat.

Execução do Sistema
Iniciar o Apache Tomcat:
Inicie o Apache Tomcat executando o script startup.sh (Linux) ou startup.bat (Windows) na pasta bin do Tomcat.

bash
Copy code
./startup.sh
Acessar o Sistema:
Abra um navegador da web e acesse o sistema através do seguinte endereço:

bash
Copy code
http://localhost:8080/nome-do-projeto
Substitua "nome-do-projeto" pelo nome do arquivo WAR implantado.

Utilizar o Sistema:
Explore as funcionalidades do sistema, incluindo a adição de pedidos e pratos. Utilize as páginas JSP correspondentes para interagir com o banco de dados PostgreSQL.

Encerrar o Apache Tomcat:
Após a utilização, encerre o Apache Tomcat executando o script shutdown.sh (Linux) ou shutdown.bat (Windows) na pasta bin do Tomcat.

bash
Copy code
./shutdown.sh
Considerações Finais
Este manual fornece instruções básicas para configurar e utilizar o Sistema de Pedidos e Pratos. Certifique-se de seguir as configurações específicas do seu ambiente, como variáveis de ambiente, configurações do PostgreSQL e detalhes específicos do seu projeto.

Para mais informações ou suporte, consulte a documentação do Apache Tomcat, PostgreSQL e Java.
