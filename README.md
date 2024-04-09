# Lombok VS Record

## Lombok

O Lombok é uma biblioteca Java que visa reduzir a quantidade de código repetitivo e boilerplate em projetos, facilitando o desenvolvimento e a manutenção do código. Ele alcança isso através do uso de anotações que geram automaticamente código comum, como getters, setters, construtores, equals, hashCode e toString, durante a compilação.

Com o Lombok podemos adicionar anotações simples em suas classes para gerar automaticamente métodos e construtores, evitando a necessidade de escrever esses métodos manualmente. Isso ajuda a tornar o código mais limpo, conciso e legível, reduzindo a quantidade de código repetitivo e propenso a erros.

Além disso, o Lombok oferece suporte para diversas anotações que permitem personalizar o comportamento da geração de código, como @Builder para a criação de padrões de construtores complexos, @Data para gerar getters, setters, equals e hashCode, @NoArgsConstructor e @AllArgsConstructor para construtores sem argumentos e com todos os argumentos, entre outras.

Em resumo, o Lombok é uma ferramenta poderosa que ajuda os desenvolvedores a escrever menos código repetitivo, automatizando a geração de métodos comuns e simplificando o desenvolvimento de aplicações Java.

### Como funciona o uso do lombok em java ?

Lombok é uma biblioteca Java que visa a redução de código boilerplate, ou seja, código repetitivo e sem valor agregado, aumentando a produtividade dos desenvolvedores. Ele faz isso através de anotações que são processadas durante a compilação, gerando automaticamente métodos como getters, setters, construtores, equals, hashCode e toString.

Para utilizar o Lombok em um projeto Java, é necessário adicionar a dependência no arquivo pom.xml do Maven ou no build.gradle do Gradle, e instalar o plugin na IDE de desenvolvimento. 

