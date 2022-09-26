const val building1 = """
     __ 
    |""|
    |""|
    |""|
    |""|
    "''""""

    const val building2 = """
       
     _ 
    |"|
    |"|
    |"|
    "'""""

    const val building3 = """
        
     __ 
    |""|
    |""|
    |""|
    "''""""

class City{
    private var buildings = mutableListOf(building1,building3,building2,building3);

    fun show():String{
        val lines:Array<String> = Array(7) { "" }
        for(b in buildings){
            val buildingLines = b.lines()
            for (i in 1..6){
                lines[i] += buildingLines[i]
            }
        }
        var result:String = ""
        for(l in lines){
            result += l.plus(System.lineSeparator())
        }
        return result
    }

    fun addBuilding(s:String){
        buildings.add(s)
    }
}