#### # 关于 spring.application.name 和 eureka.instance.appname

二者都是用于设置微服务的名称，在 Eureka 页面中会显示在 Application 一列

spring.application.name 的优先级高于 eureka.instance.appname

eureka.instance.appname 默认值为 unknown

#### # 关于 eureka.instance.instance-id

该值会显示在 eureka 页面的 Status 一列

默认值为 ${spring.cloud.client.ipAddress}:${spring.application.name}:${server.port}

#### # 在 application.yml 中引用 maven 中的属性

比如：@project.version@

这是因为 springboot 的 parent 包将 maven 中默认的 ${*} 修改成了 @*@

#### # eureka 自我保护

EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.

简而言之 : 某时刻某一个微服务不可用了, eureka 不会立即清理, 依旧会对该微服务的信息进行保存

默认情况下 eureka client 定时向 eureka server 端发送心跳包, 如果 eureka 在 server 端在一定时间内（默认90秒）没有收到 eureka client 发送的心跳包，便会直接从服务注册列表中剔除该服务，但是在短时间（90秒钟）内丢失了大量的服务实例心跳，这时候 eureka server 会开启自我保护机制，不会剔除该服务

该服务可能出现在网络不通但eureka client未出现宕机，此时如果换做别的注册中心如果一定时间内没有收到心跳会将该服务剔除，这样就出现了严重失误，因为客户端还能正常发送心跳，只是网络延迟问题，而保护机制是为了解决此问题而产生的

它的设计哲学是宁可保留错误的服务注册信息，也不盲目注销任何可能健康的服务实例，可以使 eureka 集群更加的健壮、稳定

属于 CAP 里面的 AP 分支

#### # 如果禁止自我保护

