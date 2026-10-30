def testOne = "abc"
println(testOne)

testFun = { println("test fun") }
testFun()

def testOneFun(name = "taro") {
    println("testOneFun:" + name)
}

testOneFun()
testOneFun("jiro")
testOneFun(123)

def testTwoFun(Map param) {
    println(param.name + ":" + param.age)
}

println(testTwoFun(name: "jiro", age: 15))

def testThreeFun(name, age) {
    println("testThreeFun:" + name + ":" + age)
}

testThreeFun("jiro", 15)

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