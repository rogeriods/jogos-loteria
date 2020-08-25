package br.com.rds.jogosloteria

import kotlin.random.Random

class GJRandomicos() {
    // Generate randomic games
    fun geraJogo(nJogo:Int, maxRange:Int):IntArray {
        val arInt = IntArray(nJogo)
        for (i in arInt.indices) {
            var nRandom:Int = (1..maxRange).shuffled().last()
            if (i != 0) {
                while (arInt.contains(nRandom)) {
                    nRandom = (1..maxRange).shuffled().last()
                }
            }
            arInt[i] = nRandom
        }
        arInt.sort()
        return arInt
    }

    // Return random heart's team
    fun timeDoCoracao():String {
        // Imutable variable 'val'
        val arTime = arrayOf<String>(
            "ABC/RN", "América/MG", "Améria/RJ", "América/RN", "Americano/RJ", "Atlético/GO",
            "Atlético/MG", "Atlético/PR", "Avaí/SC", "Bahia/BA", "Bangu/RJ", "Barueri/SP",
            "Botafogo/PB", "Botafogo/RJ", "Bragantino/SP", "Brasiliense/DF", "Ceará/CE",
            "Corinthians/SP", "Coritiba/PR", "CRB/AL", "Criciúma/SC", "Cruzeiro/MG", "CSA/AL",
            "Desportiva/ES", "Figueirense/SC", "Flamengo/RJ", "Fluminense/RJ", "Fortaleza/CE",
            "Gama/DF", "Goiás/GO", "Grêmio/RS", "Guarani/SP", "Inter Limeira/SP",
            "Internacional/RS", "Ipatinga/MG", "Ituano/SP", "Ji-Paraná/RO", "Joinville/SC",
            "Juventude/RS", "Juventus/SP", "Londrina/PR", "Marília/SP", "Mixto/MT", "Moto Clube/MA",
            "Nacional/AM", "Náutico/PE", "Olaria/RJ", "Operário/MS", "Palmas/TO", "Palmeiras/SP",
            "Paraná/PR", "Paulista/SP", "Paysandú/PA", "Ponte Preta/SP", "Port Desport/SP",
            "Remo/PA", "Rio Branco/AC", "Rio Branco/ES", "Rive/PI", "Roraima/RR", "Samp Corrêa/MA",
            "Santa Cruz/PE", "Santo André/SP", "Santos/SP", "São Caetano/SP", "São Paulo/SP",
            "S Raimundo/AM", "Sergipe/SE", "Sport/PE", "Treze/PB", "Tuna Luso/PA", "Uberlândia/MG",
            "U Barbarense/SP", "União S João/SP", "Vasco/RJ", "Vila Nova/GO", "Vila Nova/MG",
            "Vitória/BA", "XV Piracicaba/SP", "Ypiranga/AP"
        )
        return arTime[Random.nextInt(arTime.size)]
    }

    // Return random month of the array
    fun mesSorte():String {
        val arMonth = arrayOf<String>(
            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        )
        return arMonth[Random.nextInt(arMonth.size)]
    }

}