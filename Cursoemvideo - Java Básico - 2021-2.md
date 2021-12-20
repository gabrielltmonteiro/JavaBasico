# 1. História do Java

## Contextualização
### O primeiro computador e a programação
Eniac foi o primeiro computador, a pré-programação era feita através de plugs e botões. Os primeiros computadores eram valvulados e o ENIAC não funcionava na base binária, era na base decimal. E isso fazia com a quantidade de válvulas fosse maior.
Não tinha como programar digitando comandos, não tinha uma linguagem de programação efetiva, até porque ele não tinha teclado. O painel de entrada era muito diferente, pelo que vi não tinha tela.
Com a evolução dos computadores, para computaodres de mesas, surgiram também as linguagens de alto nível. Alto nível quer dizer que será mais próximo do entendimento do ser humano, muito compreensível.
O computador só entende as microinstruções, a linguagem que ele foi programado pra entender.

### Computador de mesa e linguagem de alto nível (Pascal)
O Pascal foi utilizado como exemplo, e ele precisa de um compilador, que no caso foi o MS-DOS. A compilação ocorreu da seguinte maneira, o programador escreve o código em Pascal, o compilador (MS-DOS) transforma o código-fonte em um código executável, de baixo-nível, e esse cógdigo gerado o computador entenderá e irá executar. Se pegar o código gerado, só será executável em uma determinada plataforma, que é a plataforma em que foi compilado. Se quiser que o sistema funcione em várias outras plataformas, o mecanismo é outro.

## Linguagem C
### Compatibilidade (C)
 A linguagem C, por exemplo, tem código fonte, é muito legível e tem compiladores para diversas plataformas. Então, se pegar o código fonte da linguagem C e passar pelo compilador de outras plataformas, esses compiladores vão gerar resultados diferentes, ou seja, vão gerar códigos executáveis específicos para cada plataforma. 

Por isso, a linguagem C é considerada uma linguagem multiplataforma.

Na maioria dos casos esse código-fonte precisa de pequenas alterações, porque plataformas diferentes precisam de microinstruções diferentes.
Por conta de sua característica multiplataforma, o C foi muito utilizado e até hoje ainda é, para criar muitos softwares conhecidos, como por exemplo o Firefox.

### Firefox Multiplataforma (C)
O Firefox funciona em Windows, L-inux, Mac, Android e por aí vai.
E a chave para o Firefox funcionar em todas essas plataformas é a Multiplataforma da Linguagem C.

### Ao Mesmo Tempo Linguagem Antiga e Linguagem Moderna
Por ser muito utilizada até hoje, é muito injusto que a Linguagem C seja considerada uma Linguagem Antiga. O C evoluiu e também faz parte das linguagens modernas. 
A evolução do C é o C++, e esse ++ disrrespeito ao acréscimo da Orientação a Objeto a linguagem. A **orientação a objeto** é um conceito extremamente moderno.

