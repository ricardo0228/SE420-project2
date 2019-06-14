整合了Hystrix提供的熔断，隔离和降级功能
首先导出provider的jar包和consumer的jar包
运行命令
java -jar feign-provider-service-0.0.1-SNAPSHOT.jar --server.port=9600
在9600端口运行provider
运行命令
java -jar feign-provider-consumer-0.0.1-SNAPSHOT.jar --hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=1000
在9700端口运行consumer，并设置超时时间为1000ms
在浏览器输入
localhost:9700/testHystrix?name=user
由于熔断保护会返回降级信息
No Response

关闭consumer并运行命令
java -jar feign-provider-consumer-0.0.1-SNAPSHOT.jar --hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=5000
此时设置超时时间为5000ms
在浏览器输入
localhost:9700/testHystrix?name=user
3000ms后得到正常返回信息
From Port 9600 : Hello user! This is a test about Hystrix.
