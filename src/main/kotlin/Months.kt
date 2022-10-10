enum class Month(var code:Int,var days:Int,var season:Season) {
    JANUARY(1,31,Season.WINTER),
    FEBRUARY(2,28,Season.WINTER),
    MARCH(3,31,Season.SPRING),
    APRIL(4,30,Season.SPRING),
    MAY(5,31,Season.SPRING),
    JUNE(6,30,Season.SUMMER),
    JULY(7,31,Season.SUMMER),
    AUGUST(8,31,Season.SUMMER),
    SEPTEMBER(9,30,Season.FAll),
    OCTOBER(10,31,Season.FAll),
    NOVEMBER(11,30,Season.FAll),
    DECEMBER(12,31,Season.WINTER);

    enum class Season{WINTER,SPRING,SUMMER,FAll}
}