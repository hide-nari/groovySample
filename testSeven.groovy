import groovy.cli.commons.CliBuilder

// help : groovy testSeven.groovy -h
// command only : groovy testSeven.groovy -d
def cli = new CliBuilder(usage: 'groovy testSeven.groovy [options]')

cli.h(longOpt: 'help', 'ヘルプ')
cli.d(longOpt: 'debug', 'デバッグ')

def options = cli.parse(args)

if (options.h) {
    cli.usage()
    return
}

if (options.d) {
    println("デバッグモードが有効です")
    return
}

