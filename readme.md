# Design Patterns - Categoria Comportamental

Este repositório contém exemplos de Design Patterns na categoria comportamental, implementados em Java. Os Design Patterns são soluções reutilizáveis para problemas comuns no desenvolvimento de software. A categoria comportamental se concentra nos padrões que gerenciam as interações entre objetos e as responsabilidades atribuídas a eles.

## Padrões Implementados

### Padrão Strategy

O Padrão Strategy permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.

Exemplo de implementação: [link para o código-fonte](https://github.com/matielojg/designPatterns_Java/tree/3a2f7a5ded35f88c81dbc0c10722148af8067589)

Site: [Refactoring Guru](https://refactoring.guru/design-patterns/strategy)

### Padrão Chain of Responsibility

O Padrão Chain of Responsibility permite que você passe solicitações ao longo de uma cadeia de manipuladores, até que a solicitação seja tratada por um objeto adequado.

Exemplo de implementação: [link para o código-fonte](https://github.com/matielojg/designPatterns_Java/tree/78f88db52f7a3e45d8f53f4bf78ce2adcec14ede)

### Padrão State

Semelhante ao Strategy, com este padrão é possível que um objeto se comporte de formas diferentes, dependendo do seu estado. Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual.

Exemplo de implementação: [link para o código-fonte]()
Site: [Refactoring Guru](https://refactoring.guru/design-patterns/state)

### Padrão Observer

O Padrão Observer define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

Exemplo de implementação: [link para o código-fonte](/caminho/para/o/codigo/observer.java)

## Como Usar

Para executar qualquer um dos exemplos de design pattern, siga as instruções abaixo:

1. Clone este repositório em sua máquina local.

git clone https://github.com/matielojg/designPatterns_Java.git


2. Navegue até o diretório do padrão desejado.

cd br/com/matielo/produto


3. Compile o código-fonte.

javac TesteImpostos_Strategy.java


4. Execute o programa.

java TesteImpostos_Strategy


## Contribuindo

Se você deseja contribuir para este repositório, sinta-se à vontade para abrir um Pull Request. Certifique-se de descrever claramente sua contribuição e os padrões implementados ou melhorados.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE). Sinta-se à vontade para usar, modificar e distribuir o código presente neste repositório.