## História do JAVA
### Sun Microsystems, GreenTeam e GreenTalk
Em 1990 a empresa chamada Sun microsystems tinha um projeto de interligar várias interfaces e fazer vários dispositivos diferentes trabalharem entre si, para isso utilizariam C++.
Na epóca não existiam microcontroladores automatos, e a linguagem C++ não foi suficiente para fazer isso, então tiveram que criar a própria linguagem. Dentro da empresa, a equipe responsável por isso ficou conhecida como GreenTeam, que criou uma linguagem para substituir o C++ nessa tarefa e batizou de GreenTalk.
### Oak, *7, Duke e casas inteligentes
Em pouco tempo, um ano depois, o GreenTalk se tornou um dos maiores projetos da Sun Microsystems e foi rebatizado de Oak. E logo, criou-se o StarSeven (*7). Um tela de mais ou menos 7 polegadas, antena de comunicação, microchip integrado, cartões inteligentes, entrada Jack (pra fone), dispositivos pra transmissão infravermelho, sistema de som integrado e uma tela sensível ao toque.
Para que fosse mais interativo foi criado um mascote chamado Duke. E basicamente você poderia controlar sua casa inteira apartir do StarSeven.
Controlava:
Eletrodomésticos e lâmpadas.
Nenhuma empresa se interessou pelo projeto e foi engavetada em 1992.
### HTML, WebRunner e Interatividade para Web
Em 1994 o Tim Bernears Lee estava criando a linguagem HTML e todas as tecnologias envolvidas. O invento de Tim veio para facilitar isso tudo, pois o HTML é uma linguagem interativa para web e o *7 era interativo, a linguagem Oak permitia a interatividade, então pensaram em unir tudo isso, surge então o projeto WebRunner.
WebRunner seria um navegador, mas em 1994 não existia nada disso, a proposta era criar interatividade para Web. Mas Oak já estavá registrado como outra tecnologia. Então tinham que dar outro nome.
### JAVA, HotJava
Rebatizado de JAVA, por conta de que o que mais animava a equipe era o Java coffee, gíria para café forte, por conta de um dos cafés mais fortes existentes ser os grãos produzidos nas ilhas de Java. O projeto WebRunner então virou HotJava.
A ideia era levar toda a interatividade da Linguagem Java, antigamente Oak, para a Web.
### Popularidade e o marketing por trás do JavaScript
A linguagem ficou muito famosa, deu um boom na mídia, todos falavam que Java era a linguagem do futuro, é a linguagem da interatividade, se você quiser ser programador aprenda Java agora, porque Java é o futuro.
Então uma das grandes empresas desenvolvedoras de navegador, a NetScape, resolveu entrar nessa jogada de marketing e lançou a linguagem JavaScript, que era pra ser LiveScript. São liguagens totalmente diferentes com funcionalidades e propostas totalmente distintas.
### Projeto Java Ring
A Sun quis criar interatividade externa, utilizando a web você poderia interagir com dispositivos externos, como por exemplo, controlar a sua televisão.
Um dos primeiros passos da Sun, foi criar um anel que substituiria suas senhas e faria configurações automáticas. Tudo em prol da proposta inicial de interação entre computador e dispositivos externos, com o Java.
### NASA
Um dos expoentes da interação entre computadores e dispositivos distantes é o projeto da NASA de enviar um robô para mapear o solo de Marte. Esse robô que estava lá em Marte se comunicava com os computadores aqui na Terra através da linguagem Java. A partir daí a linguagem passou por um grande processo de popularização.
### Código aberto, Sun, Oracle
Desde 2006 a liguagem Java é de código aberto. Outra grande mudança, foi que a Sun deixou de existir em 2009, foi vendida por 7,4 bilhões de dólares para a Oracle.
### Java nos Sistemas
Sistemas bancários no computador, cartões de crédito, smartchips, todos os softwares de celulares android, Facebook, Instagram e WhatsApp, são criados em Java.
O Sistema Android é livre também e é criado em C. Mas os Softwares pra Android, todos estão em Java.

   -ACABOU em 30:20-  

---
# Exercícios de Java #01 
Marketing do Educandus
Para a preparação dos Concursos da Marinha e da Aeronautica.
Entre 18 e 25 anos.

# Como Funciona a Linguagem Java
O Java, assim como o C, não é entendido pelo computador sem antes ser compilado. O compilador Java se chama JavaC, e o código gerado pelo JavaC não se chama executável como no C, mas sim Bytecode. O Bytecode também não é entendido pelo computador, isso porque é necessário mais um software intermdiário, a JavaVirtualMachine (JVM).
A JVM recebe o Bytecode, interpreta e gera um executável.
Resumo:
O código-fonte é enviado para o JavaC que compila e envia o Bytecode gerado para a JVM, que pode ser Linux, Windows ou Mac, tanto faz, a JVM recebe o Bytecode que será entendido por qualquer um dos Sistemas Opercaionais, por causa da JVM.
O código-fonte é compilado uma vez só e ele funciona em qualquer plataforma.
WORA
Write Once Run Anywhere
Escreva Uma vez e Execute em Qualquer lugar

### C x JAVA
C deve ser compilado em cada uma das plataformas que será executado. É Multiplataforma. 
Java pode ser compilado em qualquer plataforma e rodará em qualquer lugar. É Multiplataforma e WORA.

## Programadores Java e Usuários de Java
### JVM, JRE, JDK, JavaC e bytecode
Quem quer apenas Usar o Java vai usar o JRE, já quem quer Desenvolver pra Java vai usar o JDK.
JRE é Java Runtime Environment (Ambiente de Execução) e JDK significa Java Development Kit (Kit de Desenvolvimento).
JRE é composto por JVM e Bibliotecas, JVM é a máquina que fará com que o Bytecode seja enviado para o computador, já as Bibliotecas são as API's que poderá usar no seu programa pra que ele seja mais atrativo e com mais funcionalidades.

### Partes Internas da JVM
Existem muitos componentes dentro da JRVM e as mais importantes, por ordem de prioriade, são:  
#### Loader / Verificador
Loader é a parte interna da JVM que vai carregar o bytecode na memória da sua Máquina Virtual.
Verificador é responsável por verificar se esse código pode ser executado sem problema algum.
#### Interpretador / Gerenciador de Memória
Interpretador pega o Bytecode e transforma em Código Nativo da máquina em questão.
Gerenciador de Memória trata como os códigos e as variáveis serão tratadas na memória da JVM. Lembrando que a  JVM é como se fosse um computador virtual, então o computador JVM tem memória. o Gerenciador de memória não gerencia a memória do seu computador e sim da JVM.
#### Compilador JIT
JIT é Just In Time, pode ser algo como compilação em tempo de Execução. 

