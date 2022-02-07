fun main() {
    val guilherme = Vendedor()
    guilherme.nome = "Guilherme"
    guilherme.salario = 2000

    val evandro = Cliente()
    evandro.nome = "Evandro"
    evandro.cpf = "5555555"

    val celular = Fornecedor()
    celular.pordutos = "Celular"
    celular.cnpj = "2020500148"

    val pegasus = Transportadora()
    pegasus.nomeDaTransportadora = "Pegasus"
    pegasus.dataDaEntrega = "2022/05/27"

    val tv = Produto()
    tv.numero = 25
    tv.nome = "Tv"

    val computador = Venda()
    computador.valorTotal = 3600
    computador.nomePorduto = "computador"

    println(guilherme)
    println(evandro)
    println(celular)
    println(pegasus)
    println(tv)
    println(computador)

    println("Nome do vendedor da venda ${computador.nomePorduto} é o ${guilherme.nome}")
}
