package com.example.exampractice

import com.example.exampractice.models.Category
import com.example.exampractice.models.News

class Constants {
        companion object{
        val categories = arrayListOf(
            Category(Categories.Animals.ordinal, R.string.animals),
            Category(Categories.Anime.ordinal, R.string.anime),
            Category(Categories.Chinese.ordinal, R.string.chinese))

        val news = arrayListOf(
            News(Categories.Animals.ordinal, "Пингвин смешно стоит", "URL", "Пингвин вынырнул из воды и встал на берег"),
            News(Categories.Animals.ordinal, "Капибара чиллит", "URL", "Капибара чиллит в ванне с мандаринами"),

            News(Categories.Anime.ordinal, "Моб и гигантская брокколи", "URl", "Второй сезон мп100 увенчался успехом"),
            News(Categories.Anime.ordinal, "Клинок рассекающий демонов переоценён", "URl", "Мнение независимого критика..."),

            News(Categories.Chinese.ordinal, "Второй сезон дуньхуа!?", "URl", "Фанаты в шоке!..."),
            News(Categories.Chinese.ordinal, "Рецепт тыквенных баоцзы", "URl", "Вкусно и просто!"))
    }
}
    enum class Categories(value: Int){
        Animals(1),
        Anime(2),
        Chinese(3)
}