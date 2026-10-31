def mUser = System.getenv('mail_user')
println(mUser)

// groovy -Denv.target=prod testSix.groovy
def env = System.properties['env.target']

switch (env) {
    case 'test':
        println(env)
        break
    case 'staging':
        println(env)
        break
    case 'prod':
        println(env)
        break
    default:
        println("Unknown environment: $env")
        break
}