```xml
<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
</dependency>

<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

Depois disso, basta adicionar as anotações desejadas nas classes do projeto, como @Getter, @Setter, @ToString, @EqualsAndHashCode, @Data, @Cleanup, @Synchronized, e @SneakThrows.

Por exemplo, a anotação @Getter gera automaticamente os métodos getters para os atributos da classe, enquanto a anotação @Setter gera os métodos setters. A anotação @ToString gera o método toString(), e a anotação @EqualsAndHashCode gera os métodos equals() e hashCode().

A anotação @Data é um atalho para as anotações @ToString, @EqualsAndHashCode, @Getter em todos os campos, e @Setter em todos os campos não-finais, além de gerar um construtor livre para inicializar os campos finais.

A anotação @Cleanup gerencia automaticamente os recursos, chamando o método close() sem problemas, e a anotação @Synchronized gera synchronizeds corretamente, sem expor os locks.

O Lombok é uma ferramenta muito útil para reduzir a quantidade de código repetitivo em projetos Java, aumentando a produtividade dos desenvolvedores e tornando o código mais limpo e enxuto.

### Quais são as anotações mais comuns usadas pelo lombok em java ?

Lombok é uma biblioteca Java que fornece anotações para reduzir a quantidade de código repetitivo em projetos Java. As anotações mais comuns usadas pelo Lombok são:

1. **@Getter**: gera métodos getter para os campos da classe.
2. **@Setter**: gera métodos setter para os campos da classe.
3. **@ToString**: gera o método toString() para a classe.
4. **@EqualsAndHashCode**: gera os métodos equals() e hashCode() para a classe.
5. **@Data**: é uma combinação das anotações @Getter, @Setter, @ToString, @EqualsAndHashCode, e gera métodos getter, setter, toString(), equals() e hashCode() para a classe.
6. **@Builder**: gera um padrão de construção de objetos usando o padrão Builder.
7. **@NonNull**: gera um erro de compilação se um parâmetro de método ou campo for nulo.
8. **@SneakyThrows**: permite lançar exceções sem declará-las no método.
9. **@Slf4j**: gera um logger para a classe usando a biblioteca SLF4J.

Essas anotações podem ser usadas em conjunto para gerar automaticamente os métodos comuns de uma classe Java, reduzindo a quantidade de código repetitivo e aumentando a produtividade. Além disso, o Lombok também oferece outras anotações menos comuns, mas igualmente úteis em certos cenários.

## Record

O Records é uma funcionalidade introduzida no Java 14 que permite a criação de classes de dados de forma mais simples e concisa, reduzindo a necessidade de escrever código repetitivo. Ao declarar um tipo como record, o desenvolvedor expressa a intenção de que o novo tipo serve para representar dados. A sintaxe para declarar um record é muito mais simples do que a declaração habitual de uma classe, eliminando a necessidade de sobrescrever métodos como equals, hashCode e toString. Records são imutáveis por padrão e são uma forma nativa da linguagem Java para lidar com classes de dados.

Além disso, os Records possuem algumas restrições, como não permitir a extensão de uma classe do tipo Record, não permitir a adição de novos atributos e construtores, e não permitir a declaração de campos de instância. No entanto, é possível adicionar anotações, métodos e variáveis estáticas a um Record.

Em resumo, o Java Records é uma funcionalidade poderosa que simplifica a criação de classes de dados em Java, proporcionando uma maneira mais eficiente e clara de lidar com objetos imutáveis e transparentes.

### O record do Java não precisa dos métodos getters e setters ?

O record do Java não precisa dos métodos getters e setters, pois eles são gerados automaticamente pelo compilador. Isso é uma escolha de design para reduzir a quantidade de código repetitivo e promover a imutabilidade, já que os records são imutáveis por padrão. A utilização de getters e setters explícitos é uma prática comum em Java, mas não é necessária pela linguagem. A decisão de utilizá-los ou não depende das necessidades específicas da aplicação e dos princípios de design adotados pela equipe de desenvolvimento. No contexto dos records do Java, a utilização de getters e setters explícitos é desencorajada, pois vai contra o princípio de simplicidade e imutabilidade que os records buscam promover.

### Como funciona o uso do record em java ?

O uso do Record em Java envolve a criação de classes de dados de forma simplificada e concisa, reduzindo a necessidade de escrever métodos como getters, setters, equals e hashCode manualmente. Ao declarar um tipo como Record, o desenvolvedor expressa a intenção de que esse tipo serve para representar dados. A sintaxe para declarar um Record é mais simples do que a declaração habitual de uma classe, eliminando a necessidade de sobrescrever métodos comuns.

Um Record é uma classe abstrata que exige que as classes que a estendem possuam atributos finais e privados para cada componente declarado, um construtor público que inicializa cada atributo do Record e métodos de acesso públicos para cada componente. Esses membros são obrigatórios para garantir a integridade e imutabilidade dos Records.

É importante destacar que os Records são uma feature de prévia de linguagem, o que significa que, embora estejam totalmente implementados, ainda não são padrão na JDK e é necessário habilitar o compilador para utilizá-los. Além disso, por ser uma feature de prévia, existe a possibilidade de ser atualizada ou removida nas próximas versões do Java.

Em resumo, o uso do Record em Java simplifica a criação de classes de dados imutáveis e transparentes, proporcionando uma maneira mais eficiente e clara de lidar com objetos de dados.

### Como declarar um record em java ?
Para declarar um Record em Java, você precisa utilizar a palavra-chave `record` seguida pelo nome do Record e seus componentes. Os componentes são os atributos que compõem o Record e devem ser declarados como se fossem variáveis locais. Além disso, é necessário declarar o construtor da classe, que é declarado como se fosse um método.

Um exemplo de declaração de um Record em Java seria:

```java
public record Pessoa(String nome, int idade) {}
```

Neste exemplo, foi criado um Record chamado `Pessoa` que possui dois campos: `nome` e `idade`. O Record acima é equivalente à declaração de uma classe convencional com os mesmos atributos, construtor, métodos `equals()`, `hashCode()` e `toString()`.

A declaração de um Record em Java é simples e direta, permitindo a criação de classes de dados imutáveis de forma concisa e eficiente.


### Como acessar os campos de um record em java ?

Para acessar os campos de um record em Java pode usar os métodos `get()` que são automaticamente gerados para cada campo do record. Por exemplo, se você tiver um record chamado `Pessoa` com os campos `nome` e `idade`, você pode acessá-los usando `pessoa.nome()` e `pessoa.idade()` respectivamente. Os métodos de acesso para um record são gerados com o mesmo nome dos campos, então você não precisa usar o prefixo `get` para acessá-los.

Exemplo simples de código em Java que demonstra como acessar os campos de um record:

```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println(pessoa.nome());
        System.out.println(pessoa.idade());
    }
}
```

No exemplo acima foi criado um novo record `Pessoa` com o nome "João" e idade 30, e depois imprimimos os valores dos campos `nome` e `idade` usando os métodos `nome()` e `idade()` respectivamente.

É importante notar que os métodos de acesso para um record são gerados como públicos, então pode acessá-los de qualquer código que tenha acesso ao objeto record. Além disso, os campos de um record são automaticamente finais e privados, então eles não podem ser modificados diretamente.

Para declarar um record em Java, você pode usar a palavra-chave `record` seguida pelo nome do record e seus campos, assim como você faria com uma classe regular. Por exemplo:

```java
public record Pessoa(String nome, int idade) {
    // Construtor opcional ou métodos podem ser adicionados aqui
}
```

No exemplo acima, declaramos um record `Pessoa` com os campos `nome` e `idade`. Também podemos adicionar um construtor opcional ou métodos ao record, se necessário.

No geral, os records são uma maneira conveniente de declarar classes de dados simples em Java, e eles podem ajudar a reduzir a quantidade de código de repetição necessária para definir métodos getter e setter para cada campo. No entanto, eles podem não ser adequados para todos os casos de uso, especialmente quando mais comportamento complexo for necessário.

### Quais são os campos que podem ser declarados em um record em java ?

Em um Record em Java, os campos são declarados como componentes do Record. Os campos que podem ser declarados em um Record são:

1. **Atributos**: Os atributos representam os dados que o Record irá armazenar. Eles podem ser de qualquer tipo de dado válido em Java, como inteiros, strings, objetos, entre outros.

2. **Final e Privado por Padrão**: Os campos de um Record são automaticamente final e privados, o que significa que eles não podem ser modificados após a criação do Record e não são acessíveis diretamente de fora da classe.

3. **Construtor**: Um construtor é gerado automaticamente para inicializar os campos do Record. Esse construtor recebe todos os campos como parâmetros e é utilizado para criar instâncias do Record.

4. **Métodos de Acesso**: Métodos de acesso, como `getters`, são gerados automaticamente para cada campo do Record. Esses métodos permitem acessar os valores dos campos de forma segura e controlada.

5. **equals(), hashCode() e toString()**: Métodos como `equals()`, `hashCode()` e `toString()` são gerados automaticamente para o Record. O método `equals()` compara dois Records para igualdade, `hashCode()` retorna um código hash do Record e `toString()` retorna uma representação em string do Record.

Em resumo, os campos que podem ser declarados em um Record em Java são os atributos que representam os dados do Record, sendo automaticamente final e privados, com um construtor gerado automaticamente, métodos de acesso para cada campo e métodos comuns como `equals()`, `hashCode()` e `toString()` também gerados automaticamente.

#### Exemplo de campos que podem ser declarados:

1. **Atributos**:
   - Vamos declarar um Record chamado `Pessoa` com os seguintes atributos:
     - `nome` do tipo `String`
     - `idade` do tipo `int`

```java
public record Pessoa(String nome, int idade) {}
```

2. **Final e Privado por Padrão**:
   - Os campos do Record são automaticamente final e privados, então não precisamos declará-los explicitamente como tal.

3. **Construtor**:
   - Um construtor é gerado automaticamente para inicializar os campos do Record. Podemos criar uma instância do Record da seguinte forma:

```java
Pessoa pessoa = new Pessoa("Alice", 25);
```

4. **Métodos de Acesso**:
   - Os métodos de acesso, como `getters`, são gerados automaticamente para cada campo. Podemos acessar os valores dos campos da seguinte maneira:

```java
String pessoaNome = pessoa.nome();
int pessoaIdade = pessoa.idade();
```

5. **equals(), hashCode() e toString()**:
   - Métodos como `equals()`, `hashCode()` e `toString()` são gerados automaticamente. Podemos usá-los da seguinte forma:

```java
System.out.println(pessoa.equals(new Pessoa("Alice", 25)));
System.out.println(pessoa.hashCode());
System.out.println(pessoa.toString());
```

---

# Autor
## Feito por: `Daniel Penelva de Andrade`