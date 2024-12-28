# Builder Pattern - Sistema de Lanche

Este projeto demonstra o uso do padrão de design **Builder**, que é amplamente utilizado para construir objetos complexos de maneira clara e flexível. Utilizamos como exemplo a montagem de um sistema de **Lanches Personalizados**, onde cada lanche pode conter diferentes tipos de ingredientes e configurações.

---

## O que é o Builder Pattern?

O **Builder Pattern** (ou Padrão Construtor) é um padrão de design criacional que separa a construção de um objeto da sua representação final. Ele é especialmente útil quando:
- O objeto possui muitos atributos opcionais.
- O processo de criação é complexo e exige flexibilidade.
- Queremos evitar construtores com muitos parâmetros, que podem ser confusos e difíceis de usar.

### Benefícios do Builder:
- **Código mais legível**: A criação de objetos é feita de forma encadeada e intuitiva.
- **Flexibilidade**: Permite a construção de diferentes variações de um objeto de forma simples.
- **Imutabilidade**: Em muitos casos, o Builder facilita a criação de objetos imutáveis.

---

## Como implementamos o Builder?

### Estrutura do Projeto

- **Classe `Lanche`**: Representa o lanche final, com atributos como pão, carne, queijo e adicionais.
- **Classe `LancheBuilder`**: Fornece métodos para construir cada parte do lanche passo a passo e, ao final, retorna o objeto `Lanche`.
