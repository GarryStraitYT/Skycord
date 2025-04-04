package mods.parser

import com.discord.models.domain.ModelUserSettings

object RNThemeFix {

    /**
     * Discord started sending incompatible theme names, triggering a boot loop.
     */
    @JvmStatic
    fun fixThemeName(theme: String): String = when(theme) {
        ModelUserSettings.THEME_LIGHT,
        ModelUserSettings.THEME_DARK,
        ModelUserSettings.THEME_PURE_EVIL -> theme
        else -> ModelUserSettings.THEME_DARK
    }
}