Explicação:
A JVM é tão inteligente que consegue perceber quais partes são mais importantes pra dentro do seu programa, pega esse código e já compila definitivamente dentro do bytecode, então, não precisará do JavaC pra essa parte que o interpretador JIT considerou importante.

Pelo Java ter uma camada de software a mais (JVM), as vezes o Java é considerado mais lento que o C, por exemplo.
O Compilador JIT surgiu pra ter um ganho de performance muito grande. 

## JDK
É bem mais completo que o JRE, pra começo de conversa, dentro do JDK já tem o JRE. Além disso, vem com a linguagem Java (JavaLang) e com o conjunto de ferramentas (JavaTools).
Dentro do JDK já tem o JRE porque quando fizer o programa você já vai querer executá-lo.
Ainda existem outras coisas dentro do JDK, esse é um apanhado geral.

### JavaTools
Dentro dele existem várias ferramentas:
## JavaC
É o compilador Java, ele transforma código-fonte em bytecode.
## Debugger
Permite que verifique como o programa está sendo executado em tempo real. Verificando e testando conteúdo de variáveis ou acesso ao Banco de Dados.
## APIs
Um conjunto com várias APIs de desenvolvimento que podem ser utilizadas.

Resumo:
Você vai usar o JDK, criar seu aplicativo, gerar uma versão de distribuição (bytecode) e vai entregar para o seu cliente, o seu cliente vai precisar do JRE porque vai precisar executar esse Bytecode.

   -ACABOU em 16:00-

# Exercícios de Java #02

### Marinha (CAP-PD)
Em relação à linguagem de programação Java, complete corretamente as lacunas das senteças abaixo, e assinale a opção correta.
O comando java do J2SE Development Kit executa um aplicativo e javac compila.Quando um programa é compilado, o arquivo produzido pelo compilador termina com a extensão  de arquivo .class que contém bytecodes que são executados pela JVM. 

### Aeronáutica (EAGS-SIN)
V ou F
()A área da memória requerida para operar com o programa compilado é menor que a requerida para a interpretação
()Um programa interpretado requer uma área de memória menor do que a do programa compilado
()O tempo para a execução interpretada é maior do que o tempo para a execução compilada
()Um programa compilado requer um tempo de execução maior do que um programa interpretado.

f - v - v - f Minha resposta
F - V - V - F Gabarito

#### compilador 
transforma código fonte em código objeto
Consome mais memória, porque o código todo estará na memória do computador. Porém ele já compilou, já traduziu, já gerou o código executável no final, então leva menos tempo pra ser executado.
#### linker/montador/assembler
transforma código objeto em executável
#### Interpretador
transforma o código fonte diretamente em executável, mas tem uma pequena diferença.
Ocupa menos memória, pois o interpretador pega cada linha, joga na memória e executa, depois de executada é apagada e dá lugar para outra instrução.

Resumo:
Compilador ocupa mais memória, mas executa em menos tempo.
Interpretador ocupa menos memória, mas executa em mais tempo.

### Aeronáutica (EAGS-SIN)
#### Algoritmo
Multiplicação base pela altura dividido pela constante 2.
b) área <- (base*altura)/2 correta

### Aeronáutica (EAGS-SIN)
Fórmula correta para calcular a média aritmética entre 4 notas, representadas pelas variáveis N1, N2, N3, N4.
d)(N1 + N2 + N3 + N4)/4 correta

# Instalando o JDK no seu Computador
### IDE
Integrated Development Environment
ou Ambiente de Desenvolvimento Integrado
Características e vantagens da IDE
- IDE é um editor completo
- Possui colorização de código
- Contém integração completa com Compilador, Linker e Debugger
- Desenvolver de maneira mais simples
- Gerador de código
- Ambiente de testes
- Facilita a distribuição

A IDE escolhida pela própria Sun como a oficial e a Oracle quando comprou, continuou com ela.
Netbeans possui integrações e wizards mais fáceis que o Eclipse.

#### Edições do JDK
### SE
Standard Edition ou Edição Padrão
Se for criar uma aplicação e precisa de janelas, ambientes ou controles padrões de sistemas operacionais de interface gráfica, use a JDK SE. 
### EE
Enterprise Edition ou Edição Empresarial
Se for criar aplicativos em janela, mas que utilizar acesso remoto, acesso a banco de dados gigantes, sistemas maiores que são utilizados em grandes empresas, baixe EE.
### ME
Micro Edition ou Micro Edição
Se for desenvolver alguma coisa menor, um controle de dispositivo portátil, aplicações pra celulares, smartphones ou smartwatchs, ME a versão criada pra você.

Resumo:
Use o SE pra programas simples em janelas, EE pra programas complexos com mais recursos e o ME caso queira uma edição portátil do seu aplicativo.

