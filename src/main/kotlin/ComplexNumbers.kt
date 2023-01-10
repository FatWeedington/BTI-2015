data class ComplexNumber(val real : Double,val img: Double){
    operator fun plus(other: Double)=
        ComplexNumber(real + other,img)

    operator fun plus(other: ComplexNumber)=
        ComplexNumber(real + other.real,img + other.img)

    operator fun minus(other: ComplexNumber)=
        ComplexNumber(real - other.real,img - other.img)

    operator fun minus(other: Double)=
        ComplexNumber(real - other,img)

    operator fun times(other: ComplexNumber)=
        ComplexNumber((real * other.real)- (img*other.img),(img * other.real) + (real * other.img))

    operator fun times(other: Double)=
        ComplexNumber(real * other,img * other)

}

    operator fun Double.minus(other: ComplexNumber)=
        ComplexNumber(-(other.real - this),-other.img)


    operator fun Double.plus(other: ComplexNumber)=
        ComplexNumber(other.real + this ,other.img)

    operator fun Double.times(other: ComplexNumber)=
        ComplexNumber(this*other.real,this* other.img)



