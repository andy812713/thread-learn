# 场景

#### 初始做法

一个服务使用了责任链，一个链处理完毕，交给下一个链。

###### 弊端

假定第二个链阻塞了，此时第一个链也会被阻塞，会影响到整个服务。

![1557629037418](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1557629037418.png)

#### 优化方案

每一个链先将请求存放到threadLocal中，然后用多线程的方式；即便第一个请求过来，第二个链阻塞造成第一个链阻塞，那也仅仅影响到第一个请求；服务还是可以继续接受到第二个请求。

![1557629069528](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1557629069528.png)




