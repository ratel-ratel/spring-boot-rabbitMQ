# RabbitMQ 介绍
[RabbitMQ 介绍](https://www.cnblogs.com/ityouknow/p/6120544.html)
    RabbitMQ 是实现 AMQP（高级消息队列协议）的消息中间件的一种，最初起源于金融系统，用于在分布式系统中存储转发消息，
  在易用性、扩展性、高可用性等方面表现不俗。 RabbitMQ 主要是为了实现系统之间的双向解耦而实现的。当生产者大量产生数据时，
  消费者无法快速消费，那么需要一个中间层。保存这个数据。
    AMQP，即 Advanced Message Queuing Protocol，高级消息队列协议，是应用层协议的一个开放标准，为面向消息的中间件设计。
  消息中间件主要用于组件之间的解耦，消息的发送者无需知道消息使用者的存在，反之亦然。AMQP 的主要特征是面向消息、队列、路由（包括点对点和发布/订阅）、
  可靠性、安全。
    RabbitMQ 是一个开源的 AMQP 实现，服务器端用Erlang语言编写，支持多种客户端，如：Python、Ruby、.NET、Java、JMS、C、
  PHP、ActionScript、XMPP、STOMP 等，支持 AJAX。用于在分布式系统中存储转发消息，在易用性、扩展性、高可用性等方面表现不俗
[RabbitMQ 安装](https://blog.csdn.net/rickey17/article/details/72756766/)
    安装rabbitmq-server
    	echo 'deb http://www.rabbitmq.com/debian/ testing main' | sudo tee /etc/apt/sources.list.d/rabbitmq.list
    
    	wget -O- https://www.rabbitmq.com/rabbitmq-release-signing-key.asc | sudo apt-key add -
    
    	sudo apt-get update
# 打开管理页面 
    sudo rabbitmq-plugins enable rabbitmq_management
# 查看安装的插件 
    sudo rabbitmqctl list_users
    
# 查看用户 
    sudo rabbitmqctl list_users
    
#    新增管理员用户 
    sudo rabbitmqctl add_user admin admin 
    sudo rabbitmqctl set_user_tags admin administrator
    
#    用刚设置的账户登录管理页面 
    http://127.0.0.1:15672
    
    	启动：sudo rabbitmq-server start
    	关闭： sudo rabbitmq-server stop
    	重启： sudo rabbitmq-server restart

  


