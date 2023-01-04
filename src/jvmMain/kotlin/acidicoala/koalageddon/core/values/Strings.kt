package acidicoala.koalageddon.core.values

sealed class Strings(
    val checkForUpdates: String,
    val language: String,
    val languageEn: String = "English",
    val languageRu: String = "Русский",
    val settings: String,
    val storeSteam: String = "Steam",
    val theme: String,
    val themeDark: String,
    val themeLight: String,
) {
    object English : Strings(
        checkForUpdates = "Check for updates",
        language = "Language",
        settings = "Settings",
        theme = "Theme",
        themeDark = "Dark",
        themeLight = "Light",
    )

    object Russian : Strings(
        checkForUpdates = "Проверить обновления",
        language = "Язык",
        settings = "Настройки",
        theme = "Тема",
        themeDark = "Тёмная",
        themeLight = "Светлая",
    )
}

