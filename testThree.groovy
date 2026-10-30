class Person {
    String name
    int age
}

def person1 = new Person()
person1.name = "taro"
person1.age = 15
println(person1.name)
println(person1.age)
println(person1.getName())
println(person1.getAge())

def person2 = new Person(name: "taro", age: 15)
println(person2.getName())
println(person2.getAge())

person2.setName("jiro")
person2.setAge(14)
println(person2.getName())
println(person2.getAge())