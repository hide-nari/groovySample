import groovy.cli.commons.CliBuilder

// command only : groovy testSeven.groovy -d
def cli = new CliBuilder(usage: 'groovy testSeven.groovy [options]')

cli.d(longOpt: 'debug', 'デバッグ')

def options = cli.parse(args)

if (options.d) {
    println("デバッグモードが有効です")
    return
}

