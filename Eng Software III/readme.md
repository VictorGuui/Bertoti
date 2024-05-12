## Strategy


<h2>Padrões de Design Patterns</h2>

<table>
    <tr>
        <th>Tipos de Padrões</th>
        <th>Antipadrões</th>
        <th>Definição</th>
        <th>O que resolve</th>
        <th>Funcionalidades em Java</th>
    </tr>
    <tr>
        <td>Strategy</td>
        <td>Switch Statements (Declarações Switch): O uso excessivo de instruções switch/case para selecionar a estratégia a ser usada pode levar a um código difícil de manter, pois novas estratégias exigirão modificações no código existente.</td>
        <td>O Padrão Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Ele permite que o cliente escolha um algoritmo específico de uma família de algoritmos durante o tempo de execução, sem alterar a estrutura do código.</td>
        <td>O Padrão Strategy resolve o problema de escolher e trocar algoritmos dinamicamente. É útil quando você tem diferentes algoritmos que podem ser usados em um contexto específico e deseja permitir que o cliente escolha qual algoritmo usar durante o tempo de execução, sem modificar o código cliente.</td>
        <td>Java Comparable/Comparator: A interface java.lang.Comparable e a interface java.util.Comparator são usadas para implementar o Padrão Strategy em Java. Elas permitem que você defina estratégias de comparação personalizadas para objetos, permitindo que os objetos sejam classificados de maneira flexível.</td>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Observers Everywhere (Observadores em Todo Lugar): Quando você cria um grande número de observadores ou torna cada classe observável, isso pode levar a uma complexidade excessiva e dificuldade em rastrear todas as dependências.</td>
        <td>O Padrão Observer é um padrão comportamental que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto sofre uma mudança de estado, todos os seus dependentes são notificados e atualizados automaticamente. É usado para implementar sistemas de eventos e publicação-subscrição.</td>
        <td>O Padrão Observer lida com o problema de estabelecer uma comunicação eficiente entre objetos quando um objeto muda de estado e vários outros objetos precisam ser notificados e atualizados automaticamente. É usado quando você precisa implementar sistemas de eventos, notificações ou publicação-subscrição.</td>
        <td>Event Handling (Manipulação de Eventos): A API de manipulação de eventos em Java, como o uso de listeners e a classe java.util.Observable, implementa o Padrão Observer. Componentes gráficos como botões e caixas de seleção podem ser observados por ouvintes que respondem a eventos, como cliques ou alterações de estado.</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Unintentional Complexity (Complexidade Não Intencional): Um erro comum é adicionar métodos que não fazem sentido em um componente composto, o que pode levar a uma interface inchada e complicada.</td>
        <td>O Padrão Composite é um padrão estrutural que permite que você componha objetos em uma estrutura de árvore para representar hierarquias de parte-todo. Ele permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.</td>
        <td>O Padrão Composite resolve o problema de criar estruturas de objetos hierárquicas e compostas. É útil quando você precisa tratar objetos individuais e composições de objetos de maneira uniforme, permitindo que você construa árvores de objetos onde cada objeto pode ser tratado da mesma forma, independentemente de ser um objeto simples ou uma composição complexa.</td>
        <td>Swing GUI Components (Componentes GUI Swing): A biblioteca Swing em Java usa o Padrão Composite para criar interfaces gráficas de usuário. Os componentes Swing, como painéis, botões e caixas de seleção, são organizados em uma hierarquia de composição, onde um contêiner pode conter outros componentes.</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>God Class (Classe Deus): O antipadrão "God Class" ocorre quando a classe Facade se torna uma classe gigante que lida com quase todas as operações do sistema. Isso viola o princípio de responsabilidade única e pode tornar o sistema difícil de entender e manter.</td>
        <td>O Padrão Facade é um padrão estrutural que fornece uma interface simplificada para um conjunto mais amplo de interfaces em um subsistema. Ele visa ocultar a complexidade do sistema e fornecer um ponto de entrada único e fácil de usar para os clientes.</td>
        <td>O Padrão Facade aborda o problema de simplificar interfaces complexas ou subsistemas. Ele fornece uma interface única e simplificada para um conjunto mais amplo de interfaces em um subsistema, ocultando a complexidade do sistema subjacente. Isso torna mais fácil para os clientes interagirem com o sistema sem precisar entender sua complexidade interna.</td>
        <td>Java Database Connectivity (JDBC): A API JDBC em Java fornece uma fachada para interagir com bancos de dados. Em vez de lidar diretamente com detalhes de conexão e gerenciamento de consultas, você pode usar métodos simplificados da API JDBC para executar operações de banco de dados.</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>Global State (Estado Global): Ao usar o Singleton de forma excessiva, você pode criar um estado global compartilhado que dificulta a rastreabilidade das dependências e pode levar a problemas de concorrência em sistemas multi-threaded.</td>
        <td>O Padrão Singleton é um padrão de criação que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. É útil quando você deseja compartilhar uma única instância de uma classe em todo o sistema e controlar o acesso a essa instância.</td>
        <td>O Padrão Singleton resolve o problema de garantir que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. É útil quando você deseja controlar o acesso a uma única instância de uma classe em todo o sistema, como configurações globais, conexões de banco de dados ou recursos compartilhados, evitando a criação de múltiplas instâncias acidentais.</td>
        <td>Runtime Environment (Ambiente de Execução): O ambiente de execução Java (JVM) é uma implementação do Padrão Singleton. Garante que apenas uma instância da máquina virtual Java seja criada em um processo. Além disso, a classe java.lang.Runtime é uma fachada singleton que fornece acesso ao ambiente de execução em tempo de execução, permitindo operações como coleta de lixo e execução de comandos do sistema.</td>
    </tr>
</table>

</body>
</html>