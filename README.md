Mini projeto POO

Alunos:
Guilherme Santana Mendes - 202400050894;

Jeferson Gonzaga dos Santos Filho - 202400017890;

Davison de Jesus Santos - 202400050802;


Classe abstrata: Foi usado nos arquivos loja/model/produto/Produto.java e loja/model/cliente/Cliente.java, pois utilizamos produto e cliente como classes que serviam apenas de molde, e nenhum objeto era criado a partir deles.

Upcasting: Utilizamos em na Main.Java, pois precisávamos de arrays únicos que guardassem tipos de objetos independente de suas classes. 
ex: bdProduto guarda todos os produtos, independente de ser físico, digital ou perecível.

Downcasting:: Utilizamos no Main.java quando precisávamos acessar um método  exclusivo de uma classe filha que estava guardada em uma variável genérica.
ex: A variável produtoParaAlterar é do tipo produto, para podermos alterar o link de download (um método que só ProdutoDigital possui), primeiro verificamos se o produto é instanceof ProdutoDigital e depois fazemos o downcast (ProdutoDigital) produtoParaAlterar para ter acesso ao método .setLinkDownload().

Interface: Utilizamos a interface ICliente para a classe Cliente, ela irá servir como uma documentação clara do que seria "ser um cliente" no nosso sistema. Utilizamos a interface em cliente porque ela facilita os testes e a classe produto geralmente era a classe inicial chamada nos nossos cases dentro do arquivo Main.java , ela também ajudaria no futuro se precisassemos criar novos tipos de clientes pois essa nova classe também poderia implementar a nossa interface.

Basta rodar o Main.java e ir respondendo pelo terminal 
