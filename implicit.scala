implicit def v1 = 7
implicit def v3 = "8"
def pp(a:Int)(implicit i:Int) = println(a,i)
pp(2) //prints 2 and 7 since 7 is a type Int
