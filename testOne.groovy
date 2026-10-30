def testOne = "abc"
println(testOne)

testFun = { println("test fun") }
testFun()

println(args[0])

for (i in 0..<3) {
    println("for loop:" + i)
}

def array = [1, "a", "b"]
array.each {
    println("array each:" + it)
}
for (item in array) {
    println("array for" + item)
}

def map = [a: 123, b: 456]
map.each {
    println("map each:" + it.key + ":" + it.value)
}