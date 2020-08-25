package br.com.rds.jogosloteria

class GLoteriaJogos {
    private val gjr = GJRandomicos()

    fun megaSena():String {
        val jogo:IntArray = gjr.geraJogo(6, 60)
        return "Jogo\n${jogo.contentToString()}"
    }

    fun duplaSena():String {
        val jogo:IntArray = gjr.geraJogo(6, 50)
        return "Jogo\n${jogo.contentToString()}"
    }

    fun lotofacil():String {
        val jogo:IntArray = gjr.geraJogo(15, 25)
        return "Jogo\n${jogo.contentToString()}"
    }

    fun lotomania():String {
        val jogo:IntArray = gjr.geraJogo(50, 100)
        return "Jogo\n${jogo.contentToString()}"
    }

    fun quina():String {
        val jogo:IntArray = gjr.geraJogo(5, 80)
        return "Jogo\n${jogo.contentToString()}"
    }

    fun timemania():String {
        val jogo:IntArray = gjr.geraJogo(10, 80)
        val timeCoracao:String = gjr.timeDoCoracao()
        return "Jogo\n${jogo.contentToString()}\n\nTime do Coração\n$timeCoracao"
    }

    fun diaDeSorte():String {
        val jogo:IntArray = gjr.geraJogo(7, 31)
        val mesSorte:String = gjr.mesSorte()
        return "Jogo\n${jogo.contentToString()}\n\nMês de Sorte\n$mesSorte"
    }

}