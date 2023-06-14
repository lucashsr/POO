fun main(args: Array<String>) {

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(100.0)

    val contaFran = Conta("Fran",  1001)
    contaFran.deposita(200.0)

    println(contaAlex.transfere(1000.0, contaFran))




}
