data class ComplexNumber(val real : Double,val img: Double)
    operator fun ComplexNumber.minus(other: ComplexNumber)=
        ComplexNumber(real - other.real,img - other.img)

    operator fun ComplexNumber.minus(other: Double)=
        ComplexNumber(real - other,img)

    operator fun Double.minus(other: ComplexNumber)=
        ComplexNumber(other.real - this,other.img)
    operator fun ComplexNumber.plus(other: ComplexNumber)=
        ComplexNumber(real + other.real,img + other.img)

    operator fun Double.plus(other: ComplexNumber)=
        ComplexNumber(other.img ,other.real + this)

    operator fun ComplexNumber.plus(other: Double)=
    ComplexNumber(real + other,img + other)

    operator fun ComplexNumber.times(other: ComplexNumber)=
        ComplexNumber(real + other.real- (this.img*other.img),img * other.real + real * other.img  )

    operator fun ComplexNumber.times(other: Double)=
        ComplexNumber(real * other,img * other)

    operator fun Double.times(other: ComplexNumber)=
        ComplexNumber(this*other.real,this* other.img)



