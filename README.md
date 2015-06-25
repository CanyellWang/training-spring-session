# training-spring-session
练习使用最新的Spring-Session这个框架
spring-session这个框架实现了HttpSession的完全透明化的分布式实现，它既可以实现分布式，而且没有任何容器的限制，这样我们的应用就是完全无状态的（至少看起来是这样），以后再部属过程中无需再Tomcat上配置Memcache/Redis插件。<br>
1、实现了普通Web项目中使用<br>
2、实现了Spring-Boot中的使用<br>

所有技术没有银弹，有机会我实现一个基于权限Shiro的Redis的SessionManager这样我们以后使用的应用都是无状态了，无需开发人员去关心任何问题。。。
