# Aplicativo de Cadastro de Funcionários

Esta é uma aplicação Java local que permite cadastrar funcionários informando os seguintes dados:
- Nome
- CPF
- Matrícula
- Salário
- Setor
- Função

As informações dos funcionários cadastrados são armazenadas em um arquivo JSON para persistência.

## Requisitos do Sistema
- Java 8 ou superior instalado.
- Diretório `C://temp/leonardo` criado previamente na máquina onde a aplicação será executada. Este é o local onde o arquivo JSON com os dados será salvo.

## Bibliotecas Utilizadas
A aplicação utiliza as seguintes bibliotecas para manipulação de JSON:

1. **jackson-annotations**
   - URL de download: [https://github.com/FasterXML/jackson-annotations](https://github.com/FasterXML/jackson-annotations)

2. **jackson-core**
   - URL de download: [https://github.com/FasterXML/jackson-core](https://github.com/FasterXML/jackson-core)

3. **jackson-databind**
   - URL de download: [https://github.com/FasterXML/jackson-databind](https://github.com/FasterXML/jackson-databind)

Essas bibliotecas são usadas para serializar os dados dos funcionários para JSON e para deserialização, se necessário.

## Instalação e Execução
1. Certifique-se de que o diretório `C://temp/leonardo` existe no sistema.
2. Baixe e adicione as bibliotecas mencionadas ao `classpath` do seu projeto Java.
3. Compile e execute a aplicação com um ambiente de desenvolvimento Java ou pelo terminal usando os comandos:

```bash
javac -cp .;path/to/jackson-annotations.jar;path/to/jackson-core.jar;path/to/jackson-databind.jar Main.java
java -cp .;path/to/jackson-annotations.jar;path/to/jackson-core.jar;path/to/jackson-databind.jar Main
```

(Substitua `path/to/` pelos caminhos reais dos arquivos JAR das bibliotecas no seu sistema.)

## Estrutura do JSON
O arquivo JSON gerado pela aplicação segue o seguinte formato:

```json
[
{
  "id" : "43b265e3-6567-4143-91da-ab53b8d5109b",
  "nome" : "LEONARDO FELIPE",
  "cpf" : "11111111111",
  "matricula" : "11111111",
  "salario" : 5300.0,
  "funcao" : {
    "id" : "e80f98c8-8af1-4db0-bd02-67eb29c35bcc",
    "nome" : "DESENVOLVEDOR"
  },
  "setor" : {
    "id" : "01ff6db3-0fb3-44d8-8eb3-40bd96c78820",
    "descricao" : "SISTEMAS-60"
  }
}{
  "id" : "10a79c22-a22d-4f94-865f-4bc0410b4a48",
  "nome" : "LEO SANTOS",
  "cpf" : "22222222222",
  "matricula" : "22222222",
  "salario" : 23000.0,
  "funcao" : {
    "id" : "2c3dbdd5-f0d7-4079-8b0f-b3fe953261d5",
    "nome" : "GERENTE DE PROJETOS"
  },
  "setor" : {
    "id" : "df252189-5c6a-4f14-b098-e138c7c23cc7",
    "descricao" : "SISTEMAS-60"
  }
}
]
```

## Funcionalidades Futuras
- Validação de dados de entrada (e.g., formato do CPF).
- Interface gráfica para cadastro.
- Integração com bancos de dados.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas no repositório.

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

