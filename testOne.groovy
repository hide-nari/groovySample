def testOne = "abc"
println(testOne)

testFun = { println("test fun") }
testFun()

println(args[0])

def array = [1, 2, 3, "a", "b", "c"]
array.each {
    println(it)
}

def map = [a: 123, b: 456]
map.each {
    println(it.key + ":" + it.value)
}