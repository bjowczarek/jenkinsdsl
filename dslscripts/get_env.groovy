env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }
echo(System.getenv().collect({environmentVariable ->  "${environmentVariable.key} = ${environmentVariable.value}"}).join("\n"))
	