#### Necessidades
Precisamos do JDK, já que queremos desenvolver. E precisamos do JDK com a IDE NetBeans do Java SE.

# Aula 3 – Instalando o JDK no seu Computador
Após essa aula, você já tem instalado o Java SE (Edição Padrão), com a JDK do Java SE, com o Netbeans,Java FX e Java Docs.

# Exercícios de Java #03
Questões de algoritmos da Aeronáutica.
Assinale a expressão lógica com resultado verdade.
a) (x>5).E.(.NÃO.(Y<3))

Assinale o valor de x após a execução. Considere A=6, B=2, C=4, D=3.
Se .não.(A>6).e.não.(B<3)então
    x<-A/D
Senão
    x<-C*A
Fim_se
c)24

Marque qual o operador lógico usado na tabela.
f f f
v f v
f v v
v v v 
c).ou.

Considerando os tipos de dados, relcione as colunas e depois marque a correta.
(1)inteiros
(2)reais
(3)caracteres
(4)lógicos

(1)35; 0; -56
(4).F.;.V.
(3) "Rua Brigadeira Lyra"
(2) -0,5; 1,8; -4

d) 1,4,3,2
   -ACABOU em 9:00-

# Aula 4 – Primeiro Programa em Java
Todo o programa em Java podem ser compostos de pacotes. O primeiro comando que daremos no nosso programa é o comando de pacotes.

~~~Java
//pacote primeiroprograma
package primeiroprograma;
~~~

Para o primeiro programa é opcional!

O primeiro comando que toda a classe Java tem que ter, é justamente o cabeçalho da classe.

~~~Java
//public class NomeDaClasse
public class PrimeiroPrograma{
}
~~~

As chaves em várias linguagens, são blocos. Tudo que estiver entre as chaves são blocos. Uma classe em Java é considerada um bloco.
Dentro do bloco da classe criamos o método principal.

~~~Java
package primeiroprograma;
public class PrimeiroPrograma{
    //método principal
    public static void main(String[] args){
    }
}
~~~

Resumindo:
Então temos o método principal, dentro da classe PrimeiroPrograma, que faz parte do pacote primeiroprograma.


~~~Java
//pacote primeiroprograma
package primeiroprograma;
//public class NomeDaClasse
public class PrimeiroPrograma{
    //método principal
    public static void main(String[] args){
    }
}
~~~

Tenho métodos, as classes são compostas de métodos e posso ter várias classes dentro dos pacotes.
O método está dentro da classe e a classe faz parte de um pacote de classes.

### JAVA é Case Sensitive

O pacote é todo minúsculo
A classe é CamelCase
O método principal deve ser minúsculo

~~~Java
package primeiroprograma;
public class PrimeiroPrograma{
    public static void main(String[] args){
        //Primeiro comando
        System.out.print("Olá, Mundo!");
    }
}
~~~

~~~Java
package primeiroprograma;
import javax.swing.JOptionPane; //biblioteca necessária para criar painel com mensagem
public class PrimeiroPrograma {
    public static void main(String[] args) {
        //Num Pop up
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
        //No console
        System.out.println("Olá, Mundo!");
    }
}
~~~

### Case sensitive
O método main possui todas as letras minúsculas, mas não é um pacote, é um método, se tivesse mais uma palavra seria com a primeira letra Maiúscula.
No psvm o void indica que main se trata de um método.

#### Classe / Interface
Primeira letra maiúscula e o resto em Camel Case, ou é Classe ou é Interface

Nesse curso de Java Básico sempre será Classe, pois não veremos Interface.

Ex.: ClasseOuInterface

#### Atributo / Variável / Método
Primeira letra minúscula e o resto Camel Case, pode ser um Atributo, Variável e Método.

Ex.: atributoVariavelOuMetodo

#### Pacote
Todas as letras minúsculas, sempre é um pacote

Ex.: pacote

#### Constante
Todas as letras maiúsculas, sempre é CONSTANTE.

Ex.: CONSTANTE

~~~Java
System.out.println("Olá, Mundo!");
//System: primeira letra maiúscula, é uma Classe
//out: -
//println: minúsculas, é um método
~~~

System = Sistema
out = saída
println = imprima
() = o que tiver entre os parênteses é o parâmetro

Imprimir no sistema de saída:
Seja na tela do celular, do relógio, do computador ou qualquer outro dispositivo onde for executado.

### Duas Técnicas pra Mostrar o Olá, Mundo!
#### SmartPhone
Possui o Sistema Operacional Android escrito em C, mas suas aplicações são escritas em Java.
Então, na próxima aula, utilizaremos bibliotecas e APIs, como por exemplo, Swing e JavaFX.
   -ACABOU em 20:55-

# Exercícios de Java #04