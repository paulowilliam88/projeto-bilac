# Boas Práticas para Desenvolvimento
Esta página tem por objetivo reunir as boas práticas para o desenvolvimento, para garantir uma melhor legibilidade do código. De maneira geral, um código legível é objetivo, simples e de fácil compreensão, não possui duplicidades, é eficiente e faz apenas o que é proposto. Para auxiliar na busca por este resultado, a seguir serão descritas boas práticas que visam a criação de um código fonte de qualidade.

# Idioma de desenvolvimento
Todo o código deverá ser desenvolvido em português, salvo o uso de bibliotecas escritas em outro idioma e padrões de escrita de alguns arquivos descritos logo abixo. Esse padrão tem como objetivo facilitar o entendimento do código por todos, já que o português é a língua nativa dos integrantes do grupo.

# Convenção de nomeação de Campos
Os nomes de campos não públicos e não estáticos utilizam camelcase

Os campos finais públicos estáticos (constantes) são escritos com todas as letras maiúsculas, com palavras separadas com underlines
```
  public static final int SEGREDO_DA_VIDA_UNIVERSO_E_TUDO_MAIS = 42;
```

# Comentários e Documentação
Toda classe e método público não trivial que você escreve deve conter um comentário Javadoc com pelo menos uma frase descrevendo o que a classe ou o método faz. Esta frase deve começar com um verbo descritivo de terceira pessoa.
```
  /**
     * Realiza o backup de uma base de dados local. Obtém os dados do dispositivo e
     * faz a cópia em seu cartão de memória.
     * @param context
     * @throws IOException
     */
    public static final void backupBancoDados(Context context) throws IOException {

        File origem = new File("/data/data/" + context.getPackageName() + "/databases/", "backUP.db");
        File destino = new File(Environment.getExternalStorageDirectory(), FILE);
        org.apache.commons.io.FileUtils.copyFile(from, to);
    }
```
Lembrando que o nome e o conteúdo de um método devem tornar o uso dos comentários desnecessário.

# Escrita de Métodos
Sempre que possível, procure escrever métodos pequenos e focados. O método não deve fazer mais do que ele se propõe a fazer. Se um método exceder 40 linhas ou mais, pense se ele pode ser quebrado em outro(s) métodos sem prejudicar a estrutura do programa.

#Utilização de Anotações
Quando as anotações são aplicadas a uma classe, método ou construtor, eles são listados após o bloco de documentação e devem aparecer como uma anotação por linha
```
  /**Este é o bloco de documentação da classe */
  @AnotacaoA
  @AnotacaoB
  public class MinhaClasse {
  
  }
```

As anotações que se aplicam as variáveis/atributos devem ser declaradas uma por linha e imediatamente antes da declaração da variável.
```
  @Mock
  @Nullable 
  private String nome; 
```
