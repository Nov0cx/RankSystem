@file:JvmName("RankAPI")
package com.nov0cx.ranksystem.api

import com.nov0cx.ranksystem.api.rank.IRank
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

fun getRankAPI(): IRankAPI {

}

abstract class IRankAPI : JavaPlugin() {
    abstract fun getRank(player: Player): IRank
    abstract fun setRank(player: Player, rank: IRank)
}