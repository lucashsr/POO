class Conta(
    val titular: String,
    val numero: Int) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if(saldo < valor) return
        saldo -= valor
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo < valor) return false
        saldo -= valor
        destino.saldo += valor
        return true
    }
}