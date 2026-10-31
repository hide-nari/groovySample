def testOne = "abc"
println(testOne)

testFun = { println("test fun") }
testFun()

closure = { name, age -> println("closure:" + name + ":" + age) }
closure("taro", 15)

closureOne = { println("closureOne:" + it) }
closureOne("closure param")

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
    println("for loop one:" + i)
}

for (i in 0..3) {
    println("for loop two:" + i)
}

for (def i : 0..3) {
    println("for loop three:" + i)
}

def number = 0;
3.times {
    number++
    println("times syntax:" + number)
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

def listOne = (1..10).grep { it % 2 == 0 }
println(listOne)

def listTwo = (1..10).collect { it * 2 }
println(listTwo)

strFlg = 3;
if (strFlg == 1) {
    println("one")
} else if (strFlg == 2) {
    println("two")
} else {
    println("default")
}

switch (strFlg) {
    case 1:
        println("one")
        break
    case 2:
        println("two")
        break
    default:
        println("default")
}

// no try catch
Thread.sleep(1000);

assert strFlg == 3 : "assert test"

