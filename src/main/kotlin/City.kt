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
    var buildings = mutableListOf(building1,building3,building2,building3);

    fun show(){
        var lines:Array<String> = Array(7) { "" }
        for(b in buildings){
            var buildingLines = b.lines()
            for (i in 1..6){
                lines[i] = lines[i].plus(buildingLines[i])
            }
        }
        for(l in lines){
            println(l)
        }
    }

    fun addBuilding(s:String){
        buildings.add(s)
    }
}