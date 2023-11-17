## DESIGN PATTERNS COM JAVA - ENTENDENDO PADRÕES DE PROJETOS


### S.O.L.I.D.

- Single Responsability Principle
- Open/Close Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

### DESIGN PATTERNS

O livro "Design Patterns: Elements of Reusable Object-Oriented Software," frequentemente chamado de "Gang of Four" (GoF), apresenta 23 padrões de projeto. Aqui está uma lista de todos os 23 padrões de projeto GoF:

**Padrões de Criação (Creational Patterns):**
1. **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância. ✅

2. **Factory Method**: Define uma interface para a criação de um objeto, mas permite às subclasses alterar o tipo de objetos que serão criados. ✅

3. **Abstract Factory**: Fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas. ✅

4. **Builder**: Separar a construção de um objeto complexo da sua representação, permitindo a mesma construção ser usada para criar diferentes representações. ✅

5. **Prototype**: Cria novos objetos copiando um objeto existente, conhecido como protótipo. ✅

**Padrões Estruturais (Structural Patterns):**

6. **Adapter**: Permite que objetos com interfaces incompatíveis trabalhem juntos. ✅

7. **Bridge**: Separa uma abstração de sua implementação, permitindo que ambas possam variar independentemente. ✅

8. **Composite**: Componha objetos em estruturas de árvore para representar hierarquias parte-todo.

9. **Decorator**: Anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível à herança para estender funcionalidades.

10. **Facade**: Fornece uma interface unificada para um conjunto de interfaces em um subsistema. Simplifica o uso de subsistemas complexos.

11. **Flyweight**: Minimiza o uso de objetos compartilhando parte de seu estado entre vários objetos.

12. **Proxy**: Fornece um substituto ou marcador de localização para outro objeto controlar o acesso a ele. ✅

**Padrões Comportamentais (Behavioral Patterns):**

13. **Chain of Responsibility**: Passa uma solicitação ao longo de uma cadeia de manipuladores. Cada manipulador decide se processa a solicitação ou a passa para o próximo manipulador na cadeia. ✅

14. **Command**: Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com solicitações, enfileirar solicitações e suportar operações desfazer. ✅

15. **Interpreter**: Fornece uma maneira de avaliar a linguagem gramatical ou expressões.

16. **Iterator**: Fornece uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor sua representação subjacente.

17. **Mediator**: Define um objeto que encapsula a maneira como um conjunto de objetos interage. Promove o baixo acoplamento entre objetos.

18. **Memento**: Captura e externaliza o estado interno de um objeto para que o objeto possa ser restaurado para esse estado mais tarde.

19. **Observer**: Define uma dependência um-para-muitos entre objetos, para que quando um objeto muda de estado, todos os seus observadores sejam notificados e atualizados automaticamente. ✅

20. **State**: Permite a um objeto alterar seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado sua classe.

21. **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Estratégia permite que o algoritmo varie independentemente dos clientes que o usam.

22. **Template Method**: Define o esqueleto de um algoritmo em uma operação, adiando alguns passos para subclasses. O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar sua estrutura.

23. **Visitor**: Representa uma operação a ser executada nos elementos de uma estrutura de objetos. Permite definir uma nova operação sem alterar as classes dos elementos em que opera. ✅

Cada um desses padrões de projeto aborda um problema específico de design de software e fornece uma solução testada e comprovada. Eles são amplamente usados na prática para melhorar a organização, flexibilidade e manutenibilidade do código.